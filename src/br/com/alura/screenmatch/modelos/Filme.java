/*
 * Autor: William Silva (https://github.com/unclWill)
 * Data : 15/01/2024
 * Curso: Formação Java - Alura | Aplicando Orientação a Objetos
 */

package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)obterMediaAvaliacoes() / 2;
    }
}
