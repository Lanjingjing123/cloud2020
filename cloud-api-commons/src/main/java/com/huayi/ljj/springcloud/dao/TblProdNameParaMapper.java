package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblProdNamePara;
import com.huayi.ljj.springcloud.model.TblProdNameParaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblProdNameParaMapper {
    long countByExample(TblProdNameParaExample example);

    int deleteByExample(TblProdNameParaExample example);

    int deleteByPrimaryKey(String productNo);

    int insert(TblProdNamePara record);

    int insertSelective(TblProdNamePara record);

    List<TblProdNamePara> selectByExample(TblProdNameParaExample example);

    TblProdNamePara selectByPrimaryKey(String productNo);

    int updateByExampleSelective(@Param("record") TblProdNamePara record, @Param("example") TblProdNameParaExample example);

    int updateByExample(@Param("record") TblProdNamePara record, @Param("example") TblProdNameParaExample example);

    int updateByPrimaryKeySelective(TblProdNamePara record);

    int updateByPrimaryKey(TblProdNamePara record);
}