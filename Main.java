package BTU;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
	    double x;
	    double y;
        PrintWriter writer = new PrintWriter("function.txt", "UTF-8");
	    for (x=1; x<=2.01; x+=0.01)
        {
            y=x*x+2*x+3;
            writer.println(y);
        }
        writer.close();
    }}

