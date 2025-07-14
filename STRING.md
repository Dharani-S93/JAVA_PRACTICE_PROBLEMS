### STRING PROGRAMS
### 14/07/2025


### To delete the characters in the string based on the * and the preceding characters

//  INPUT--- leet**co*d*e
//  OUTPUT--- lece(* and its preceding char is to be removed from the string 
//depending on the number of *)

````java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE STRING: ");
    
        String st=s.nextLine();
        Stack <Character> ss=new Stack<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)!='*'){
                ss.push(st.charAt(i));
            }
            else{
                ss.pop();
            }
            
        }
        System.out.print("THE OUTPUT STRING IS: "+ss);
    }
}

````


### OUTPUT

````JAVA
ENTER THE STRING: leet***co*de
THE OUTPUT STRING IS: [l, c, d, e]
````
