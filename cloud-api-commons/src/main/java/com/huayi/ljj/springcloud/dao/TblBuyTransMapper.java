package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblBuyTrans;
import com.huayi.ljj.springcloud.model.TblBuyTransExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblBuyTransMapper {
    long countByExample(TblBuyTransExample example);

    int deleteByExample(TblBuyTransExample example);

    int insert(TblBuyTrans record);

    int insertSelective(TblBuyTrans record);

    List<TblBuyTrans> selectByExample(TblBuyTransExample example);

    int updateByExampleSelective(@Param("record") TblBuyTrans record, @Param("example") TblBuyTransExample example);

    int updateByExample(@Param("record") TblBuyTrans record, @Param("example") TblBuyTransExample example);
}