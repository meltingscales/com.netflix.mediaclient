package o;

import java.io.IOException;
import java.io.Reader;

/* loaded from: classes3.dex */
public final class HD extends Reader {
    private final int a;
    private final String b;
    private boolean d;
    private int e;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d = true;
    }

    public HD(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
        this.a = str.length();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        C8632dsu.c((Object) cArr, "");
        if (this.d) {
            throw new IOException("Reader closed");
        }
        int i3 = this.e;
        int i4 = this.a;
        if (i3 >= i4) {
            return -1;
        }
        if (i4 - i3 >= i2) {
            i4 = i3 + i2;
        }
        this.b.getChars(i3, i4, cArr, i);
        this.e = i4;
        return i4 - i3;
    }
}
