package ca.bubblewrapstudios.tvmaze.shows;

import ca.bubblewrapstudios.tvmaze.TvMaze;
import ca.bubblewrapstudios.tvmaze.models.Result;
import ca.bubblewrapstudios.tvmaze.models.Show;
import org.junit.Assert;
import org.junit.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class SearchShowsTest {

    private final String SINGLE_SHOW = "South Park";
    private final String MULTIPLE_SHOWS = "homeland";

    @Test
    public void searchSingleShow() {
        try {
            Response<Show> response = TvMaze.getInstance()
                    .searchSingleShow(SINGLE_SHOW)
                    .execute();

            assert response.isSuccessful();

            Show show = response.body();
            Assert.assertNotNull(show);
            Assert.assertEquals(show.getName(), "South Park");

        } catch (IOException e) {

        }

    }

    @Test
    public void searchShows() {
        try {
            Response<List<Result<Show>>> response = TvMaze.getInstance()
                    .searchShows(MULTIPLE_SHOWS)
                    .execute();

            assert response.isSuccessful();

            List<Result<Show>> showsResult = response.body();
            Assert.assertNotNull(showsResult);

            List<Show> shows = showsResult.stream().map(Result::getShow).collect(Collectors.toList());

            Assert.assertEquals(shows.get(0).getName(), "Homeland");
            Assert.assertTrue(shows.size() > 1);

        } catch (IOException e) {

        }
    }
}
