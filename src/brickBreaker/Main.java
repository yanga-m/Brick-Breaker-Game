package brickBreaker;

import brickBreaker.Gameplay;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame obj = new JFrame();
            Gameplay gamePlay = new Gameplay();
            obj.setBounds(10, 10, 700, 600);
            obj.setTitle("Breakout Ball");
            obj.setResizable(false);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.add(gamePlay);
            obj.setVisible(true);
        });
    }
}
