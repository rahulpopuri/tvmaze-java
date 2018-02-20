package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Links;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;
import java.util.Map;

@Data
public class Episode {
    private Links _links;

    private Instant airstamp;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date airdate;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime airtime;
    private int id;
    private Map<String, String> image;
    private String name;
    private Integer number;
    private Integer runtime;
    private Integer season;
    private String url;

}
