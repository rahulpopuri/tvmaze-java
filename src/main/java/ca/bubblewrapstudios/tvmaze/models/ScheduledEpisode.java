package ca.bubblewrapstudios.tvmaze.models;

import lombok.Data;

@Data
public class ScheduledEpisode extends Episode {
    private Show show;

}
