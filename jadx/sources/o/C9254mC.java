package o;

/* renamed from: o.mC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9254mC {
    public static final String a(byte[] bArr) {
        int c;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            int i2 = b & 255;
            if (i2 < 16) {
                sb.append('0');
            }
            c = C8672dug.c(16);
            String num = Integer.toString(i2, c);
            C8632dsu.a(num, "");
            sb.append(num);
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }
}
