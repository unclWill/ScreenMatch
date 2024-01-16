/*
 * Autor: William Silva (https://github.com/unclWill)
 * Data : 15/01/2024
 * Curso: Formação Java - Alura | Aplicando Orientação a Objetos
 */

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.printf("""
                Nome do filme: \t\t%s
                Ano de lançamento: \t%d
                """, nome, anoDeLancamento);
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double obterMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
