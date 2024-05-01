package com.radio.principal;

import com.radio.modelos.Cancion;
import com.radio.modelos.MisFavoritos;
import com.radio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Sugar");
        miCancion.setCantante("System of a Down");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Rock pesado");
        miPodcast.setPresentador("Mario pergolini");
        miPodcast.setDescripcion("Café Rock");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduccion();
        }


        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miPodcast.reproduccion();
        }

        System.out.println("Total de reproducciones: "+miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: "+miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciones(miPodcast);
        favoritos.adiciones(miCancion);
    }
}