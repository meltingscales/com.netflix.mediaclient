package o;

import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;

/* renamed from: o.cYu  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6233cYu extends C9941zV {
    public /* synthetic */ AbstractC6233cYu(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC6233cYu() {
    }

    /* renamed from: o.cYu$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC6233cYu {
        private final TrackingInfoHolder c;
        private final TrailerItem e;

        public final TrackingInfoHolder c() {
            return this.c;
        }

        public final TrailerItem d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c(this.e, cVar.e) && C8632dsu.c(this.c, cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            TrailerItem trailerItem = this.e;
            TrackingInfoHolder trackingInfoHolder = this.c;
            return "Share(trailerItem=" + trailerItem + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) trailerItem, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.e = trailerItem;
            this.c = trackingInfoHolder;
        }
    }

    /* renamed from: o.cYu$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC6233cYu {
        private final TrailerItem a;
        private final AppView d;
        private final TrackingInfoHolder e;

        public final TrackingInfoHolder a() {
            return this.e;
        }

        public final TrailerItem d() {
            return this.a;
        }

        public final AppView e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.a, eVar.a) && C8632dsu.c(this.e, eVar.e) && this.d == eVar.d;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = this.e.hashCode();
            AppView appView = this.d;
            return (((hashCode * 31) + hashCode2) * 31) + (appView == null ? 0 : appView.hashCode());
        }

        public String toString() {
            TrailerItem trailerItem = this.a;
            TrackingInfoHolder trackingInfoHolder = this.e;
            AppView appView = this.d;
            return "Play(trailerItem=" + trailerItem + ", trackingInfo=" + trackingInfoHolder + ", appView=" + appView + ")";
        }

        public /* synthetic */ e(TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder, AppView appView, int i, C8627dsp c8627dsp) {
            this(trailerItem, trackingInfoHolder, (i & 4) != 0 ? null : appView);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TrailerItem trailerItem, TrackingInfoHolder trackingInfoHolder, AppView appView) {
            super(null);
            C8632dsu.c((Object) trailerItem, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.a = trailerItem;
            this.e = trackingInfoHolder;
            this.d = appView;
        }
    }

    /* renamed from: o.cYu$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC6233cYu {
        private final String a;
        private final String b;
        private final String c;
        private final AppView d;
        private final TrackingInfoHolder e;
        private final VideoType g;

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        public final TrackingInfoHolder d() {
            return this.e;
        }

        public final AppView e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c((Object) this.c, (Object) aVar.c) && this.g == aVar.g && C8632dsu.c((Object) this.b, (Object) aVar.b) && C8632dsu.c(this.e, aVar.e) && this.d == aVar.d && C8632dsu.c((Object) this.a, (Object) aVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.c.hashCode() * 31) + this.g.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode();
        }

        public final VideoType j() {
            return this.g;
        }

        public String toString() {
            String str = this.c;
            VideoType videoType = this.g;
            String str2 = this.b;
            TrackingInfoHolder trackingInfoHolder = this.e;
            AppView appView = this.d;
            String str3 = this.a;
            return "OpenDetailPage(videoId=" + str + ", videoType=" + videoType + ", videoTitle=" + str2 + ", trackingInfo=" + trackingInfoHolder + ", appView=" + appView + ", source=" + str3 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, VideoType videoType, String str2, TrackingInfoHolder trackingInfoHolder, AppView appView, String str3) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) appView, "");
            C8632dsu.c((Object) str3, "");
            this.c = str;
            this.g = videoType;
            this.b = str2;
            this.e = trackingInfoHolder;
            this.d = appView;
            this.a = str3;
        }
    }

    /* renamed from: o.cYu$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC6233cYu {
        private final String a;
        private final String b;
        private final boolean c;
        private final TrackingInfoHolder d;
        private final String e;

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.e;
        }

        public final TrackingInfoHolder c() {
            return this.d;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c(this.d, bVar.d) && C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c((Object) this.b, (Object) bVar.b) && this.c == bVar.c && C8632dsu.c((Object) this.e, (Object) bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            String str = this.a;
            int hashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.b;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            int hashCode4 = Boolean.hashCode(this.c);
            String str3 = this.e;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            TrackingInfoHolder trackingInfoHolder = this.d;
            String str = this.a;
            String str2 = this.b;
            boolean z = this.c;
            String str3 = this.e;
            return "LaunchGame(trackingInfoHolder=" + trackingInfoHolder + ", title=" + str + ", packageName=" + str2 + ", isGameInstalled=" + z + ", appStoreUrl=" + str3 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TrackingInfoHolder trackingInfoHolder, String str, String str2, boolean z, String str3) {
            super(null);
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.d = trackingInfoHolder;
            this.a = str;
            this.b = str2;
            this.c = z;
            this.e = str3;
        }
    }

    /* renamed from: o.cYu$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC6233cYu {
        private final int a;
        private final LoMo b;

        public d() {
            this(null, 0, 3, null);
        }

        public final LoMo b() {
            return this.b;
        }

        public final int d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.b, dVar.b) && this.a == dVar.a;
            }
            return false;
        }

        public int hashCode() {
            LoMo loMo = this.b;
            return ((loMo == null ? 0 : loMo.hashCode()) * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            LoMo loMo = this.b;
            int i = this.a;
            return "Retry(lomo=" + loMo + ", from=" + i + ")";
        }

        public /* synthetic */ d(LoMo loMo, int i, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? null : loMo, (i2 & 2) != 0 ? 0 : i);
        }

        public d(LoMo loMo, int i) {
            super(null);
            this.b = loMo;
            this.a = i;
        }
    }

    /* renamed from: o.cYu$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC6233cYu {
        private final VideoType a;
        private final String b;
        private final int c;
        private final TrackingInfoHolder d;
        private final boolean e;

        public final boolean a() {
            return this.e;
        }

        public final TrackingInfoHolder b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final VideoType d() {
            return this.a;
        }

        public final int e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return this.c == iVar.c && C8632dsu.c((Object) this.b, (Object) iVar.b) && this.a == iVar.a && this.e == iVar.e && C8632dsu.c(this.d, iVar.d);
            }
            return false;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.c) * 31) + this.b.hashCode()) * 31) + this.a.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + this.d.hashCode();
        }

        public String toString() {
            int i = this.c;
            String str = this.b;
            VideoType videoType = this.a;
            boolean z = this.e;
            TrackingInfoHolder trackingInfoHolder = this.d;
            return "ToggleMyList(actionId=" + i + ", videoId=" + str + ", videoType=" + videoType + ", add=" + z + ", trackingInfo=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i, String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.c = i;
            this.b = str;
            this.a = videoType;
            this.e = z;
            this.d = trackingInfoHolder;
        }
    }

    /* renamed from: o.cYu$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC6233cYu {
        private final String a;
        private final TrackingInfoHolder b;
        private final String c;
        private final int d;
        private final boolean e;
        private final VideoType h;

        public final boolean a() {
            return this.e;
        }

        public final String b() {
            return this.c;
        }

        public final int c() {
            return this.d;
        }

        public final TrackingInfoHolder d() {
            return this.b;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.d == gVar.d && C8632dsu.c((Object) this.a, (Object) gVar.a) && this.h == gVar.h && this.e == gVar.e && C8632dsu.c((Object) this.c, (Object) gVar.c) && C8632dsu.c(this.b, gVar.b);
            }
            return false;
        }

        public final VideoType f() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.d) * 31) + this.a.hashCode()) * 31) + this.h.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            int i = this.d;
            String str = this.a;
            VideoType videoType = this.h;
            boolean z = this.e;
            String str2 = this.c;
            TrackingInfoHolder trackingInfoHolder = this.b;
            return "ToggleRemindMe(actionId=" + i + ", videoId=" + str + ", videoType=" + videoType + ", remindMe=" + z + ", videoTitle=" + str2 + ", trackingInfo=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, String str, VideoType videoType, boolean z, String str2, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.d = i;
            this.a = str;
            this.h = videoType;
            this.e = z;
            this.c = str2;
            this.b = trackingInfoHolder;
        }
    }
}
