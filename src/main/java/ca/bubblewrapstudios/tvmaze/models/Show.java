package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class Show {
    protected Links _links;
    protected List<CastMember> cast;
    protected Map<String, String> externals;
    protected List<String> genres;
    protected int id;
    protected Map<String, String> image;
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
