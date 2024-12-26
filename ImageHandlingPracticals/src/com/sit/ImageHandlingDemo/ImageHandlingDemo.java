package com.sit.ImageHandlingDemo;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=963;
		int height=640;
		
		BufferedImage image=null;
		
		image=readFromFile(width,height,image);
		writeFromFile(image);

	}

	private static void writeFromFile(BufferedImage image) {
		// TODO Auto-generated method stub
		try
		{
			File output=new File("C:\\Users\\Admin\\Pictures\\out.jpg");
			ImageIO.write(image, "jpg", output);
			
			System.out.println("Writing Complete");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
		// TODO Auto-generated method stub
		try
		{
			File samplefile=new File("C:\\Users\\Admin\\Pictures\\Sample.jpg");
			image=new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
			
			
			//Reading input file
			image=ImageIO.read(samplefile);
			
			System.out.println("Reading Complete :"+image);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return image;
	}

}
