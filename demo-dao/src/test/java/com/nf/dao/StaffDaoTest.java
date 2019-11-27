package com.nf.dao;

import com.nf.config.DaoConfig;
import com.nf.entity.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
public class StaffDaoTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void getAll() {
        StaffDao staffDao = context.getBean(StaffDao.class);
        List<Staff> staffs = staffDao.getAll(2,3);
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }
}