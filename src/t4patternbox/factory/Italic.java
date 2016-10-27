package t4patternbox.factory;

import java.awt.*;

/**
 * Created by joseba on 26/10/2016.
 */
public class Italic implements IFontStyle {
    @Override
    public Font getFont() {
        return new Font("TRUETYPE-FONT", Font.ITALIC, 24);
    }
}
