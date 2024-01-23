package edu.greenriverdev.dadjoke.service;

import edu.greenriverdev.dadjoke.db.DadJokeRepository;
import edu.greenriverdev.dadjoke.domain.DadJokes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DadJokeService {

    private DadJokeRepository repository;

    public DadJokeService(DadJokeRepository repository){
        this.repository = repository;
    }

    public List<DadJokes> getAll(){
        List<DadJokes> dadList = repository.findAll();
        return dadList;
    }

    public void add(DadJokes joke){
        repository.save(joke);
    }

    public DadJokes update(int id, String newJokeText){
        DadJokes currentJoke = repository.findById(id).orElseThrow();

        currentJoke.setJokeText(newJokeText);

        return repository.save(currentJoke);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
