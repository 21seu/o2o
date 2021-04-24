package com.ftj.o2o.util;

public class PathUtil {

    /**
     * 获取文件的分隔符
     */
    private static String seperator = System.getProperty("file.separator");

    /**
     * 返回项目图片的根路径
     *
     * @return
     */
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image/";
        } else {
            basePath = "/home/o2o/image";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    /**
     * 返回项目图片的子路径
     *
     * @param shopId
     * @return
     */
    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
