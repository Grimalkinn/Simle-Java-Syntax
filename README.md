# Simle-Java-Syntax
a java class that that simplifies core java syntax like printing, input, file handling, type checks etc

Usage - simply extend the <SimpleSyntax> class to get access to methods
-----
```java
public class MyClass extends SimpleSyntax {

    public static void main(String[] args) { // example in a static method
        Test test = new Test();
        Myclass.myMethod();

        print(type(0));
    }


    public void myMethod() { // example in a non-static method
        print("Hello, World!");

        String name = input("Enter name: "); 
        int age = itr(input("Enter age: ")); 

        print(age + " " + type(age));

        Object[] objects = new Object[]{1,2,3};
        objects = append(objects, 4);
        print(objects);
    }

}
```
