package ca.bubblewrapstudios.tvmaze.models;

import lombok.Data;

import java.time.Instant;
import java.util.Map;

@Data
public class Episode {
    private Map<String, String> _links;

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
