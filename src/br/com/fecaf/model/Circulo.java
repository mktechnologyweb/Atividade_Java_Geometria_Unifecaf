package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    // Isso é um atributo !!!
    public double raio, area, perimetro;

    // Instancia Biblioteca Scanner
    Scanner scanner = new Scanner(System.in);

    /* Cadastrar Novo Circulo
       Isso é um metodo que é uma ação em outras linguagens se chama função
      (Function)*/
    public boolean cadastrarCirculo() {
        System.out.println("/******************************/");
        System.out.println("/*      Cadastro Circulo      */");
        System.out.println("/******************************/");
        System.out.print("Informe o raio do circulo: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso !");
        System.out.println("/******************************/");
        return true;

    }

    // Metodo para calcular Area
    public void calcularArea() {
        System.out.println("/* Calculando Area */");
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area é" + " " + area);

    }

    // Metodo para calcular o perimetro
    public void calcularPerimetro() {
        System.out.println("/* Calculando o Perimetro */");
        perimetro = 2 * Math.PI * raio;
        System.out.println("O perimetro do circulo é" + " " + perimetro);
    }
}
