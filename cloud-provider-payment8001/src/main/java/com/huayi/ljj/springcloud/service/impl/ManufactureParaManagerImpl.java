package com.huayi.ljj.springcloud.service.impl;

import com.huayi.ljj.springcloud.dao.TblManuFacturerParaMapper;
import com.huayi.ljj.springcloud.model.TblManuFacturerPara;
import com.huayi.ljj.springcloud.service.IManufactureParaManager;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

@Service
public class ManufactureParaManagerImpl implements IManufactureParaManager {

    @Resource
    TblManuFacturerParaMapper manuFacturerParaMapper;

    @Override
    public int create(TblManuFacturerPara tblManuFacturerPara) {
        return manuFacturerParaMapper.insert(tblManuFacturerPara);
    }

    @Override
    public TblManuFacturerPara getManuFacturerParaById(String manufacturerCode) {
        return manuFacturerParaMapper.selectByPrimaryKey(manufacturerCode);
    }
}
