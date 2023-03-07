/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contasPagas;

/**
 *
 * @author Lenovo
 */
public class Conta {
    private String idConta;
    private String DataVencimento;
    private String DataPagamento;
    Produto pro;
    Cliente cli;

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(String DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    public String getDataPagamento() {
        return DataPagamento;
    }

    public void setDataPagamento(String DataPagamento) {
        this.DataPagamento = DataPagamento;
    }
    
    public void visuallizarConta(){
        System.out.println("IDConta: "+idConta);
        System.out.println("Produto: "+pro.getDescricaoProduto());
        System.out.println("Nome do cliente: "+cli.getNomeCliente());
        System.out.println("CPF do cliente: "+cli.getCpf());
        System.out.println("Valor do produto: "+pro.getValorProduto());
        System.out.println("Data de Vencimento: "+DataVencimento);
        System.out.println("Data de Pagamento: "+DataPagamento);
    }
}
