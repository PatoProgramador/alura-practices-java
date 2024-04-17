package audioApp.principal;

import audioApp.models.Cancion;
import audioApp.models.Podcast;

public class AppPrincipal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantate("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalMeGusta());
    }
}
