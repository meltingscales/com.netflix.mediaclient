package o;

/* renamed from: o.boM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4884boM {
    private final String a;
    private final String b;
    private final boolean c;
    private final String d;
    private final String e;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.c;
    }

    public C4884boM(String str, String str2, boolean z, String str3, String str4) {
        C8632dsu.c((Object) str, "");
        this.a = str;
        this.d = str2;
        this.c = z;
        this.b = str3;
        this.e = str4;
    }

    public /* synthetic */ C4884boM(String str, String str2, boolean z, String str3, String str4, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
