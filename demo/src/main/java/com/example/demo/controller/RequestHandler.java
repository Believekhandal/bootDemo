package com.example.demo.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.book.model.Book;

@RestController
public class RequestHandler {

	@PostMapping(value="/books/{bookId}")
	public ResponseEntity<Object> showBookDetails(@RequestBody Book book, @PathVariable String bookId)
	{
		System.out.println("bookId: "+bookId+"  book: "+book.getName());
		System.out.println("Price: "+book.getPrice());
		return ResponseEntity.ok(book);
	}
}
