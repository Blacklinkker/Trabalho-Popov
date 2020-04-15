package Trab;
//importa o JOptionPane que é utilizado para mostrar as mensagens e receber informações escritas 
import javax.swing.JOptionPane;

public class FilaVetor {
    //Classe que serve como "No"
    public static class Cliente{
        //qual a posição do cliente na fila
        int numero;
        //nome do cliente
        String nome;
    }
    public static void main(String[] args) {
        //string usada para ilustrar a ordem dos clientes na fila
        String ordenados="";
        
        //solicita o numero de clientes na fila
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira quantos clientes compõem a fila:"));   
        Cliente vetorFila[]=new Cliente[n];
        
        //estancia a classe Cliente no vetor
        for(int i=0;i<n;i++){
            vetorFila[i]=new Cliente();
        }

        //solicita o nome dos clientes e atribui um numero de posição a eles
        for(int i=0;i<n;i++){
            vetorFila[i].numero=i+1;
            vetorFila[i].nome=JOptionPane.showInputDialog(null, "Insira o nome do cliente Nº "+vetorFila[i].numero);
        }

        //Ordena os clientes na string com seus nomes e numeros
        for(int i=0;i<n;i++){
            ordenados+=vetorFila[i].nome+",sendo o cliente Nº "+vetorFila[i].numero+", ";
        }
        //exibe os clientes ordenados na string
        JOptionPane.showMessageDialog(null, "Os clientes ordenados e suas posições:"+ordenados);

        //"inicia" o "atendimento" dos clientes
        JOptionPane.showMessageDialog(null, "A fila esta cheia, os atendimentos começaram!");
        for(int i=0;i<n;i++){
            //exibe os clientes atendidos e seus respectivos numeros
            JOptionPane.showMessageDialog(null, "O Cliente Nº "+vetorFila[i].numero+", com o nome de "+ vetorFila[i].nome+" acaba de ser atendido,que venha o proximo!");
            
            //limpa os valores pois os clientes ja sairam da fila
            vetorFila[i].numero=0;
            vetorFila[i].nome=null;
        }
        //termina o programa exibindo que todos ja foram atendidos
        JOptionPane.showMessageDialog(null, "Todos os clientes foram atendidos!");

    }
}
