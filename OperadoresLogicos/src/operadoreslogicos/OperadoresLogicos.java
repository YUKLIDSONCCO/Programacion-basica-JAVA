
package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //Operador AND (&&)
        boolean resultadoAND = esVerdadero && esFalso;
        System.out.println("AND:"+ resultadoAND);
        
        //Operador OR (||)
        boolean resultadoOR = esVerdadero || esFalso;
        System.out.println("OR: "+ resultadoOR );
        
        //Operador NOT (!)
        boolean resultadoNOT = !esVerdadero;
        System.out.println("NOT:"+ resultadoNOT);
        
        
    }
    
}
