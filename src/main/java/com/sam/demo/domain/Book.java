package com.sam.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by samchu on 2016/7/21.
 */
@Data
@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long authorid;
    @ManyToOne
    @JoinColumn(name = "authorid", insertable = false, updatable = false, referencedColumnName = "id")
    private Author author;

    public Book(){

    }
    public Book(String name, Long authorid) {
        this.name = name;
        this.authorid = authorid;
    }

}
