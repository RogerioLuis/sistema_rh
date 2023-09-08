package com.sistema_rh.sistemarh;

public class Atendente1 extends Funcionario1 {

    public Atendente1(String nome, int idade, String endereco, String telefone, String email, int matricula,
            double salarioBase) {
        super(nome, idade, endereco, telefone, email, matricula, salarioBase);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularFGTS() {
        // Construtor para a classe Atendente
    public Atendente1(String nome, int idade, String endereco, String telefone, String email, int matricula, double salarioBase) {
        super(nome, idade, endereco, telefone, email, matricula, salarioBase);
    }

    // Implementação do método calcularDecimoTerceiro para a classe Atendente
    @Override
    public double calcularDecimoTerceiro() {
        // Implemente a lógica de cálculo do 13º salário para Atendente
        // Por exemplo, você pode calcular com base no salário base
        double salarioBase = getSalarioBase();
        return salarioBase / 12; // Exemplo simples: dividir o salário base por 12 meses
    }
    }

    @Override
    public double calcularDecimoTerceiro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularDecimoTerceiro'");
    }

    @Override
    public String toString() {
        return "Atendente1 []";
    }

    @Override
    public double calcularFerias() {
        // TODO Auto-generated method stub
        return super.calcularFerias();
    }

    @Override
    public double calcularINSS() {
        // TODO Auto-generated method stub
        return super.calcularINSS();
    }

    @Override
    public int getMatricula() {
        // TODO Auto-generated method stub
        return super.getMatricula();
    }

    @Override
    public double getSalarioBase() {
        // TODO Auto-generated method stub
        return super.getSalarioBase();
    }

    @Override
    public void setMatricula(int matricula) {
        // TODO Auto-generated method stub
        super.setMatricula(matricula);
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        // TODO Auto-generated method stub
        super.setSalarioBase(salarioBase);
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return super.getEmail();
    }

    @Override
    public String getEndereco() {
        // TODO Auto-generated method stub
        return super.getEndereco();
    }

    @Override
    public int getIdade() {
        // TODO Auto-generated method stub
        return super.getIdade();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public String getTelefone() {
        // TODO Auto-generated method stub
        return super.getTelefone();
    }

    @Override
    public void setEmail(String email) {
        // TODO Auto-generated method stub
        super.setEmail(email);
    }

    @Override
    public void setEndereco(String endereco) {
        // TODO Auto-generated method stub
        super.setEndereco(endereco);
    }

    @Override
    public void setIdade(int idade) {
        // TODO Auto-generated method stub
        super.setIdade(idade);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setTelefone(String telefone) {
        // TODO Auto-generated method stub
        super.setTelefone(telefone);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    
}