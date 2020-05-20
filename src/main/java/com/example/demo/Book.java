package com.example.demo;

import java.util.UUID;

import javax.persistence.*;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
public class Book {
	
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;
}