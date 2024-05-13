package testPjt;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// xml 컨테이너에 접근하기 위한 코드
		GenericXmlApplicationContext ctx =new GenericXmlApplicationContext("classpath:applicationContext.xml");
		TranspotationWalk rTranspotationWalk=ctx.getBean("tWalk",TranspotationWalk.class);
		rTranspotationWalk.move();
		ctx.close();
	}
}
