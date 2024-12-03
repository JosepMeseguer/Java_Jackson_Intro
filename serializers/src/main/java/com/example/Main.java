package com.example;

import com.example.model.BookDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BookDTO b = new BookDTO("Sapiens", "Yuval Harari", 300);
        ObjectMapper mapper = new ObjectMapper();
    	String jsonBook;
        try {
            jsonBook = mapper.writeValueAsString(b);
            System.out.println(jsonBook);
            BookDTO bImported = new ObjectMapper().readValue(jsonBook, BookDTO.class);
	        System.out.println(bImported);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
    	
    }
}