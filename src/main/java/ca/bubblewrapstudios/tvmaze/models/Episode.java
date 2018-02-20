package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Links;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;

@Data
public class Episode {
    @JsonProperty("_links")
    private Links links;

    private Instant airstamp;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date airdate;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime airtime;
    private int id;
    private Image image;
    private String name;
    private Integer number;
    private Integer runtime;
    private Integer season;
    private String url;

}
