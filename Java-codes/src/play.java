//Checked Exception with Throws

import java.io.IOException;

public class play{

  
    static void demo() throws IOException {
        
        throw new IOException("IO Error occurred");
    }

    public static void main(String[] args) {
        try {
            demo(); 
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
