import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class ArayeTest {
    @Test
    void bayad_araye_besazad() {
        String[] zabanhayeBarnameNevisi = {"Java", ".Net", "Java Script"};
        out.println(zabanhayeBarnameNevisi[0]);
        out.println(zabanhayeBarnameNevisi[1]);
        out.println(zabanhayeBarnameNevisi[2]);
        zabanhayeBarnameNevisi[0] = "Python";
        out.println(zabanhayeBarnameNevisi[0]);
        int length = zabanhayeBarnameNevisi.length;
        out.println("Andazeye arayeye ma " + length + " ast");
    }
}
