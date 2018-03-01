package com.sda.dp;

import com.sda.dp.devices.CoffeMachine;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<KitchenDevice> deviceList;

    public Kitchen() {
        this.deviceList = new ArrayList<KitchenDevice>();
//        this.deviceList.add(new CoffeMachine()); ??
    }

    public void turnEverythingOn(){
        for (KitchenDevice device : deviceList) {
            device.turnDeviceOn();
        }
    }

    // TODO: turn off
}
