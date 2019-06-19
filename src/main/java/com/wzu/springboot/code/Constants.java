package com.wzu.springboot.code;

import java.awt.Color;
import java.awt.Font;

public class Constants {

	// 验证码的字体库
	public static Font[] codeFont = { new Font("Times New Roman", Font.PLAIN, 30),
			new Font("Times New Roman", Font.PLAIN, 30), new Font("Times New Roman", Font.PLAIN, 30),
			new Font("Times New Roman", Font.PLAIN, 30) };

	// 验证码数字颜色库
	public static Color[] color = { Color.BLACK, Color.RED, Color.DARK_GRAY, Color.BLUE };

	// 验证码的字符库
	public static final String IMAGE_CHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	// 验证码的宽度
	public static final Integer IMAGE_WIDTH = 120;

	// 验证码的高度
	public static final Integer IMAGE_HEIGHT = 40;
}
