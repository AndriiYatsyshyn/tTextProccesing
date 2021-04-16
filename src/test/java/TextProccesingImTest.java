import Model.Book;
import Service.TextProccesingImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextProccesingImTest {
    Book testBook = new Book();
    TextProccesingImpl textProccesingIm = new TextProccesingImpl();


    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void countWords() {
        testBook.setTxt("ttt ggg ooooo aaaaaaa ooo yyyyyyyyy");
        int[] counter = textProccesingIm.countWords(testBook);
        assertEquals(3, counter[0]);
        assertEquals(1, counter[1]);
        assertEquals(1, counter[1]);
    }

    @org.junit.Test
    public void countLine() {
        testBook.setTxt("ttt ggg. ooooo aaaaaaa. yyyyyyyyy.iiiiiiiii");
        int count1 = textProccesingIm.countLine(testBook);
        assertEquals(3, count1);
    }

    @org.junit.Test
    public void countDate() {
        testBook.setTxt("ttt ggg . ooooo 11-2-2000 aaaaaaa. yyyyyyyyy 2000.iiiiiiiii");
        int numbers = textProccesingIm.countDate(testBook);
        assertEquals(2, numbers);
    }

    @org.junit.Test
    public void sumNumbers() {
        testBook.setTxt("iia.2 oooo.reeee 1.yuyui 3.");
        int sum = textProccesingIm.sumNumbers(testBook);
        assertEquals(6, sum);
    }

    @org.junit.Test
    public void toUpperCase(){
        testBook.setTxt("Eeeee. yyy.oToo.");
        String[] lineToUpperC = textProccesingIm.toUpperCase(testBook);
        assertEquals("EEEEE",lineToUpperC[0]);
        assertEquals("YYY",lineToUpperC[1]);
    }

    @org.junit.Test
    public void letter() {
        testBook.setTxt("aaa. ggg.oooo.");
        String[] lines = textProccesingIm.letter(testBook);
        assertEquals("TTT", lines);

    }
}






