package org.example.example01v1.java;

public class Window implements WindowActionListener {
    @Override
    public void openWindow() {
        System.out.println("Window is opening");
    }

    @Override
    public void closeWindow() {
        System.out.println("Window is closing");
    }
}
