package com.cjp.sdutycommons.IO_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileBytesCount {
	/**
	 * 我们写一个检测文件长度的小程序，别看这个程序挺长的，你忽略try catch块后发现也就那么几行而已。
	 */
	public static void main(String[] args) {
		int count = 0; // 统计文件字节长度
		InputStream streamReader = null; // 文件输入流
		try {
			streamReader = new FileInputStream(new File("C:/Users/Administrator/Desktop/截图保存/360截图20170515102121936.jpg"));
			/*
			 * 1.new File()里面的文件地址也可以写成D:\\David\\Java\\java
			 * 高级进阶\\files\\tiger.jpg,前一个\是用来对后一个
			 * 进行转换的，FileInputStream是有缓冲区的，所以用完之后必须关闭，否则可能导致内存占满，数据丢失。
			 */
			//byte[] b = new byte[1024];
			while (streamReader.read() != -1) { // 读取文件字节，并递增指针到下一个字节
				count++;
			}
			System.out.println("---长度是： " + count + " 字节");
		} catch (final IOException e) {
			e.printStackTrace();
		} finally {
			try {
				streamReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
