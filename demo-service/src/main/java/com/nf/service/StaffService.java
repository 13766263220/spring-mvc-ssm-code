package com.nf.service;

import com.nf.dao.DepartmentDao;
import com.nf.dao.StaffDao;
import com.nf.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffDao staffDao;
    @Autowired
    private DepartmentDao departmentDao;

    public List<Staff> getAll(Integer pageNum, Integer pageSize){
        return staffDao.getAll(pageNum,pageSize);
    }

    @Transactional
    public void deleteByDid(Integer dId){
        staffDao.deleteByDid(dId);
        departmentDao.deleteDept(dId);
    }
}
