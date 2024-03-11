package o;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.Arrays;

/* renamed from: o.dFy  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7803dFy implements dFD {
    private int c;
    private char[] e = C7780dFb.c.a();

    @Override // o.dFD
    public void c(long j) {
        c(String.valueOf(j));
    }

    @Override // o.dFD
    public void b(char c) {
        b(1);
        char[] cArr = this.e;
        int i = this.c;
        this.c = i + 1;
        cArr[i] = c;
    }

    @Override // o.dFD
    public void c(String str) {
        C8632dsu.c((Object) str, "");
        int length = str.length();
        if (length == 0) {
            return;
        }
        b(length);
        str.getChars(0, str.length(), this.e, this.c);
        this.c += length;
    }

    @Override // o.dFD
    public void a(String str) {
        C8632dsu.c((Object) str, "");
        b(str.length() + 2);
        char[] cArr = this.e;
        int i = this.c;
        int i2 = i + 1;
        cArr[i] = JsonFactory.DEFAULT_QUOTE_CHAR;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < dFK.e().length && dFK.e()[c] != 0) {
                b(i4 - i2, i4, str);
                return;
            }
        }
        cArr[i3] = JsonFactory.DEFAULT_QUOTE_CHAR;
        this.c = i3 + 1;
    }

    private final void b(int i, int i2, String str) {
        int i3;
        int length = str.length();
        while (i < length) {
            int a = a(i2, 2);
            char charAt = str.charAt(i);
            if (charAt < dFK.e().length) {
                byte b = dFK.e()[charAt];
                if (b == 0) {
                    i3 = a + 1;
                    this.e[a] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = dFK.d()[charAt];
                        C8632dsu.d((Object) str2);
                        int a2 = a(a, str2.length());
                        str2.getChars(0, str2.length(), this.e, a2);
                        i2 = a2 + str2.length();
                        this.c = i2;
                    } else {
                        char[] cArr = this.e;
                        cArr[a] = '\\';
                        cArr[a + 1] = (char) b;
                        i2 = a + 2;
                        this.c = i2;
                    }
                    i++;
                }
            } else {
                i3 = a + 1;
                this.e[a] = charAt;
            }
            i2 = i3;
            i++;
        }
        int a3 = a(i2, 1);
        this.e[a3] = JsonFactory.DEFAULT_QUOTE_CHAR;
        this.c = a3 + 1;
    }

    public void a() {
        C7780dFb.c.c(this.e);
    }

    public String toString() {
        return new String(this.e, 0, this.c);
    }

    private final void b(int i) {
        a(this.c, i);
    }

    private final int a(int i, int i2) {
        int b;
        int i3 = i2 + i;
        char[] cArr = this.e;
        if (cArr.length <= i3) {
            b = C8657dts.b(i3, i * 2);
            char[] copyOf = Arrays.copyOf(cArr, b);
            C8632dsu.a(copyOf, "");
            this.e = copyOf;
        }
        return i;
    }
}
