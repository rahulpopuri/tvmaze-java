package ca.bubblewrapstudios.tvmaze.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Image implements Serializable {
    private String medium;
    private String original;
}
