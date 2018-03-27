package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class Show implements Serializable {
    @JsonProperty("_links")
    protected Links links;
    protected List<CastMember> cast;
    protected Externals externals;
    protected List<String> genres;
    protected int id;
    protected Image image;
    protected String language;
    protected String name;
    protected Network network;
    @JsonFormat(pattern = "yyyy-MM-dd")
    protected Date premiered;
    protected Rating rating;
    protected Integer runtime;
    protected Schedule schedule;
    protected String status;
    protected String summary;
    protected String type;
    protected Integer updated;
    protected String url;
    protected WebChannel webChannel;

}
