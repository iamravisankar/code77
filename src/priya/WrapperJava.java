package priya;

public class WrapperJava {

	public static void main(String[] args) {
		Byte myByte = 10;
	    Integer myInt = 5; 
	    Double myDouble = 5.99; 
	    Character myChar = 'A'; 
	    Boolean myBoolean = true;
	    String myString = myInt.toString();
	    System.out.println("Integer length: "+myString.length());
	    System.out.println("Byte Value: "+myByte.byteValue());
	    System.out.println("Integer Value: "+myInt.intValue());
	    System.out.println("Double Value: "+myDouble.doubleValue());
	    System.out.println("Character Value: "+myChar.charValue());
	    System.out.println("Boolean Value: "+myBoolean.booleanValue());
	    
	}
}


