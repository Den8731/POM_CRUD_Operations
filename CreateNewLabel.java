package com.cherish.crudoperations;


import javax.swing.*;
import java.awt.*;

public class CreateNewLabel extends JFrame {
    int labelCount = 0;
    JFrame window_frame = new JFrame("Content window");
    JPanel panelItemOne = new JPanel(new FlowLayout());
    JPanel buttonPanel = new JPanel(new FlowLayout());


    public CreateNewLabel() {


        window_frame.setSize(415, 350);
        window_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window_frame.setLayout(new BorderLayout());

        // Add the button to its own panel
        buttonPanel.add(CreateNewLabel());

        // Keep the button at the top
        window_frame.add(buttonPanel, BorderLayout.NORTH);

        // Keep generated labels in the center
        window_frame.add(panelItemOne, BorderLayout.CENTER);
        panelItemOne.setLayout(
                new BoxLayout(panelItemOne, BoxLayout.Y_AXIS));

        window_frame.setLocationRelativeTo(null);
        window_frame.setVisible(true);



    }

    //Make a new label on the fly
    public JButton CreateNewLabel() {
        JButton addLabel = new JButton("Generate Labels");

        addLabel.addActionListener(event -> {
            labelCount++;
            LabelGenerator("Label" + " " + labelCount + " " + "created");


        });
        return addLabel;
    }

    public JLabel LabelGenerator(String text) {
        JLabel contentOne = new JLabel(text);


        panelItemOne.add(contentOne);
        panelItemOne.revalidate();
        panelItemOne.repaint();


        return contentOne;
    }

    public void AddNewContent() {

    }

    public void ClearScreen() {

    }


}