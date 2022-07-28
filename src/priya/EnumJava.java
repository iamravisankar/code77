package priya;
//import java.util.Scanner;
enum Color{
Saffron, Green, Yellow, White,
Black, violet, Grey;
}
public class EnumJava{
Color color;
public EnumJava (Color color){
this.color = color;
}
public void colorIsLike (){
switch (color){
case Saffron:
System.out.println("saffron color signifies peace.");
break;
case Green:
System.out.println("Green is an ecofriendly color.");
break;
case Yellow:
System.out.println("Yellow is an bright color.");
break;
case White:
System.out.println("White is a soothing color.");
break;
default:
System.out.println("Grey is a neutral color with dull mood.");
break;
}
}
public static void main (String [] args)
{
String str = "Yellow";
EnumJava t1 = new EnumJava (Color.valueOf(str));
t1.colorIsLike();
}
}
