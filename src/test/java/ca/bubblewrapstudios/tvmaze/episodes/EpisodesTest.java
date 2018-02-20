package ca.bubblewrapstudios.tvmaze.episodes;

import ca.bubblewrapstudios.tvmaze.TvMaze;
import ca.bubblewrapstudios.tvmaze.models.Episode;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

public class EpisodesTest {

    private final int SHOW_ID = 1;

    @Test
    public void getEpisodesForShow() {
        try {
            Response<List<Episode>> response = TvMaze.getInstance().getEpisodes(SHOW_ID).execute();
            assert response.isSuccessful();

            List<Episode> episodes = response.body();
            Assert.assertNotNull(episodes);

            Assert.assertEquals(episodes.get(0).getName(), "Pilot");
            Assert.assertTrue(episodes.size() > 1);

        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }

    }

    @Test
    public void getEpisodeByNumber() {
        try {
            Response<Episode> response = TvMaze.getInstance().getEpisodeByNumber(SHOW_ID, 1, 1).execute();
            assert response.isSuccessful();

            Episode episode = response.body();
            Assert.assertNotNull(episode);

            // Check some date fields
            Assert.assertEquals(episode.getAirtime(), LocalTime.of(22, 0));
            Assert.assertNotNull(episode.getAirdate());
            Assert.assertNotNull(episode.getAirtime());

            Assert.assertEquals(episode.getName(), "Pilot");

        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void getEpisodesByDate() {
        try {
            LocalDate localDate = LocalDate.of(2013, Month.JULY, 1);
            Response<List<Episode>> response = TvMaze.getInstance().getEpisodesByDate(SHOW_ID, localDate).execute();
            assert response.isSuccessful();

            List<Episode> episodes = response.body();
            Assert.assertNotNull(episodes);

            Assert.assertEquals(episodes.get(0).getName(), "The Fire");

        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }

    }


}