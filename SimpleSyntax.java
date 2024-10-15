import java.io.*;
import java.util.*;

public class SimpleSyntax {
    
    SimpleSyntax(){}

    public static void main(String[] args) {
        // test code here
        Object[] objects = new Object[]{1,2,3};
        objects = append(objects, 4);
        print(objects);
    }

    // simply print
    public static void println(Object obj) {  if (obj != null) System.out.println(obj); else System.out.println(""); }
    public static void print(Object obj) { if (obj != null) System.out.print(obj); else System.out.println(""); }

    // simply print arrays
    public static void print(Object obj[]) { try { System.out.print(Arrays.toString(obj));} catch(Exception ex) {;;} }
    public static void println(Object obj[]) { try { System.out.println(Arrays.toString(obj));} catch(Exception ex) {;;} }

    // simply return object type as string
    public static String type(Object obj){ return obj.getClass().getSimpleName(); }

    // simply input
    public static String input(){
        try (Scanner scan = new Scanner(System.in)){
            String terminal_input = scan.nextLine();
            scan.close();
            return terminal_input;
        }
    }

    // simply input with msg
    public static String input(String msg){
        System.out.print(msg);
        String terminal_input = input();
        return terminal_input;
    }


    // simply read a file
    public static String read(String filename, int lines) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String content = ""; String line = ""; String quanta = ""; 
            int num = 0;

            while ((line = reader.readLine()) != null) 
                content = content.concat(line + "\n"); 
                num++;
            
            if (lines > num || lines <= 0) return content;
            else 
                num = 0; 
                while ((line = reader.readLine()) != null && num <= lines) 
                    quanta = quanta.concat(line + "\n"); num++;
                    num ++;

            return quanta;
        }
    }

    // simply write or append a file
    public static void write(String filename, boolean append, String msg) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, append))){
            writer.write(msg);
        }
    }

    // simply convert to string
    public static String str(Object obj){ return String.valueOf(obj); }

    // simply convert to int
    public static int itr(Object obj){ return (int) Integer.parseInt(str(obj).trim()); }

    // simply append to any array of type Object
    public static Object[] append(Object[] prev, Object data) {
        Object[] newArray = new Object[prev.length +1];
        for (int i = 0; i < prev.length; i++) newArray[i] = prev[i];
        newArray[newArray.length-1] = data;
        return newArray;
    }
 
} 

// END