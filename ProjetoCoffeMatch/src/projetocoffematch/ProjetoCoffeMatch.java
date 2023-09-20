package projetocoffematch;

import java.util.Scanner;


public class ProjetoCoffeMatch {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       Pergunta p1 = new Pergunta();
       Estatistica estatistica = new Estatistica();
       Resposta resposta = new Resposta();
       
       
       
       p1.titulo();
       p1.descricao1();
       p1.opcao1();
       estatistica.setOpcao1(scan.nextInt());
       
       p1.titulo();
       p1.descricao2();
       p1.opcao2();
       estatistica.setOpcao2(scan.nextInt());
       
       p1.titulo();
       p1.descricao3();
       p1.opcao3();
       estatistica.setOpcao3(scan.nextInt());
       
       p1.titulo();
       p1.descricao4();
       p1.opcao4();
       estatistica.setOpcao4(scan.nextInt());
       
       estatistica.somatorioTotal();
       
       
        
    }
    
}
