package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i;
        i=1;
        do {
            System.out.println(i);
            BufferedImage image = null;
                //For three digit
                try {
                    //URL here
                URL url = new URL("https://resources.pearsonactivelearn.com/r00/r0091/r009134/r00913465/current/OPS/images/913465-\"+String.format(\"%03d\",i)+\".jpg");
                //MATH AA https://resources.pearsonactivelearn.com/r00/r0091/r009134/r00913465/current/OPS/images/913465-"+String.format("%03d",i)+".jpg
                //math AI http://resources.pearsonactivelearn.com/r00/r0091/r009187/r00918716/current/OPS/images/918716-" + i + ".jpg
                // read the url
                image = ImageIO.read(url);

                // for jpg
                ImageIO.write(image, "jpg", new File("/Users/jimli/Desktop/DP/书/AAH/"+i+".jpg"));

        } catch (Exception e) {
        e.printStackTrace();
        }
        i=i+1;
        }while (i<15);
        }
        }
