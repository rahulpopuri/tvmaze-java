package ca.bubblewrapstudios.tvmaze.models.show;

import lombok.Data;

import java.io.Serializable;

@Data
public class Network implements Serializable {
    private Country country;
    private int id;
    private String name;

}
