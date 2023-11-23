package com.bookeeping.userdto;

import com.bookeeping.model.bookauthorEnum;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Booksdto {

	@Enumerated(EnumType.STRING)
	private bookauthorEnum bookauthor;
	
    private String bookauthorname;
	
   private String bookdescription;
	
	private double bookprice;

	private String bookname;

	public bookauthorEnum getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(bookauthorEnum bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookauthorname() {
		return bookauthorname;
	}

	public void setBookauthorname(String bookauthorname) {
		this.bookauthorname = bookauthorname;
	}

	public String getBookdescription() {
		return bookdescription;
	}

	public void setBookdescription(String bookdescription) {
		this.bookdescription = bookdescription;
	}

	public double getBookprice() {
		return bookprice;
	}

	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	
	
	

}
