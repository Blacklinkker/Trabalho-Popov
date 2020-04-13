package Trab;

public class Fila{
    //declara os marcadores
    No cabeca=null;
    No inicio=null;
    int tamanho=0;

    //verifica se tem cabeça da fila
    String verificaCabeca(){
        if(cabeca==null){
            return null;
        }else{
            return cabeca.info;
        }
    }

    //retorna se é vazia ou não
    boolean vazia(){
        return tamanho==0;
    }

    //insere componentes na fila
    void inserir(String info){
        No no= new No();
        no.info=info;
        no.proximo=inicio;
        inicio=no;
        if(tamanho==0){
            cabeca=no;
        }
        tamanho++;
    }

    //remove componentes da fila
    String retirar(){
        //verifica se nao esta vazia
        if(vazia()){
            return null;
        }
        String info=cabeca.info;
        //verifica se tem apenas a cabeca, se sim zera ela
        if(tamanho==1){
            inicio=null;
            cabeca=null;
        }else{
            No local=inicio;
            while(local.proximo!= cabeca){
                local=local.proximo;
            }
            cabeca=local;
            cabeca.proximo=null;
        }
        tamanho--;
        return info; 
    }
    
}