/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iniciar;

import Arvore.ABB;
import Arvore.NodeTree;
import Fila.Dynamic_Queue;
import java.util.Scanner;

/**
 *
 * @author Clayton
 */

public class GameHandle {
    
    private int jogadas = 1;
    private boolean continuar;
    
    private NodeTree nodeAtual;
    private final Dynamic_Queue questoes;
    private final ABB arvore = new ABB();
    Scanner leitor = new Scanner(System.in);
    
    public GameHandle(Dynamic_Queue questoes) {
        this.questoes = questoes;
    }
    
    private void iniciarABB() {
        arvore.inserir(questoes);
        nodeAtual = arvore.getRaiz();
    }
    
    public void game() {
        iniciarABB();
        iniciarGame();
    }
    
    private void iniciarGame() {
        System.out.println("Olá, Vamos começar?!");
        
        do {
            System.out.println("\n\nJogadas: " + jogadas);
            System.out.println(this.nodeAtual.toString());
            
            while(nodeAtual.getValue().getClassificacao() != '!') {
                playGame(validar(lerResp()));
                System.out.println(this.nodeAtual.toString());
            }
            
            System.out.println("\nDeseja encerrar?");
            encerraJogo(lerResp());
        } while (continuar);
    }
    
    private String lerResp() {
        return leitor.nextLine();
    }
    
    private String validar(String resposta) {
        if (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")
                || resposta.equalsIgnoreCase("Yes") || resposta.equalsIgnoreCase("Y")
                || resposta.equalsIgnoreCase("Não")|| resposta.equalsIgnoreCase("Nao")
                || resposta.equalsIgnoreCase("No") || resposta.equalsIgnoreCase("N")) {
            return resposta;
        } else {
            System.out.println("Por favor, insira uma resposta válida!");
            System.out.println("\n" + this.nodeAtual.toString());
            resposta = leitor.nextLine();
            return validar(resposta);
        }
    }
    
    private void playGame(String resposta) {
        String resp = resposta;
         if ((resp.equalsIgnoreCase("Nao")|| resposta.equalsIgnoreCase("No") || resposta.equalsIgnoreCase("N")) && nodeAtual.getFilhoDireito() != null) {
            nodeAtual = nodeAtual.getFilhoDireito();
        } else if ((resp.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S")
                || resposta.equalsIgnoreCase("Yes") || resposta.equalsIgnoreCase("Y")) && nodeAtual.getFilhoEsquerdo() != null) {
            nodeAtual = nodeAtual.getFilhoEsquerdo();
        }
    }
    
    private void encerraJogo(String check) {
        if (check.equalsIgnoreCase("Sim") || check.equalsIgnoreCase("S") 
                || check.equalsIgnoreCase("Yes") || check.equalsIgnoreCase("Y")) {
            continuar = false;
        } else if (check.equalsIgnoreCase("Nao") || check.equalsIgnoreCase("Não")
                || check.equalsIgnoreCase("No") || check.equalsIgnoreCase("N")) {
            nodeAtual = arvore.getRaiz();
            jogadas++;
            continuar = true;
        } else {
            System.out.println("Por favor, insira uma resposta válida!\nDeseja encerrar?");
            check = leitor.nextLine();
            encerraJogo(check);
        }
    }     
}
