import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class AvalinMoteghayyerhaTest {

    @Test
    void moteghayer_va_comment() {

        // Type primitive : horof kochak
        // Type non-primitive : horof bozorg

        // Sakhtar yek moteghayer
        // Type nam = meghdar;

        // avalin moteghayer adadi
        Integer nonPrimitiveInteger = null;
        nonPrimitiveInteger.toString();
        out.println(nonPrimitiveInteger);
        int adad_mosbat = 6;
        out.println(adad_mosbat);
        int adad_manfi = -4;
        out.println(adad_manfi);
        int sefr = 0;
        out.println(sefr);

        long adad_kheyli_bozorg = 20000000000L;
        Long nonPrimitiveLong;
        out.println(adad_kheyli_bozorg);

        // moteghayer ashari
        float adad_ashari = 1.2F;
        Float nonPrimitiveFloat;
        out.println(adad_ashari);
        double adad_ashari_dovom = -2.9696969;
        Double nonPrimitiveDouble;
        out.println(adad_ashari_dovom);

        // moteghayer boolean
        boolean dorost = true;
        boolean ghalat = false;
        Boolean nonPrimitiveBoolean;
        out.println(dorost);
        out.println(ghalat);

        // moteghayer horofi
        char harf = 'c';
        Character nonPrimitiveChracter;
        out.println(harf);
        String kalame = "Java";
        out.println(kalame);
        String jomle = "I Love Java";
        out.println(jomle);
    }
}
