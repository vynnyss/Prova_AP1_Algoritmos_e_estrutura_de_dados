import javax.swing.*;

public class Main {
    public static void ex1(){
        JOptionPane.showMessageDialog(null, "EX1: Converter Fahrenheit para Celsius.");
        double fahr = Double.parseDouble(JOptionPane.showInputDialog("Temperatura em Fahrenheit"));
        double celsius = (fahr - 32) * 5 / 9;
        String celsius_format = String.format("%.2f", celsius);
        JOptionPane.showMessageDialog(null,"A temperatura em celsius é: " + celsius_format + "°C");
    }

    public static void ex2(){
        JOptionPane.showMessageDialog(null, "EX2: Converter Celsius para Fahrenheit.");
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Temperatura em Celsius"));
        double fahr = (celsius * 9 / 5) + 32;
        String fahr_format = String.format("%.2f", fahr);
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + fahr_format + "°F");
    }

    public static void ex3(){
        JOptionPane.showMessageDialog(null, "EX3: Calcular o IMC");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        double imc = peso / (altura*altura);
        String imc_format = String.format("%.2f", imc);
        JOptionPane.showMessageDialog(null,"O imc é: " + imc_format);
    }

    public static void ex4(){
        JOptionPane.showMessageDialog(null, "EX4: Calcular um numero ao quadrado e ao cubo.");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        int quad = num * num;
        int cubo = num * num * num;
        JOptionPane.showMessageDialog(null, "O numero "+ num +" ao quadrado é: " + quad +", e o mesmo numero ao cubo é: " + cubo);
    }

    public static void ex5(){
        JOptionPane.showMessageDialog(null, "EX5: Calcular a area de um triângulo.");
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triangulo(inteiro)"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triangulo(inteiro)"));
        int area = (base*altura) / 2;
        JOptionPane.showMessageDialog(null,"A area do trângulo é: "+area);
    }

    public static void ex6(){
        JOptionPane.showMessageDialog(null, "EX6: Calcular o delta de uma equação de segundo grau.");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
        int delta = (b*b) - (4*a*c);
        JOptionPane.showMessageDialog(null,"O delta é: "+delta);
    }

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();


    }
}