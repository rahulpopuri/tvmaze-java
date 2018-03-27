package ca.bubblewrapstudios.tvmaze.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class Crew implements Serializable {
    private String type;
    private Person person;
}
