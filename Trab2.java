package Trab;

import javax.swing.JOptionPane;

public class Trab2 {
    public static void main(String[] args) {
        
        //fila sendo utilizada para armazenar um fila de banco em um caixa eletronico
        
        //estanciação da fila (que está  presente no arquivo "Fila.java")
        Fila clientes=new Fila();
       
        //armazena quantos clientes estão na fila para utilizar no laço
        int clientesFila=Integer.parseInt(JOptionPane.showInputDialog("insira a quantidade de clientes na fila: "));

        //insere os clientes na fila utilizando o metodo cliente.inserir() definido em Fila.java
        //e um laço de repetição com o numero de clientes presentes na fila
        for(int i=0;i<clientesFila;i++){
            clientes.inserir(JOptionPane.showInputDialog("Insira o nome do"+ (i+1)+"º cliente a chegar: "));
        }
        //coloca os clientes em ordem em uma String para facilitar noção da fila
        String ordenados=clientes.filaEmOrdem(clientesFila);
        JOptionPane.showMessageDialog(null, ordenados);

        //remove os clientes em ordem de chegada até não restar nenhum 
        while(clientes.vazia()==false){
            //anuncia que os clientes foram atendidos e solicita o proximo
            JOptionPane.showMessageDialog(null, "O cliente "+clientes.retirar()+" acaba de ser atendido,que venha o proximo!");
        }
        JOptionPane.showMessageDialog(null, "Todos os clientes foram atendidos com sucesso!");
    }
}
