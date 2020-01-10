package me.littlebit.chucknorrisfeed.clients;

import me.littlebit.chucknorrisfeed.models.Joke;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class ChuckNorrisClientTest {

    @Autowired
    private ChuckNorrisClient chuckNorrisClient;

    @Test
    void getJoke() {
        Joke testJoke = chuckNorrisClient.getJoke();
        assertNotNull(testJoke);
    }
}