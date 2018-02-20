package ca.bubblewrapstudios.tvmaze;

import ca.bubblewrapstudios.tvmaze.models.*;
import ca.bubblewrapstudios.tvmaze.models.show.Links;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface TvMazeApi {

    @GET("/search/shows")
    Call<List<Result<Show>>> searchShows(@Query("q") String showName);

    @GET("/singlesearch/shows")
    Call<Show> getSingleShow(@Query("q") String showName);

    @GET("/shows")
    Call<List<Show>> getAllShows(@Query("page") int page);

    @GET("/shows/{id}")
    Call<Show> getShowById(@Path("id") int showId);

    @GET("/shows/{id}/episodes")
    Call<List<Episode>> getEpisodes(@Path("id") int showId, @Query("specials") Boolean specials);

    @GET("/shows/{id}/episodebynumber")
    Call<Episode> getEpisodeByNumber(@Path("id") int showId, @Query("season") int season, @Query("number") int number);

    @GET("/shows/{id}/episodesbydate")
    Call<List<Episode>> getEpisodesByDate(@Path("id") int showId, @Query("date") LocalDate date);

    @GET("/shows/{id}/seasons")
    Call<List<Season>> getSeasons(@Path("id") int showId);

    @GET("/shows/{id}/cast")
    Call<List<CastMember>> getShowCast(@Path("id") int showId);

    @GET("/shows/{id}/crew")
    Call<List<Crew>> getShowCrew(@Path("id") int showId);

    @GET("/shows/{id}/akas")
    Call<List<Aka>> getShowAkas(@Path("id") int showId);

    @GET("/seasons/{id}/episodes")
    Call<List<Episode>> getSeasonEpisodes(@Path("id") int seasonId);

    @GET("/people/{id}")
    Call<Person> getPerson(@Path("id") int personId);

    @GET("/people/{id}/castcredits")
    Call<List<Links>> getPersonCastCredits(@Path("id") int personId);

    @GET("/people/{id}/crewcredits")
    Call<List<CrewCredit>> getPersonCrewCredits(@Path("id") int personId);

    @GET("/updates/shows")
    Call<Map<Integer, Long>> getShowUpdates();

}
