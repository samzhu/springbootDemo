package com.sam.demo;

import com.sam.demo.domain.Author;
import com.sam.demo.domain.Book;
import com.sam.demo.repository.AuthorRepository;
import com.sam.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by samchu on 2016/7/21.
 */
@Component
public class ApplicationLoader implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {


        Author author = new Author();
        author.setId(1L);
        author.setName("青山剛昌");
        authorRepository.save(author);

        Arrays.asList("神偷怪盜,棒球狂想曲,名偵探柯南".split(","))
                .forEach(x -> bookRepository.save(new Book(x, 1L)));


        author = new Author();
        author.setId(2L);
        author.setName("鳥山明");
        authorRepository.save(author);

        Arrays.asList("怪博士與機器娃娃,七龍珠,GO!GO!ACKMAN 惡魔少年".split(","))
                .forEach(x -> bookRepository.save(new Book(x, 2L)));
    }
}
