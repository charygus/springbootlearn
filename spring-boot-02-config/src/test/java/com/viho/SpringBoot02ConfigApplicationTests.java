package com.viho;

import com.viho.bean.Person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**S
 * author viho
 *SpringBoot单元测试
 *  可以在测试期间很方便的类似编码一样自动注入到容器中
 * @create 2020-11-17下午 2:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.viho.bean.Person.class)
public class SpringBoot02ConfigApplicationTests {
    @Autowired
    Person person;
    @Test
    public void contextLoads(){
        System.out.println(person.toString());
    }
}
