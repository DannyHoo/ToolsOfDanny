package com.danny.tools.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ListUtilsTest
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2016-12-06 14:11:05
 */
public class ListUtilsTest {

    @Test
    public void multipleTest(){
        List<Person> personList=new ArrayList<>();
        Set<Person> personSet=new HashSet<Person>();

        Person person=new Person("1");
        personList.add(person);
        person.setName("2");
        personList.add(person);
        person.setName("3");
        personList.add(person);

        personSet.addAll(personList);
        System.out.println(person);

        /*Person person=new Person("1");
        personSet.add(person);
        person.setName("2");
        personSet.add(person);
        person.setName("3");
        personSet.add(person);
        System.out.println(personSet);*/

    }

    @Test
    public void listRemoveTest(){
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person("adf"));
        personList.add(new Person("danny"));
        personList.add(new Person("dannyhoo"));
        personList.add(new Person("dgag"));

        Iterator<Person> it = personList.iterator();
        while(it.hasNext()){
            Person x = it.next();
            if(x.getName().contains("danny")){
                it.remove();
            }
        }
        for (Person person:personList){
            System.out.println(person.getName());
        }
    }

    @Test
    public void testGoThroughByListSize(){
        List<Object> stringList=new ArrayList<Object>();
        stringList.add("宋爽爽");
        stringList.add("danny");
        stringList.add("dannyhoo");
        stringList.add("胡玉洋");
        ListUtils.goThroughByListSize(stringList);
    }

    @Test
    public void testGetObject(){
        Object object=getObject();
        Assert.assertNotNull(object);
    }

    public static Object getObject(){
        Object object=new Object();
        int i=1/0;
        return object;
    }

}
class Person{
    public Person(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}