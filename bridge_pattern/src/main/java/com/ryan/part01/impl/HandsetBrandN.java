package com.ryan.part01.impl;

import com.ryan.part01.AbstractHandsetBrand;
import com.ryan.part01.AbstractHandsetSoft;

/**
 * @author kq
 * @description 手机实现类 N
 * @create 2024-08-11 22:08
 */
public class HandsetBrandN extends AbstractHandsetBrand {


    public HandsetBrandN(AbstractHandsetSoft handsetSoft) {
        super(handsetSoft);
    }

    @Override
    public void run() {
        System.out.print("品牌 N:");
        handsetSoft.run();
    }

}
