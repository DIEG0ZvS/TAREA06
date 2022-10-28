package PREGUNTA4;

public class Capitulo {

    private String nombreCapitulo;
    private Tema tema[];
    private int contadorTema;

    public Capitulo(String nombreCapitulo)
    {
        this.nombreCapitulo = nombreCapitulo;
        this.tema = new Tema[3];
        this.contadorTema = 0;
    }

    public String getNombreCapitulo() {
        return nombreCapitulo;
    }

    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }

    public Tema[] getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema[this.contadorTema] = tema;
        this.contadorTema++;
    }
}