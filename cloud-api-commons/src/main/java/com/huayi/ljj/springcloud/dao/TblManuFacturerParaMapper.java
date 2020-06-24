package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblManuFacturerPara;
import com.huayi.ljj.springcloud.model.TblManuFacturerParaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblManuFacturerParaMapper {
    long countByExample(TblManuFacturerParaExample example);

    int deleteByExample(TblManuFacturerParaExample example);

    int deleteByPrimaryKey(String manufacturerCode);

    int insert(TblManuFacturerPara record);

    int insertSelective(TblManuFacturerPara record);

    List<TblManuFacturerPara> selectByExample(TblManuFacturerParaExample example);

    TblManuFacturerPara selectByPrimaryKey(String manufacturerCode);

    int updateByExampleSelective(@Param("record") TblManuFacturerPara record, @Param("example") TblManuFacturerParaExample example);

    int updateByExample(@Param("record") TblManuFacturerPara record, @Param("example") TblManuFacturerParaExample example);

    int updateByPrimaryKeySelective(TblManuFacturerPara record);

    int updateByPrimaryKey(TblManuFacturerPara record);
}