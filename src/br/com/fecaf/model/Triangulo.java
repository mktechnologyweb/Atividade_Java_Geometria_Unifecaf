package br.com.fecaf.model;

import java.util.Scanner;

/* Esta classe formara o Triangulo e irá informar atraves dos métodos e atributos:
 os tipos de triangulo a area, perimetro, e se o triangulo é um triangulo retangulo,
e se o triangulo retangulo é 3, 4, 5, com base na solicitação da classe menu*/

public class Triangulo {
    // O objeto Scanner da biblioteca do java pedira o imput dos dados do triangulo
    // ao usuario
    Scanner scanner = new Scanner(System.in);

    /*
     * Os atributos receberão os valores do imput
     * e o java permitira o acesso delas nos demais metodos
     * atraves do modificador de acesso publico (public)
     */
    public double base, lado2, lado3, area, perimetro, altura;

    /*
     * Em cadastrarTriangulo o java solicitará ao usuario os dados do triangulo
     * para realizar as contas
     */
    public boolean cadastrarTriangulo() {
        System.out.println("*******************");
        System.out.println("/* Cadastrar Triangulo */");
        System.out.println("*******************");
        System.out.println("/* Informe a base */");
        base = scanner.nextDouble();
        System.out.println("Informe o lado2 */");
        lado2 = scanner.nextDouble();
        System.out.println("Informe o lado3 */");
        lado3 = scanner.nextDouble();
        System.out.println("Informe a altura */");
        altura = scanner.nextDouble();
        System.out.println("Triangulo Cadastrado com Sucesso!");
        System.out.println("/******************");
        return true;

    }

    // Este metodo fara o calculo da area caso o usuario solicite pela classe menu
    public void calcularArea() {
        System.out.println("*******************");
        System.out.println("/*  Calculando Area   */");
        System.out.println("*******************");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("*******************");

    }

    // Este metodo fara o calculo do perimetro caso o usuario solicite pela classe
    // menu
    public void calcularPerimetro() {
        System.out.println("*******************");
        System.out.println("/*  Calculando Perimetro   */");
        System.out.println("*******************");

        perimetro = base + lado2 + lado3;

        System.out.println("O perimetro é: " + perimetro);
        System.out.println("*******************");
    }

    /*
     * Este metodo o Triangulo é um Retangulo fara o calculo do triangulo retangulo
     * caso o usuario solicite
     * pela classe menu e informara se é um triangulo retangulo ou apenas um
     * triangulo com as informaçoes
     * dos lados das variaveis (metodos)
     */
    public boolean oTrianguloERetangulo() {
        System.out.println("*******************");
        System.out.println("/*  Calculando Triangulo Retangulo   */");
        System.out.println("*******************");

        // Com base na formula de matemática a² + b² = c²
        // o java responderá se é um triangulo retangulo ou não
        if (lado3 * lado3 == base * base + lado2 * lado2) {
            System.out.println("Este é um triângulo retângulo");
            return true;
        }

        System.out.println(" Este é apenas um triangulo");
        return false;

    }

    /*
     * Com base na formula de matematica a² + b² = c² o java responderá se é
     * um triangulo retangulo ou um triangulo retangulo 3, 4, 5 ou apenas um
     * triangulo
     */
    public boolean eTresQuatroCinco() {
        // utilizamos aqui o calculo a² + b² = c²
        if (lado3 * lado3 == base * base + lado2 * lado2) {

            // Verificação do triangulo retangulo 3, 4, 5
            if (base % 3 == 0 && lado2 % 4 == 0 && lado3 % 5 == 0) {

                System.out.println("Este é um triangulo retangulo do tipo  3, 4, 5");
                return true;
            } else {
                System.out.println("Este é apenas um triângulo retângulo");
                return true;
            }
        }
        System.out.println(" Este é apenas um triangulo");
        return false;
    }

    // aqui sera informado se o triangulo é Isosceles / Escaleno / Equilatero
    public void definirTipo() {

        System.out.println("*******************");
        System.out.println("/*  Definindo tipo  */");
        System.out.println("*******************");

        // O triangulo équilatero tem os lados iguais
        if (base == lado2 && base == lado3) {

            System.out.println("Este Triangulo é Equilatero");
            // Escaleno Possui lados diferentes
        } else if (base != lado2 && base != lado3 && lado2 != lado3) {
            System.out.println("Este triangulo é Escaleno");

        } else {
            // isosceles tem dois lados iguais então ele pode passar no primeiro if
            // dependendo dos valores
            System.out.println("Este Triangulo é Isosceles");
        }
        System.out.println("*******************");
    }

}
