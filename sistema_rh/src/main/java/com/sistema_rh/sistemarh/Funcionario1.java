package com.sistema_rh.sistemarh;

public abstract class Funcionario1 extends Pessoa1 implements CalculoSalario {
    private int matricula;
    private double salarioBase;

      // Construtor
      public Funcionario1(String nome, int idade, String endereco, String telefone, String email,
      int matricula, double salarioBase) {
super(nome, idade, endereco, telefone, email);
this.matricula = matricula;
this.salarioBase = salarioBase;
}


public int getMatricula() {
return matricula;
}

public void setMatricula(int matricula) {
this.matricula = matricula;
}

public double getSalarioBase() {
return salarioBase;
}

public void setSalarioBase(double salarioBase) {
this.salarioBase = salarioBase;
}

@Override
public double calcularFGTS() {

return salarioBase * 0.08; 
}

@Override
public double calcularINSS() {

return salarioBase * 0.10; 
}

@Override
public abstract double calcularDecimoTerceiro(); 

@Override
public double calcularFerias() {

return salarioBase * 0.2; 
}
}
