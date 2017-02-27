package com.danny.optimise.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ListOptimise
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2016-12-11 21:22:13
 */
public class ListOptimise {

    public static void main(String[] args) {
        /*long startTime = System.currentTimeMillis();

        List<Person> personList = new ArrayList<Person>();
        for (int i = 0; i < 100000; i++) {
            personList.add(new Person(i, ("Danny" + i).toString()));
        }

        //一个姓名字符串集合
        List<String> strList = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            strList.add("Danny" + i);
        }

        List<Person> resultList = new ArrayList<Person>();
        for (Person person : personList) {
            for (String str : strList) {
                if (person.getName().equals(str)) {
                    resultList.add(person);
                }
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println(resultList.size());
        System.out.println(endTime - startTime);*/

        List<Person> personList = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            personList.add(new Person(i, ("Danny" + i).toString()));
        }

        for (Person person:personList){
            if (person.getId()==1||person.getId()==3||person.getId()==5||person.getId()==7||person.getId()==9){
                person.setName("Danny");
            }
        }

        for (Person person:personList){
            System.out.println(person.getId()+":"+person.getName());
        }
    }


}

class Person {
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}