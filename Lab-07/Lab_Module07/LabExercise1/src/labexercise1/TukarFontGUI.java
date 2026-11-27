/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexercise1;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class TukarFontGUI extends JFrame implements ActionListener {

    private JLabel label;
    private JRadioButton plainButton, boldButton, italicButton, boldItalicButton;
    private ButtonGroup fontGroup;

    public TukarFontGUI() {
        super("Font Changer");

        label = new JLabel("HELLOOOO, SAYA AISYAH DAN SAYA COMEL");
        label.setFont(new Font("Serif", Font.PLAIN, 20));

        plainButton = new JRadioButton("Plain", true);
        boldButton = new JRadioButton("Bold");
        italicButton = new JRadioButton("Italic");
        boldItalicButton = new JRadioButton("Bold + Italic");

        fontGroup = new ButtonGroup();
        fontGroup.add(plainButton);
        fontGroup.add(boldButton);
        fontGroup.add(italicButton);
        fontGroup.add(boldItalicButton);

        plainButton.addActionListener(this);
        boldButton.addActionListener(this);
        italicButton.addActionListener(this);
        boldItalicButton.addActionListener(this);

        JPanel radioPanel = new JPanel(new GridLayout(4, 1));
        radioPanel.add(plainButton);
        radioPanel.add(boldButton);
        radioPanel.add(italicButton);
        radioPanel.add(boldItalicButton);

        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(radioPanel, BorderLayout.SOUTH);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int style = Font.PLAIN;

        if (boldButton.isSelected()) {
            style = Font.BOLD;
        } else if (italicButton.isSelected()) {
            style = Font.ITALIC;
        } else if (boldItalicButton.isSelected()) {
            style = Font.BOLD | Font.ITALIC;
        }

        label.setFont(new Font("Serif", style, 20));
    }
}
