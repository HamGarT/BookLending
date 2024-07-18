/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uicomponents;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JSeparator;
import javax.swing.JTextArea;

import javax.swing.SwingConstants;

/**
 *
 * @author Hamer
 */
public class CommentComponent extends JPanel {

    private JPanel commentPanel;
    private JSeparator separator;
    

    public CommentComponent(String user, String content) {
        setLayout(new BorderLayout());

        commentPanel = new JPanel();
        commentPanel.setLayout(new BoxLayout(commentPanel, BoxLayout.Y_AXIS));
        add(commentPanel, BorderLayout.WEST);

        JTextArea textArea = new JTextArea(content + " - @" + user, 0, 46);
        textArea.setFont(new Font("Serif", Font.PLAIN, 12));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        commentPanel.add(textArea);

        separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setMinimumSize(new Dimension(Integer.MAX_VALUE, separator.getPreferredSize().height));
        separator.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        commentPanel.add(separator);
        this.setMaximumSize(new Dimension(200, 50));

    }
}
