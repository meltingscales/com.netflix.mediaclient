package o;

import android.util.SparseIntArray;
import java.math.BigInteger;

/* renamed from: o.ddW  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8073ddW {
    protected static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '_', '-', '.', '*', '(', ')', ',', '@', '\'', '$', ':', ';', '!'};
    protected static final SparseIntArray a = new SparseIntArray();

    static {
        a();
    }

    static void a() {
        int i = 0;
        while (true) {
            char[] cArr = b;
            if (i >= cArr.length) {
                return;
            }
            a.put(cArr[i], Integer.valueOf(i).intValue());
            i++;
        }
    }

    private static int c(char c) {
        Integer valueOf = Integer.valueOf(a.get(c));
        if (valueOf != null) {
            return valueOf.intValue();
        }
        throw new NumberFormatException("Value out of range " + c);
    }

    public static String c(String str, int i) {
        return b(str, i).toString();
    }

    private static BigInteger b(String str, int i) {
        BigInteger bigInteger = new BigInteger("" + i);
        BigInteger bigInteger2 = new BigInteger("0");
        String sb = new StringBuilder(str).reverse().toString();
        int i2 = 0;
        int i3 = 0;
        while (i2 < sb.length()) {
            int c = c(sb.charAt(i2));
            bigInteger2 = bigInteger2.add(bigInteger.pow(i3).multiply(new BigInteger("" + c)));
            i2++;
            i3++;
        }
        return bigInteger2;
    }
}
