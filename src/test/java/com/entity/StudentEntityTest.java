package com.entity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring.xml"} )
public class StudentEntityTest {
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Test
    public void testGet(){
        StudentEntity studentEntity = hibernateTemplate.get(StudentEntity.class, 1);
        //studentEntity.setName("tom");

        //hibernateTemplate.update(studentEntity);
        System.out.println(studentEntity);

    }
}