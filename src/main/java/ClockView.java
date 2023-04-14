/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class ClockView implements ClockListener {
    public void displayClock(int hour, int minute, int second) {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    @Override
    public void onClockTick(int hour, int minute, int second) {
        displayClock(hour, minute, second);
    }
}
