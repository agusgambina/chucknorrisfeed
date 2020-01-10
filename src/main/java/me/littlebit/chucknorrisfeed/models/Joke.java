package me.littlebit.chucknorrisfeed.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

public @NoArgsConstructor @AllArgsConstructor @Data @JsonIgnoreProperties(ignoreUnknown = true)
class Joke {

    private String iconUrl;
    @Id
    private String id;
    private String url;
    private String value;

}
