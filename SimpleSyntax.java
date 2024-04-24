import java.io.*;
import java.util.*;

public class SimpleSyntax {
    
    public SimpleSyntax(){}

    // simply print
    public void print(int s) { System.out.println(s); }
    public void print(char s) { System.out.println(s); }
    public void print(byte s) { System.out.println(s); }
    public void print(long s) { System.out.println(s); }
    public void print(float s) { System.out.println(s); }
    public void print(Object o) { System.out.println(o); }
    public void print(double s) { System.out.println(s); }
    public void print(String s) { System.out.println(s); }
    public void print(boolean s) { System.out.println(s); }

    // simply return object type as string
    public String type(Object s){ return s.getClass().getSimpleName(); }

    // simply input
    public String input(){
        Scanner scan = new Scanner(System.in);
        String terminal_input = scan.nextLine();
        scan.close();
        return terminal_input;
    }

    // simply input with msg
    public String input(String msg){
        System.out.print(msg);
        String terminal_input = input();
        return terminal_input;
    }

    // simply read a file
    public String read(String filename, int lines) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){      
            String line = "";
            for (int i=0; i<lines-1; i++)
                line = line.concat(reader.readLine() + "\n");
            return line;
        }
    }

    // simply write or append a file
    public void write(String filename, boolean append, String msg) throws IOException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(filename, append))){
            buffer.write(msg);
        }
    }

    // simply convert to string
    public String str(Object obj){ return String.valueOf(obj); }
    // simply convert to int
    public int num(Object obj){ return (int) Integer.parseInt(str(obj).trim()); }


} 

// END
