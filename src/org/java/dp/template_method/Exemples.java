package org.java.dp.template_method;

public class Exemples {
	public static void main(String[] args) {
		TemplateClass templateClass = new TemplateImp1();
		System.out.println(templateClass.templateMethod());
		
		templateClass = new TemplateImp2();
		System.out.println(templateClass.templateMethod());
	}
}
