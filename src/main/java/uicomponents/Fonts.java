/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package uicomponents;

import java.awt.Font;

/**
 *
 * @author Hamer
 */
public enum Fonts {
    CASCADIACODE(new Font("Cascadia Code", Font.BOLD, 12)),
    ARIAL(new Font("Arial", Font.PLAIN, 14)),
    TIMESNEWROMAN(new Font("Times New Roman", Font.ITALIC, 16)),
    PLAYWRITE(new Font("Cascadia Code", Font.PLAIN, 11));

    private final Font font;

    // Enum constructor
    Fonts(Font font) {
        this.font = font;
    }

    // Getter method for the font
    public Font getFont() {
        return font;
    }
}
