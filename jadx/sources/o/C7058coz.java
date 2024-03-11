package o;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* renamed from: o.coz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7058coz {
    private final boolean a;
    private final TrackingInfoHolder b;
    private final boolean c;
    private final VideoType d;
    private final boolean e;
    private final String f;

    public static /* synthetic */ C7058coz a(C7058coz c7058coz, String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c7058coz.f;
        }
        if ((i & 2) != 0) {
            videoType = c7058coz.d;
        }
        VideoType videoType2 = videoType;
        if ((i & 4) != 0) {
            z = c7058coz.a;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            trackingInfoHolder = c7058coz.b;
        }
        TrackingInfoHolder trackingInfoHolder2 = trackingInfoHolder;
        if ((i & 16) != 0) {
            z2 = c7058coz.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = c7058coz.c;
        }
        return c7058coz.a(str, videoType2, z4, trackingInfoHolder2, z5, z3);
    }

    public final C7058coz a(String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder, boolean z2, boolean z3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        return new C7058coz(str, videoType, z, trackingInfoHolder, z2, z3);
    }

    public final boolean a() {
        return this.c;
    }

    public final VideoType b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final TrackingInfoHolder d() {
        return this.b;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7058coz) {
            C7058coz c7058coz = (C7058coz) obj;
            return C8632dsu.c((Object) this.f, (Object) c7058coz.f) && this.d == c7058coz.d && this.a == c7058coz.a && C8632dsu.c(this.b, c7058coz.b) && this.e == c7058coz.e && this.c == c7058coz.c;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.a)) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.c);
    }

    public final boolean i() {
        return this.a;
    }

    public String toString() {
        String str = this.f;
        VideoType videoType = this.d;
        boolean z = this.a;
        TrackingInfoHolder trackingInfoHolder = this.b;
        boolean z2 = this.e;
        boolean z3 = this.c;
        return "MyListFlaggedForRemovalItem(videoId=" + str + ", type=" + videoType + ", isSwipeToDelete=" + z + ", trackingInfoHolder=" + trackingInfoHolder + ", removalUpdateSent=" + z2 + ", removed=" + z3 + ")";
    }

    public C7058coz(String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder, boolean z2, boolean z3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.f = str;
        this.d = videoType;
        this.a = z;
        this.b = trackingInfoHolder;
        this.e = z2;
        this.c = z3;
    }

    public /* synthetic */ C7058coz(String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder, boolean z2, boolean z3, int i, C8627dsp c8627dsp) {
        this(str, videoType, z, trackingInfoHolder, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3);
    }
}
