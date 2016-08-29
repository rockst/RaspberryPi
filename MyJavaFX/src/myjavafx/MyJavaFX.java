package myjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author rockst
 */
public class MyJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // GridPane 容器
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); // 所有元件對齊中央
        grid.setHgap(10); // 元件之間水平、垂直 10 個畫素
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        // 設定頂端文字
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        // 設定帳號標題
        Label userName = new Label("User Name");
        grid.add(userName, 0, 1);
        
        // 設定帳號欄位
        final TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        
        // 設定密碼標題
        Label pw = new Label("Password");
        grid.add(pw, 0, 2);
        
        // 設定密碼欄位
        final PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);
        
        // 設定按鈕使用 HBox 把 Button 包起來
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        // 設定送出後狀態文字
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        // btn ActionEvent Handler 監聽
        btn.setOnAction((ActionEvent e) -> {
            
            // 取得送出後內容
            String userNameValue = userTextField.getText();
            String passwordValue = passwordField.getText();
            
            // 預設狀態文字
            String result = "Incorrect!!";
            
            // 比對帳號密碼
            if(userNameValue.equals("rock") && passwordValue.equals("letmein")) {
                result = "Welcome!!";
            }
            
            actiontarget.setFill(Color.BLUE); // 文字顏色
            actiontarget.setText(result);
        });
        
        // 產生容器
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        
        // String style = getClass().getResource("MyStyle.css").toExternalForm();
        // scene.getStylesheets().addAll(style);
        
        
        scene.getStylesheets().add(
                //MyJavaFX.class.getResource("MyStyle.css").toExternalForm()
                "MyStyle.css"
        );
        
        
        scenetitle.setId("welcome-text");
        actiontarget.setId("actiontarget");
                
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
