import java.util.*;

class pauta{
    public void ler_pauta (int [][] a){
    Scanner input = new Scanner (System.in);
        for(int i = 0;i < a.length;i++){
            System.out.println("Novo aluno" +" "+(i+1));
            for(int j = 0;j < a[i].length;j++){
                a[i][j] = input.nextInt();
            }
        }
    }
    public int somar (int [][] a,int k){
        int soma = 0;
        if (k < a.length){
           for (int i = 0;i<a.length;i++){
               soma += a[i][k];
            } 
        }
        return soma;
    }

    public void printar_linha (){
        for(int i = 0; i < 5; i++){
            System.out.print("-");
        }
        System.out.print("\n");
    } 

    public void printar_pauta(int [][] n){
        for (int i = 0;i < n.length;i++){
            for(int j = 0;j < n[i].length;j++){
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public double media_aluno (int [][] n, int k){
        int soma = 0;
        for(int i = 0; i<n.length;i++){
            soma += n[k][i];
        }
        double media = soma/n.length;
        return media;
    }

    public double media_uc (int [][] n,int k){
        int soma = 0;
        for(int i = 0; i<n.length;i++){
            soma += n[i][k];
        }
        double media = soma/n.length;
        return media;
    }
}


