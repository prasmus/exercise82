/**
 * Created by Praktika on 20.12.2016.
 */
public class exercise82 {
    public static int banana(int[] a) {  // loendab kiwi'sid
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
    public static int grapefruit(int[] a, int grape) { // väljastab i väärtuse mis on võrdne grape väärtusega
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    public static int pineapple(int[] a, int apple) { // väljastab a väärtused mis ei ole võrdsed apple'iga
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

}
