//import static KeyValues.engToMorse;

public class Decoder {
    public static String convertEng(String input){
        StringBuilder output = new StringBuilder();
        for (Character x: input.toCharArray()) {
            output.append(KeyValues.engToMorse.get(x) + "/");
        }
        return output.toString();
    }
    public static String convertMorse(String input) {
        StringBuilder outputEng = new StringBuilder();
        String[] words = input.split("\\s{2}");
        for (String word : words) {
            outputEng.append(' ');
            String[] letters = word.split("\\s");
            for (String letter : letters) {
                outputEng.append(KeyValues.morseToEng.get(letter));
            }
        }
        return outputEng.toString();
    }
}
