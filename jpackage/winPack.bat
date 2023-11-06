set /p var1=Input Program Version:
cd ../
call mvn clean
call mvn javafx:jlink
cd ./jpackage
jpackage -n BE-BerylEnigma --app-version %var1% -m "beryenigma/ffffffff0x.beryenigma.Main" --runtime-image ..\target\beryenigma --dest ..\target\ --java-options "--add-opens=java.base/java.lang.reflect=com.jfoenix --add-exports=javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix --add-exports=javafx.base/com.sun.javafx.binding=com.jfoenix --add-exports=javafx.base/com.sun.javafx.event=com.jfoenix --add-exports=javafx.graphics/com.sun.javafx.stage=com.jfoenix --add-exports=javafx.graphics/com.sun.javafx.scene=com.jfoenix --add-exports=javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix --add-exports=javafx.controls/com.sun.javafx.scene.control=com.jfoenix" --icon .\ico\BerylEnigma.ico --type app-image --description "BerylEnigma" --vendor "RyuZU,ffffffff0x" --copyright "Copyright 2022 ffffffff0x,MIT License"