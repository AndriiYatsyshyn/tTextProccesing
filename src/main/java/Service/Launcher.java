package Service;

public class Launcher {
    public static void main(String[] args) {
        TextProccesingImpl textProccesing = new TextProccesingImpl();
        textProccesing.countWords();
        textProccesing.countLine();
        textProccesing.countDate();
        textProccesing.sumNumbers();
        textProccesing.sentencetoUpperCase();
        textProccesing.letter();
        textProccesing.reverseLine();
        textProccesing.combineLastLine();


    }
}
