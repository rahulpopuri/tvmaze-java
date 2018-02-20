package ca.bubblewrapstudios.tvmaze;

import ca.bubblewrapstudios.tvmaze.episodes.EpisodesTest;
import ca.bubblewrapstudios.tvmaze.shows.SearchShowsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SearchShowsTest.class, EpisodesTest.class})
public class TvMazeTestSuite {

}
