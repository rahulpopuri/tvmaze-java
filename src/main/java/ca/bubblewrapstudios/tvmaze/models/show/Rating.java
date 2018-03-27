package ca.bubblewrapstudios.tvmaze.models.show;

import lombok.Data;

import java.io.Serializable;

@Data
public class Rating implements Serializable {
    private Double average;
}
