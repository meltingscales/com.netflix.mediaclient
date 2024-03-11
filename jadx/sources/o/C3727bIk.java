package o;

import java.util.List;

/* renamed from: o.bIk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3727bIk implements InterfaceC8888fH {
    private final Integer a;
    private final boolean b;
    private final AbstractC8918fl<InterfaceC5198buI> c;
    private final Integer d;
    private final boolean e;
    private final String h;

    public C3727bIk() {
        this(null, null, null, null, false, false, 63, null);
    }

    public static /* synthetic */ C3727bIk copy$default(C3727bIk c3727bIk, String str, AbstractC8918fl abstractC8918fl, Integer num, Integer num2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3727bIk.h;
        }
        AbstractC8918fl<InterfaceC5198buI> abstractC8918fl2 = abstractC8918fl;
        if ((i & 2) != 0) {
            abstractC8918fl2 = c3727bIk.c;
        }
        AbstractC8918fl abstractC8918fl3 = abstractC8918fl2;
        if ((i & 4) != 0) {
            num = c3727bIk.d;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = c3727bIk.a;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z = c3727bIk.b;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = c3727bIk.e;
        }
        return c3727bIk.e(str, abstractC8918fl3, num3, num4, z3, z2);
    }

    public final boolean a() {
        return this.e;
    }

    public final Integer c() {
        return this.d;
    }

    public final String component1() {
        return this.h;
    }

    public final AbstractC8918fl<InterfaceC5198buI> component2() {
        return this.c;
    }

    public final Integer component3() {
        return this.d;
    }

    public final Integer component4() {
        return this.a;
    }

    public final boolean component5() {
        return this.b;
    }

    public final boolean component6() {
        return this.e;
    }

    public final boolean d() {
        return this.b;
    }

    public final C3727bIk e(@InterfaceC8969gj String str, AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl, @InterfaceC8969gj Integer num, Integer num2, boolean z, boolean z2) {
        C8632dsu.c((Object) abstractC8918fl, "");
        return new C3727bIk(str, abstractC8918fl, num, num2, z, z2);
    }

    public final AbstractC8918fl<InterfaceC5198buI> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3727bIk) {
            C3727bIk c3727bIk = (C3727bIk) obj;
            return C8632dsu.c((Object) this.h, (Object) c3727bIk.h) && C8632dsu.c(this.c, c3727bIk.c) && C8632dsu.c(this.d, c3727bIk.d) && C8632dsu.c(this.a, c3727bIk.a) && this.b == c3727bIk.b && this.e == c3727bIk.e;
        }
        return false;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.h;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.c.hashCode();
        Integer num = this.d;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        String str = this.h;
        AbstractC8918fl<InterfaceC5198buI> abstractC8918fl = this.c;
        Integer num = this.d;
        Integer num2 = this.a;
        boolean z = this.b;
        boolean z2 = this.e;
        return "FullDpState(videoId=" + str + ", videoDetails=" + abstractC8918fl + ", activeTab=" + num + ", selectedSeason=" + num2 + ", episodesPageLoadFailed=" + z + ", shouldPlayTrailer=" + z2 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3727bIk(@InterfaceC8969gj String str, AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl, @InterfaceC8969gj Integer num, Integer num2, boolean z, boolean z2) {
        C8632dsu.c((Object) abstractC8918fl, "");
        this.h = str;
        this.c = abstractC8918fl;
        this.d = num;
        this.a = num2;
        this.b = z;
        this.e = z2;
    }

    public /* synthetic */ C3727bIk(String str, AbstractC8918fl abstractC8918fl, Integer num, Integer num2, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C8974go.e : abstractC8918fl, (i & 4) != 0 ? null : num, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2);
    }

    public final int b() {
        InterfaceC5194buE P;
        List<InterfaceC5195buF> at;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        InterfaceC5198buI c = this.c.c();
        if (c != null && (P = c.P()) != null && (at = P.at()) != null) {
            C8632dsu.d(at);
            int i = 0;
            for (InterfaceC5195buF interfaceC5195buF : at) {
                if (interfaceC5195buF.x() == P.bV_()) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
