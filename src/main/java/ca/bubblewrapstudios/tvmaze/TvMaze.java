package ca.bubblewrapstudios.tvmaze;

import ca.bubblewrapstudios.tvmaze.models.Episode;
import ca.bubblewrapstudios.tvmaze.models.Result;
import ca.bubblewrapstudios.tvmaze.models.Show;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.time.LocalDate;
import java.util.List;

public class TvMaze {

    private static final String TVMAZE_URL = "http://api.tvmaze.com";

    private static TvMaze INSTANCE;

    private Retrofit retrofit;
    private TvMazeApi tvMazeApi;

    private TvMaze() {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                .registerModule(new JavaTimeModule());

        retrofit = new Retrofit.Builder()
                .baseUrl(TVMAZE_URL)
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .build();

        tvMazeApi = retrofit.create(TvMazeApi.class);
    }

    public static TvMaze getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TvMaze();
        }
        return INSTANCE;
    }

    public Call<List<Result<Show>>> searchShows(String searchString) {
        return tvMazeApi.searchShows(searchString);
    }

    public Call<Show> searchSingleShow(String searchString) {
        return tvMazeApi.getSingleShow(searchString);
    }

    public Call<Show> getShowById(int showId) {
        return tvMazeApi.getShowById(showId);
    }

    public Call<List<Episode>> getEpisodes(int showId) {
        return getEpisodes(showId, null);
    }

    public Call<List<Episode>> getEpisodes(int showId, Boolean includeSpecials) {
        return tvMazeApi.getEpisodes(showId, includeSpecials);
    }

    public Call<Episode> getEpisodeByNumber(int showId, int season, int number) {
        return tvMazeApi.getEpisodeByNumber(showId, season, number);
    }

    public Call<List<Episode>> getEpisodesByDate(int showId, LocalDate date) {
        return tvMazeApi.getEpisodesByDate(showId, date);
    }

    public Call<List<Season>> getSeasons(int showId) {
        return tvMazeApi.getSeasons(showId);
    }

    public Call<List<Episode>> getSeasonEpisodes(int seasonId) {
        return tvMazeApi.getSeasonEpisodes(seasonId);
    }
}
