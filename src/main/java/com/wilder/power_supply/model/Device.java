package com.wilder.power_supply.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Wilder Gao
 * time:2018/5/1
 * Description：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device implements Serializable {

    /**
     * 设备Id
     */
    private int deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备所需要的材料信息
     */
    private List<Meterial> meterials;
}
