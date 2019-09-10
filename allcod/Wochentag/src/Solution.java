import java.awt.Color;

class Solution {
public static void main (String []args)
{
double a = lum(Color.red);
System.out.println(a);
Color s = changedColorSaturation(Color.BLUE,-123);
System.out.println(s);
System.out.println(colorValue(12));
rotatedLeft() 
}

public static double lum(Color color) {
double r = color.getRed();
double g = color.getGreen();
double b = color.getBlue();
return r * 0.299 + g * 0.587 + b * 0.114;
}
public static double averageLum(Picture pic) {
double lumSum = 0;
for (int x = 0; x < pic.width(); x++) {
for (int y = 0; y < pic.height(); y++) {
lumSum = lumSum + lum(pic.get(x, y));
}
}
return lumSum / (pic.width() * pic.height());
}
public static Color changedColorSaturation(Color color , double change) {
double r = color.getRed();
double g = color.getGreen();
double b = color.getBlue();
double p = lum(color);
int newR = colorValue(p + (r - p) * change);
int newG = colorValue(p + (g - p) * change);
int newB = colorValue(p + (b - p) * change);
return new Color(newR , newG , newB);
}
/* Schneidet Nachkommastellen ab und sorgt dafür, dass das
Ergebnis ein int aus [0, 255] ist */
private static int colorValue(double v) {
return Math.max(0, Math.min(255, (int) Math.round(v)));
}
public static Picture rotatedLeft(Picture p) {
Picture rotated = new Picture(p.height(), p.width());
for (int x = 0; x < rotated.width(); x++) {
for (int y = 0; y < rotated.height(); y++) {
rotated.set(x, y, p.get(rotated.height() - 1 - y, x));
}
}
return rotated;
}
}
