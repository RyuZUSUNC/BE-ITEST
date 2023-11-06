package ffffffff0x.beryenigma.App.View.Modules.Sample.HEXCoder;

import ffffffff0x.beryenigma.App.View.Viewobj.ViewControllerFileMode;
import ffffffff0x.beryenigma.Init.Init;
import ffffffff0x.beryenigma.Init.ViewInit;
import ffffffff0x.beryenigma.Kit.Utils.FileUtils;
import ffffffff0x.beryenigma.Kit.Utils.ViewNode;
import ffffffff0x.beryenigma.Kit.Utils.ViewUtils;
import com.jfoenix.controls.*;
import javafx.fxml.FXML;
import java.io.UnsupportedEncodingException;

/**
 * @author RyuZU
 */
@ViewNode(name = "HEX",folderPath = "Root/Encryption/Coding/",fxmlName = "HEXCoderView.fxml",isVisible = false)
public class HEXCoderController extends ViewControllerFileMode {

    @FXML private JFXComboBox JCB_charset;
    @FXML private JFXTextField JTF_split;

    @Override
    protected void initialize() {
        super.initialize();
        ViewInit.comboBoxCharset(JCB_charset);
        ViewInit.textAreaErrorInfoGeneral(JTA_dst);
    }

    @Override
    public void ONClickEncode() {
        super.ONClickEncode();
        try {
            if(JTB_modeSelect.getText().equals(Init.getLanguage("TextMode"))){
                try {
                    JTA_dst.setText(HEXCodeEnCode());
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }else{
                FileUtils.outPutFile(HEXCoderImpl.encode(byteFile));
                fileEncodeEnd();
            }
        }catch (Exception e) {
            ViewUtils.textAreaValidate(JTA_dst);
        }
    }

    @Override
    public void ONClickDecode() {
        super.ONClickDecode();
        try{
            if(JTB_modeSelect.getText().equals(Init.getLanguage("TextMode"))){
                try {
                    JTA_dst.setText(HEXCodeDeCode());
                } catch (UnsupportedEncodingException e) {
                    JTA_dst.validate();
                }
            }else{
                FileUtils.outPutFile(HEXCoderImpl.decode(byteFile));
                fileEncodeEnd();
            }
        }catch (Exception e){
            ViewUtils.textAreaValidate(JTA_dst);
        }
    }

    private String HEXCodeEnCode() throws UnsupportedEncodingException {
        return HEXCoderImpl.encode(JTA_src.getText(),
                JTF_split.getText(),
                JCB_charset.getValue().toString());
    }

    private String HEXCodeDeCode() throws UnsupportedEncodingException {
        return HEXCoderImpl.decode(JTA_src.getText(),
                JTF_split.getText(),
                JCB_charset.getValue().toString());
    }


    @Override
    public void getFile(){
        super.getFile();
//        byteFile = FileUtils.getFilebyte(file);
    }
}
