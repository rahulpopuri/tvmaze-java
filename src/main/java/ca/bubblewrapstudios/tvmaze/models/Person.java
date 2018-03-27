package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Country;
import ca.bubblewrapstudios.tvmaze.models.show.Links;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Person implements Serializable {
    @JsonProperty("_links")
    private Links links;
    private int id;
    private Image image;
    private String name;
    private String url;
    private Country country;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date deathday;
    private String gender;

}
