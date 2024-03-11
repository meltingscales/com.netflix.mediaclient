package o;

import com.fasterxml.jackson.core.JsonFactory;

/* renamed from: o.dFh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7786dFh {
    public static final char[] a;
    public static final byte[] c;
    public static final C7786dFh e;

    private C7786dFh() {
    }

    static {
        C7786dFh c7786dFh = new C7786dFh();
        e = c7786dFh;
        a = new char[117];
        c = new byte[126];
        c7786dFh.d();
        c7786dFh.c();
    }

    private final void d() {
        for (int i = 0; i < 32; i++) {
            e(i, 'u');
        }
        e(8, 'b');
        e(9, 't');
        e(10, 'n');
        e(12, 'f');
        e(13, 'r');
        b('/', '/');
        b(JsonFactory.DEFAULT_QUOTE_CHAR, JsonFactory.DEFAULT_QUOTE_CHAR);
        b('\\', '\\');
    }

    private final void c() {
        for (int i = 0; i < 33; i++) {
            a(i, Byte.MAX_VALUE);
        }
        a(9, (byte) 3);
        a(10, (byte) 3);
        a(13, (byte) 3);
        a(32, (byte) 3);
        e(',', (byte) 4);
        e(':', (byte) 5);
        e('{', (byte) 6);
        e('}', (byte) 7);
        e('[', (byte) 8);
        e(']', (byte) 9);
        e(JsonFactory.DEFAULT_QUOTE_CHAR, (byte) 1);
        e('\\', (byte) 2);
    }

    private final void e(int i, char c2) {
        if (c2 != 'u') {
            a[c2] = (char) i;
        }
    }

    private final void b(char c2, char c3) {
        e(c2, c3);
    }

    private final void a(int i, byte b) {
        c[i] = b;
    }

    private final void e(char c2, byte b) {
        a(c2, b);
    }
}
