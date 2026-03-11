//Nome: Thiago Mussolino Tincani Ribeiro
//Aula 3

import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // EXERCÍCIO 1
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num > 20) {
            int metade = num / 2;
            System.out.println("Metade: " + metade);
        }

        // EXERCÍCIO 2
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // EXERCÍCIO 3
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Números iguais");
        } else {
            if (n1 > n2) {
                System.out.println("Diferença: " + (n1 - n2));
            } else {
                System.out.println("Diferença: " + (n2 - n1));
            }
        }

        // EXERCÍCIO 4
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("Ordem decrescente: " + num1 + ", " + num2);
        } else {
            System.out.println("Ordem decrescente: " + num2 + ", " + num1);
        }

        // EXERCÍCIO 6
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = sc.next();

        double pesoIdeal;

        if (sexo.equals("M") || sexo.equals("m")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("Peso ideal: " + pesoIdeal);

        // EXERCÍCIO 7
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite os anos de trabalho: ");
        int anos = sc.nextInt();

        double bonus;

        if (anos >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.println("Bônus: " + bonus);

        // EXERCÍCIO 8
        System.out.print("Digite a senha: ");
        String senha = sc.next();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        // EXERCÍCIO 9
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double prestacao = sc.nextDouble();

        if (prestacao <= salarioBruto * 0.30) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }

        // EXERCÍCIO 10
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Os números são iguais");
        } else {
            int maior = a;

            if (b > maior) {
                maior = b;
            }

            if (c > maior) {
                maior = c;
            }

            System.out.println("Maior número: " + maior);
        }

        // EXERCÍCIO 11
        System.out.print("Digite a idade do nadador: ");
        int idadeNadador = sc.nextInt();

        if (idadeNadador >= 5 && idadeNadador <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idadeNadador <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idadeNadador <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idadeNadador <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idadeNadador >= 18) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade fora das categorias");
        }

        // EXERCÍCIO 12
        System.out.print("Digite o salário: ");
        double salarioINSS = sc.nextDouble();

        double desconto;

        if (salarioINSS <= 600) {
            desconto = 0;
        } else if (salarioINSS <= 1200) {
            desconto = salarioINSS * 0.20;
        } else if (salarioINSS <= 2000) {
            desconto = salarioINSS * 0.25;
        } else {
            desconto = salarioINSS * 0.30;
        }

        System.out.println("Desconto INSS: R$ " + desconto);

        // EXERCÍCIO 13
        System.out.print("Digite o primeiro número: ");
        double numA = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numB = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        if (operacao == '+') {
            System.out.println("Resultado: " + (numA + numB));
        }
        else if (operacao == '-') {
            System.out.println("Resultado: " + (numA - numB));
        }
        else if (operacao == '*') {
            System.out.println("Resultado: " + (numA * numB));
        }
        else if (operacao == '/') {
            if (numB > 0) {
                System.out.println("Resultado: " + (numA / numB));
            } else {
                System.out.println("Impossível dividir!!");
            }
        }
        else {
            System.out.println("Sinal inválido");
        }

        // DESAFIO
        System.out.print("Digite sua idade: ");
        int idadeVoto = sc.nextInt();

        if (idadeVoto < 16) {
            System.out.println("Não pode votar.");
        }
        else if (idadeVoto < 18) {
            System.out.println("Voto facultativo.");
        }
        else if (idadeVoto < 70) {
            System.out.println("Voto obrigatório.");
        }
        else {
            System.out.println("Voto facultativo.");
        }

        sc.close();
    }
}
