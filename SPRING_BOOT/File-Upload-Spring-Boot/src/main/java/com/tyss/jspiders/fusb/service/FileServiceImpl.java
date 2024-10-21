package com.tyss.jspiders.fusb.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tyss.jspiders.fusb.contactutil.ContactUtil;
import com.tyss.jspiders.fusb.repository.ContactRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FileServiceImpl implements FileService {

	private final ContactRepository contactRepository;

	@Override
	public List<List<String>> uploadFile(MultipartFile file) {

		List<List<String>> readExcel = new ArrayList<List<String>>();
		DataFormatter dataFormatter = new DataFormatter();

		try {
			InputStream inputStream = file.getInputStream();
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheetAt(0);
			for (Row row : sheet) {
				List<String> rowList = new ArrayList<String>();
				for (Cell cell : row) {
					rowList.add(dataFormatter.formatCellValue(cell));
				}
				readExcel.add(rowList);
				contactRepository.save(ContactUtil.convert(rowList));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return readExcel;
	}

}
