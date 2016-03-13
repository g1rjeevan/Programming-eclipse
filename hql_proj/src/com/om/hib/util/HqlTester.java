package com.om.hib.util;

import com.om.hib.dao.MovieDAO;
import com.om.hib.dto.MovieDTO;

public class HqlTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// save a movie

		MovieDAO dao = new MovieDAO();

		MovieDTO shivalinga = new MovieDTO();

		shivalinga.setLang("Kannada");
		shivalinga.setName("shivalinga");
		shivalinga.setRating(3);
		
		
		MovieDTO deadPool=new MovieDTO();
		deadPool.setLang("English");
		deadPool.setName("Dead pool");
		deadPool.setRating(3);
		
		
		MovieDTO sanemRe=new MovieDTO();
		
		sanemRe.setLang("Hindi");
		sanemRe.setRating(2);
		sanemRe.setName("Sanam Re");
		
		//dao.save(deadPool);
		//dao.save(sanemRe);
		dao.fetch();
	}

}
