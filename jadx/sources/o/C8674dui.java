package o;

import java.nio.charset.Charset;

/* renamed from: o.dui  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8674dui {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final C8674dui e = new C8674dui();
    public static final Charset f;
    public static final Charset i;

    private C8674dui() {
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        C8632dsu.a(forName, "");
        i = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C8632dsu.a(forName2, "");
        b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C8632dsu.a(forName3, "");
        d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C8632dsu.a(forName4, "");
        f = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C8632dsu.a(forName5, "");
        c = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C8632dsu.a(forName6, "");
        a = forName6;
    }
}
