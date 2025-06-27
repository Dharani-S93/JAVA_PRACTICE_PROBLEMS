## CODE

````JAVA
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int c=0;
	while(n>0){
	    n=n/10;
	    c++;
	}
		System.out.println(c);
	}
}
````

## OUTPUT

````JAVA
ENTER THE VALUE OF N: 
10000000
THE OUTPUT IS: 8

````

### CODE

````JAVA
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE VALUE OF N: ");
	int n=s.nextInt();
	if(n==0){
	    System.out.println("THE OUTPUT IS: "+1);;
	}
	else{
	    int d=(int) Math.floor(Math.log10(Math.abs(n)))+1;
		System.out.println("THE OUTPUT IS: " +d);
	}
	}
}
````


### OUTPUT

````JAVA
ENTER THE VALUE OF N: 
0000
THE OUTPUT IS: 1

ENTER THE VALUE OF N: 
-23425
THE OUTPUT IS: 5

````

### CODE

````JAVA
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE VALUE OF N: ");
	int n=s.nextInt();
	 n=Math.abs(n);
	int c=0;
	
	if(n==0){
	    c=1;
	}
	
	while(n>0){
	    int ld=n%10;   //TAKES THE LAST DIGIT
	    if(ld==0){       // IF IT IS 0- THEN COUNT INCREMENTS 
	        c++;
	    }
	    n/=10; // REMOVES THE LAST DIGIT
	}
	System.out.println("THE OUTPUT IS: "+c);
	
		}
	}


````


### OUTPUT

````JAVA
ENTER THE VALUE OF N: 
8990002
THE OUTPUT IS: 3

````
