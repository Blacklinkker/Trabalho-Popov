package Trab;

import javax.swing.JOptionPane;

public class Trab2 {
    public static void main(String[] args) {
        //adaptar para vetor como ele pede no trabalho
        //precisamos da ideia de "problema" a ser resolvido
        Fila f=new Fila();
        f.inserir(JOptionPane.showInputDialog("Insira um valor"));
        f.inserir(JOptionPane.showInputDialog("Insira outro valor"));   
        f.inserir(JOptionPane.showInputDialog("Insira um valor"));
        while(!f.vazia()){
            JOptionPane.showMessageDialog(null, f.retirar());
        }
    }
}