import com.sda.dp.Kitchen;
import com.sda.dp.KitchenDevice;
import com.sda.dp.adapters.CoffeeMachineAdapter;
import com.sda.dp.adapters.FridgeAdapter;
import com.sda.dp.adapters.OvenAdapter;
import com.sda.dp.devices.CoffeMachine;
import com.sda.dp.devices.Fridge;
import com.sda.dp.devices.Oven;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<KitchenDevice> kitchenDevices = new ArrayList<>();
        kitchenDevices.add(new CoffeeMachineAdapter(new CoffeMachine()));
        kitchenDevices.add(new OvenAdapter(new Oven()));
        kitchenDevices.add(new FridgeAdapter(new Fridge()));

        turnAllDevicesOn(kitchenDevices);

        turnAllDevicesOff(kitchenDevices);
    }

    private static void turnAllDevicesOn(List<KitchenDevice> kitchenDevices) {
        for (KitchenDevice device : kitchenDevices) {
            device.turnDeviceOn();
        }
    }
    private static void turnAllDevicesOff(List<KitchenDevice> kitchenDevices) {
        for (KitchenDevice device : kitchenDevices) {
            device.turnDeviceOff();
        }
    }
}
