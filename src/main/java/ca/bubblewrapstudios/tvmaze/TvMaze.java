package ca.bubblewrapstudios.tvmaze;

import ca.bubblewrapstudios.tvmaze.models.Episode;
import ca.bubblewrapstudios.tvmaze.models.Result;
import ca.bubblewrapstudios.tvmaze.models.Show;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    private TvMazeAPI tvMazeAPI;

    private TvMaze() {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(new JavaTimeModule());

        retrofit = new Retrofit.Builder()
                .baseUrl(TVMAZE_URL)
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .build();

        tvMazeAPI = retrofit.create(TvMazeAPI.class);
    }

    public static TvMaze getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TvMaze();
        }
        return INSTANCE;
    }

    public Call<List<Result<Show>>> searchShows(String searchString) {
        return tvMazeAPI.searchShows(searchString);
    }

    public Call<Show> searchSingleShow(String searchString) {
        return tvMazeAPI.getSingleShow(searchString);
    }

    public Call<Show> getShowById(int showId) {
        return tvMazeAPI.getShowById(showId);
    }

    public Call<List<Episode>> getEpisodes(int showId) {
        return getEpisodes(showId, null);
    }

    public Call<List<Episode>> getEpisodes(int showId, Boolean includeSpecials) {
        return tvMazeAPI.getEpisodes(showId, includeSpecials);
    }

    public Call<Episode> getEpisodeByNumber(int showId, int season, int number) {
        return tvMazeAPI.getEpisodeByNumber(showId, season, number);
    }

    public Call<List<Episode>> getEpisodesByDate(int showId, LocalDate date) {
        return tvMazeAPI.getEpisodesByDate(showId, date);
    }
}
