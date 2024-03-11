package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* loaded from: classes3.dex */
public final class VW {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final InterfaceC5160btX f;
    private final String g;
    private final int h;
    private final int i;
    private final int j;
    private final VideoType n;

    /* renamed from: o  reason: collision with root package name */
    private final String f13404o;

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final int e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VW) {
            VW vw = (VW) obj;
            return C8632dsu.c((Object) this.g, (Object) vw.g) && this.i == vw.i && C8632dsu.c((Object) this.f13404o, (Object) vw.f13404o) && C8632dsu.c((Object) this.a, (Object) vw.a) && this.h == vw.h && C8632dsu.c((Object) this.c, (Object) vw.c) && this.e == vw.e && this.j == vw.j && C8632dsu.c(this.f, vw.f) && this.n == vw.n && this.d == vw.d && C8632dsu.c((Object) this.b, (Object) vw.b);
        }
        return false;
    }

    public final int f() {
        return this.h;
    }

    public final String g() {
        return this.f13404o;
    }

    public final VideoType h() {
        return this.n;
    }

    public int hashCode() {
        int hashCode = this.g.hashCode();
        int hashCode2 = Integer.hashCode(this.i);
        String str = this.f13404o;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.a.hashCode();
        int hashCode5 = Integer.hashCode(this.h);
        int hashCode6 = this.c.hashCode();
        int hashCode7 = Boolean.hashCode(this.e);
        int hashCode8 = Integer.hashCode(this.j);
        InterfaceC5160btX interfaceC5160btX = this.f;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (interfaceC5160btX != null ? interfaceC5160btX.hashCode() : 0)) * 31) + this.n.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.b.hashCode();
    }

    public final int i() {
        return this.j;
    }

    public final InterfaceC5160btX j() {
        return this.f;
    }

    public final boolean m() {
        return this.e;
    }

    public final boolean o() {
        return this.d;
    }

    public String toString() {
        String str = this.g;
        int i = this.i;
        String str2 = this.f13404o;
        String str3 = this.a;
        int i2 = this.h;
        String str4 = this.c;
        boolean z = this.e;
        int i3 = this.j;
        InterfaceC5160btX interfaceC5160btX = this.f;
        VideoType videoType = this.n;
        boolean z2 = this.d;
        String str5 = this.b;
        return "EpisodeData(name=" + str + ", number=" + i + ", synopsis=" + str2 + ", badge=" + str3 + ", runTime=" + i2 + ", imageUrl=" + str4 + ", isAvailableToPlay=" + z + ", progress=" + i3 + ", playable=" + interfaceC5160btX + ", type=" + videoType + ", isEpisodeNumberHidden=" + z2 + ", availabilityDateMessage=" + str5 + ")";
    }

    public VW(String str, int i, String str2, String str3, int i2, String str4, boolean z, int i3, InterfaceC5160btX interfaceC5160btX, VideoType videoType, boolean z2, String str5) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) str4, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str5, "");
        this.g = str;
        this.i = i;
        this.f13404o = str2;
        this.a = str3;
        this.h = i2;
        this.c = str4;
        this.e = z;
        this.j = i3;
        this.f = interfaceC5160btX;
        this.n = videoType;
        this.d = z2;
        this.b = str5;
    }
}
