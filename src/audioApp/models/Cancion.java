package audioApp.models;

public class Cancion extends Audio {
    private String album;
    private String cantate;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantate() {
        return cantate;
    }

    public void setCantate(String cantate) {
        this.cantate = cantate;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
