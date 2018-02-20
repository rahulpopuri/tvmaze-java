package ca.bubblewrapstudios.tvmaze.models.show;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Schedule {
    private String[] days;
    private LocalTime time;

}
