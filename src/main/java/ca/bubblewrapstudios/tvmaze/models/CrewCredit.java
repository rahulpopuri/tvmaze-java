package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CrewCredit {
    @JsonProperty("_links")
    private Links links;
    private String type;
}
