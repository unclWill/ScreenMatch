/*
 * Autor: William Silva (https://github.com/unclWill)
 * Data : 15/01/2024
 * Curso: Formação Java - Alura | Aplicando Orientação a Objetos
 */

import br.com.alura.screenmatch.modelos.*;

public class Main {
    public static void main(String[] args) {
        // Filme
        Filme filme = new Filme();
        filme.setNome("Matrix");
        filme.setAnoDeLancamento(1999);
        filme.setDiretor("Wachowski Sisters");
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(130);

        filme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos());

        System.out.println("Direção: " + filme.getDiretor() + " minutos");
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.printf("Média de avaliações do filme: %.1f\n", filme.obterMediaAvaliacoes());

        // Serie
        Serie serie = new Serie();
        serie.setNome("Sobrenatural");
        serie.setAnoDeLancamento(2005);
        serie.setTemporadas(15);
        serie.setEpisodiosPorTemporada(22);
        serie.setMinutosPorEpisodio(40);
        serie.exibeFichaTecnica();
        System.out.println("Duração total da série: " + serie.getDuracaoEmMinutos() + " minutos");
    }
}