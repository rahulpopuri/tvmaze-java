package ca.bubblewrapstudios.tvmaze.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    private Double score;
    private T show;
}
