/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        
        
        System.out.println("IDConta: ");
        conta1.setIdConta(entrada.nextLine());
        System.out.println("Produto: ");
        produto1.setDescricaoProduto(entrada.nextLine());
        System.out.println("Nome do cliente: ");
        cliente1.setNomeCliente(entrada.nextLine());
        System.out.println("CPF do cliente: ");
        cliente1.setCpf(entrada.nextLine());
        System.out.println("Valor do produto: ");
        produto1.setValorProduto(entrada.nextDouble());
        clearBuffer(entrada);
        System.out.println("Data de Vencimento: ");
        conta1.setDataVencimento(entrada.nextLine());
        System.out.println("Data de Pagamento: ");
        conta1.setDataPagamento(entrada.nextLine());
        
        //System.out.println("IDConta: ");
        //conta2.setIdConta(entrada.nextLine());
        //System.out.println("Produto: ");
        //produto2.setDescricaoProduto(entrada.nextLine());
        //System.out.println("Nome do cliente: ");
        //cliente2.setNomeCliente(entrada.nextLine());
        //System.out.println("CPF do cliente: ");
        //cliente2.setCpf(entrada.nextLine());
        //System.out.println("Valor do produto: ");
        //produto2.setValorProduto(entrada.nextDouble());
        //clearBuffer(entrada);
        //System.out.println("Data de Vencimento: ");
        //conta2.setDataVencimento(entrada.nextLine());
        //System.out.println("Data de Pagamento: ");
        //conta2.setDataPagamento(entrada.nextLine());
        
        conta1.visuallizarConta();
        
        
        
        
    }
     private static void clearBuffer(Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
