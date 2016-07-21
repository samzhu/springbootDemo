package com.sam.demo.repository;

import com.sam.demo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by samchu on 2016/7/21.
 */
@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {

}
