import java.util.*;

class Matriz{

    public void ler(int [][] m){
        Scanner input = new Scanner (System.in);
        for(int i = 0;i < m.length;i++){
            for(int j = 0;j < m[i].length;j++){
                m[i][j] = input.nextInt();
            }
        }
    }

    public int [][] somaM (int [][] a, int [][] b,int numLin,int numCol){
        int [][] c = new int [numLin][numCol];
        for(int i = 0; i < a.length;i++){
            for(int j = 0;j < a[i].length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public boolean verificaigual (int [][] a,int [][] b){
        boolean bool = true;
        for(int i = 0; i < a.length && bool == true;i++){
            for(int j = 0;j < a[i].length && bool == true;j++){
                if (a[i][j] != b[i][j]) bool = false;
            }
        }
        return bool;

    }
    public int [][] oposta (int [][] a){
        for(int i = 0; i < a.length;i++){
            for(int j = 0;j < a[i].length;j++){
                a[i][j] = (-1) * a[i][j];
            }
        }
        return a;
    }

    public void printar (int [][] n){
        for (int i = 0;i < n.length;i++){
            for(int j = 0;j < n[i].length;j++){
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}