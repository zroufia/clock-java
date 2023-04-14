/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author admin
 */
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ClockModel {
    private LocalTime time;
    private final List<ClockListener> listeners = new ArrayList<>();

    public ClockModel() {
        time = LocalTime.now();
    }

    public void updateTime() {
        time = LocalTime.now();
        notifyListeners();
    }

    public int getHour() {
        return time.getHour();
    }

    public int getMinute() {
        return time.getMinute();
    }

    public int getSecond() {
        return time.getSecond();
    }

    public void addClockListener(ClockListener listener) {
        listeners.add(listener);
    }

    public void removeClockListener(ClockListener listener) {
        listeners.remove(listener);
    }

    private void notifyListeners() {
        for (ClockListener listener : listeners) {
            listener.onClockTick(getHour(), getMinute(), getSecond());
        }
    }
}
