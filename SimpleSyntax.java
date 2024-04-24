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


    // simply loop through arrays
    // public void traverse(Object a) { System.out.println(Arrays.toString(a)); }

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

 

    // simply append to list
    // public int[] append(int[] alfa, int data){ int[] beta = new int[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }
    // public String[] append(String[] alfa, String data){ String[] beta = new String[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }
    // public char[] append(char[] alfa, char data){ char[] beta = new char[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }
    // public Integer[] append(Integer[] alfa, Integer data){ Integer[] beta = new Integer[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }
    // public boolean[] append(boolean[] alfa, boolean data){ boolean[] beta = new boolean[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }
    // public byte[] append(byte[] alfa, byte data){ byte[] beta = new byte[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }
    // public long[] append(long[] alfa, long data){ long[] beta = new long[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }
    // public float[] append(float[] alfa, float data){ float[] beta = new float[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }
    // public double[] append(double[] alfa, double data){ double[] beta = new double[alfa.length+1]; for (int i = 0; i < alfa.length; i++) {beta[i] = alfa[i];} return beta[alfa.length+1]; }




} 

// END