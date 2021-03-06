package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Character implements Serializable {

	@JsonProperty("_links")
	private Links links;
    private int id;
    private Image image;
    private String name;
    private String url;

}
