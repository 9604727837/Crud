package com.bookeeping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookeeping.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

	

}
