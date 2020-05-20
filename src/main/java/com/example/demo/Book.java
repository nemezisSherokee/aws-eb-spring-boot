package com.example.demo;


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

	public void withId(int i) {
		this.id = id;
	}

	public void withName(String string) {
		this.name = string;
	}
}