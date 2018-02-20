package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Country;
import lombok.Data;

@Data
public class Aka {
    private Country country;
    private String name;
}
