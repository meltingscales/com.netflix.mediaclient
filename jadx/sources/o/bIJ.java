package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* loaded from: classes4.dex */
public final class bIJ implements InterfaceC8962gc {
    private final String a;
    private final AbstractC8918fl<InterfaceC8366diy> d;
    private final VideoType e;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ bIJ copy$default(bIJ bij, String str, VideoType videoType, AbstractC8918fl abstractC8918fl, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bij.a;
        }
        if ((i & 2) != 0) {
            videoType = bij.e;
        }
        if ((i & 4) != 0) {
            abstractC8918fl = bij.d;
        }
        return bij.b(str, videoType, abstractC8918fl);
    }

    public final String a() {
        return this.a;
    }

    public final bIJ b(@InterfaceC8969gj String str, @InterfaceC8969gj VideoType videoType, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        return new bIJ(str, videoType, abstractC8918fl);
    }

    public final String component1() {
        return this.a;
    }

    public final VideoType component2() {
        return this.e;
    }

    public final AbstractC8918fl<InterfaceC8366diy> component3() {
        return this.d;
    }

    public final AbstractC8918fl<InterfaceC8366diy> d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bIJ) {
            bIJ bij = (bIJ) obj;
            return C8632dsu.c((Object) this.a, (Object) bij.a) && this.e == bij.e && C8632dsu.c(this.d, bij.d);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        String str = this.a;
        VideoType videoType = this.e;
        AbstractC8918fl<InterfaceC8366diy> abstractC8918fl = this.d;
        return "DpCreditsState(videoId=" + str + ", videoType=" + videoType + ", fullVideoDetails=" + abstractC8918fl + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bIJ(@InterfaceC8969gj String str, @InterfaceC8969gj VideoType videoType, AbstractC8918fl<? extends InterfaceC8366diy> abstractC8918fl) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        this.a = str;
        this.e = videoType;
        this.d = abstractC8918fl;
    }

    public /* synthetic */ bIJ(String str, VideoType videoType, AbstractC8918fl abstractC8918fl, int i, C8627dsp c8627dsp) {
        this(str, videoType, (i & 4) != 0 ? C8974go.e : abstractC8918fl);
    }
}
