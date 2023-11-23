package com.bookeeping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookeeping.model.Books;
import com.bookeeping.model.bookauthorEnum;
import com.bookeeping.repo.BooksRepository;
import com.bookeeping.userdto.Booksdto;

import jakarta.persistence.EntityNotFoundException;

@Service
public class Bookservice {
	
@Autowired
BooksRepository booksRepository;  

	public List<Books> getAllBooks() 
	{
	
		return booksRepository.findAll();
	}

	public Books getBooksById(int id) 
	{
		Books books = booksRepository.findById(id).orElseThrow(null);
		return books;
	}
	
	public void saveOrUpdate(Booksdto booksdto) 
	{
	    Books b=new Books();
		
		b.setBookauthor(booksdto.getBookauthor());
		b.setBookauthorname(booksdto.getBookauthorname());
		b.setBookname(booksdto.getBookname());
		b.setBookdescription(booksdto.getBookdescription());
		b.setBookprice(booksdto.getBookprice());
		
		booksRepository.save(b);  	
	}

	public void delete(int bookid) 
	{
		booksRepository.deleteById(bookid);		
	}
	
	public void update(Books books,int bookid) 
	{
		booksRepository.save(books);  	

	}

	public Books updateBooks(int id,Booksdto booksdto)
	{
		 Books books = booksRepository.findById(id).orElseThrow(null);
		
		System.out.println(books.getBookauthorname()+" | "+books.getBookdescription()+" | "+books.getBookname()+" | "+books.getBookprice());		
			
		books.setBookauthor(booksdto.getBookauthor());
		books.setBookauthorname(booksdto.getBookauthorname());
		books.setBookdescription(booksdto.getBookdescription());
		books.setBookname(booksdto.getBookname());
		books.setBookprice(booksdto.getBookprice());
			
			return booksRepository.save(books);
		
	}
	
	

}
