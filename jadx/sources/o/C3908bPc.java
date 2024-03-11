package o;

import com.netflix.mediaclient.servicemgr.interface_.GameDetails;

/* renamed from: o.bPc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3908bPc {
    private final AbstractC5100bsQ b;
    private final GameDetails c;
    private final boolean d;
    private final bPY e;

    public final boolean a() {
        return this.d;
    }

    public final GameDetails b() {
        return this.c;
    }

    public final bPY c() {
        return this.e;
    }

    public final AbstractC5100bsQ e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3908bPc) {
            C3908bPc c3908bPc = (C3908bPc) obj;
            return C8632dsu.c(this.c, c3908bPc.c) && this.d == c3908bPc.d && C8632dsu.c(this.e, c3908bPc.e) && C8632dsu.c(this.b, c3908bPc.b);
        }
        return false;
    }

    public int hashCode() {
        GameDetails gameDetails = this.c;
        int hashCode = gameDetails == null ? 0 : gameDetails.hashCode();
        int hashCode2 = Boolean.hashCode(this.d);
        int hashCode3 = this.e.hashCode();
        AbstractC5100bsQ abstractC5100bsQ = this.b;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (abstractC5100bsQ != null ? abstractC5100bsQ.hashCode() : 0);
    }

    public String toString() {
        GameDetails gameDetails = this.c;
        boolean z = this.d;
        bPY bpy = this.e;
        AbstractC5100bsQ abstractC5100bsQ = this.b;
        return "GameDetailsData(gameDetails=" + gameDetails + ", isInstalled=" + z + ", loadingState=" + bpy + ", videoGroup=" + abstractC5100bsQ + ")";
    }

    public C3908bPc(GameDetails gameDetails, boolean z, bPY bpy, AbstractC5100bsQ abstractC5100bsQ) {
        C8632dsu.c((Object) bpy, "");
        this.c = gameDetails;
        this.d = z;
        this.e = bpy;
        this.b = abstractC5100bsQ;
    }

    public /* synthetic */ C3908bPc(GameDetails gameDetails, boolean z, bPY bpy, AbstractC5100bsQ abstractC5100bsQ, int i, C8627dsp c8627dsp) {
        this(gameDetails, z, bpy, (i & 8) != 0 ? null : abstractC5100bsQ);
    }
}
