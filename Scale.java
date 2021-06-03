import java.util.scanner;
public class Scale {

public static void print(int i){
if(n>=1){
print(n-1);
prints(n);
System.out.println();
print(n-1);
}
}

public static prints(int n){
for(int i=0;i<n;i++)
System.out.println("-");
}

public static void printscale(int n,int p){
prints(n);
System.out.println(0);
for(int i=1;i<=p;i++){
print(n-1);
prints(n);
System.out.println(i);
}
}

public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the lenght of scale");
while(!scanner.hasnextInt()){
String snum = scanner.next();
System.out.println("Enter a valid number"); 
}
int l =scanner.nextInt();
System.out.println("Enter the width of scale");
while(!scanner.hasnextInt()){
String snum = scanner.next();
System.out.println("Enter a valid number"); 
}
int w =scanner.nextInt();

printscale(w,l);
}
}
