package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Country;
import lombok.Data;

import java.io.Serializable;

@Data
public class Aka implements Serializable {
    private Country country;
    private String name;
}
