package com.nf;

import com.nf.config.MvcConfig;
import com.nf.config.ServiceConfig;
import com.nf.service.StaffService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MvcConfig.class)
public class MvcTest {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private StaffService staffService;
    @Test
    public void getAll(){
        System.out.println(staffService.getAll(2,3));
    }
}
