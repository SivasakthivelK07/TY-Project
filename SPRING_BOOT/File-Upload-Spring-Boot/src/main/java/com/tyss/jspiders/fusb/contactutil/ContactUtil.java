package com.tyss.jspiders.fusb.contactutil;

import java.util.List;

import com.tyss.jspiders.fusb.entity.Contact;

public interface ContactUtil {

	public static Contact convert(List<String> rowlList) {
//		Contact contact = Contact.builder()
//				.contactName(rowlList.get(0))
//				.phoneNumber(rowlList.get(1))
//				.build();

		return Contact.builder()
				.contactName(rowlList.get(0))
				.phoneNumber(rowlList.get(1))
				.build();
	}
}
