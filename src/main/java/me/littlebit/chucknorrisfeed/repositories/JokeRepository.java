package me.littlebit.chucknorrisfeed.repositories;

import me.littlebit.chucknorrisfeed.models.Joke;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface JokeRepository extends MongoRepository<Joke, String> {
    public Joke findByUrl(String url);
    public List<Joke> findByValue(String value);
}
