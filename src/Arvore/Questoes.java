/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arvore;

/**
 *
 * @author Clayton
 */

public class Questoes {
    private final String informacoes;
    private final char classificacao;

    public Questoes(String informacoes, char classificacao) {
        this.informacoes = informacoes;
        this.classificacao = classificacao;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public char getClassificacao() {
        return classificacao;
    }
    

    @Override
    public String toString() {
        return informacoes;
    }
}
