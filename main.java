import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class main{
    public static void main(String [] args){
        Matriz m1 = new Matriz(); 
        euromilhoes milhao = new euromilhoes();
        Scanner input = new Scanner (System.in);
        System.out.println("Qual o exercicio que quer executar?");
        int escolha = input.nextInt();

        switch(escolha){
            /* EXERCICIO 7 */
            case 7: 
                int [] h = new int [7];
                int jl;
                int [] chave = new int[7];
                chave = milhao.gera();
                for (int j = 0; j < 7; j++)System.out.print(chave[j] + " ");
                    System.out.print("\n");
                    System.out.println("Digite os números");
                for(int i = 0; i<7; i++){
                 h[i] = input.nextInt();   
                }
                milhao.verifica(h);
                if (milhao.compara(h,chave) == true){
                String b = " ";
                for (int i = 0;i < 50; i++){
                System.out.print(b);
                for (int j = 0; j < 7; j++){
                    System.out.print(h[j] + " ");
                }
                System.out.print("\n");
                b += " ";
                }
                }
                System.out.println(milhao.compara(h,chave));
                break;
            /* EXERCICIO 6 */   
            case 6: 
                System.out.println("numero de linhas");
                int numLin = input.nextInt();
                System.out.println("numero de colunas");
                int numCol = input.nextInt();
                System.out.println("Primeira matriz");
                int [][] m2 = new int[numLin][numCol];
                m1.ler(m2);
                System.out.println("Segunda matriz");
                int [][] m3 = new int[numLin][numCol];
                m1.ler(m3);
                int pauta [][] = m1.somaM(m2,m3,numLin,numCol);
                System.out.print("\n");
                System.out.println("*** Primeira Matriz ***");
                System.out.print("\n");
                m1.printar(m2);
                System.out.print("\n");
                System.out.println("*** Segunda Matriz ***");
                System.out.print("\n");
                m1.printar(m3);
                System.out.print("\n");
                System.out.println("*** Soma das Matrizes ***");
                System.out.print("\n");
                m1.printar(pauta);
                System.out.print("\n");
                System.out.println("*** As Primeiras Duas Matrizes são iguais? ***");
                System.out.print("\n");
                System.out.println(m1.verificaigual(m2,m3));
                System.out.print("\n");
                System.out.println("*** Matriz Oposta da Primeira Matriz ***");
                System.out.print("\n");
                int [][] c = m1.oposta(m2);
                m1.printar(c);
                System.out.print("\n");
                break;
        }
        /*
        System.out.println("numero de linhas");
        int numLin = input.nextInt();
        System.out.println("numero de colunas");
        int numCol = input.nextInt();
        System.out.println("Primeira matriz");
        int [][] m2 = new int[numLin][numCol];
        m1.ler(m2);
        System.out.println("Segunda matriz");
        int [][] m3 = new int[numLin][numCol];
        m1.ler(m3);
        int pauta [][] = m1.somaM(m2,m3,numLin,numCol);
        System.out.print("\n");
        System.out.println("*** Primeira Matriz ***");
        System.out.print("\n");
        m1.printar(m2);
        System.out.print("\n");
        System.out.println("*** Segunda Matriz ***");
        System.out.print("\n");
        m1.printar(m3);
        System.out.print("\n");
        System.out.println("*** Soma das Matrizes ***");
        System.out.print("\n");
        m1.printar(pauta);
        System.out.print("\n");
        System.out.println("*** As Primeiras Duas Matrizes são iguais? ***");
        System.out.print("\n");
        System.out.println(m1.verificaigual(m2,m3));
        System.out.print("\n");
        /*
        Ficha2exercicio1 n1 = new Ficha2exercicio1();
        int [] xd = {1,45,49,57,6};
        int [] manuel = {1,6,5,3,4,9,10};
        int mino = n1.minimo(xd);
        System.out.println("Alinea a)");
        System.out.println(mino);
        System.out.println("Alinea b)");
        int [] l = n1.devolve(xd,1,4);
        for (int i = 0; i<l.length;i++){
            System.out.println(l[i] + " ");
        }
        System.out.println("Alinea c)");
        int [] ze = n1.iguais(xd,manuel);
        for (int i = 0; i<ze.length;i++){
            System.out.println(ze[i] + " ");
        }
        System.out.println("Exercicio 2");
        int [][]pauta;
        pauta = new int [5][5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4;i++){
            for(int j = 0;j < 4;i++){
                pauta[i][j]  = input.nextInt();
            }
        }
        for (int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                System.out.print(pauta[i][j] + "  ");
            System.out.println();
            }
        }
        */

    }
}