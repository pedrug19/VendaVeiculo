/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaveiculo;

import java.io.*;

/**
 *
 * @author User
 */
public class teste {

    public static void main(String[] args) {
        try {
            File arq = new File("teste.txt");
            if (!arq.canRead()) {
                System.out.println("ERRO");
            } else {
                System.out.println("OK");
            }

        } catch (IOError e) {
            System.out.println("ERRO");
        }
    }
}
