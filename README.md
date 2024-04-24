# Simle-Java-Syntax
a java class that that simplifies java syntax like printing, input, file handling, type checks etc

Usage
-----
```java
public class Test extends SimpleSyntax {

    public void run() {
        print("Hello, World!");
        String age = input("Enter age: ");
        age = num(age);
        print(age + " " + type(age));
    }

  public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }

}
```
