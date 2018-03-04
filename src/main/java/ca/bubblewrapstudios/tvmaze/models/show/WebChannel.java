package ca.bubblewrapstudios.tvmaze.models.show;

import lombok.Data;

@Data
public class WebChannel {

    private int id;
    private String name;
    private Country country;
}
