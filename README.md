# tvmaze-java

[![CircleCI](https://circleci.com/gh/rahulpopuri/tvmaze-java/tree/master.svg?style=svg)](https://circleci.com/gh/rahulpopuri/tvmaze-java/tree/master)
[ ![Download](https://api.bintray.com/packages/bubblewrapstudios/tvmaze-java/ca.bubblewrapstudios.tvmaze/images/download.svg?version=0.1) ](https://bintray.com/bubblewrapstudios/tvmaze-java/ca.bubblewrapstudios.tvmaze/0.1/link)

A Java wrapper for the TvMaze [API ](http://www.tvmaze.com/api)


Built with [Retrofit2](http://square.github.io/retrofit/) and [lombok](https://projectlombok.org/)


Code for the models is based on https://github.com/RNGuy/TVMaze


# Usage
TvMaze is a singleton that you can retrieve with `TvMaze.getInstance()`

To get a list of all supported endpoints, look at [TvMazeApi.java](https://github.com/rahulpopuri/tvmaze-java/blob/master/src/main/java/ca/bubblewrapstudios/tvmaze/TvMazeApi.java)

- To search for a show by name:

    ```java
     try {
         Response<List<Result<Show>>> showsResponse = TvMaze.getInstance().searchShows(name).execute();
         if (showsResponse.isSuccessful()) {
             List<Result<Show>> shows = showsResponse.body();
             if (shows != null) {
                 return shows.stream().map(Result::getShow).collect(Collectors.toList());
             }
         }
     } catch (IOException e) {
         // Handle error
     }
    ```

- To find a list of episodes in a show:

    ```java
    try {
        Response<List<Episode>> response = TvMaze.getInstance().getEpisodes(id).execute();
        if (response.isSuccessful()) {
            return response.body();
        }
    } catch (IOException e) {
        // Handle error
    }
    ```

# TODO
Not all endpoints are supported yet
- `Show Lookup`
- `Schedule`
- `Embeds`