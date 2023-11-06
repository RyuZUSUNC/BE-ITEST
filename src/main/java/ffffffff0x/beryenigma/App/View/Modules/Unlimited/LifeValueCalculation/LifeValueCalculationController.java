package ffffffff0x.beryenigma.App.View.Modules.Unlimited.LifeValueCalculation;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import ffffffff0x.beryenigma.Kit.Utils.ViewNode;
import javafx.fxml.FXML;

/**
 * @program: BE-ITEST
 * @author: RyuZU
 * @create: 2023-11-03 13:59
 **/
@ViewNode(name = "无限生命计算",fxmlName = "LifeValueCalculationView.fxml")
public class LifeValueCalculationController {
    @FXML
    JFXTextField maxLifeValue;
    @FXML
    JFXTextField nowLifeValue;
    @FXML
    JFXTextField Bdamage;
    @FXML
    JFXTextField Ldamage;
    @FXML
    JFXTextField Adamage;
    @FXML
    JFXButton reset;
    @FXML
    JFXButton confirm;
    @FXML
    JFXTextArea resault;

    @FXML
    public void confirm() {
        LifeValueBean lifeValueBean = new LifeValueBean();
        lifeValueBean.setMaxLifeValue(Integer.parseInt(maxLifeValue.getText()));
        if (nowLifeValue.getText().length() > 0) {
            String[] nowLife = nowLifeValue.getText().split("/");
            lifeValueBean.setNowBDamage(String2Int(nowLife[0]));
            lifeValueBean.setNowLDamage(String2Int(nowLife[1]));
            lifeValueBean.setNowADamage(String2Int(nowLife[2]));
        } else {
            lifeValueBean.setNowBDamage(0);
            lifeValueBean.setNowLDamage(0);
            lifeValueBean.setNowADamage(0);
        }

        String lifeValueText = LifeValueCalculationImpl.LifeValue(lifeValueBean,
                String2Int(Bdamage.getText()),
                String2Int(Ldamage.getText()),
                String2Int(Adamage.getText()));

        nowLifeValue.setText(lifeValueText);
        resault.setText(resault.getText() + lifeValueText + "\n");
    }

    @FXML
    public void reset() {
        maxLifeValue.setText("");
        nowLifeValue.setText("");
        Bdamage.setText("");
        Ldamage.setText("");
        Adamage.setText("");
        resault.setText("");
    }

    private int String2Int(String s) {
        if (s.length() == 0) {
            return 0;
        }else {
            return Integer.parseInt(s);
        }
    }
}
