package o;

import java.util.List;

/* renamed from: o.dl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8422dl {
    private final char a;
    private final String b;
    private final double c;
    private final String d;
    private final List<C7879dO> e;
    private final double i;

    public double a() {
        return this.i;
    }

    public List<C7879dO> b() {
        return this.e;
    }

    public static int a(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public C8422dl(List<C7879dO> list, char c, double d, double d2, String str, String str2) {
        this.e = list;
        this.a = c;
        this.c = d;
        this.i = d2;
        this.d = str;
        this.b = str2;
    }

    public int hashCode() {
        return a(this.a, this.b, this.d);
    }
}
