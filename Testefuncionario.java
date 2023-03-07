/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author 13912471673
 */
public class Testefuncionario {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Funcionario f = new Funcionario();
        System.out.println("Digite o nome:");
        f.setNomeF(entrada.nextLine());
        System.out.println("Digite o salario: ");
        f.setSalario(entrada.nextDouble());
        System.out.println("Digite o departamento: ");
        clearBuffer(entrada);
        f.setDepartamento(entrada.nextLine());
        System.out.println("Digite o RG: ");
        f.setRg(entrada.nextLine());
        System.out.println("Digite a data de entrada: ");
        f.setDataEnt(entrada.nextLine());
        
        f.mostra();
        
        System.out.println("");
        System.out.println("Digite o valor do aumento: ");
        f.bonificado(entrada.nextDouble());
        
        

    }
        private static void clearBuffer(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
}

