package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblOrderRecordIn;
import com.huayi.ljj.springcloud.model.TblOrderRecordInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOrderRecordInMapper {
    long countByExample(TblOrderRecordInExample example);

    int deleteByExample(TblOrderRecordInExample example);

    int deleteByPrimaryKey(String orderNo);

    int insert(TblOrderRecordIn record);

    int insertSelective(TblOrderRecordIn record);

    List<TblOrderRecordIn> selectByExample(TblOrderRecordInExample example);

    TblOrderRecordIn selectByPrimaryKey(String orderNo);

    int updateByExampleSelective(@Param("record") TblOrderRecordIn record, @Param("example") TblOrderRecordInExample example);

    int updateByExample(@Param("record") TblOrderRecordIn record, @Param("example") TblOrderRecordInExample example);

    int updateByPrimaryKeySelective(TblOrderRecordIn record);

    int updateByPrimaryKey(TblOrderRecordIn record);
}