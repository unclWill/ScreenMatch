/*
 * Autor: William Silva (https://github.com/unclWill)
 * Data : 15/01/2024
 * Curso: Formação Java - Alura | Aplicando Orientação a Objetos
 */

public class Filme {
    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    public double somaDasAvaliacoes;
    public int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public void exibeFichaTecnica() {
        System.out.printf("""
                Nome do filme: \t\t%s
                Ano de lançamento: \t%d
                """, nome, anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double obterMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
