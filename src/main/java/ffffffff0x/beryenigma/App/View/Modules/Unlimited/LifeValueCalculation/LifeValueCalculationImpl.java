package ffffffff0x.beryenigma.App.View.Modules.Unlimited.LifeValueCalculation;

import ffffffff0x.beryenigma.Kit.Utils.TextFormatter.IntegerFilter;

/**
 * @program: BE-ITEST
 * @author: RyuZU
 * @create: 2023-11-03 13:50
 **/

public class LifeValueCalculationImpl {
    public static String LifeValue(LifeValueBean lifeV,int BDamage,int LDamage,int ADamage) {
        // 完好的生命计数
        int intactLifeValue = lifeV.getMaxLifeValue() - lifeV.getNowADamage() - lifeV.getNowBDamage() - lifeV.getNowLDamage();
        int maxBdamage = lifeV.getMaxLifeValue() - lifeV.getNowADamage() - lifeV.getNowLDamage();
        // B
        // 完好转化为B
        if (intactLifeValue > 0 && BDamage > 0) {
            if (intactLifeValue > BDamage) {
                lifeV.setNowBDamage(lifeV.getNowBDamage() + BDamage);
                intactLifeValue = intactLifeValue - BDamage;
                BDamage = 0;
            } else {
                lifeV.setNowBDamage(lifeV.getNowBDamage() + intactLifeValue);
                BDamage = BDamage - intactLifeValue;
                intactLifeValue = 0;
            }
        }

        if (BDamage > 0) {
            // 计算溢出情况
            if (BDamage + lifeV.getNowBDamage() > maxBdamage && BDamage + lifeV.getNowBDamage() < maxBdamage * 2) {
                // 溢出超过满值但不超过两倍情况
                int NBdamage = (lifeV.getNowBDamage() + BDamage);
                lifeV.setNowBDamage(maxBdamage - (NBdamage - maxBdamage));
                // 伤害转化
                LDamage = LDamage + (maxBdamage - lifeV.getNowBDamage());
            } else if (BDamage + lifeV.getNowBDamage() >= maxBdamage * 2) {
                // 溢出超过两倍情况
                lifeV.setNowBDamage(0);
                // 伤害转化
                LDamage = LDamage + maxBdamage + ((BDamage + lifeV.getNowBDamage()) - maxBdamage);
            } else {
                // 不溢出情况
                lifeV.setNowBDamage(lifeV.getNowBDamage() + BDamage);
            }
        }

        intactLifeValue = lifeV.getMaxLifeValue() - lifeV.getNowADamage() - lifeV.getNowBDamage() - lifeV.getNowLDamage();
        int maxLdamage = lifeV.getMaxLifeValue() - lifeV.getNowADamage();

        // L
        // 完好转换为L
        if (intactLifeValue > 0 && LDamage > 0) {
            if (intactLifeValue > LDamage) {
                lifeV.setNowLDamage(lifeV.getNowLDamage() + LDamage);
                intactLifeValue = intactLifeValue - LDamage;
                LDamage = 0;
            } else {
                lifeV.setNowLDamage(lifeV.getNowLDamage() + intactLifeValue);
                LDamage = LDamage - intactLifeValue;
                intactLifeValue = 0;
            }
        }
        // B转L
        if (lifeV.getNowBDamage() > 0 && LDamage > 0) {
            if (lifeV.getNowBDamage() > LDamage) {
                int NBdamage = lifeV.getNowBDamage();
                lifeV.setNowBDamage(NBdamage - LDamage);
                lifeV.setNowLDamage(lifeV.getNowLDamage() + LDamage);
                LDamage = LDamage - NBdamage;
            } else {
                int NBdamage = lifeV.getNowBDamage();
                lifeV.setNowBDamage(0);
                lifeV.setNowLDamage(lifeV.getNowLDamage() + NBdamage);
                LDamage = LDamage - NBdamage;
            }
        }

        if (LDamage > 0) {
            // 计算溢出情况
            if (LDamage + lifeV.getNowLDamage() > maxLdamage && LDamage + lifeV.getNowLDamage() < maxLdamage * 2) {
                // 溢出超过满值但不超过两倍情况
                int NLdamage = (lifeV.getNowLDamage() + LDamage);
                lifeV.setNowLDamage(maxLdamage - (NLdamage - maxLdamage));
                // 伤害转化
                ADamage = ADamage + (maxLdamage - lifeV.getNowLDamage());
            } else if (LDamage + lifeV.getNowLDamage() >= maxLdamage * 2) {
                // 溢出超过两倍情况
                lifeV.setNowLDamage(0);
                // 伤害转化
                ADamage = ADamage + maxLdamage + ((LDamage + lifeV.getNowLDamage()) - maxLdamage);
            } else {
                // 不溢出情况
                lifeV.setNowLDamage(lifeV.getNowLDamage() + LDamage);
            }
        }

        intactLifeValue = lifeV.getMaxLifeValue() - lifeV.getNowADamage() - lifeV.getNowBDamage() - lifeV.getNowLDamage();
        // A伤害计算
        // A
        // 完好转换为A
        if (intactLifeValue > 0 && ADamage > 0) {
            if (intactLifeValue > ADamage) {
                lifeV.setNowADamage(lifeV.getNowADamage() + ADamage);
                intactLifeValue = intactLifeValue - ADamage;
                ADamage = 0;
            } else {
                lifeV.setNowADamage(lifeV.getNowADamage() + intactLifeValue);
                ADamage = ADamage - intactLifeValue;
                intactLifeValue = 0;
            }
        }
        // B转A
        if (lifeV.getNowBDamage() > 0 && ADamage > 0) {
            if (lifeV.getNowBDamage() > ADamage) {
                int NBdamage = lifeV.getNowBDamage();
                lifeV.setNowBDamage(NBdamage - ADamage);
                lifeV.setNowADamage(lifeV.getNowLDamage() + ADamage);
                ADamage = ADamage - NBdamage;
            } else {
                int NBdamage = lifeV.getNowBDamage();
                lifeV.setNowBDamage(0);
                lifeV.setNowADamage(lifeV.getNowADamage() + NBdamage);
                ADamage = ADamage - NBdamage;
            }
        }
        // L转A
        if (lifeV.getNowLDamage() > 0 && ADamage > 0) {
            if (lifeV.getNowLDamage() > ADamage) {
                int NLdamage = lifeV.getNowLDamage();
                lifeV.setNowLDamage(NLdamage - ADamage);
                lifeV.setNowADamage(lifeV.getNowLDamage() + ADamage);
                ADamage = ADamage - NLdamage;
            } else {
                int NLdamage = lifeV.getNowLDamage();
                lifeV.setNowLDamage(0);
                lifeV.setNowADamage(lifeV.getNowADamage() + NLdamage);
                ADamage = ADamage - NLdamage;
            }
        }

        if (ADamage > 0) {
            lifeV.setNowADamage(lifeV.getNowADamage() + ADamage);
        }

//        // B伤害计算
//        if (intactLifeValue - BDamage >= 0) {
//            lifeV.setNowBDamage(BDamage);
//        } else {
//            if (lifeV.getNowBDamage() + BDamage <= lifeV.getMaxLifeValue()) {
//                lifeV.setNowBDamage(lifeV.getNowBDamage() + BDamage);
//            } else if (lifeV.getNowBDamage() == 0 && (lifeV.getNowLDamage() + lifeV.getNowADamage()) >= lifeV.getMaxLifeValue()) {
//                LDamage = BDamage + LDamage;
//            } else if (lifeV.getNowBDamage() + BDamage / lifeV.getMaxLifeValue() >= 2) {
//                LDamage = (lifeV.getNowBDamage() + BDamage) - lifeV.getMaxLifeValue();
//                lifeV.setNowBDamage(0);
//            } else {
//                int overBDamage = (lifeV.getNowBDamage() + BDamage) - lifeV.getMaxLifeValue();
//                lifeV.setNowBDamage(lifeV.getMaxLifeValue() - overBDamage);
//                LDamage = overBDamage + LDamage;
//            }
//        }
//
//        intactLifeValue = lifeV.getMaxLifeValue() - lifeV.getNowADamage() - lifeV.getNowBDamage() - lifeV.getNowLDamage();
//
//        // L伤害计算
//        if (intactLifeValue - LDamage >= 0) {
//            lifeV.setNowLDamage(LDamage);
//        } else {
//            if (lifeV.getNowLDamage() + LDamage <= lifeV.getMaxLifeValue()) {
//                lifeV.setNowLDamage(lifeV.getNowLDamage() + LDamage);
//            } else if (lifeV.getNowLDamage() + LDamage / lifeV.getMaxLifeValue() >= 2) {
//                ADamage = (lifeV.getNowLDamage() + LDamage) - lifeV.getMaxLifeValue();
//                lifeV.setNowLDamage(0);
//            } else {
//                int overLDamage = (lifeV.getNowLDamage() + LDamage) - lifeV.getMaxLifeValue();
//                lifeV.setNowLDamage(lifeV.getMaxLifeValue() - overLDamage);
//                ADamage = overLDamage + ADamage;
//            }
//        }
//
//        intactLifeValue = lifeV.getMaxLifeValue() - lifeV.getNowADamage() - lifeV.getNowBDamage() - lifeV.getNowLDamage();
//
//        // A伤害计算
//        if (intactLifeValue - ADamage >= 0) {
//            lifeV.setNowADamage(ADamage);
//        } else {
//            lifeV.setNowADamage(lifeV.getNowADamage() + ADamage);
//        }

        return lifeV.getStringLifeDamage();
    }


    public static void main(String[] args) {
        LifeValueBean lifeValueBean = new LifeValueBean();
        lifeValueBean.setMaxLifeValue(7);
        lifeValueBean.setNowBDamage(1);
        lifeValueBean.setNowLDamage(1);
        lifeValueBean.setNowADamage(1);
        System.out.println(LifeValue(lifeValueBean,11,0,0));
    }
}
