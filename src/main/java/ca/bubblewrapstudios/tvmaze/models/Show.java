package ca.bubblewrapstudios.tvmaze.models;

import ca.bubblewrapstudios.tvmaze.models.show.Links;
import ca.bubblewrapstudios.tvmaze.models.show.Network;
import ca.bubblewrapstudios.tvmaze.models.show.Rating;
import ca.bubblewrapstudios.tvmaze.models.show.Schedule;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class Show implements Comparable<Show>, Serializable {
    private static final long serialVersionUID = 6857464574895812956L;
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
    protected String webChannel;

    public int compareTo(Show other) {
        return name.replaceAll("(?i)^the\\s", "").compareTo(
                other.name.replaceAll("(?i)^the\\s", ""));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Show other = (Show) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

}
