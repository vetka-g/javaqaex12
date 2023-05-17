package ru.netology.posters;

public class PosterManager {
    private int limit = 5;

    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public int getLimitManager() {
        return limit;
    }


    public Poster[] movies = new Poster[0];

    public void addNewMovie(Poster movie) {
        Poster[] tmp = new Poster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Poster[] findAll() {
        return movies;
    }


    public Poster[] findLast() {
        int resultLength;
        if (limit == movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

