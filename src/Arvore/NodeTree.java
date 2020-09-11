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

public class NodeTree {
    private Questoes value;
    private NodeTree filhoEsquerdo;
    private NodeTree filhoDireito;
    NodeTree raiz;

    @Override
    public String toString() {
        return value.toString();
    }
    
    public NodeTree(Questoes valor){
        this.value = valor;
        this.filhoEsquerdo = null;
        this.filhoDireito = null;
        this.raiz = this;
    } 

    public Questoes getValue() {
        return value;
    }

    public void setRaiz(Questoes value) {
        this.value = value;
    }

    public void setValue(Questoes value) {
        this.value = value;
    }

    public NodeTree getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(NodeTree filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public NodeTree getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(NodeTree filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
    
    
    /*public void emNivel_LinkedList(){
        //Método interativo que utiliza uma fila auxiliar 
        NodeTree noAux;
        LinkedList fila = new LinkedList();
        fila.addLast(raiz);
        while(!fila.isEmpty()){
            noAux = (NodeTree) fila.removeFirst();
            
            if(noAux.getFilhoEsquerdo() !=null){
                fila.addLast(noAux.getFilhoEsquerdo());
            }
            
            if(noAux.getFilhoDireito() != null){
                fila.addLast(noAux.getFilhoDireito());
            }
            
            System.out.println(noAux.getValue()+"lalalala");
        }
    }*/
    
    /*public void emNivel_Queue(){
        NodeTree nodeAux;
        Dynamic_Queue queue;
        
        queue = new Dynamic_Queue();
        queue.enqueue(raiz);
        
        while(!queue.isEmpty()){
            nodeAux = (NodeTree) queue.dequeue();
            if(nodeAux.getFilhoEsquerdo() != null)
                queue.enqueue(nodeAux.getFilhoEsquerdo());
            
            if(nodeAux.getFilhoDireito() != null)
                queue.enqueue(nodeAux.getFilhoDireito());
            
            System.out.println(nodeAux.getValue() + " ");
        }  
    }*/
}
