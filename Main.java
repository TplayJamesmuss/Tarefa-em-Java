import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // EXERCÍCIO 1
        String nomeCompleto = "Thiago Mussolino Tincani Ribeiro";
        String ra = "1142817406";
        String curso = "Análise e Desenvolvimento de Sistemas";

        System.out.println(nomeCompleto);
        System.out.println(ra);
        System.out.println(curso);

        // EXERCÍCIO 2
        int idade = 18;
        double altura = 1.80;
        String status = "Presente";

        System.out.println(idade);
        System.out.println(altura);
        System.out.println(status);

        // EXERCÍCIO 3
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int produto = num1 * num2;
        System.out.println("Produto: " + produto);

        // EXERCÍCIO 4
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        System.out.print("Digite o quarto número: ");
        int n4 = sc.nextInt();

        int soma = n1 + n2 + n3 + n4;
        System.out.println("Soma: " + soma);

        // EXERCÍCIO 5
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);

        // EXERCÍCIO 6
        double exp1 = (20 - 15) / 2.0;
        double exp2 = Math.pow(2, (5.0 / 20.0)) + 30.0 / Math.pow(15, 2);
        double exp3 = 35.0 / (6 + 2);
        int exp4 = 23 % 4;


        System.out.println("(20 - 15) / 2 = " + exp1);
        System.out.println("2^(5/20) + 30/(15^2) = " + exp2);
        System.out.println("35 / (6+2) = " + exp3);
        System.out.println("23 módulo 4 = " + exp4);

        // EXERCÍCIO 7
        System.out.println((120 - 30) == Math.pow(3, 30));
        System.out.println(!((20 % 4) == 1) || (9 != 9));
        System.out.println((5 % 2) > 3);
        System.out.println('a' == 'A');

        // EXERCÍCIO 8
        double media4 = (8.0 + 7.5 + 4.5 + 9.0) / 4;
        System.out.println("Média: " + media4);

        // EXERCÍCIO 9
        double lado = 350.0;
        double areaQuadrado = lado * lado;
        System.out.println("Área do quadrado: " + areaQuadrado + " m²");

        // EXERCÍCIO 10
        double pi = 3.14159;
        double raio = 5.0;
        double areaCirculo = pi * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + areaCirculo + " cm²");

        // EXERCÍCIO 11
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idadeAtual = anoAtual - anoNascimento;
        int idade2030 = 2030 - anoNascimento;

        System.out.println("Idade atual: " + idadeAtual);
        System.out.println("Idade em 2030: " + idade2030);

        // EXERCÍCIO 12
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raiz = Math.sqrt(numero);
        double potencia10 = Math.pow(numero, 10);

        System.out.println("Número ao quadrado: " + quadrado);
        System.out.println("Número ao cubo: " + cubo);
        System.out.println("Raiz quadrada: " + raiz);
        System.out.println("Número elevado à potência 10: " + potencia10);

        sc.close();
    }
}
