package com.huayi.ljj.springcloud.dao;

import com.huayi.ljj.springcloud.model.TblHuayiGoods;
import com.huayi.ljj.springcloud.model.TblHuayiGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblHuayiGoodsMapper {
    long countByExample(TblHuayiGoodsExample example);

    int deleteByExample(TblHuayiGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TblHuayiGoods record);

    int insertSelective(TblHuayiGoods record);

    List<TblHuayiGoods> selectByExample(TblHuayiGoodsExample example);

    TblHuayiGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TblHuayiGoods record, @Param("example") TblHuayiGoodsExample example);

    int updateByExample(@Param("record") TblHuayiGoods record, @Param("example") TblHuayiGoodsExample example);

    int updateByPrimaryKeySelective(TblHuayiGoods record);

    int updateByPrimaryKey(TblHuayiGoods record);
}