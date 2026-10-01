import java.util.Stack;

public class Pila {
    private Stack<Integer> coleccion;
    public Pila(){
        coleccion=new Stack<>();

    }

    public void push (Integer dato){
        coleccion.push(dato);
    }

    public String binario(){
        StringBuilder sb=new StringBuilder();
        for(int i=coleccion.size()-1;i>=0;i--){
            sb.append(""+coleccion.pop());
        }
        return sb.toString();
    }


}
