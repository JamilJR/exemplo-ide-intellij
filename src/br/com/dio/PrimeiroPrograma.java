package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro = new Livro("The Witcher", 300);

        System.out.println(livro);
    }

}

class Livro {
    private String name;
    private Integer numPaginas;

    public Livro(String name, Integer numPaginas) {
        this.name = name;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
