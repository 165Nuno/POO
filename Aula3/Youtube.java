import java.util.*;
import java.time.LocalDate;

class Youtube{

    private String nome;
    private int conteudo;
    private LocalDate data;
    private int resX;
    private int resY;
    private int segundos;
    private String [] comentarios;
    private int likes;
    private int unlikes;

    public Youtube(){
        this.nome = "";
        this.conteudo = 0;
        this.data = LocalDate.of(2014,8,1);
        this.resX = 0;
        this.resY = 0;
        this.comentarios = new String[0];
        this.likes = 0;
        this.unlikes = 0;
    }

    public Youtube(String a,int b,LocalDate c,int d,int e,int f,String [] g,int h,int i){
        this.nome = a;
        this.conteudo = b;
        this.data = c;
        this.resX = d;
        this.resY = e;
        this.comentarios = new String[20];

        for (int k = 0; k < 20; k++){
            this.comentarios[k] = g[k];
        }
        this.likes = h;
        this.unlikes = i;

    }

    public void thumbsUp(){
        this.likes += 1;
    }

    public String toString(){
        return (this.nome + "\n" + this.conteudo + "\n" + this.conteudo);
    }
}