package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblProdInventory;
import com.huayi.ljj.springcloud.model.TblProdInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblProdInventoryMapper {
    long countByExample(TblProdInventoryExample example);

    int deleteByExample(TblProdInventoryExample example);

    int deleteByPrimaryKey(String productKind);

    int insert(TblProdInventory record);

    int insertSelective(TblProdInventory record);

    List<TblProdInventory> selectByExample(TblProdInventoryExample example);

    TblProdInventory selectByPrimaryKey(String productKind);

    int updateByExampleSelective(@Param("record") TblProdInventory record, @Param("example") TblProdInventoryExample example);

    int updateByExample(@Param("record") TblProdInventory record, @Param("example") TblProdInventoryExample example);

    int updateByPrimaryKeySelective(TblProdInventory record);

    int updateByPrimaryKey(TblProdInventory record);
}