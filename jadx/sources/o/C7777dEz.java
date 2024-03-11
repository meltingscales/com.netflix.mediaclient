package o;

import com.netflix.android.org.json.zip.JSONzip;

/* renamed from: o.dEz  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7777dEz {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final dES j;
    private final boolean k;
    private final String l;
    private final boolean m;
    private final boolean n;

    public C7777dEz() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, 16383, null);
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.a;
    }

    public final boolean f() {
        return this.i;
    }

    public final boolean g() {
        return this.k;
    }

    public final dES h() {
        return this.j;
    }

    public final boolean i() {
        return this.h;
    }

    public final boolean j() {
        return this.f;
    }

    public final boolean k() {
        return this.n;
    }

    public final boolean l() {
        return this.g;
    }

    public final boolean m() {
        return this.m;
    }

    public final String n() {
        return this.l;
    }

    public C7777dEz(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, dES des, boolean z11) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.h = z;
        this.i = z2;
        this.g = z3;
        this.b = z4;
        this.k = z5;
        this.f = z6;
        this.l = str;
        this.a = z7;
        this.n = z8;
        this.d = str2;
        this.c = z9;
        this.m = z10;
        this.j = des;
        this.e = z11;
    }

    public /* synthetic */ C7777dEz(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, String str2, boolean z9, boolean z10, dES des, boolean z11, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? "    " : str, (i & 128) != 0 ? false : z7, (i & JSONzip.end) != 0 ? false : z8, (i & 512) != 0 ? "type" : str2, (i & 1024) != 0 ? false : z9, (i & 2048) == 0 ? z10 : true, (i & 4096) != 0 ? null : des, (i & 8192) == 0 ? z11 : false);
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.h + ", ignoreUnknownKeys=" + this.i + ", isLenient=" + this.g + ", allowStructuredMapKeys=" + this.b + ", prettyPrint=" + this.k + ", explicitNulls=" + this.f + ", prettyPrintIndent='" + this.l + "', coerceInputValues=" + this.a + ", useArrayPolymorphism=" + this.n + ", classDiscriminator='" + this.d + "', allowSpecialFloatingPointValues=" + this.c + ", useAlternativeNames=" + this.m + ", namingStrategy=" + this.j + ", decodeEnumsCaseInsensitive=" + this.e + ')';
    }
}
