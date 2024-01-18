package edu.greenriverdev.dadjoke.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadJokes {
//    Define a DadJoke class with attributes like id, jokeText.
    @Id
    @GeneratedValue
    int id;
    
    String jokeText;

}
