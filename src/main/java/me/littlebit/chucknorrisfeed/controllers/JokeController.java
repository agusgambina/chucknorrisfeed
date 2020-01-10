package me.littlebit.chucknorrisfeed.controllers;

import me.littlebit.chucknorrisfeed.clients.ChuckNorrisClient;
import me.littlebit.chucknorrisfeed.models.Joke;
import me.littlebit.chucknorrisfeed.repositories.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/jokes")
public class JokeController {

    @Autowired
    private JokeRepository jokeRepository;

    @Autowired
    private ChuckNorrisClient chuckNorrisClient;

    @GetMapping
    public List<Joke> getJoke() {
        jokeRepository.save(chuckNorrisClient.getJoke());
        return jokeRepository.findAll();
    }


}
