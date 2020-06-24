package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblTransLog;
import com.huayi.ljj.springcloud.model.TblTransLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblTransLogMapper {
    long countByExample(TblTransLogExample example);

    int deleteByExample(TblTransLogExample example);

    int deleteByPrimaryKey(String transNo);

    int insert(TblTransLog record);

    int insertSelective(TblTransLog record);

    List<TblTransLog> selectByExample(TblTransLogExample example);

    TblTransLog selectByPrimaryKey(String transNo);

    int updateByExampleSelective(@Param("record") TblTransLog record, @Param("example") TblTransLogExample example);

    int updateByExample(@Param("record") TblTransLog record, @Param("example") TblTransLogExample example);

    int updateByPrimaryKeySelective(TblTransLog record);

    int updateByPrimaryKey(TblTransLog record);
}