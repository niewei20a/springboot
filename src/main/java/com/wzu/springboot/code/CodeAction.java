package com.wzu.springboot.code;

import com.wzu.springboot.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;


/**
 * Servlet implementation class CodeAction
 */
@Controller
public class CodeAction {
	
	private static final long serialVersionUID = 1736370958785036518L;
	
	protected static String codeNumbers = "";

	@GetMapping("/code")
	public void loginCheck(HttpServletResponse response) throws IOException {
		BufferedImage image = new BufferedImage(Constants.IMAGE_WIDTH, Constants.IMAGE_HEIGHT, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.setColor(createRandomColor(200, 250));
		g.fillRect(0, 0, Constants.IMAGE_WIDTH, Constants.IMAGE_HEIGHT);
		for (int i = 0; i < 4; i++){
			drawString(g, i);
		}
		String sss = codeNumbers;
		Globle.setCode(sss);
		codeNumbers = "";
		// 利用ImageIO类的write方法对图像进行编码
		ServletOutputStream sos = response.getOutputStream();
		ImageIO.write(image, "GIF", sos);
		sos.close();
	}
	
	
	private void drawString(Graphics graphics, int i) {
		Random random = new Random();
		// 产生随即切割序号
		/* 0-61.9999 */
		Integer j = random.nextInt((Constants.IMAGE_CHAR.length()));
		// 切割随机数
		String number = Constants.IMAGE_CHAR.substring(j, j + 1);
		graphics.setFont(Constants.codeFont[i]);
		graphics.setColor(Constants.color[i]);
		// 绘制验证码到图片X、Y（每个字体x每次步进13的倍数，y不变，大小6*6）
		graphics.drawString(number, 20 + i * 20, 30);

		codeNumbers += number;
		
		//System.out.println(codeNumbers);
	}
	
	private Color createRandomColor(int fc, int bc) {// 给定范围获得随机颜色
		// 随机对象
		Random random = new Random();
		// 随机初始数值不得大于255
		if (fc > 255)
			fc = 255;
		// 随机初始数值不得大于255
		if (bc > 255)
			bc = 255;
		// 产生随机红蓝绿色调
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}
}
