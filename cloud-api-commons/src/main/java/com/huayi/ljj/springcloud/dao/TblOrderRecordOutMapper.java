package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblOrderRecordOut;
import com.huayi.ljj.springcloud.model.TblOrderRecordOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOrderRecordOutMapper {
    long countByExample(TblOrderRecordOutExample example);

    int deleteByExample(TblOrderRecordOutExample example);

    int deleteByPrimaryKey(String orderNo);

    int insert(TblOrderRecordOut record);

    int insertSelective(TblOrderRecordOut record);

    List<TblOrderRecordOut> selectByExample(TblOrderRecordOutExample example);

    TblOrderRecordOut selectByPrimaryKey(String orderNo);

    int updateByExampleSelective(@Param("record") TblOrderRecordOut record, @Param("example") TblOrderRecordOutExample example);

    int updateByExample(@Param("record") TblOrderRecordOut record, @Param("example") TblOrderRecordOutExample example);

    int updateByPrimaryKeySelective(TblOrderRecordOut record);

    int updateByPrimaryKey(TblOrderRecordOut record);
}