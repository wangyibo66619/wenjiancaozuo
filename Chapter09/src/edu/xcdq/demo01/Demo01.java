package edu.xcdq.demo01;

import java.io.File;
import java.io.IOException;

/**
 * @author 王艺博
 * @date 2021/5/14 11:10
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\zz.txt");
        File file2 = new File("D:\\大根.mp4");
        File file3 = new File("D:\\demo01\\demo1.1");
        File file4= new File("D:\\demo01\\demo1.1");
        File file5 = new File("d:/酷我/zzz.txt");
        // 1 创建一个文件
        file2.createNewFile();
        // 2 创建一个文件夹    mkdir    一次只能创建一个文件夹，如果父路径没有，则创建失败
        boolean res = file3.mkdir();
        System.out.println(res);
        // 3 mkdirs()  创建多个文件夹，如果父路径不存在，则一次性创建全部路径
        file4.mkdirs();
        // 4 删除文件
        file2.delete();
        // 5 renameTo  移动文件
        file1.renameTo(new File("d:/酷我/zzz.txt"));
        // 6 exists
        System.out.println(file2.exists());
        // 7   isFile  是否是文件
        System.out.println(file5.isFile());
        // 8 isDirectory   是否是目录
        System.out.println(file4.isDirectory());
        // 9 getPath 获取路径
        System.out.println(file5.getPath());
    }
}
