package me.littlebit.chucknorrisfeed.services;

import me.littlebit.chucknorrisfeed.clients.ChuckNorrisClient;
import me.littlebit.chucknorrisfeed.models.Joke;
import me.littlebit.chucknorrisfeed.repositories.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class JokeService {

    @Autowired
    private ChuckNorrisClient chuckNorrisClient;

    @Autowired
    private JokeRepository jokeRepository;

//    public getJoke(){
//        Joke joke = chuckNorrisClient.getJoke();
//    }
}
