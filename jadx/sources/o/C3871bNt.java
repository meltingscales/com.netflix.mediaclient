package o;

import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.MagicPathUiType;

/* renamed from: o.bNt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3871bNt implements InterfaceC8888fH {
    private final String c;
    private final MagicPathUiType e;

    public static /* synthetic */ C3871bNt copy$default(C3871bNt c3871bNt, String str, MagicPathUiType magicPathUiType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3871bNt.c;
        }
        if ((i & 2) != 0) {
            magicPathUiType = c3871bNt.e;
        }
        return c3871bNt.c(str, magicPathUiType);
    }

    public final C3871bNt c(String str, MagicPathUiType magicPathUiType) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) magicPathUiType, "");
        return new C3871bNt(str, magicPathUiType);
    }

    public final String component1() {
        return this.c;
    }

    public final MagicPathUiType component2() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3871bNt) {
            C3871bNt c3871bNt = (C3871bNt) obj;
            return C8632dsu.c((Object) this.c, (Object) c3871bNt.c) && this.e == c3871bNt.e;
        }
        return false;
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.c;
        MagicPathUiType magicPathUiType = this.e;
        return "MagicPathState(beaconCode=" + str + ", uiType=" + magicPathUiType + ")";
    }

    public C3871bNt(String str, MagicPathUiType magicPathUiType) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) magicPathUiType, "");
        this.c = str;
        this.e = magicPathUiType;
    }

    public final boolean a() {
        return this.e == MagicPathUiType.c;
    }
}
