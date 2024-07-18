/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uicomponents;

/**
 *
 * @author Hamer
 */
import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.border.EmptyBorder;


public class BookPanel extends JPanel {
    private JLabel imageLabel;
    private JLabel authorLabel;
    private JLabel bookNameLabel;
    private Path projectDir;

    public BookPanel() {
        this("Author", "Book Name", null);
    }

    public BookPanel(String author, String bookName, Icon bookImage) {
        projectDir = Paths.get(System.getProperty("user.dir"));
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(200, 350));
        imageLabel = new JLabel();
        if (bookImage != null) {
            imageLabel.setIcon(bookImage);
        }
        imageLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        JPanel p1 = new RoundedPanel(15, new Color(255, 255, 255));
        p1.setLayout(new BorderLayout());

        p1.setBorder(new EmptyBorder(20, 10, 10, 10));
        p1.setForeground(Color.WHITE);
        p1.setOpaque(false);

        p1.add(imageLabel, BorderLayout.CENTER);
        authorLabel = new JLabel(author);
        bookNameLabel = new JLabel(bookName);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2, 1));
        textPanel.add(authorLabel);
        textPanel.add(bookNameLabel);
        textPanel.setBorder(new EmptyBorder(20, 10, 10, 10));
        textPanel.setBackground(new Color(255, 255, 255));
        p1.add(textPanel, BorderLayout.SOUTH);

        // Center texts
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);
        authorLabel.setHorizontalAlignment(JLabel.CENTER);
        bookNameLabel.setHorizontalAlignment(JLabel.CENTER);
        // cursor
        imageLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // fonts
        bookNameLabel.setFont(Fonts.CASCADIACODE.getFont());
        authorLabel.setFont(Fonts.PLAYWRITE.getFont());

        authorLabel.setOpaque(true);
        bookNameLabel.setOpaque(true);
        this.setBackground(new Color(0, 0, 0, 0));
        bookNameLabel.setBackground(new Color(255, 255, 255));
        authorLabel.setBackground(new Color(255, 255, 255));
        authorLabel.repaint();
        p1.setPreferredSize(new Dimension(200, 350));
        add(p1);

    }

    public void setAuthor(String author) {
        authorLabel.setText(author);
    }

    public void setBookName(String bookName) {
        bookNameLabel.setText(bookName);
    }

    public void setBookImage(String url) {
        Icon icon = new ImageIcon(
                new ImageIcon(getClass().getResource(url)).getImage().getScaledInstance(200, 300, 0));
        imageLabel.setIcon(icon);
    }

    public void setBookImage1(String url) {
        Icon icon = new ImageIcon(
                new ImageIcon(projectDir + "\\imagenes" + url).getImage().getScaledInstance(200, 300, 0));
        imageLabel.setIcon(icon);
    }

    public void setColor(Color color) {
        authorLabel.setOpaque(true);
        bookNameLabel.setOpaque(true);
        this.setBackground(color);
        bookNameLabel.setBackground(color);
        authorLabel.setBackground(color);

    }

}
