package ca.bubblewrapstudios.tvmaze;

import ca.bubblewrapstudios.tvmaze.episodes.EpisodesTest;
import ca.bubblewrapstudios.tvmaze.shows.ShowsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ShowsTest.class, EpisodesTest.class})
public class TvMazeTestSuite {

}
