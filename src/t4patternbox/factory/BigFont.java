package t4patternbox.factory;

import java.awt.*;

public class BigFont implements IFontStyle{
    @Override
    public Font getFont() {
        return new Font("Bold", Font.BOLD, 36);
    }
}
