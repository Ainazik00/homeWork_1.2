import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(AgeAndTemperature(23, 17));
        System.out.println(AgeAndTemperature(13, 56));
        System.out.println(AgeAndTemperature(54, 34));
        System.out.println(AgeAndTemperature(21, 19));
        System.out.println(AgeAndTemperature(-45, generateRandomAge()));
    }

    public static String AgeAndTemperature(int temperature, int age) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30)
            return "Можно идти гулять";
        else if (age < 20 && temperature > 0 && temperature < 28)
            return "Можно идти гулять";
        else if (age > 45 && temperature > -10 && temperature < 25)
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        Random cat = new Random();
        int dog = cat.nextInt(20);
        return dog;
    }
}