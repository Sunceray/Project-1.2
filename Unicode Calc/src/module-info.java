import java.util.*;
class first
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter first string : ");
String s1 = sc.nextLine();
System.out.print("Enter second string : ");
String s2 = sc.nextLine();
System.out.println();

int sm1 = 0 , sm2 = 0, c;
for(int i=0;i<s1.length();i++)
{
c = (int)s1.charAt(i);
System.out.println(s1.charAt(i)+" : "+c);
sm1 += c;
}
System.out.println();
for(int i=0;i<s2.length();i++)
{
c = (int)s2.charAt(i);
System.out.println(s2.charAt(i)+" : "+c);
sm2+=c;
}
System.out.println();
int ab = Math.abs(sm1-sm2);
System.out.println("Sum of first string : "+sm1);
System.out.println("Sum of second string : "+sm2);
System.out.println("Absolute difference is : "+ab);

}
}
