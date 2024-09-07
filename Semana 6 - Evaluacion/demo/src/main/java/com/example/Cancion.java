package com.example;

//1. 2. COMPLETOS


    //3. 
    public class Cancion {
        //4.
        String titulo;
        String artista;
        int duracion;
        String genero;
        String album;
        
        //5. 
        public Cancion() {
            titulo = "No Definido";
            artista = "No Definido";
            duracion = 0;
            genero = "No Definido";
            album = "No Definido";
        }


        public Cancion(String titulo, String artista, int duracion) {
            this.titulo= titulo;
            this.artista = artista;
            this.duracion = duracion;
            this.genero = genero;
            this.album = album;
        }

        //6.--------------------------------------------
        //Getter
        public String getTitulo() {
            return titulo;
        }


        public String getArtista() {
            return artista;
        }


        public int getDuracion() {
            return duracion;
        }


        public String getGenero() {
            return genero;
        }


        public String getAlbum() {
            return album;
        }

        //Setter
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }


        public void setArtista(String artista) {
            this.artista = artista;
        }


        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }


        public void setGenero(String genero) {
            this.genero = genero;
        }


        public void setAlbum(String album) {
            this.album = album;
        }


        //7.------------------------------------------
        private int calcularDuracionMinutos() {
            return duracion/SEGUNDOS_POR_MINUTO;
        }

        //8.--------------------------------------------

        final int SEGUNDOS_POR_MINUTO = 60;


        //9.------------------------------------------------------
        public void mostrarInformacion() {
            System.out.println("Titulo: " + titulo);
            System.out.println("Artista: "+ artista);
            System.out.println("Duracion" + duracion);
            System.out.println("Género: " + genero);
            System.out.println("Álbum: " + album);
        }


        public void mostrarInformacion(String nombreUsuarioOyente) {
            mostrarInformacion();

            System.out.println("Escuhado por: " + nombreUsuarioOyente);
        }
    }