package ca.bubblewrapstudios.tvmaze.models.show;

public class Links {

    private Link self;
    private Link previousepisode;
    private Link nextepisode;

    public Link getSelf() {
        return self;
    }

    public void setSelf(Link self) {
        this.self = self;
    }

    public Link getPreviousepisode() {
        return previousepisode;
    }

    public void setPreviousepisode(Link previousepisode) {
        this.previousepisode = previousepisode;
    }

    public Link getNextepisode() {
        return nextepisode;
    }

    public void setNextepisode(Link nextepisode) {
        this.nextepisode = nextepisode;
    }
}
