package com.google.gson.internal.bind.util;

import java.util.TimeZone;
import o.C8543dpm;

/* loaded from: classes.dex */
public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = C8543dpm.c("UTC");

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:48:0x00ce, B:50:0x00d4, B:52:0x00da, B:76:0x0187, B:56:0x00e4, B:57:0x00ff, B:58:0x0100, B:62:0x011c, B:64:0x0129, B:67:0x0132, B:69:0x0151, B:72:0x0160, B:73:0x0182, B:75:0x0185, B:61:0x010b, B:78:0x01b8, B:79:0x01bf, B:41:0x00b7, B:42:0x00ba), top: B:95:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8 A[Catch: IllegalArgumentException -> 0x01c0, NumberFormatException -> 0x01c2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01c4, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:48:0x00ce, B:50:0x00d4, B:52:0x00da, B:76:0x0187, B:56:0x00e4, B:57:0x00ff, B:58:0x0100, B:62:0x011c, B:64:0x0129, B:67:0x0132, B:69:0x0151, B:72:0x0160, B:73:0x0182, B:75:0x0185, B:61:0x010b, B:78:0x01b8, B:79:0x01bf, B:41:0x00b7, B:42:0x00ba), top: B:95:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int parseInt(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4++;
        }
        return -i3;
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
