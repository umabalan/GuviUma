import java.io.*;
import java.util.*;
public class Positive
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();


if(n==0)
{
System.out.println("zero");
}
elseif(n>0)
{
System.out.println("positive");
}
else
{
System.out.println("negative");
}
}
