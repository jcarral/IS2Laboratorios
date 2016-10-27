package t4patternbox.factory;

import java.awt.*;


public class Bold implements IFontStyle {
    @Override
    public Font getFont() {
        return new Font("ROMAN-BASELINE", Font.ROMAN_BASELINE, 24);
    }
}
