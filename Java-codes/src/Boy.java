public class Boy {
//creating boy class which has 3 data members name,height,sports .creating an object with new keyword(no intialization)
    String name;
    int height;
    String sports;

    public static void main(String[] args) {
        Boy b1 = new Boy();
        System.out.println("Name: " + b1.name);
        System.out.println("Height: " + b1.height);
        System.out.println("Sports: " + b1.sports);
    }
}

}
