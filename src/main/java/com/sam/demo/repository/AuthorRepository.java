package com.sam.demo.repository;

import com.sam.demo.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by samchu on 2016/7/21.
 */
//@Repository
@RepositoryRestResource
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @RestResource(path = "byname")
    Collection<Author> findByName(@Param("name") String name);
}
