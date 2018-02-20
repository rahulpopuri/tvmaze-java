package ca.bubblewrapstudios.tvmaze;

import ca.bubblewrapstudios.tvmaze.models.Image;
import ca.bubblewrapstudios.tvmaze.models.show.Links;
import ca.bubblewrapstudios.tvmaze.models.show.Network;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Season {
    private int id;
    private String url;
    private int number;
    private String name;
    private int episodeOrder;
    private Date premiereDate;
    private Date endDate;
    private Network network;
    private String webChannel;
    private Image image;
    private String summary;
    @JsonProperty("_links")
    private Links links;
}
