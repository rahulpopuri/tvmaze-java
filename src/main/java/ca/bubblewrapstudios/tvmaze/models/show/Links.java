package ca.bubblewrapstudios.tvmaze.models.show;

import lombok.Data;

@Data
public class Links {

    private Link self;
    private Link previousepisode;
    private Link nextepisode;

}
