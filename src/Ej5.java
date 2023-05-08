
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
public class Ej5 {

    public enum format {
        wav, mp3, midi, avi, mov, mpg, cdAudio, dvd
    }

    protected String titulo;
    protected String autor;
    protected format formato;
    protected String duracion;
    ArrayList<String> titulos;
    ArrayList<String> autores;

    public Ej5(String titulo, String autor, format formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public format getFormato() {
        return formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(format formato) {
        this.formato = formato;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: " + formato + "\nDuracion: " + duracion;
    }

    public boolean equals(Ej5 m) {
        boolean devolver = false;
        if (m.getAutor().equals(autor) && m.getTitulo().equals(titulo)) {
            devolver = true;
        }
        return devolver;
    }
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
    }
}
