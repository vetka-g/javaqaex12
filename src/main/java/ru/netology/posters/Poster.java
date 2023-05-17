package ru.netology.posters;

public class Poster {
    private int id;
    private String image;
    private String title;
    private String genre;


    public Poster(int id, String image, String title, String genre) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.genre = genre;
    }

    public Poster() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
