package com.ryan.part01;

/**
 * @author kq
 * @description 手机品牌类
 * @create 2024-08-11 22:07
 */
public abstract class AbstractHandsetBrand {

    protected AbstractHandsetSoft handsetSoft;

    public AbstractHandsetBrand(AbstractHandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    public void setHandsetSoft(AbstractHandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    /**
     * 手机运行
     */
    public abstract void run();

}
