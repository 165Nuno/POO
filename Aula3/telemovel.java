import java.util.*;

class telemovel{
    
    /* Variáveis por instância */
    private String marca;
    private String modelo;
    private int displayX;
    private int displayY;
    private int dimarm;
    private int dim_total_fotoap;
    private int dim_foto;
    private int dim_ap;
    private int espacoocupado;
    private int numero_de_fotos_ocupadas;
    private int numero_de_aplicacoes_instaladas;
    private String [] nome_das_aplicacoes_instaladas;


    /* Construtor por omissão */
    public telemovel(){
        this.marca = "";
        this.modelo = "";
        this.displayX = 0;
        this.displayY = 0;
        this.dimarm = 0;
        this.dim_total_fotoap = 0;
        this.dim_foto = 0;
        this.dim_ap = 0;
        this.espacoocupado = 0;
        this.numero_de_fotos_ocupadas = 0;
        this.numero_de_aplicacoes_instaladas = 0;
        this.nome_das_aplicacoes_instaladas = new String [0];
    }

    /* Construtor por parametros */
    public telemovel(String a, String b,int c,int d,int e,int f,int g,int h,int i,int k,int l, String [] m){
        this.marca = a;
        this.modelo = b;
        this.displayX = c;
        this.displayY = d;
        this.dimarm = e;
        this.dim_total_fotoap = f;
        this.dim_foto = g;
        this.dim_ap = h;
        this.espacoocupado = i;
        this.numero_de_fotos_ocupadas = k;
        this.numero_de_aplicacoes_instaladas = l;
        this.nome_das_aplicacoes_instaladas = new String [l];

        /* Colocar o nome das aplicacoes no array */
        for (int cont = 0; cont < this.numero_de_aplicacoes_instaladas; cont++){
            this.nome_das_aplicacoes_instaladas[cont] = m[cont];
        }        
    }
    /* Construtor por copia !!!! FIX ME !!!*/
    public telemovel(telemovel tele){
        this.marca = tele.getMarca();
    }

    /* Gets */

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getDisplayX(){
        return this.displayX;
    }
    public int getDisplayY(){
        return this.displayY;
    }
    public int getdimArm(){
        return this.dimarm;
    }
    public int getdim_total_fotoap(){
        return this.dim_total_fotoap;
    }
    public int getDimAP(){
        return this.dim_ap;
    }
    public int getEspacoOcupado(){
        return this.espacoocupado;
    }
    public int getNumerodeFoto(){
        return this.numero_de_fotos_ocupadas;
    }
    public int getNumeroAps(){
        return this.numero_de_aplicacoes_instaladas;
    }
    public String [] getNomeAps(){
        return this.nome_das_aplicacoes_instaladas;
    }

    /* Verifica se ainda existe espaço */
    public boolean existeEspaco(int numeroBytes){
        if ((this.dim_total_fotoap - this.espacoocupado)>0) return true;
        else return false;
    }

    /* Carrega (isto é, instala) uma aplicação nova */
    /* Não estou a considerar o espaco / tamanho) */
    public void instalaApp(String nome, int tamanho){
        this.nome_das_aplicacoes_instaladas[numero_de_aplicacoes_instaladas] = nome;
        this.numero_de_aplicacoes_instaladas++;
        this.espacoocupado += tamanho;
    }


}