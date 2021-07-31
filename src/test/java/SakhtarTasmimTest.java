import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class SakhtarTasmimTest {

    @Test
    void if_else() {

        salamKon();

        int adad_zoj = 8;
        boolean shart = adad_zoj % 2 == 0;
        out.println(shart);
        if (shart) {
            benevis("zoj");
        } else {
            benevis("fard");
        }
    }

    private void benevis(String meghdar) {
        out.println("in adad " + meghdar + " ast");
    }

    // Sakhtar tabe ya method
    // mahdodeye_did type_khoroji nam_method ( parametr_1, parametr_2, ... ) {
    //  code
    //  return meghdar_khoroji agar type_khoroji void nabashad
    //}
    void salamKon() {
        out.println("Salam");
    }

    // DRY : Don't Repeat Yourself => ba sakhtane method az in asl peyravi mikonim

}
