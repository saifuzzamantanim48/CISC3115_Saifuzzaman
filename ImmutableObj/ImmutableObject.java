import java.util.Scanner;
public class ImmutableObject {
    public static void main(String[] args) {
        float fahrenheit;
        float centigrade;

        fahrenheit = 98.6f;
        centigrade = (5/9f)*(fahrenheit-32);

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Centigrade: " + centigrade);
        System.out.println("----------------");

        for(int i = 0; i <= 40; i += 4){
            System.out.println((5/9f)*(i-32));
        }
        System.out.println("----------------");

        float x = 0;
        while(x<=40){
            System.out.println((5/9f)*(x-32));
            x += 4;
        }

        StopChecking();
    }
    public static void StopChecking(){
        Scanner sc = new Scanner(System.in);

        String[][] myArray = {
            {"BMW", "Ferrari", "Lambo"},
            {"pizza", "burger", "dumpling"}
        };

        String isIn;
        String inputWords;

        System.out.print("Enter a word: ");
        inputWords = sc.next();

        while(true){
            if(inputWords.equals("STOP")){
                break;
            }
            isIn = isInArray(myArray, inputWords);

            if(isIn != null){
                System.out.println(inputWords + " is in the 2D array.");
            }else{
                System.out.println(inputWords + " is not in the 2D array.");
            }
            break;
        }
    }
    public static String isInArray(String[][] myArray, String inputWords) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (inputWords.equals(myArray[i][j])) {
                    return inputWords;
                }
            }
        }
        return null;
    }
}
