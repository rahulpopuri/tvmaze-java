package ca.bubblewrapstudios.tvmaze.models;

import lombok.Data;

@Data
public class Result<T> {
    private Double score;
    private T show;
}
