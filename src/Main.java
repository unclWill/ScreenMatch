/*
 * Autor: William Silva (https://github.com/unclWill)
 * Data : 15/01/2024
 * Curso: Formação Java - Alura | Aplicando Orientação a Objetos
 */

import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Matrix");
        filme.setAnoDeLancamento(1999);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(130);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.printf("Média de avaliações do filme: %.1f", filme.obterMediaAvaliacoes());
    }
}