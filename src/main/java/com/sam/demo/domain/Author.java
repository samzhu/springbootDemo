package com.sam.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by samchu on 2016/7/21.
 */
@Data
@Entity
public class Author implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany()
    @JoinColumn(name = "authorid", insertable = false, updatable = false)
    public List<Book> books;
}
