package o;

import com.netflix.android.org.json.zip.JSONzip;

/* renamed from: o.bwj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5331bwj {
    private final int a;
    private final String b;
    private final long c;
    private final boolean d;
    private final int e;
    private final String f;
    private final String g;
    private final boolean h;
    private final String i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5331bwj(long j, int i, int i2, boolean z, boolean z2, String str, String str2, String str3) {
        this(j, i, i2, z, z2, str, str2, str3, null, JSONzip.end, null);
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
    }

    public final long a() {
        return this.c;
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.g;
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5331bwj) {
            C5331bwj c5331bwj = (C5331bwj) obj;
            return this.c == c5331bwj.c && this.e == c5331bwj.e && this.a == c5331bwj.a && this.d == c5331bwj.d && this.h == c5331bwj.h && C8632dsu.c((Object) this.g, (Object) c5331bwj.g) && C8632dsu.c((Object) this.f, (Object) c5331bwj.f) && C8632dsu.c((Object) this.b, (Object) c5331bwj.b) && C8632dsu.c((Object) this.i, (Object) c5331bwj.i);
        }
        return false;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.c) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.a)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.h)) * 31) + this.g.hashCode()) * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + this.i.hashCode();
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.f;
    }

    public String toString() {
        long j = this.c;
        int i = this.e;
        int i2 = this.a;
        boolean z = this.d;
        boolean z2 = this.h;
        String str = this.g;
        String str2 = this.f;
        String str3 = this.b;
        String str4 = this.i;
        return "ManifestKey(playableId=" + j + ", netType=" + i + ", netId=" + i2 + ", isBranching=" + z + ", supportsLanguageSelector=" + z2 + ", preferredAudio=" + str + ", preferredSubtitle=" + str2 + ", preferredAssistive=" + str3 + ", token=" + str4 + ")";
    }

    public C5331bwj(long j, int i, int i2, boolean z, boolean z2, String str, String str2, String str3, String str4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        this.c = j;
        this.e = i;
        this.a = i2;
        this.d = z;
        this.h = z2;
        this.g = str;
        this.f = str2;
        this.b = str3;
        this.i = str4;
    }

    public /* synthetic */ C5331bwj(long j, int i, int i2, boolean z, boolean z2, String str, String str2, String str3, String str4, int i3, C8627dsp c8627dsp) {
        this(j, i, i2, z, z2, str, str2, str3, (i3 & JSONzip.end) != 0 ? "" : str4);
    }
}
