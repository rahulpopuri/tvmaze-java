package ca.bubblewrapstudios.tvmaze.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class ScheduledEpisode extends Episode implements Serializable {
    private Show show;

}
