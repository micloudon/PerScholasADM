package com.example.accessingdatamysql;

import java.util.List;
import com.example.accessingdatamysql.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{
	
	List<Book> findByTitle(String title);

	Book findById(int id);
}
