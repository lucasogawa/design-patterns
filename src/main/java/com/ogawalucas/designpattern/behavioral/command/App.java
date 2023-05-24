package com.ogawalucas.designpattern.behavioral.command;

public class App {

    public static void main(String[] args) {
        var switcher = new Switcher();
        var light = new Light();
        var onCommand = new TurnOnCommand(light);
        var offCommand = new TurnOffCommand(light);

        switcher.addCommand(offCommand);
        switcher.addCommand(onCommand);

        switcher.executeCommands();
    }
}
