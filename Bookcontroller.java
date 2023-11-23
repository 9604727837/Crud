package com.bookeeping.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookeeping.model.Books;
import com.bookeeping.service.Bookservice;
import com.bookeeping.userdto.Booksdto;

@RestController //parent annotation of all the get,put,post if we want to use thi annotatin compulsory class should be denoted with restcontroller
@RequestMapping("/book")
public class Bookcontroller {
	
@Autowired
	Bookservice bookService;


@GetMapping("/{bookid}")  //getting the data from database
private Books getBooks(@PathVariable("bookid")int bookid)
{
	return  bookService.getBooksById(bookid);
	
}

@GetMapping("/List")//getting the data from database
private List<Books>getAllBooks()
{
	return bookService.getAllBooks();
	
}

@PostMapping("/create")//inserting the data from database
private String saveBook(@RequestBody Booksdto books)
{
	bookService.saveOrUpdate(books);
	return "success";
	
}

@PutMapping("/update/{bookid}")//updating the data from database
private Booksdto update(@RequestBody  Booksdto books,@PathVariable("bookid")int bookid) 
{
	bookService.updateBooks(bookid, books);
	return books;
	
}

@DeleteMapping("/delete/{bookid}")//delete the data from database
private void deleteBook(@PathVariable("bookid")int bookid) 
{
	bookService.delete(bookid);	
}

}



