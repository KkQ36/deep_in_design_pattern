package com.ryan.part01;

import com.ryan.part01.impl.HandsetAddressList;
import com.ryan.part01.impl.HandsetBrandM;
import com.ryan.part01.impl.HandsetBrandN;
import com.ryan.part01.impl.HandsetGame;
import org.junit.Test;

/**
 * @author kq
 * @description
 * @create 2024-08-11 22:11
 */
public class PartTest {

    @Test
    public void testPart01() {
        HandsetBrandM handsetBrandM = new HandsetBrandM(new HandsetGame());
        handsetBrandM.run();
        handsetBrandM.setHandsetSoft(new HandsetAddressList());
        handsetBrandM.run();

        HandsetBrandN handsetBrandN = new HandsetBrandN(new HandsetGame());
        handsetBrandN.run();
        handsetBrandN.setHandsetSoft(new HandsetAddressList());
        handsetBrandN.run();
    }

}
