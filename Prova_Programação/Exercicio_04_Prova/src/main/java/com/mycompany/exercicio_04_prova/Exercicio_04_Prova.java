/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_04_prova;

import java.io.DataInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_04_Prova {

    public static void main(String[] args) {
        
        String dado = "Digite um numero para saber seu sucessor e antecessor:";
        int num = 0;
        
        JOptionPane.showInputDialog(null, dado, dado, num);
        
        JOptionPane.showMessageDialog(null,num);
    }
}
