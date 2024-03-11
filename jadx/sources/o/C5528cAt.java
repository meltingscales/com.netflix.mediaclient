package o;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.PostPlayAction;

/* renamed from: o.cAt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5528cAt {
    private final String a;
    private final boolean b;
    private final String c;
    private final String d;
    private final PostPlayAction e;
    private final PostPlayAction f;
    private final int g;
    private final int h;
    private final int i;
    private final VideoType j;
    private final int k;
    private final int l;
    private final c m;
    private final String n;

    public final int a() {
        return this.h;
    }

    public final C5528cAt a(int i, int i2, VideoType videoType, String str, String str2, int i3, int i4, String str3, int i5, String str4, PostPlayAction postPlayAction, PostPlayAction postPlayAction2, c cVar, boolean z) {
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) postPlayAction, "");
        C8632dsu.c((Object) postPlayAction2, "");
        C8632dsu.c((Object) cVar, "");
        return new C5528cAt(i, i2, videoType, str, str2, i3, i4, str3, i5, str4, postPlayAction, postPlayAction2, cVar, z);
    }

    public final VideoType b() {
        return this.j;
    }

    public final PostPlayAction c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5528cAt) {
            C5528cAt c5528cAt = (C5528cAt) obj;
            return this.l == c5528cAt.l && this.h == c5528cAt.h && this.j == c5528cAt.j && C8632dsu.c((Object) this.a, (Object) c5528cAt.a) && C8632dsu.c((Object) this.c, (Object) c5528cAt.c) && this.i == c5528cAt.i && this.k == c5528cAt.k && C8632dsu.c((Object) this.d, (Object) c5528cAt.d) && this.g == c5528cAt.g && C8632dsu.c((Object) this.n, (Object) c5528cAt.n) && C8632dsu.c(this.f, c5528cAt.f) && C8632dsu.c(this.e, c5528cAt.e) && C8632dsu.c(this.m, c5528cAt.m) && this.b == c5528cAt.b;
        }
        return false;
    }

    public final int f() {
        return this.i;
    }

    public final c g() {
        return this.m;
    }

    public final int h() {
        return this.l;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.l);
        int hashCode2 = Integer.hashCode(this.h);
        int hashCode3 = this.j.hashCode();
        int hashCode4 = this.a.hashCode();
        int hashCode5 = this.c.hashCode();
        int hashCode6 = Integer.hashCode(this.i);
        int hashCode7 = Integer.hashCode(this.k);
        int hashCode8 = this.d.hashCode();
        int hashCode9 = Integer.hashCode(this.g);
        String str = this.n;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31) + this.e.hashCode()) * 31) + this.m.hashCode()) * 31) + Boolean.hashCode(this.b);
    }

    public final int i() {
        return this.g;
    }

    public final String j() {
        return this.n;
    }

    public final boolean n() {
        return this.b;
    }

    public String toString() {
        int i = this.l;
        int i2 = this.h;
        VideoType videoType = this.j;
        String str = this.a;
        String str2 = this.c;
        int i3 = this.i;
        int i4 = this.k;
        String str3 = this.d;
        int i5 = this.g;
        String str4 = this.n;
        PostPlayAction postPlayAction = this.f;
        PostPlayAction postPlayAction2 = this.e;
        c cVar = this.m;
        boolean z = this.b;
        return "PreviewVideoInfo(topNodeVideoId=" + i + ", previewVideoId=" + i2 + ", previewVideoType=" + videoType + ", backgroundArtUrl=" + str + ", logoAssetUrl=" + str2 + ", runtimeSeconds=" + i3 + ", year=" + i4 + ", maturityRating=" + str3 + ", runTime=" + i5 + ", seasonNumLabel=" + str4 + ", playAction=" + postPlayAction + ", addToMyListAction=" + postPlayAction2 + ", trackingInfoHolderWrapper=" + cVar + ", isInMyList=" + z + ")";
    }

    public C5528cAt(int i, int i2, VideoType videoType, String str, String str2, int i3, int i4, String str3, int i5, String str4, PostPlayAction postPlayAction, PostPlayAction postPlayAction2, c cVar, boolean z) {
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) postPlayAction, "");
        C8632dsu.c((Object) postPlayAction2, "");
        C8632dsu.c((Object) cVar, "");
        this.l = i;
        this.h = i2;
        this.j = videoType;
        this.a = str;
        this.c = str2;
        this.i = i3;
        this.k = i4;
        this.d = str3;
        this.g = i5;
        this.n = str4;
        this.f = postPlayAction;
        this.e = postPlayAction2;
        this.m = cVar;
        this.b = z;
    }

    /* renamed from: o.cAt$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private final TrackingInfoHolder d;
        private final String e;

        public final TrackingInfoHolder a() {
            return this.d;
        }

        public c(String str, TrackingInfoHolder trackingInfoHolder) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.e = str;
            this.d = trackingInfoHolder;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return C8632dsu.c((Object) this.e, (Object) ((c) obj).e);
            }
            return false;
        }

        public int hashCode() {
            return this.e.hashCode();
        }
    }
}
