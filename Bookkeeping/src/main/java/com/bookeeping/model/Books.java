package com.bookeeping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Books {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    @Column(name="book_id")
	private int bookId;

    @Column(name="book_author")
    @Enumerated(EnumType.STRING)
	private bookauthorEnum bookauthor;
    
    @Column(name="bookauthor_Name")
    private String bookauthorname;
    
    @Column(name="book_name")
	private String bookname;
    
    @Column(name="book_description")
    private String bookdescription;
    
    @Column(name="book_price")
	private double bookprice;

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookauthor=" + bookauthor + ", bookauthorname=" + bookauthorname
				+ ", bookname=" + bookname + ", bookdescription=" + bookdescription + ", bookprice=" + bookprice + "]";
	}

	public Books() {
		super();
		this.bookId = bookId;
		this.bookauthor = bookauthor;
		this.bookauthorname = bookauthorname;
		this.bookname = bookname;
		this.bookdescription = bookdescription;
		this.bookprice = bookprice;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

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

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
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


    
}

