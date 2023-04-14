/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class ClockController {
    private ClockModel model;
    private ClockView view;

    public ClockController(ClockModel model, ClockView view) {
        this.model = model;
        this.view = view;
        model.addClockListener(view);
    }

    public void updateClock() {
        model.updateTime();
    }
}

