package o;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;

/* renamed from: o.Wd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1294Wd {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final Integer e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final CommanderState l;
    private final boolean m;
    private final boolean n;

    public C1294Wd() {
        this(false, null, false, false, false, false, null, false, false, false, false, false, false, 8191, null);
    }

    public final boolean a() {
        return this.g;
    }

    public final boolean b() {
        return this.c;
    }

    public final C1294Wd c(boolean z, CommanderState commanderState, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C8632dsu.c((Object) commanderState, "");
        return new C1294Wd(z, commanderState, z2, z3, z4, z5, num, z6, z7, z8, z9, z10, z11);
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1294Wd) {
            C1294Wd c1294Wd = (C1294Wd) obj;
            return this.c == c1294Wd.c && this.l == c1294Wd.l && this.d == c1294Wd.d && this.a == c1294Wd.a && this.g == c1294Wd.g && this.h == c1294Wd.h && C8632dsu.c(this.e, c1294Wd.e) && this.b == c1294Wd.b && this.j == c1294Wd.j && this.i == c1294Wd.i && this.n == c1294Wd.n && this.m == c1294Wd.m && this.f == c1294Wd.f;
        }
        return false;
    }

    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return this.n;
    }

    public final boolean h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.c);
        int hashCode2 = this.l.hashCode();
        int hashCode3 = Boolean.hashCode(this.d);
        int hashCode4 = Boolean.hashCode(this.a);
        int hashCode5 = Boolean.hashCode(this.g);
        int hashCode6 = Boolean.hashCode(this.h);
        Integer num = this.e;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.j)) * 31) + Boolean.hashCode(this.i)) * 31) + Boolean.hashCode(this.n)) * 31) + Boolean.hashCode(this.m)) * 31) + Boolean.hashCode(this.f);
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.i;
    }

    public final CommanderState m() {
        return this.l;
    }

    public final boolean n() {
        return this.m;
    }

    public final boolean o() {
        return this.b;
    }

    public String toString() {
        boolean z = this.c;
        CommanderState commanderState = this.l;
        boolean z2 = this.d;
        boolean z3 = this.a;
        boolean z4 = this.g;
        boolean z5 = this.h;
        Integer num = this.e;
        boolean z6 = this.b;
        boolean z7 = this.j;
        boolean z8 = this.i;
        boolean z9 = this.n;
        boolean z10 = this.m;
        boolean z11 = this.f;
        return "UiInfraData(deviceSheetVisible=" + z + ", state=" + commanderState + ", hasBottomNavBar=" + z2 + ", keyboardOpen=" + z3 + ", showDeviceSheetOverlay=" + z4 + ", showMdxMenu=" + z5 + ", originalSoftInputMode=" + num + ", isScrubbing=" + z6 + ", showLanguageOverlay=" + z7 + ", showEpisodesOverlay=" + z8 + ", showSeasonOverlay=" + z9 + ", showTooltip=" + z10 + ", showManualParingTooltip=" + z11 + ")";
    }

    public C1294Wd(boolean z, CommanderState commanderState, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C8632dsu.c((Object) commanderState, "");
        this.c = z;
        this.l = commanderState;
        this.d = z2;
        this.a = z3;
        this.g = z4;
        this.h = z5;
        this.e = num;
        this.b = z6;
        this.j = z7;
        this.i = z8;
        this.n = z9;
        this.m = z10;
        this.f = z11;
    }

    public /* synthetic */ C1294Wd(boolean z, CommanderState commanderState, boolean z2, boolean z3, boolean z4, boolean z5, Integer num, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CommanderState.d : commanderState, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? false : z6, (i & JSONzip.end) != 0 ? false : z7, (i & 512) != 0 ? false : z8, (i & 1024) != 0 ? false : z9, (i & 2048) != 0 ? false : z10, (i & 4096) == 0 ? z11 : false);
    }
}
