package Trab;

public class Fila{
    //declara os marcadores
    //primeiro da fila
    No primeiro=null;
    //ultimo da fila (onde ela "começa")
    No inicio=null;
    //tamanho da fila
    int tamanho=0;

    //verifica se tem o primeiro cliente na fila
    String verificaPrimeiro(){
        //compara com nulo,se der diferente então temos o primeiro na fila
        if(primeiro==null){
            return null;
        }else{
            return primeiro.info;
        }
    }
    //mostra a quantidade de clientes e ordenados numa String, recebendo o numero de clientes
    String filaEmOrdem(int numeroClientes){
        //criação da String que guarda a fila
        String filaOrdenada="(caixa eletronico está aqui)<== ";
        //laço que ordena os clientes
        for(int i=0;i<numeroClientes;i++){
            filaOrdenada+=(i+1)+"º cliente"+", ";
        }
        return filaOrdenada;
    }

    //retorna se é vazia ou não (se tamanho==0 = "true", de outra forma é "false")
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
            primeiro=no;
        }
        tamanho++;
    }

    //remove componentes da fila
    String retirar(){
        
        //verifica se a fila do caixa não esta vazia
        //utiliza o metodo ja criado para economia de linhas e praticidade
        if(vazia()){
            return null;
        }
        String info=primeiro.info;
        //verifica se apenas tem uma pessoa na fila, se sim zera ela para remover.
        if(tamanho==1){
            inicio=null;
            primeiro=null;
        }else{
            No local=inicio;
            while(local.proximo!= primeiro){
                local=local.proximo;
            }
            primeiro=local;
            primeiro.proximo=null;
        }
        tamanho--;
        return info; 
    }
    
}
