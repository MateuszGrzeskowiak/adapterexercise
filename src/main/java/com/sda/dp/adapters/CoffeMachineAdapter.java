package com.sda.dp.adapters;

import com.sda.dp.KitchenDevice;
import com.sda.dp.devices.CoffeMachine;

public class CoffeMachineAdapter implements KitchenDevice {
    private CoffeMachine coffeMachine;

    public CoffeMachineAdapter(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    public void turnDeviceOn() {
        coffeMachine.on();
    }
}
