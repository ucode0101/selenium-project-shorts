package utility;

public class Temp {
    public static void main(String[] args) {

        String str = ConfigReader.getProperty("url");
        System.out.println(str);
    }
}
