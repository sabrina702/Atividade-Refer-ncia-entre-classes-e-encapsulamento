/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 13912471673
 */
public class Funcionario {
    private String nomeF;
    private String departamento;
    private double salario;
    private String dataEnt;
    private String Rg;
    boolean ativo;

 
    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEnt() {
        return dataEnt;
    }

    public void setDataEnt(String dataEnt) {
        this.dataEnt = dataEnt;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }
    
    public void bonificado(double aumento){
        this.salario = this.salario+aumento;
        System.out.println("Aumento realizado com sucesso!! ");
        System.out.println("Salario: "+getSalario());
    }
    
    public void mostra(){
        System.out.println("");
        System.out.println("Nome: "+getNomeF());
        System.out.println("Salario: "+getSalario());
        System.out.println("RG: "+getRg());
        System.out.println("Data de entrada: "+getDataEnt());
        System.out.println("Departamento: "+getDepartamento());

    }

    
}