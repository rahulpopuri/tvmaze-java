package ca.bubblewrapstudios.tvmaze;

import ca.bubblewrapstudios.tvmaze.models.Episode;
import ca.bubblewrapstudios.tvmaze.models.Result;
import ca.bubblewrapstudios.tvmaze.models.Show;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.time.LocalDate;
import java.util.List;

public interface TvMazeAPI {

    @GET("/search/shows")
    Call<List<Result<Show>>> searchShows(@Query("q") String showName);

    @GET("/singlesearch/shows")
    Call<Show> getSingleShow(@Query("q") String showName);

    @GET("/shows/{id}")
    Call<Show> getShowById(@Path("id") int showId);

    @GET("/shows/{id}/episodes")
    Call<List<Episode>> getEpisodes(@Path("id") int showId, @Query("specials") Boolean specials);

    @GET("/shows/{id}/episodebynumber")
    Call<Episode> getEpisodeByNumber(@Path("id") int showId, @Query("season") int season, @Query("number") int number);

    @GET("/shows/{id}/episodesbydate")
    Call<List<Episode>> getEpisodesByDate(@Path("id") int showId, @Query("date") LocalDate date);
}
