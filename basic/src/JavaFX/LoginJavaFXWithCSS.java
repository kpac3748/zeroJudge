package JavaFX;

import javafx.application.Application;
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

public class LoginJavaFXWithCSS extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Layout
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		//用Layout做為Scene的root node
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
		
		//GUI元件
		Text scenetitle = new Text("歡迎");
		scenetitle.setFont(Font.font("Serif", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Label userName = new Label("帳號: ");
		grid.add(userName, 0, 1);
		
		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		
		Label pw = new Label("密碼: ");
		grid.add(pw, 0, 2);
		
		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		
		Button btn = new Button("登入");
		HBox hbBtn = new HBox(btn);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		grid.add(hbBtn, 1, 4);
		
		//登入事件
		final Text actiontarget = new Text();
		grid.add(actiontarget, 1, 6);
		btn.setOnAction(e ->{
			actiontarget.setText("登入成功!");
		});
		
		//讀取與設定CSS
		scene.getStylesheets().add(LoginJavaFXWithCSS.class.getResource("Login.css").toExternalForm());
		scenetitle.setId("welcom-text");
		actiontarget.setId("actiontarget");
		
		
		//顯示Stage
		primaryStage.setTitle("登入");
		primaryStage.show();
	}

}
