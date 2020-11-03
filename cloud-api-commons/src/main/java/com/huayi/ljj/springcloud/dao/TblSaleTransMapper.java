package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblSaleTrans;
import com.huayi.ljj.springcloud.model.TblSaleTransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSaleTransMapper {
    long countByExample(TblSaleTransExample example);

    int deleteByExample(TblSaleTransExample example);

    int insert(TblSaleTrans record);

    int insertSelective(TblSaleTrans record);

    List<TblSaleTrans> selectByExample(TblSaleTransExample example);

    int updateByExampleSelective(@Param("record") TblSaleTrans record, @Param("example") TblSaleTransExample example);

    int updateByExample(@Param("record") TblSaleTrans record, @Param("example") TblSaleTransExample example);
}