package projetocoffematch;

public class Pergunta {
    String titulo;
    String descricao1, descricao2, descricao3, descricao4;
    int opcao1, opcao2, opcao3, opcao4;
   
    
    void titulo(){
        System.out.println("Escolha qual opcao desejada tem mais proximidade do seu paladar!");
    
}
    void descricao1(){
        System.out.println("Qual seu aroma preferido?");
    }
    void descricao2(){
        System.out.println("Qual seu corpo preferido?");
    }
    void descricao3(){
        System.out.println("Qual seu sabor preferido?");
    }
    void descricao4(){
        System.out.println("Qual sua acidez preferido?");
    }
    void opcao1(){
        System.out.println("    1- Frutas citricas."
                + "             2- Chocolate."
                + "             3- Mel."
                + "             4- Frutas Vermelhas."
                + "             5- Nozes.");
    }
    
    void opcao2(){
        System.out.println("    1- Aquoso."
                + "             2- Amanteigado."
                + "             3- Aveludado."
                + "             4- Viscoso."
                + "             5- Exotico.");
    }
    void opcao3(){
        System.out.println("    1- Tangerina."
                + "             2- Caramelo."
                + "             3- Melaço."
                + "             4- Exotico."
                + "             5- Avelã.");
    }
    void opcao4(){
        System.out.println("    1- Alta."
                + "             2- Media."
                + "             3- Nenhuma."
                + "             4- Leve.");
    }
    
}
