package Trab;
import javax.swing.JOptionPane;

public class Trab1 {
    
    public static void main(String[] args) {
        //atividade 1, usar pilhas para resolver problema (caso: desmontar computador)

        //declarados os numero de passos a serem empilhados de forma simples
        int n=Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de passos: "));
        
        //declarado onde serão armazenados os passos
        String vetor[]=new String[n];
        
        //logica simples de empilhamento estatico (sem referencia de proximo ou topo)
        for(int i=0;i<n;i++){
            vetor[i]=JOptionPane.showInputDialog("insira a instrução numero "+(i+1));
        }

        //checar se o usuario deseja "desempilhar" o passo a passo para remontar seu computador
        String resposta=JOptionPane.showInputDialog("Deseja remontar o computador? (s/n).");
        if(resposta!="n"){
            for(int i=n;i>=0;i--){
                //roda passo por passo, desempilhando as instruções para o usuario
                JOptionPane.showMessageDialog(null,"Passo a executar: "+vetor[i-1]);
                n--;
            }
        }else{
            //encerra o programa com mensagem final
            JOptionPane.showMessageDialog(null, "Programa encerrado.");
        }

    }
}
