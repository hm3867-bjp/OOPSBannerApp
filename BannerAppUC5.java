public class BannerAppUC5 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", "W", "E", "L", "C", "O", "M", "E", "*"),
                String.join("", "*", " ", "T", "O", " ", "J", "A", "V", "A", "*"),
                String.join("", "*", " ", "B", "A", "N", "N", "E", "R", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}