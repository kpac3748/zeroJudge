package fun;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Watermark {

	public static void main(String[] args) {
		try {
			BufferedImage buffImage = ImageIO.read(new File("src/Wind.jpg"));
			Graphics g = buffImage.getGraphics();
			Font font = new Font("黑體", Font.BOLD, 22);
			g.setFont(font);
			g.setColor(Color.BLACK);
			g.drawString("RRRRRRRR", 400, 200);
			FileOutputStream outImg = new FileOutputStream(new File("C:/Users/hyt/Desktop/test.jpg"));
			ImageIO.write(buffImage, "jpg", outImg);
			outImg.flush();
			outImg.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

}
