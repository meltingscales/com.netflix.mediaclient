package o;

import com.netflix.android.volley.VolleyError;

/* renamed from: o.brB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5032brB {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public static C5032brB e(C9858xs c9858xs, VolleyError volleyError) {
        String str;
        int d = C5044brN.d(volleyError);
        if (d != -1 && d != 5) {
            return new C5032brB(d, null, null, volleyError.getCause().getMessage(), false);
        }
        if (c9858xs == null || c9858xs.e < 400 || (str = c9858xs.d.get("X-FTL-Error")) == null) {
            return null;
        }
        return new C5032brB(c9858xs.e, str, c9858xs.d.get("Via"), null, c9858xs.e == 418);
    }

    private C5032brB(int i, String str, String str2, String str3, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }
}
