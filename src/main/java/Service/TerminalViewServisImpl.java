package Service;

public class TerminalViewServisImpl implements TerminalViewService {


    public void printcountWords(int[] counters){
        System.out.println("Слова з 3 букв:" +  counters[0]);
        System.out.println("Слова з 5 букв:" +  counters[1]);
        System.out.println("Слова з 7 букв:" +  counters[2]);

    }

    public void printCountLine(int count) {
        System.out.println("Кількість рядків= " + count);
    }

    public void printCountDate (int numbers) {

        System.out.println("Кількість дат-" + numbers);
    }

    public void printSumNumbers (int sum){

        System.out.println("Сума всіх чисел= " + sum);
    }

    public void printLines(String[] lines) {
        System.out.println(lines);
    }

    public void printToUpperCase(String[] lineToUpperC) {
        System.out.println(lineToUpperC + ".");

    }


}
