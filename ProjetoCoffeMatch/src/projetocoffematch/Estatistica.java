package projetocoffematch;


public class Estatistica {
    int somatorioTotal;
    int cafe1, cafe2, cafe3, cafe4, cafe5;
    int opcao1, opcao2, opcao3, opcao4;

    public int getSomatorioTotal() {
        return somatorioTotal;
    }

    public void setSomatorioTotal(int somatorioTotal) {
        this.somatorioTotal = somatorioTotal;
    }

    public int getCafe1() {
        return cafe1;
    }

    public void setCafe1(int cafe1) {
        this.cafe1 = cafe1;
    }

    public int getCafe2() {
        return cafe2;
    }

    public void setCafe2(int cafe2) {
        this.cafe2 = cafe2;
    }

    public int getCafe3() {
        return cafe3;
    }

    public void setCafe3(int cafe3) {
        this.cafe3 = cafe3;
    }

    public int getCafe4() {
        return cafe4;
    }

    public void setCafe4(int cafe4) {
        this.cafe4 = cafe4;
    }

    public int getCafe5() {
        return cafe5;
    }

    public void setCafe5(int cafe5) {
        this.cafe5 = cafe5;
    }

    public int getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(int opcao1) {
        this.opcao1 = opcao1;
    }

    public int getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(int opcao2) {
        this.opcao2 = opcao2;
    }

    public int getOpcao3() {
        return opcao3;
    }

    public void setOpcao3(int opcao3) {
        this.opcao3 = opcao3;
    }

    public int getOpcao4() {
        return opcao4;
    }

    public void setOpcao4(int opcao4) {
        this.opcao4 = opcao4;
    }
    
//    
    
    void somatorioTotal(){
        // tudo da opção 1
        if (opcao1 == 1) {
            cafe1 += 20;
        }
        
        if (opcao1 == 2){
            cafe2 += 20;
        }
        
        if (opcao1 == 3){
            cafe3 += 20;
        }
        
        if (opcao1 == 4){
            cafe4 +=20;
        }
        
        if (opcao1 == 5){
            cafe5 += 20;
        }
        
        // tudo da opção 2
        if (opcao2 == 1){
            cafe1 += 20;
        }
        
        if (opcao2 == 2){
             cafe2 += 20;
        }
       
        if (opcao2 == 3){
            cafe3 +=20;
        }
        
        if (opcao2 == 4){
            cafe4 += 20;
        }
        
        if (opcao2 ==5){
            cafe5 += 20;
        }
        
        
        if (opcao3 == 1){
            cafe1 += 20;
        }
        
        if (opcao3 == 2){
            cafe2 += 20;
        }
        
        if (opcao3 == 3){
            cafe3 += 20;
        }
        
        if (opcao3 == 4){
            cafe4 += 20;
        }
        
        if (opcao3 ==5){
            cafe5 += 20;
        }
        
        
        if (opcao4 == 1){
            cafe1 += 20;
        }
        
        if (opcao4 == 2){
            cafe2 += 20;
        }
        
        if (opcao4 == 3){
            cafe3 += 20;
        }
        
        if (opcao4 == 4){
            cafe4 += 20;
        }
       
        if (opcao4 == 5){
            cafe5 += 20;
        }
        
    
        if (cafe1 >= 60) {
        System.out.println ("O cafe que mais aproxima do seu paladar é o CAFÉ TANGERINA.");
    }
    
    
        if (cafe2 >= 60){
        System.out.println ("O cafe que mais aproxima do seu paladar é o CHOCO TOFFEE.");
    }
    
    
        if (cafe3 >= 60){
        System.out.println ("O cafe que mais aproxima do seu paladar é o ROOT'S MEL MELAÇO.");
    }
    
    
        if (cafe4 >= 60){
        System.out.println ("O cafe que mais aproxima do seu paladar é o ROOT'S FRUTA MADURA.");
    }
    
   
        if (cafe5 >= 60){
        System.out.println ("O cafe que mais aproxima do seu paladar é o CHOCO E NUTS.");
    }
      
    } 
    
    
}
