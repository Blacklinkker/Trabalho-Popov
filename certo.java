package Trab;

import javax.swing.JOptionPane;

public class FilaVetor {
    public static class Cliente{
        int numero;
        String nome;
    }
    public static void main(String[] args) {
        String ordenados="";
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira quantos clientes compõem a fila:"));   
        Cliente vetorFila[]=new Cliente[n];
        
        for(int i=0;i<n;i++){
            vetorFila[i]=new Cliente();
        }

        for(int i=0;i<n;i++){
            vetorFila[i].numero=i+1;
            vetorFila[i].nome=JOptionPane.showInputDialog(null, "Insira o nome do cliente Nº "+vetorFila[i].numero);
        }
        for(int i=0;i<n;i++){
            ordenados+=vetorFila[i].nome+",sendo o cliente Nº "+vetorFila[i].numero+", ";
        }
        JOptionPane.showMessageDialog(null, "Os clientes ordenados e suas posições:"+ordenados);

        JOptionPane.showMessageDialog(null, "A fila esta cheia, os atendimentos começaram!");
        for(int i=0;i<n;i++){
            
            JOptionPane.showMessageDialog(null, "O Cliente Nº "+vetorFila[i].numero+", com o nome de "+ vetorFila[i].nome+" acaba de ser atendido,que venha o proximo!");
            
        }
        JOptionPane.showMessageDialog(null, "Todos os clientes foram atendidos!");

    }
}
