package javafundamentals.basics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
        public static void main(String[] args) {
            int dogCount = 1;
            System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

            int catCount = 2;
            System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

            int turtleCount = 0;
            System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

            flipNHeads(1);
            clock();
        }

        public static String pluralize (String word,int number){
            if (number == 0 || number > 1) {
                return word + "s";
            } else {
                return word;
            }
        }
        
        public static String flipNHeads (int number){
            int heads = 0;
            int flips = 0;
            while (heads < number) {
                double random = Math.random();
                if (random < 0.5) {
                    System.out.println("tails");
                    heads = 0;
                } else {
                    System.out.println("heads");
                    heads++;
                }
                flips++;
            }
            return "It took " + flips + " flips to flip " + number + " heads in a row";
        }

        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        public static void clock () {
            while (true) {
                LocalDateTime now = LocalDateTime.now();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);

            }
        }
}

