package ca.bubblewrapstudios.tvmaze;

import ca.bubblewrapstudios.tvmaze.models.Person;
import lombok.Data;

@Data
public class Crew {
    private String type;
    private Person person;
}
