import java.util.*;
import java.lang.*;

class euromilhoes{

    public int num = 7;

    // Criação do método para gerar chave
    public int [] gera(){
        int [] key = new int [num];
        Random r = new Random();
        int n;
        for(int i = 0; i < 5; i++){
             n = r.nextInt(50) + 1;
             for(int j = 0; j < 5; j++){
                 if (n == key[j] && j!=i){
                    n = r.nextInt(50) + 1; // gerar outro número caso este já exista
                 }else {
                     key[i] = n;
                 }
          }
        }
        for (int k = 5; k<7; k++){
                 n = r.nextInt(11) + 1;
                for(int j = 5; j < 7; j++){
                    if (n == key[j] && j!=k){
                        n = r.nextInt(11) + 1; // gerar outro número caso este já exista
                    }else {
                     key[k] = n;
                    }
                }
        }
        return key;
    }
             
    // Criação do método para comparar chaves
    public boolean compara(int [] c ,int [] x){
        boolean valor = true;
        for (int i = 0; i < num && valor == true; i++){
            if (c[i] != x[i]) valor = false;
        }
        return valor;
    }

    // Criação do método que verifica as chaves
    public void verifica (int [] c){
        for (int i = 0; i < 5; i++){
            if (c[i] <= 0 || c[i] > 50) System.out.print("Fodeu número");
        }
        for (int i = 5; i < 7; i++){
            if (c[i] <= 0 || c[i] > 12) System.out.print("Fodeu estrela");
        }

    }



}



