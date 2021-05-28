import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class OperatorTest {

    @Test
    void bayad_mohasebe_konad() {
        int adad_shomare_1 = 55;
        int adad_shomare_2 = 10;
        out.println(adad_shomare_1 + adad_shomare_2);
        out.println(adad_shomare_1 - adad_shomare_2);
        out.println(adad_shomare_1 * adad_shomare_2);
        out.println(adad_shomare_1 / adad_shomare_2);
        out.println((double) adad_shomare_2 / (double) adad_shomare_1);
        out.println((float) adad_shomare_2 / (float) adad_shomare_1);
        out.println(adad_shomare_1 % adad_shomare_2);

        //adad_shomare_1 = adad_shomare_1 + adad_shomare_1;
        adad_shomare_1 += adad_shomare_1;
        out.println(adad_shomare_1);    // adad_shomare_1 = 110
        adad_shomare_1 += adad_shomare_2;   // adad_shomare_1 = adad_shomare_1 + adad_shomare_2;
        out.println(adad_shomare_1);    // add_shomare_1 = 120

        //adad_shomare_1 = adad_shomare_1 + 1;
        //adad_shomare_1++;
        out.println(adad_shomare_1++);    // add_shomare_1 = 120
                                        // add_shomare_1 = 121
        out.println(++adad_shomare_1);    // add_shomare_1 = 122
    }

    @Test
    void bayad_amaliat_manteghi_anjam_dahad() {
        int x = 2;
        int y = 5;
        boolean x1 = x > y;
        out.println(x1);
        boolean x2 = x < y;
        out.println(x2);
        out.println(x1 && x2);
        out.println(x1 || x2);
        out.println(!x1);
        int z = 2;
        out.println(x > z);
        out.println(x >= z);
        out.println(x <= z);
        out.println(x != z);
        out.println(x == z);
    }
}
