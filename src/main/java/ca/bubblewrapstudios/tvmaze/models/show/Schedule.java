package ca.bubblewrapstudios.tvmaze.models.show;

import lombok.Data;
import org.joda.time.LocalTime;

@Data
public class Schedule {
    private String[] days;
    private LocalTime time;

}
