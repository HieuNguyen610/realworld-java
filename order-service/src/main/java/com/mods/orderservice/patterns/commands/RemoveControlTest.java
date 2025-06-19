package com.mods.orderservice.patterns.commands;

public class RemoveControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan();

        // create command and receiver
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        // set command to invoker
        simpleRemoteControl.setCommand(lightOnCommand);
        // simulate button press
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        simpleRemoteControl.setCommand(ceilingFanHighCommand);
        simpleRemoteControl.buttonWasPressed();

    }
}
