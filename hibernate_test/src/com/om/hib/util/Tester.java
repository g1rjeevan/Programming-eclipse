package com.om.hib.util;

import com.om.hib.dao.FileDAO;
import com.om.hib.dto.FileDTO;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileDTO file = new FileDTO();
		// file.setFid(2);
		file.setName("welcome.jpg");
		FileDAO dao = new FileDAO();

	}

}
