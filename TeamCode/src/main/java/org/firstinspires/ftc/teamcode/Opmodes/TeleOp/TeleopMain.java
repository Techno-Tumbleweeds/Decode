package org.firstinspires.ftc.teamcode.Opmodes.TeleOp;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Hardware.RobotHardware;
import org.firstinspires.ftc.teamcode.Hardware.Subsystems.IMUSensor;

@TeleOp
public class TeleopMain extends OpMode {
    // Creates instances of our subsystems
    IMUSensor gyro = new IMUSensor();
    RobotHardware robot  = new RobotHardware();

    @Override
    public void init() {
        // Initializes our subsystems
        gyro.init(hardwareMap);
        robot.init(hardwareMap);
    }

    @Override
    public void loop() {
         // Tests two Front Motors
         robot.leftFront.setPower(gamepad1.right_stick_y);
         robot.rightFront.setPower(gamepad1.left_stick_y);

         // Tests IMU on button press
         if (gamepad1.a) {
             telemetry.addData("Heading", gyro.getHeading());

         }
    }

}
