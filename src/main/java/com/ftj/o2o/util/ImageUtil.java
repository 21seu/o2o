package com.ftj.o2o.util;

import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageUtil {

    //图片压缩，加水印
    public static void main(String[] args) throws IOException {
        String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        Thumbnails.of(new File("D:\\tools\\eclipse\\workspace\\o2o\\src\\main\\resources\\pic05.jpg"))
                .size(200, 200).watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "\\watermark.jpg")), 0.25f).outputQuality(0.8f)
                .toFile("D:\\tools\\eclipse\\workspace\\o2o\\src\\main\\resources\\pic06.jpg");
    }
}
