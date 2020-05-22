package com.huayi.ljj.springcloud.service;


import com.huayi.ljj.springcloud.model.TblManuFacturerPara;
import org.springframework.stereotype.Service;

@Service
public interface IManufactureParaManager {
    public int create(TblManuFacturerPara tblManuFacturerPara);

    public TblManuFacturerPara getManuFacturerParaById(String manufaturerCode);
}
