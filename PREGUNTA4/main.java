package PREGUNTA4;

public class main {
    public static void main(String[] args) {

        Autor joan = new Autor("Pepe","Luiz Suarez");

        Tema t1 = new Tema("Engaño");
        Tema t2 = new Tema("Orizonte");
        Tema t3 = new Tema("Lagunas");

        Tema t4 = new Tema("Elegante");
        Tema t5 = new Tema("Tristesa");
        Tema t6 = new Tema("Ferreo");

        Capitulo cap1 = new Capitulo("A, La peor desicion");
        cap1.setTema(t1);
        cap1.setTema(t2);
        cap1.setTema(t3);

        Capitulo cap2 = new Capitulo("B, Eramos");
        cap2.setTema(t4);
        cap2.setTema(t5);
        cap2.setTema(t6);

        Libro Ercules =new Libro("Ercules",230239093,"1983");
        System.out.println();
        System.out.println("Libro: "+Ercules.getTitulo());
        System.out.println();
        System.out.println("Codigo: "+Ercules.getCodigo());
        System.out.println();
        System.out.println("Anio de Publicación"+Ercules.getAnioPublicacion());
        System.out.println();
        System.out.println("Capitulo: ");
        System.out.println();
        Ercules.setCapitulo(cap1);
        Ercules.setCapitulo(cap2);

        Ercules.setAutor(joan);


        for (Capitulo c: Ercules.getCapitulo()) {

            System.out.println("Capitulo: "+c.getNombreCapitulo());

            for(Tema t:c.getTema()){

                System.out.println("Temas: "+t.getNombreTema());
            }
            System.out.println();

        }

        for (Autor a: Ercules.getAutor()) {

            System.out.println("Autor: "+a.getNombres()+" "+a.getApellidos());
            System.out.println();

        }

    }
}
