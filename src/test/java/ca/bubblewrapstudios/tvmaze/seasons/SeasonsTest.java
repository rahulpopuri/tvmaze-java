package ca.bubblewrapstudios.tvmaze.seasons;

import ca.bubblewrapstudios.tvmaze.Season;
import ca.bubblewrapstudios.tvmaze.TvMaze;
import ca.bubblewrapstudios.tvmaze.models.Episode;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class SeasonsTest {
    private final int SHOW_ID = 1;
    private final int SEASON_ID = 1;

    @Test
    public void getEpisodesForSeason() {
        try {
            Response<List<Episode>> response = TvMaze.getInstance().getSeasonEpisodes(SEASON_ID).execute();
            assert response.isSuccessful();

            List<Episode> episodes = response.body();
            Assert.assertNotNull(episodes);

            Assert.assertEquals(episodes.get(0).getName(), "Pilot");
            Assert.assertEquals(episodes.size(), 13);

        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }

    }

    @Test
    public void getSeasonsForShows() {
        try {
            Response<List<Season>> response = TvMaze.getInstance().getSeasons(SHOW_ID).execute();
            assert response.isSuccessful();

            List<Season> seasons = response.body();
            Assert.assertNotNull(seasons);

            Assert.assertEquals(seasons.get(0).getId(), 1);
            Assert.assertEquals(seasons.size(), 3);

        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }

    }
}
