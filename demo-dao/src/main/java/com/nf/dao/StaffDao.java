package com.nf.dao;

import com.nf.entity.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StaffDao {
    List<Staff> getAll(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    void deleteByDid(Integer id);
}
