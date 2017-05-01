import java.io.*
import java.util.*
class prog
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
if(n>0){
System.out.println("positive");}
else if(n<0){
System.out.println("negative");}
else{
System.out.println("zero");}
}
}
