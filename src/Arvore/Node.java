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

public class Node {
    //Valor do nodo
    private Questoes value;
    //Endereço para o próximo item
    private Node next;
    //Retorna valor do nodo
    public Questoes getValue() {
        return value;
    }
    //Altera valor do nodo
    public void setValue(Questoes value) {
        this.value = value;
    }
    //Retorna endereço do próximo nodo
    public Node getNext() {
        return next;
    }
    //Altera endereço do proximo nodo
    public void setNext(Node next) {
        this.next = next;
    }
}
