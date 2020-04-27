package JavaFX;



import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BlurCircleAnimation extends Application{

	//視窗大小
	public static final int width = 800;
	public static final int height = 600;
	
	//動畫時間
	public static final long duration = 30000;
	
	//圖型數量
	public static final int count = 30;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//以root這個Group做為Scene的root node
		Group root = new Group();
		Scene scene = new Scene(root, width, height, Color.BLACK);
		primaryStage.setScene(scene);
		
		//建立顏色矩形colors，大小先不設定，顏色為從左下到右上的漸層
		Rectangle colors = new Rectangle(0, 0,
			new LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new Stop[] {
					new Stop(0, Color.web("#f8bd55")),
					new Stop(0.14, Color.web("#c0fe56")),
					new Stop(0.28, Color.web("#5dfbc1")),
					new Stop(0.43, Color.web("#64c2f8")),
					new Stop(0.57, Color.web("#be4af7")),
					new Stop(0.71, Color.web("#ed5fc2")),
					new Stop(0.85, Color.web("#ef504c")),
					new Stop(1, Color.web("#f2660f")),
			}));
		
		//讓colors大小隨著Scene的長寬做變化(如果有先設定colors的大小，那麼它將只有在放大的時候才會延展)
		colors.widthProperty().bind(scene.widthProperty());
		colors.heightProperty().bind(scene.heightProperty());
		
		//繪製圖形
		Group circles = new Group();
		for (int i = 0; i < count; i++) {
			Circle circle= new Circle(Math.random() * 50 + 75, Color.web("white", 0.15));
			circle.setStrokeType(StrokeType.OUTSIDE);
			circle.setStrokeWidth(4);
//			circles.setEffect(new BoxBlur(10, 10, 3));
			circles.getChildren().add(circle);
		}
		
		//製作動畫
		Timeline timeline = new Timeline(); //動畫時間軸
		circles.getChildren().forEach((circle) ->{ //將所有的圓形都設動畫
			//製作起始、終止的關鍵影格
			KeyFrame start = new KeyFrame(Duration.ZERO, 
											new KeyValue(circle.translateXProperty(),
													Math.random() * scene.getWidth()),
											new KeyValue(circle.translateYProperty(),
													Math.random() * scene.getHeight())
											);
			
			KeyFrame end = new KeyFrame(new Duration(duration), 
											new KeyValue(circle.translateXProperty(),
													Math.random() * scene.getWidth()),
											new KeyValue(circle.translateYProperty(),
													Math.random() * scene.getHeight())
											);
			
			//加入關鍵影格
			timeline.getKeyFrames().addAll(start, end);
			timeline.setCycleCount(Timeline.INDEFINITE);
		});
		timeline.play(); //播放時間軸動畫
		
		//***混合模式,以下幾種都可以玩玩看
		colors.setBlendMode(BlendMode.SCREEN);
//		colors.setBlendMode(BlendMode.OVERLAY);
//		colors.setBlendMode(BlendMode.ADD);
//		colors.setBlendMode(BlendMode.DIFFERENCE);
//		colors.setBlendMode(BlendMode.DARKEN);
		
		//加入Node，注意這裡的加入順序!
		root.getChildren().add(circles);
		root.getChildren().add(colors);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}








	

}
