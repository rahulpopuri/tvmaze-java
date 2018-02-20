package ca.bubblewrapstudios.tvmaze.episodes;

import ca.bubblewrapstudios.tvmaze.TvMaze;
import ca.bubblewrapstudios.tvmaze.models.Episode;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
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

        }

    }

}
