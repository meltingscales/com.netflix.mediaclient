package org.xbill.DNS;

/* loaded from: classes5.dex */
public final class TTL {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void check(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new InvalidTTLException(j);
        }
    }

    public static String format(long j) {
        check(j);
        StringBuilder sb = new StringBuilder();
        long j2 = j % 60;
        long j3 = j / 60;
        long j4 = j3 % 60;
        long j5 = j3 / 60;
        long j6 = j5 % 24;
        long j7 = j5 / 24;
        long j8 = j7 % 7;
        long j9 = j7 / 7;
        int i = (j9 > 0L ? 1 : (j9 == 0L ? 0 : -1));
        if (i > 0) {
            sb.append(j9);
            sb.append("W");
        }
        int i2 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        if (i2 > 0) {
            sb.append(j8);
            sb.append("D");
        }
        int i3 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i3 > 0) {
            sb.append(j6);
            sb.append("H");
        }
        int i4 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        if (i4 > 0) {
            sb.append(j4);
            sb.append("M");
        }
        if (j2 > 0 || (i == 0 && i2 == 0 && i3 == 0 && i4 == 0)) {
            sb.append(j2);
            sb.append("S");
        }
        return sb.toString();
    }
}
