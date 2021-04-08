import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.jhlabs.image.GaussianFilter;
import java.awt.image.BufferedImage;

public class GaussianTest {
	public static void main(String[] args) throws IOException {
		GaussianFilter gaussianFilter = new GaussianFilter();

		BufferedImage fromImage = ImageIO.read(new File("crop2.png"));
		BufferedImage toImage = new BufferedImage(fromImage.getWidth(), fromImage.getHeight(),BufferedImage.TYPE_INT_RGB);
		gaussianFilter.setRadius(5);
		gaussianFilter.filter(fromImage, toImage);
		ImageIO.write(toImage, "png", new File("crop2_gaussian.png"));
		
	}
}