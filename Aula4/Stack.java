import java.util.*;

class Stack{
    
    
    private ArrayList<String> stack;
    private int tamanho;


    // Construtor por omissão;
    public Stack(){
        this.stack = new ArrayList<>();
        this.tamanho = 0;
    }

    public String top(){
        if (this.tamanho == 0){ // se estiver vazia;
            return "STACK VAZIA";
        }else{
            String topo = stack.get(this.tamanho-1);
            return topo;
        }
    }

    public void pop(){
        if (this.tamanho != 0){
            this.tamanho = this.tamanho -1;
            stack.remove(this.tamanho);
        }
    }

    public void push(String elemento){
        this.stack.add(this.tamanho,elemento);
        this.tamanho+= 1;
    }

    public int length() {
        return this.tamanho;
    }

    public String indice (int x){
        return this.stack.get(x);
    }

    public String toString() {
		return "Stack " + this.stack + ".";
	}

    public Boolean Empty(){
        if (this.tamanho == 0) return true;
        else return false;
    }
}