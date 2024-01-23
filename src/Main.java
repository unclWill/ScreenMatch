/*
 * Autor: William Silva (https://github.com/unclWill)
 * Data : 15/01/2024
 * Curso: Formação Java - Alura | Aplicando Orientação a Objetos
 */

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Filme
        Filme matrix = new Filme();
        matrix.setNome("Matrix");
        matrix.setAnoDeLancamento(1999);
        matrix.setDiretor("Wachowski Sisters");
        matrix.setIncluidoNoPlano(true);
        matrix.setDuracaoEmMinutos(130);
        matrix.exibeFichaTecnica();
        System.out.println("Duração do matrix: " + matrix.getDuracaoEmMinutos());

        System.out.println("Direção: " + matrix.getDiretor() + " minutos");
        matrix.avalia(8);
        matrix.avalia(5);
        matrix.avalia(10);

        System.out.println("Total de avaliações: " + matrix.getTotalDeAvaliacoes());
        System.out.printf("Média de avaliações do matrix: %.1f\n", matrix.obterMediaAvaliacoes());

        Filme starWars = new Filme();
        starWars.setNome("Star Wars");
        starWars.setDuracaoEmMinutos(200);

        // Serie
        Serie theOffice = new Serie();
        theOffice.setNome("The Office");
        theOffice.setAnoDeLancamento(2005);
        theOffice.setTemporadas(9);
        theOffice.setEpisodiosPorTemporada(22);
        theOffice.setMinutosPorEpisodio(20);
        theOffice.setDuracaoEmMinutos(theOffice.getDuracaoEmMinutos());
        theOffice.exibeFichaTecnica();
        System.out.println("Duração total da série: " + theOffice.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.inclui(matrix);
        calc.inclui(starWars);
        calc.inclui(theOffice);
        System.out.println("Duração total = " + calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(matrix);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(theOffice);
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);

        var montyPython = new Filme();
        montyPython.setNome("Monty Python em Busca do Cálice Sagrado");
        montyPython.setDuracaoEmMinutos(200);
        montyPython.setAnoDeLancamento(2003);
        montyPython.avalia(10.0);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(matrix);
        listaDeFilmes.add(starWars);
        listaDeFilmes.add(montyPython);
        System.out.println("DIMENSÃO DA LISTA: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
    }
}