package audioApp.models;

public class Cancion extends Audio {
    private String album;
    private String cantate;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getTotalMeGusta() > 5000) {
            return 8;
        } else {
            return 4;
        }
    }

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
