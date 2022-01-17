import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("[a-zA-Z]*\\d{3}[a-zA-Z]*");
//        String text = "abc123def";
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()){
//            System.out.println(matcher.group());

        Pattern pattern = Pattern.compile("[+]\\d{3}[(]\\d{2}[)]\\d{3}[-]\\d{2}[-]\\d{2}");
        String text = "+375(29)512-89-78";
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        Pattern pattern1 = Pattern.compile(".+[@][a-z]+[.][a-z]+");
        String text1 = "mlkfg982@gmail.com" ;
        Matcher matcher1 = pattern1.matcher(text1);
        while (matcher1.find()){
            System.out.println(matcher1.group());
        }

        String text2 = "Ляляля пупупу тырыпыры.Опять ляляля пупупу и хватит.";
        String [] sentence = text2.split("(\\.|\\,|\\!|\\?)");
        for (String word: sentence) {
            Pattern pattern2 = Pattern.compile("^[а-яА-Я]+\\s");
            Matcher matcher2 = pattern2.matcher(word);
            while (matcher2.find()) {
                System.out.println(matcher2.group());
            }
        }
        for (String word: sentence) {
            Pattern pattern3 = Pattern.compile("[а-яА-Я]+$");
            Matcher matcher3 = pattern3.matcher(word);
            while (matcher3.find()) {
                System.out.println(matcher3.group());
            }
            }
        }
    }
