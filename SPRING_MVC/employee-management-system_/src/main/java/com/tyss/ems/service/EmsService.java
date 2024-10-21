package com.tyss.ems.service;

import com.tyss.ems.dto.EmployeeRegisterDTO;

public interface EmsService {

	Boolean checkCredentials(String id, String password);

	String register(EmployeeRegisterDTO dto);

	Boolean changePassword(String id, String password, String changePassword);

}
