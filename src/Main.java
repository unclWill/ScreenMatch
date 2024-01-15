/*
 * Autor: William Silva (https://github.com/unclWill)
 * Data : 15/01/2024
 * Curso: Formação Java - Alura | Aplicando Orientação a Objetos
 */

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Matrix";
        filme.anoDeLancamento = 1999;
        filme.incluidoNoPlano = true;
        filme.totalDeAvaliacoes = 0;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.printf("Média de avaliações do filme: %.1f", filme.obterMediaAvaliacoes());
    }
}