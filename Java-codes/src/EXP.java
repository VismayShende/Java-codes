//Throw Keyword
public class EXP {
    static void check(int marks) {
        if (marks < 40) throw new IllegalArgumentException("Failed");
    }

    public static void main(String[] args) {
        check(35);
    }
}

    
