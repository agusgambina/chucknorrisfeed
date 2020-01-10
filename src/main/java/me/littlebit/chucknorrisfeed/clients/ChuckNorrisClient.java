package me.littlebit.chucknorrisfeed.clients;

import me.littlebit.chucknorrisfeed.models.Joke;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ChuckNorrisClient {

    public static Joke getJoke() {
        RestTemplate restTemplate = new RestTemplate();
        Joke joke = restTemplate.getForObject("https://api.chucknorris.io/jokes/random", Joke.class);
        return joke;
    }

}
