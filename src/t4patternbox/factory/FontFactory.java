package t4patternbox.factory;


public class FontFactory {

    public static IFontStyle createFont(int n){
        switch (n){
            case 1:
                return new Bold();
            case 2:
                return new Italic();
            case 3:
                return new Plain();
            case 4:
                return new BigFont();
            default:
                return null;
        }
    }
}
