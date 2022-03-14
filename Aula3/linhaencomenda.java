import java.util.*;

class linhaencomenda{

    private String referencia;
    private String descricao;
    private double preco_antes_impostos;
    private int quantidade;
    private double iva;
    private double desconto_comercial;

    public linhaencomenda(){
        this.referencia = "";
        this.descricao = "";
        this.preco_antes_impostos = 0;
        this.quantidade = 0;
        this.iva = 0;
        this.desconto_comercial = 0;
    }  

    public linhaencomenda(String a,String b,double c,int d,double e,double f){
        this.referencia = a;
        this.descricao = b;
        this.preco_antes_impostos = c;
        this.quantidade = d;
        this.iva = e;
        this.desconto_comercial = f;
    }  

    public linhaencomenda(linhaencomenda encomenda){
        this.referencia = encomenda.getReferencia();
        this.descricao = encomenda.getDescricao();
        this.preco_antes_impostos = encomenda.getPreco();
        this.quantidade = encomenda.getQuantidade();
        this.iva = encomenda.getIva();
        this.desconto_comercial = encomenda.getDesconto();
    }

    public String getReferencia(){
        return this.referencia;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public double getPreco(){
        return this.preco_antes_impostos;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getIva(){
        return this.iva;
    }

    public double getDesconto(){
        return this.desconto_comercial;
    }

    public String toString(){
        return " Referência : " + this.referencia + "\n" + " Descrição : " + this.descricao + "\n" + " Preço antes do Imposto : " + this.preco_antes_impostos + "\n" + " Quantidade : " + this.quantidade + "\n" + " Iva : " + this.iva + "\n" + " Desconto : " + this.desconto_comercial + "\n";
    }

    public double CalculaValorDesconto(){
        double x = this.preco_antes_impostos * this.quantidade * ((100-this.desconto_comercial)/100);
        return x;
    }

    public double calculaValorLinhaEnc(){
        double x = ((this.iva * this.preco_antes_impostos) + (this.preco_antes_impostos * (this.desconto_comercial/100))) * this.quantidade;
        return x;
    }

}