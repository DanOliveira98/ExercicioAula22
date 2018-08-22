/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula22;

/**
 *
 * @author Danie
 */
import javax.swing.JOptionPane;
public class Aula22 {
    public static void main(String Args[]){
        String nome = JOptionPane.showInputDialog("Qual a sua Nome?");
        String idade = JOptionPane.showInputDialog("Qual a sua Idade?");
        int id =(Integer.parseInt(idade));
        if (id >= 18){
            JOptionPane.showMessageDialog(null, nome + " Você pode Tirar a CNH!!!");
        } else {
            String cnh = String.format("Voê tem apenas %d anos", id);
            JOptionPane.showMessageDialog(null, cnh);
        }
        
    }
    
}
