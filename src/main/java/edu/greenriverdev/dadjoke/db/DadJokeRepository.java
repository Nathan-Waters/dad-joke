package edu.greenriverdev.dadjoke.db;

import edu.greenriverdev.dadjoke.domain.DadJokes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadJokeRepository extends JpaRepository<DadJokes, Integer> {


}
