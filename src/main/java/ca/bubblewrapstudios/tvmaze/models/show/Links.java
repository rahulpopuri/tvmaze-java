package ca.bubblewrapstudios.tvmaze.models.show;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Links {

    private Link self;
    @JsonProperty("previousepisode")
    private Link previousEpisode;
    @JsonProperty("nextepisode")
    private Link nextEpisode;

}
