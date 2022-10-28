package PREGUNTA4;

public class Libro {
    private String titulo;
    private Integer codigo;
    private Autor autor[];
    private int contadorAutor;

    private String anioPublicacion;

    private Capitulo capitulo[];

    private int contadorCapitulo;

    public Libro(){
        this.autor = new Autor[2];
        this.contadorAutor = 0;
    }

    public Libro(String titulo, Integer codigo, String aPublic){
        this.titulo = titulo;
        this.codigo = codigo;
        this.anioPublicacion= aPublic;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor[this.contadorAutor] = autor;
        this.contadorAutor++;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Capitulo[] getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo[this.contadorCapitulo] = capitulo;
        this.contadorCapitulo++;
    }



    public Capitulo[] buscarCapitulo(String nombre) {
        int i;
        int band = 0;

        System.out.println("BUSCAR");

        Scanner sc = new Scanner(System.in);

        System.out.println("BUSCAR: Capitulo Num."); int busqueda = sc.nextInt();
        for(int i=1,i<contadorCapitulo+1;i++){
            if (i==busqueda)
                band=1;
        }
        if (band == 1)
            System.out.println("CAP ENCONTRADO: Capitulo "+ busqueda);
        else
            System.out.println("NO SE ENCONTRO: Capitulo "+ busqueda);
    }
}
