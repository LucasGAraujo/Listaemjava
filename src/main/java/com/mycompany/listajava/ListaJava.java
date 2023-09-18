/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listajava;
import java.util.Scanner;
/**
 *
 * @author lukin
 */

public class ListaJava {
public static int contarVogais(String texto) {
        int count = 0;
        texto.toUpperCase();
        String vogais = "AEIOU";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (vogais.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
public static boolean Palidorica(String valor) {
       valor = valor.replaceAll("[^a-zA-Z]", "");
        int length = valor.length();
        for (int i = 0; i < length / 2; i++) {
            if (valor.charAt(i) != valor.charAt(length - i - 1)) {
                return false; 
            }
        }
        return true; 
    }
public static String ValorExtensos(int valor) {
        String[] digitos = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String numeroPorExtenso = "";
        String numeroComoString = Integer.toString(valor);

  for (int i = 0; i < numeroComoString.length(); i++) {
      
            char digitoChar = numeroComoString.charAt(i);
            int digitoInt = Character.getNumericValue(digitoChar);
            numeroPorExtenso += digitos[digitoInt];
            if (i < numeroComoString.length() - 1) {
                numeroPorExtenso += ", ";
            }
        }
        return numeroPorExtenso;
    }

  public static boolean ehConector(String palavra) {
        String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        for (String conector : conectores) {
            if (palavra.equals(conector)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Exercicio A-----------------");
         Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma String: ");
        String stringdigitado = sc.nextLine();
        System.out.println("O número de caracteres da string digitada é: " + stringdigitado.length());
        System.out.println("");
        System.out.println("Exercicio B-----------------");
        System.out.println("A string com todas as letras maisculas: " + stringdigitado.toUpperCase());
        System.out.println("");
        System.out.println("Exercicio C-----------------");
        int numerodevogais = contarVogais(stringdigitado);
        System.out.println("Numeros de vogais achadas : " + numerodevogais);
        System.out.println("");
        System.out.println("Exercicio D-----------------");
        if(stringdigitado.substring(0,3).equalsIgnoreCase("INF")) {
            System.out.println("Possui INF no começo da palavra ... ");
        }else {
            System.out.println("Não possui INF no começo da palavra");
        }
        System.out.println("");
        System.out.println("Exercicio E-----------------");
        if(stringdigitado.toUpperCase().endsWith("NET")) {
            System.out.println("Possui NET no final da palavra"
                    );
        }else {
            System.out.println("Não possui NET no começo da palavra");
        }
        System.out.println("");
        System.out.println("Exercicio F-----------------");
        String doisdigitos = stringdigitado.substring(0,2);
        System.out.println("Os 2 primeiro digito das string: " + doisdigitos);
        System.out.println("");
        System.out.println("Exercicio G-----------------");
        boolean palindromo = Palidorica(stringdigitado);
        if(palindromo == true) {
            System.out.println("É palindromo....");
        }else {
            System.out.println("Não e palindromo");
        }
        System.out.println("");
        System.out.println("Exercicio 2-----------------");
        System.out.println("Digite um numero: ");
        int digitos = sc.nextInt();
        String valoreme = ValorExtensos(digitos);
        System.out.println("Valor por extenso: " + valoreme);
        
        System.out.println("");
        System.out.println("Exercicio 3-----------------");
        System.out.println("Digite um Nome completo: ");
        String nomeCompleto = sc.nextLine();
         String[] palavras = nomeCompleto.split(" ");
        StringBuilder iniciais = new StringBuilder();

        for (String palavra : palavras) {
            if (!ehConector(palavra)) {
                iniciais.append(Character.toUpperCase(palavra.charAt(0))); 
            }
        }
        System.out.println("Iniciais: " + iniciais.toString());
        System.out.println("");
        System.out.println("Exercicio 4----------------- EM ANDAMENTO...");
        
    } 
}
