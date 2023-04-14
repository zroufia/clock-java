/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class ClockMain {
    public static void main(String[] args) throws InterruptedException {
        ClockModel model = new ClockModel();
        ClockView view = new ClockView();
        ClockController controller = new ClockController(model, view);

        while (true) {
            controller.updateClock();
            Thread.sleep(1000); 
            System.out.print("\033[H\033[2J"); // clear console
            System.out.flush();
        }
    }
}

