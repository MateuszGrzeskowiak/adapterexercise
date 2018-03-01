package com.sda.dp.adapters;

import com.sda.dp.KitchenDevice;
import com.sda.dp.devices.CoffeMachine;

public class CoffeMachineInheritedAdapter extends CoffeMachine implements KitchenDevice {

    public void turnDeviceOn() {
        super.on();
    }
}
