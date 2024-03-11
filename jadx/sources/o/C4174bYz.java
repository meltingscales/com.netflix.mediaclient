package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* renamed from: o.bYz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4174bYz implements InterfaceC8962gc {
    private final String a;
    private final AbstractC8918fl<InterfaceC5198buI> b;
    private final VideoType d;

    public C4174bYz() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4174bYz copy$default(C4174bYz c4174bYz, String str, VideoType videoType, AbstractC8918fl abstractC8918fl, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4174bYz.a;
        }
        if ((i & 2) != 0) {
            videoType = c4174bYz.d;
        }
        if ((i & 4) != 0) {
            abstractC8918fl = c4174bYz.b;
        }
        return c4174bYz.d(str, videoType, abstractC8918fl);
    }

    public final String a() {
        return this.a;
    }

    public final AbstractC8918fl<InterfaceC5198buI> c() {
        return this.b;
    }

    public final String component1() {
        return this.a;
    }

    public final VideoType component2() {
        return this.d;
    }

    public final AbstractC8918fl<InterfaceC5198buI> component3() {
        return this.b;
    }

    public final VideoType d() {
        return this.d;
    }

    public final C4174bYz d(@InterfaceC8969gj String str, @InterfaceC8969gj VideoType videoType, AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl) {
        C8632dsu.c((Object) abstractC8918fl, "");
        return new C4174bYz(str, videoType, abstractC8918fl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4174bYz) {
            C4174bYz c4174bYz = (C4174bYz) obj;
            return C8632dsu.c((Object) this.a, (Object) c4174bYz.a) && this.d == c4174bYz.d && C8632dsu.c(this.b, c4174bYz.b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        VideoType videoType = this.d;
        return (((hashCode * 31) + (videoType != null ? videoType.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        VideoType videoType = this.d;
        AbstractC8918fl<InterfaceC5198buI> abstractC8918fl = this.b;
        return "VideoState(videoId=" + str + ", videoType=" + videoType + ", videoDetailsRequest=" + abstractC8918fl + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4174bYz(@InterfaceC8969gj String str, @InterfaceC8969gj VideoType videoType, AbstractC8918fl<? extends InterfaceC5198buI> abstractC8918fl) {
        C8632dsu.c((Object) abstractC8918fl, "");
        this.a = str;
        this.d = videoType;
        this.b = abstractC8918fl;
    }

    public /* synthetic */ C4174bYz(String str, VideoType videoType, AbstractC8918fl abstractC8918fl, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : videoType, (i & 4) != 0 ? C8974go.e : abstractC8918fl);
    }

    public final boolean e() {
        return (this.a == null || this.d == null || !(this.b instanceof InterfaceC8881fA)) ? false : true;
    }

    public final boolean b() {
        AbstractC8918fl<InterfaceC5198buI> abstractC8918fl = this.b;
        return (abstractC8918fl instanceof C8927fu) && abstractC8918fl.c() == null;
    }
}
