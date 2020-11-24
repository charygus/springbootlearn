package com.viho.bean;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * author viho
 *将配置文件中的每个属性·1 映射到这个组件中
 * @configurationProperties 告诉springboot 这个实体的属性和配置文件中相关的属性配置进行绑定
 * prefix = "person"  指定哪个属性下的数据进行绑定
 *@configurationProperties 支持松散语法绑定 表示遇到大写字母时可以用-或_进行代替 也可以绑定 value则必须对应
 * 但是value支持spEL @configurationProperties不支持
 * @configurationProperties支持JSR303数据校验 则value不支持
 * 这个组件只有是容器中的组件 才能提供@configurationProperties动态绑定的功能
 * @create 2020-11-17下午 1:44
 */
//增加数据校验
//@Validated
//@Component
//@ConfigurationProperties(prefix = "person1")
public class Person {
    //@Value("${person.last-name}")
    private String lastName;
    //@Value("#{11*2}")
    private Integer age;
    //@Value("false")
    private Boolean isBoss;
    private Date birth;
    private Map<String,Object> map;
    private List<Object> list;
    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return isBoss;
    }

    public void setBoss(Boolean boss) {
        isBoss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isBoss=" + isBoss +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
