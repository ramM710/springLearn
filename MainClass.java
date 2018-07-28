/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Ram M
 */
public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("emp/emp-spring-xml.xml");

//        EmpAddress eA = new EmpAddress();
//
//        EmpInfo eI = new EmpInfo(eA);
        EmpInfo eI = (EmpInfo) context.getBean("empInfo1");
        EmpInfo eI1 = (EmpInfo) context.getBean("empInfo2");

        System.out.println("Emp details" + eI);
        System.out.println("Emp details" + eI1);

        ClassPathXmlApplicationContext cpac = (ClassPathXmlApplicationContext) context;
        cpac.close();
    }

}
