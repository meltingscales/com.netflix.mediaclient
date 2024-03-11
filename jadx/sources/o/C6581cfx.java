package o;

import android.util.Pair;

/* renamed from: o.cfx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6581cfx {
    private boolean a;
    private String b;
    private String e;

    public String b() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public boolean e() {
        return this.a;
    }

    private C6581cfx(String str, String str2, boolean z) {
        this.e = str;
        this.b = str2;
        this.a = z;
    }

    public String toString() {
        return "MdxTarget [TAG=nf_mdx, mUUID=" + this.e + ", friendlyName=" + this.b + ", local=" + this.a + "]";
    }

    public static C6581cfx a() {
        return new C6581cfx(null, null, true);
    }

    public static C6581cfx a(Pair<String, String> pair) {
        return new C6581cfx((String) pair.first, (String) pair.second, false);
    }
}
