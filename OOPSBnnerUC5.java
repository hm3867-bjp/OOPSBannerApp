public class OOPSBnnerUC5 {
    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", "O", "O", "P", "S", " ", " ", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "B", "A", "N", "N", "E", "R", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print banner
        for(String line : banner){
            System.out.println(line);
        }
    }
}

