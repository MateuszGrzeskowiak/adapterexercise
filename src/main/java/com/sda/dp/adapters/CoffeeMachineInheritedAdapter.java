package com.sda.dp.adapters;

import com.sda.dp.KitchenDevice;
import com.sda.dp.devices.CoffeMachine;

public class CoffeeMachineInheritedAdapter extends CoffeMachine implements KitchenDevice {

    public void turnDeviceOn() {
        super.on();
    }

    @Override
    public void turnDeviceOff() {

    }
}
