package com.takeo._SF_HELLOWORLD;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
 
import com.takeo.pojo.Student;
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
    	Object obj = factory.getBean("student");
    	Student stu = (Student)obj;
    	System.out.println(stu.getMessage());
    	System.out.println(stu.getSno());
    	System.out.println(stu.getFname());
    	System.out.println(stu.getLname());
    }
}
