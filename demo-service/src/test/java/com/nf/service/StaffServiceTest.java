package com.nf.service;

import com.nf.config.DaoConfig;
import com.nf.config.ServiceConfig;
import com.nf.dao.StaffDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfig.class)

public class StaffServiceTest {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private StaffService staffService;

    @Autowired
    private StaffDao staffDao;

    @Test
    public void getAll() {
        System.out.println(staffDao.getAll(2,4));
    }
}