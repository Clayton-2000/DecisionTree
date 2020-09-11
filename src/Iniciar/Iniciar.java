/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iniciar;

import Arvore.Questoes;
import Fila.Dynamic_Queue;

/**
 *
 * @author Clayton
 */

public class Iniciar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jogo_One();
    }
    
    public static void jogo_One() {
        Questoes p1,p2,p3,r1,r2,r3,r4;
        p1 = new Questoes("O animal come carne?", '?');
        p2 = new Questoes("O animal tem listras?", '?');
        p3 = new Questoes("O animal tem listras?", '?');
        r1 = new Questoes("Tigre", '!');
        r2 = new Questoes("Leopardo", '!');
        r3 = new Questoes("Zebra", '!');
        r4 = new Questoes("Cavalo", '!');
        
        Dynamic_Queue perguntas = new Dynamic_Queue();
        perguntas.enqueue(p1);
        perguntas.enqueue(p2);
        perguntas.enqueue(p3);
        perguntas.enqueue(r1);
        perguntas.enqueue(r2);
        perguntas.enqueue(r3);
        perguntas.enqueue(r4);
        
        GameHandle jogo = new GameHandle(perguntas);
        jogo.game();
    }
}
    

