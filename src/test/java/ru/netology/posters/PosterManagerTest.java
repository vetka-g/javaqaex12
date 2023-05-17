package ru.netology.posters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosterManagerTest {

    PosterManager manager = new PosterManager();
    PosterManager manager2 = new PosterManager(7);

    Poster movie1 = new Poster(1, "Постер 1", "Фильм 1","жанр 1");
    Poster movie2 = new Poster(2, "Постер 2", "Фильм 2","жанр 2");
    Poster movie3 = new Poster(3, "Постер 3", "Фильм 3","жанр 3");
    Poster movie4 = new Poster(4, "Постер 4", "Фильм 4","жанр 4");
    Poster movie5 = new Poster(5, "Постер 5", "Фильм 5","жанр 5");
    Poster movie6 = new Poster(6, "Постер 6", "Фильм 6","жанр 6");
    Poster movie7 = new Poster(7, "Постер 7", "Фильм 7","жанр 7");

    @BeforeEach
    public void setup() {
        manager.addNewMovie(movie1);
        manager.addNewMovie(movie2);
        manager.addNewMovie(movie3);
        manager.addNewMovie(movie4);
        manager.addNewMovie(movie5);
        manager.addNewMovie(movie6);
        manager.addNewMovie(movie7);
    }

    @BeforeEach
    public void setup2() {
        manager2.addNewMovie(movie1);
        manager2.addNewMovie(movie2);
        manager2.addNewMovie(movie3);
        manager2.addNewMovie(movie4);
        manager2.addNewMovie(movie5);
        manager2.addNewMovie(movie6);
        manager2.addNewMovie(movie7);
    }

    @Test
    public void testLimitManager() {

        Assertions.assertEquals(5, manager.getLimitManager());
    }

    @Test
    public void testLimitManagerIfMore() {

        Assertions.assertEquals(7, manager2.getLimitManager());
    }

    @Test
    public void shouldAddNewMovie() {

        Poster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {

        Poster[] expected = {movie7, movie6, movie5, movie4, movie3};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMore() {

        Poster[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Poster[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
