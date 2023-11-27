

/*

Com tipos curinga podemos fazer metodos que recebem um generico de qualquer tipo


*/

package aula240tiposcuringa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


// tipo coringa = ? interrogacao 

public class Aula240TiposCuringa {

   
  
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
        
        List<String> myStrs = Arrays.asList("maria", "joao", "bob");
        printList(myStrs);
    }
    
    
    // esse method funciona pra qualquer tipo usando coringa = ?
    public static void printList(List<?> list){
        // eu nao posso add elemento na lista
        list.add(3); // erro de compilacao
        
        for (Object obj : list){
            System.out.println(obj);
        }
    }
    
}
