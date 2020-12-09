package fun;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;

public class MakeContentImage {
	
	public MakeContentImage(String content, OutputStream os) throws IOException {
		File file = new File("src/Wind.jpg");
		BufferedImage image = ImageIO.read(file);
		Graphics g = image.getGraphics();
		g.setColor(Color.black);
		g.setFont(new Font("宋體", Font.PLAIN, 22));
		g.drawString(content, 400, 200);
		ImageIO.write(image, "JPEG", os);
		os.flush();
		os.close();
	}
}
