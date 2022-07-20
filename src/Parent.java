public class Parent {
    public void someFunction(){
        System.out.println("this is from parent class");
    }

}

class ChildOne extends Parent {
    public void someFunction(){
        System.out.println("this is from childone class");
    }
}

class ChildTwo extends ChildOne {
    public void someFunction(){
        System.out.println("this is from childTwo class");
    }
}

class Main extends ChildTwo {
    public static void main(String[] args) {
        Parent mainObj = new Parent();
        mainObj.someFunction();
    }
}
