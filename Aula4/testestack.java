import java.util.*;

class testestack{

    public static void main (String [] args){
        Stack stack = new Stack();
        System.out.println("ADICIONAR ELEMENTOS A STACK....");
        stack.push("Zé");
        stack.push("Olá");
        stack.push("Teste");
        stack.push("GRINCHHHHHHHHHHHHH");
        System.out.println("TAMANHO DA STACK " + stack.length());
        System.out.println("ESTA VAZIA: " + stack.Empty());
        System.out.println("STACK NESTE MOMENTO " + stack.toString());
        System.out.println("ELEMENTO DO TOPO: " + stack.top());
        stack.pop();
        System.out.println("STACK NESTE MOMENTO " + stack.toString());

    }
}