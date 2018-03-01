package com.sda.dp.adapters;

import com.sda.dp.Adapter;
import com.sda.dp.devices.CoffeMachine;

public class CoffeMachineInheritedAdapter extends CoffeMachine implements Adapter{

    public void turnDeviceOn() {
        super.on();
    }
}
