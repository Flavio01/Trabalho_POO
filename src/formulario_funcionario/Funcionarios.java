/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario_funcionario;

import java.util.ArrayList;

/**
 *
 * @author FLAVIO RICARDO
 */
public class Funcionarios {
    private String codigo ;
    private String apelido;
    private String nomeCompleto;
    private String dataNascimento;
    private String numeroBI;
    private String genero ;
    private String naturalidade;
    private String email;
    private double salario ;
    private String estadoCivil;
    private int contactos;
    private String endereco;
    private String observacao ;
    
    
    private ArrayList<Funcionario> ListaFuncionarios ;
 
        
    
    public Funcionarios() { 
      //  ListaFuncionarios = new ArrayList ();
           
    }

   // public Funcionarios(ArrayList<Funcionario> ListaFuncionarios) {
     //   this.ListaFuncionarios = ListaFuncionarios;
    //}
     
    
    public Funcionarios(String codigo, String apelido, String nomeCompleto, String dataNascimento, String numeroBI, String genero, String naturalidade, String email, double salario, String estadoCivil, int contactos, String endereco, String observacao) {
        this.codigo = codigo;
        this.apelido = apelido;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.numeroBI = numeroBI;
        this.genero = genero;
        this.naturalidade = naturalidade;
        this.email = email;
        this.salario = salario;
        this.estadoCivil = estadoCivil;
        this.contactos = contactos;
        this.endereco = endereco;
        this.observacao = observacao;
        ListaFuncionarios = new ArrayList (); 
    }
     
    public String getCódigo() {
        return codigo;
    }

    public void setCódigo(String Código) {
        this.codigo = Código;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroBI() {
        return numeroBI;
    }

    public void setNumeroBI(String numeroBI) {
        this.numeroBI = numeroBI;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getContactos() {
        return contactos;
    }

    public void setContactos(int contactos) {
        this.contactos = contactos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return ListaFuncionarios;
    }

    public void setListaFuncionarios(ArrayList<Funcionario> ListaFuncionarios) {
        this.ListaFuncionarios = ListaFuncionarios;
    }

    public void addFunc(Funcionario F){
        ListaFuncionarios.add(F);
    }
}
