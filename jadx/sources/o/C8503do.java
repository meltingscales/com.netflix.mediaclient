package o;

/* renamed from: o.do  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8503do {
    public final float b;
    private final String c;
    public final float d;

    public C8503do(String str, float f, float f2) {
        this.c = str;
        this.b = f2;
        this.d = f;
    }

    public boolean e(String str) {
        if (this.c.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.c.endsWith("\r")) {
            String str2 = this.c;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
