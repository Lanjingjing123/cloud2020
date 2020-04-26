package com.huayi.ljj.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lanjingjing
 * @description table
 * @date 2020/4/6
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id ;

    private String serial;
}
