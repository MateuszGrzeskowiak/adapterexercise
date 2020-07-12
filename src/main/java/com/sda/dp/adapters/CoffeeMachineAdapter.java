package com.sda.dp.adapters;

import com.sda.dp.KitchenDevice;
import com.sda.dp.devices.CoffeMachine;

public class CoffeeMachineAdapter implements KitchenDevice {
    private CoffeMachine coffeMachine;

    public CoffeeMachineAdapter(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    public void turnDeviceOn() {
        coffeMachine.on();
    }

    public void turnDeviceOff() {
        coffeMachine.off();
    }
}


