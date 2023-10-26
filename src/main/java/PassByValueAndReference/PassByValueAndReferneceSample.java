package PassByValueAndReference;

/**
 * https://www.digitalocean.com/community/tutorials/java-is-pass-by-value-and-not-pass-by-reference
 * <p>
 * Output：
 * After the swap method executes:
 * `red` color value = Red
 * `blue` color value = Blue
 * After the changeValue method executes:
 * `blue` color value = Red
 */
public class PassByValueAndReferneceSample {

    public static void main(String[] args) {

        Balloon red = new Balloon("Red"); // memory reference = 50
        Balloon blue = new Balloon("Blue"); // memory reference = 100

        swap(red, blue);
//        swapBalloon(red, blue);
        System.out.println("After the swap method executes:");
        System.out.println("`red` color value = " + red.getColor());//`red` color value = Red
        System.out.println("`blue` color value = " + blue.getColor()); //`blue` color value = Blue

        changeValue(blue);
        System.out.println("After the changeValue method executes:");
        System.out.println("`blue` color value = " + blue.getColor()); //`blue` color value = Red

    }

    /*
    The values of o1 and o2 are swapped, but because the values are copies of the red and blue memory locations,
    there is no change to the values of the red and blue color values.
    Since the variables contain the reference to the objects,
    it’s a common mistake to assume that you’re passing the reference and Java is pass by reference.
    However, you’re passing a value which is a copy of the reference and therefore it’s pass by value.
     */
    public static void swap(Object o1, Object o2) { // o1 = 50, o2 = 100
        Object temp = o1; // assign the object reference value of o1 to temp: temp = 50, o1 = 50, o2 = 100
        o1 = o2; // assign the object reference value of o2 to o1: temp = 50, o1 = 100, o2 = 100
        o2 = temp; // assign the object reference value of temp to o2: temp = 50, o1 = 100, o2 = 50
    }

    //swapもswapBalloonも結果は同じ
    public static void swapBalloon(Balloon o1, Balloon o2) { // o1 = 50, o2 = 100
        Balloon temp = o1; // assign the object reference value of o1 to temp: temp = 50, o1 = 50, o2 = 100
        o1 = o2; // assign the object reference value of o2 to o1: temp = 50, o1 = 100, o2 = 100
        o2 = temp; // assign the object reference value of temp to o2: temp = 50, o1 = 100, o2 = 50
    }


    /*
    Here’s a step-by-step breakdown of what happens within the changeValue() method:
    The class calls the changeValue() method on the blue variable that references memory location 100.
    The first line creates a reference that also points to memory location 100.
    The color value of the object at memory location 100 is changed to "Red".

    The second line creates a new object (with color value "Green").
    The new object is at memory location 200.
    Any further methods executed on the balloon variable act upon the object at memory location 200,
    and don’t affect the object at memory location 100.
    The new balloon variable overwrites the reference created in line 1 and the balloon reference from line 1 is no longer accessible within this method.

    The third line changes the color value of the new Balloon object at memory location 200 to "Blue",
    but does not affect the original object referenced by blue at memory location 100.
    This explains why the final line of the example program output prints blue color value = Red, which reflects the change from line 1.
     */
    private static void changeValue(Balloon balloon) { // balloon = 100
        balloon.setColor("Red"); // balloon = 100, Blue-> Red
        balloon = new Balloon("Green"); // balloon = 200, New Green
        balloon.setColor("Blue"); // balloon = 200, Green->Blue
    }
}
