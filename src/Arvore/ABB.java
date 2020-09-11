/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arvore;

import Fila.Dynamic_Queue;
import java.util.ArrayList;

/**
 *
 * @author Clayton
 */

public class ABB<Questoes> {

    private NodeTree raiz;
    private Questoes nodo;
    
    public ABB() {
        raiz = null;
    }

    public boolean isEmpty() {
        return (raiz == null);
    }

    public void setRaiz(NodeTree raiz) {
        this.raiz = raiz;
    }

    public NodeTree getRaiz() {
        return raiz;
    }
    
   public void inserir(Dynamic_Queue questoes) {
        NodeTree nodoAtual = raiz;
        Dynamic_Queue filaAux = new Dynamic_Queue();
        ArrayList<NodeTree> listaDeNodos = new ArrayList<>();
        
        while (!questoes.isEmpty()) {
            if (raiz == null) {
                filaAux.enqueue(questoes.dequeue());
                NodeTree novaRaiz = new NodeTree(filaAux.peek());
                nodoAtual = novaRaiz;
                setRaiz(novaRaiz);
            } else {
                while (filaAux.peek().getClassificacao() == '?') {
                    NodeTree add = new NodeTree(questoes.peek());
                    listaDeNodos.add(add);
                    nodoAtual.setFilhoEsquerdo(add);
                    filaAux.enqueue(questoes.dequeue());

                    NodeTree add2 = new NodeTree(questoes.peek());
                    listaDeNodos.add(add2);
                    nodoAtual.setFilhoDireito(add2);
                    filaAux.enqueue(questoes.dequeue());

                    nodoAtual = listaDeNodos.remove(0);
                    filaAux.dequeue();
                }
                while(!questoes.isEmpty()) {
                    questoes.dequeue();
                }
            }
        }
   }

    /*public static void preOrdem(NodeTree node) {
        if (node != null) {
            System.out.println(node.getValue() + "");
            preOrdem(node.getFilhoEsquerdo());
            preOrdem(node.getFilhoDireito());
        }
    }*/

    /*public void emOrdem(NodeTree node) {
        if (node != null) {
            emOrdem(node.getFilhoEsquerdo());
            System.out.println(node.getValue() + "");
            preOrdem(node.getFilhoDireito());
        }
    }*/

    /*public void emNivel_LinkedList() {
        //Método interativo que utiliza uma fila auxiliar 
        NodeTree noAux;
        LinkedList fila = new LinkedList();
        fila.addLast(raiz);
        while (!fila.isEmpty()) {
            noAux = (NodeTree) fila.removeFirst();

            if (noAux.getFilhoEsquerdo() != null) {
                fila.addLast(noAux.getFilhoEsquerdo());
            }

            if (noAux.getFilhoDireito() != null) {
                fila.addLast(noAux.getFilhoDireito());
            }

            System.out.println(noAux.getValue() + "lalalala");
        }
    }*/

    /*public void emNivel_Queue() {
        NodeTree nodeAux;
        Dynamic_Queue queue;

        queue = new Dynamic_Queue();
        queue.enqueue(raiz);

        while (!queue.isEmpty()) {
            nodeAux = (NodeTree) queue.dequeue();
            if (nodeAux.getFilhoEsquerdo() != null) {
                queue.enqueue(nodeAux.getFilhoEsquerdo());
            }

            if (nodeAux.getFilhoDireito() != null) {
                queue.enqueue(nodeAux.getFilhoDireito());
            }

            System.out.println(nodeAux.getValue() + " ");
        }
    }*/
}
