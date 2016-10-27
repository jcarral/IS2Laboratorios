package t4patternbox.factory;

import java.awt.*;

public class Plain implements IFontStyle {
    @Override
    public Font getFont() {
        return new Font("Plain", Font.PLAIN, 24);
    }
}
