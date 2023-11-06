package ffffffff0x.beryenigma.App.View.Modules.Unlimited.LifeValueCalculation;

import java.util.StringJoiner;

/**
 * @program: BE-ITEST
 * @author: RyuZU
 * @create: 2023-11-03 14:53
 **/

public class LifeValueBean {
    int maxLifeValue;

    int nowBDamage;
    int nowLDamage;
    int nowADamage;

    public int getMaxLifeValue() {
        return maxLifeValue;
    }

    public void setMaxLifeValue(int maxLifeValue) {
        this.maxLifeValue = maxLifeValue;
    }

    public int getNowLDamage() {
        return nowLDamage;
    }

    public void setNowLDamage(int nowLDamage) {
        this.nowLDamage = nowLDamage;
    }

    public int getNowBDamage() {
        return nowBDamage;
    }

    public void setNowBDamage(int nowBDamage) {
        this.nowBDamage = nowBDamage;
    }

    public int getNowADamage() {
        return nowADamage;
    }

    public void setNowADamage(int nowADamage) {
        this.nowADamage = nowADamage;
    }

    public String getStringLifeDamage() {
        StringJoiner stringJoiner = new StringJoiner("/");
        stringJoiner.add(String.valueOf(getNowBDamage()));
        stringJoiner.add(String.valueOf(getNowLDamage()));
        stringJoiner.add(String.valueOf(getNowADamage()));
        return stringJoiner.toString();
    }
}
