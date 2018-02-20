package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Links;
import lombok.Data;

import java.time.Instant;
import java.util.Map;

@Data
public class Episode {
    private Links _links;

    private Instant airstamp;
    private int id;
    private Map<String, String> image;
    private String name;
    private Integer number;
    private Integer runtime;
    private Integer season;
    private int showId;
    private String url;

}
