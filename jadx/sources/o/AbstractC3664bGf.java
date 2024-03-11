package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.originals.ContentWarning;

/* renamed from: o.bGf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3664bGf extends C9941zV {

    /* renamed from: o.bGf$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3664bGf {
        private final int d;

        public final int b() {
            return this.d;
        }
    }

    public /* synthetic */ AbstractC3664bGf(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC3664bGf() {
    }

    /* renamed from: o.bGf$A */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3664bGf {
        private final Status e;

        public final Status b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && C8632dsu.c(this.e, ((A) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            Status status = this.e;
            return "VideoDataLoadedResult(status=" + status + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(Status status) {
            super(null);
            C8632dsu.c((Object) status, "");
            this.e = status;
        }
    }

    /* renamed from: o.bGf$r */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC3664bGf {
        private final boolean c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.c == ((r) obj).c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.c);
        }

        public String toString() {
            boolean z = this.c;
            return "PlayButtonClick(isPreRelease=" + z + ")";
        }

        public r(boolean z) {
            super(null);
            this.c = z;
        }
    }

    /* renamed from: o.bGf$B */
    /* loaded from: classes4.dex */
    public static final class B extends AbstractC3664bGf {
        public static final B d = new B();

        private B() {
            super(null);
        }
    }

    /* renamed from: o.bGf$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3664bGf {
        public static final e d = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: o.bGf$c  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3667c extends AbstractC3664bGf {
        private final InterfaceC5227bul b;

        public final InterfaceC5227bul e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3667c) && C8632dsu.c(this.b, ((C3667c) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            InterfaceC5227bul interfaceC5227bul = this.b;
            return "IntentPlayEpisode(episodeDetails=" + interfaceC5227bul + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3667c(InterfaceC5227bul interfaceC5227bul) {
            super(null);
            C8632dsu.c((Object) interfaceC5227bul, "");
            this.b = interfaceC5227bul;
        }
    }

    /* renamed from: o.bGf$b  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3666b extends AbstractC3664bGf {
        private final InterfaceC5160btX a;
        private final VideoType b;
        private final TrackingInfoHolder d;

        public final TrackingInfoHolder a() {
            return this.d;
        }

        public final VideoType b() {
            return this.b;
        }

        public final InterfaceC5160btX d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3666b) {
                C3666b c3666b = (C3666b) obj;
                return C8632dsu.c(this.a, c3666b.a) && this.b == c3666b.b && C8632dsu.c(this.d, c3666b.d);
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            InterfaceC5160btX interfaceC5160btX = this.a;
            VideoType videoType = this.b;
            TrackingInfoHolder trackingInfoHolder = this.d;
            return "IntentPlayTrailerTabVideo(playerPlayable=" + interfaceC5160btX + ", videoType=" + videoType + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3666b(InterfaceC5160btX interfaceC5160btX, VideoType videoType, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) interfaceC5160btX, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.a = interfaceC5160btX;
            this.b = videoType;
            this.d = trackingInfoHolder;
        }
    }

    /* renamed from: o.bGf$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC3664bGf {
        private final int b;
        private final TrackingInfoHolder c;

        public final TrackingInfoHolder c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return this.b == mVar.b && C8632dsu.c(this.c, mVar.c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.b);
            TrackingInfoHolder trackingInfoHolder = this.c;
            return (hashCode * 31) + (trackingInfoHolder == null ? 0 : trackingInfoHolder.hashCode());
        }

        public String toString() {
            int i = this.b;
            TrackingInfoHolder trackingInfoHolder = this.c;
            return "IntentTabSelected(tabType=" + i + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        public m(int i, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            this.b = i;
            this.c = trackingInfoHolder;
        }
    }

    /* renamed from: o.bGf$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3664bGf {
        private final boolean a;
        private final TrackingInfoHolder b;
        private final boolean c;
        private final boolean d;
        private final String e;
        private final VideoType f;
        private final String i;
        private final String j;

        public final String a() {
            return this.i;
        }

        public final String c() {
            return this.j;
        }

        public final VideoType d() {
            return this.f;
        }

        public final TrackingInfoHolder e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c((Object) this.j, (Object) kVar.j) && this.f == kVar.f && C8632dsu.c((Object) this.i, (Object) kVar.i) && C8632dsu.c((Object) this.e, (Object) kVar.e) && this.a == kVar.a && this.c == kVar.c && this.d == kVar.d && C8632dsu.c(this.b, kVar.b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.j.hashCode();
            int hashCode2 = this.f.hashCode();
            String str = this.i;
            int hashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.a)) * 31) + Boolean.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.j;
            VideoType videoType = this.f;
            String str2 = this.i;
            String str3 = this.e;
            boolean z = this.a;
            boolean z2 = this.c;
            boolean z3 = this.d;
            TrackingInfoHolder trackingInfoHolder = this.b;
            return "IntentShowDetailsPage(videoId=" + str + ", videoType=" + videoType + ", videoTitle=" + str2 + ", boxshotUrl=" + str3 + ", isOriginal=" + z + ", isAvailableToPlay=" + z2 + ", isPlayable=" + z3 + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, VideoType videoType, String str2, String str3, boolean z, boolean z2, boolean z3, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.j = str;
            this.f = videoType;
            this.i = str2;
            this.e = str3;
            this.a = z;
            this.c = z2;
            this.d = z3;
            this.b = trackingInfoHolder;
        }
    }

    /* renamed from: o.bGf$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC3664bGf {
        private final boolean c;

        public final boolean d() {
            return this.c;
        }

        public o(boolean z) {
            super(null);
            this.c = z;
        }
    }

    /* renamed from: o.bGf$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3664bGf {
        private final String b;
        private final String e;

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            this.e = str;
            this.b = str2;
        }
    }

    /* renamed from: o.bGf$s */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC3664bGf {
        private final int c;

        public final int b() {
            return this.c;
        }

        public s(int i) {
            super(null);
            this.c = i;
        }
    }

    /* renamed from: o.bGf$d  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3668d extends AbstractC3664bGf {
        private final TrackingInfoHolder a;
        private final VideoType c;
        private final boolean d;
        private final String e;

        public final TrackingInfoHolder b() {
            return this.a;
        }

        public final String c() {
            return this.e;
        }

        public final boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3668d) {
                C3668d c3668d = (C3668d) obj;
                return C8632dsu.c((Object) this.e, (Object) c3668d.e) && this.c == c3668d.c && this.d == c3668d.d && C8632dsu.c(this.a, c3668d.a);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.e.hashCode() * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.a.hashCode();
        }

        public String toString() {
            String str = this.e;
            VideoType videoType = this.c;
            boolean z = this.d;
            TrackingInfoHolder trackingInfoHolder = this.a;
            return "IntentMyListUpdated(videoId=" + str + ", videoType=" + videoType + ", add=" + z + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3668d(String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.e = str;
            this.c = videoType;
            this.d = z;
            this.a = trackingInfoHolder;
        }
    }

    /* renamed from: o.bGf$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3664bGf {
        private final VideoType a;
        private final String b;
        private final TrackingInfoHolder c;
        private final boolean d;

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.d;
        }

        public final TrackingInfoHolder d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return C8632dsu.c((Object) this.b, (Object) gVar.b) && this.a == gVar.a && this.d == gVar.d && C8632dsu.c(this.c, gVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.c.hashCode();
        }

        public String toString() {
            String str = this.b;
            VideoType videoType = this.a;
            boolean z = this.d;
            TrackingInfoHolder trackingInfoHolder = this.c;
            return "IntentRemindMeUpdated(videoId=" + str + ", videoType=" + videoType + ", add=" + z + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.b = str;
            this.a = videoType;
            this.d = z;
            this.c = trackingInfoHolder;
        }
    }

    /* renamed from: o.bGf$t */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC3664bGf {
        public static final t e = new t();

        private t() {
            super(null);
        }
    }

    /* renamed from: o.bGf$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC3664bGf {
        public static final p d = new p();

        private p() {
            super(null);
        }
    }

    /* renamed from: o.bGf$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3664bGf {
        public static final h c = new h();

        private h() {
            super(null);
        }
    }

    /* renamed from: o.bGf$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3664bGf {
        public static final j d = new j();

        private j() {
            super(null);
        }
    }

    /* renamed from: o.bGf$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3664bGf {
        public static final l c = new l();

        private l() {
            super(null);
        }
    }

    /* renamed from: o.bGf$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3664bGf {
        private final ContentWarning c;

        public final ContentWarning d() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ContentWarning contentWarning) {
            super(null);
            C8632dsu.c((Object) contentWarning, "");
            this.c = contentWarning;
        }
    }

    /* renamed from: o.bGf$q */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC3664bGf {
        public static final q c = new q();

        private q() {
            super(null);
        }
    }

    /* renamed from: o.bGf$w */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC3664bGf {
        public static final w d = new w();

        private w() {
            super(null);
        }
    }

    /* renamed from: o.bGf$C */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3664bGf {
        public static final C b = new C();

        private C() {
            super(null);
        }
    }

    /* renamed from: o.bGf$v */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC3664bGf {
        public static final v e = new v();

        private v() {
            super(null);
        }
    }

    /* renamed from: o.bGf$x */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC3664bGf {
        public static final x a = new x();

        private x() {
            super(null);
        }
    }

    /* renamed from: o.bGf$y */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC3664bGf {
        public static final y d = new y();

        private y() {
            super(null);
        }
    }

    /* renamed from: o.bGf$D */
    /* loaded from: classes4.dex */
    public static final class D extends AbstractC3664bGf {
        public static final D c = new D();

        private D() {
            super(null);
        }
    }

    /* renamed from: o.bGf$a  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C3665a extends AbstractC3664bGf {
        public static final C3665a a = new C3665a();

        private C3665a() {
            super(null);
        }
    }

    /* renamed from: o.bGf$u */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC3664bGf {
        private final boolean b;
        private final int c;
        private final VideoType e;

        public final boolean a() {
            return this.b;
        }

        public final VideoType c() {
            return this.e;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                return this.c == uVar.c && this.e == uVar.e && this.b == uVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.c) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            int i = this.c;
            VideoType videoType = this.e;
            boolean z = this.b;
            return "ToggleVideoRemindMe(videoId=" + i + ", videoType=" + videoType + ", checked=" + z + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i, VideoType videoType, boolean z) {
            super(null);
            C8632dsu.c((Object) videoType, "");
            this.c = i;
            this.e = videoType;
            this.b = z;
        }
    }
}
