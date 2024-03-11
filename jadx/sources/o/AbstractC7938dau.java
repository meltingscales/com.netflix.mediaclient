package o;

import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.GameDetails;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.UpNextFeedListItem;

/* renamed from: o.dau  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7938dau extends C9941zV {
    public /* synthetic */ AbstractC7938dau(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC7938dau() {
    }

    /* renamed from: o.dau$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC7938dau {
        private final TrackingInfoHolder c;
        private final UpNextFeedListItem e;

        public final TrackingInfoHolder a() {
            return this.c;
        }

        public final UpNextFeedListItem e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return C8632dsu.c(this.e, jVar.e) && C8632dsu.c(this.c, jVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            UpNextFeedListItem upNextFeedListItem = this.e;
            TrackingInfoHolder trackingInfoHolder = this.c;
            return "Share(item=" + upNextFeedListItem + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(UpNextFeedListItem upNextFeedListItem, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) upNextFeedListItem, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.e = upNextFeedListItem;
            this.c = trackingInfoHolder;
        }
    }

    /* renamed from: o.dau$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC7938dau {
        private final TrackingInfoHolder a;
        private final AppView c;
        private final InterfaceC8366diy d;

        public final AppView a() {
            return this.c;
        }

        public final TrackingInfoHolder b() {
            return this.a;
        }

        public final InterfaceC8366diy c() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c(this.d, hVar.d) && C8632dsu.c(this.a, hVar.a) && this.c == hVar.c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.a.hashCode();
            AppView appView = this.c;
            return (((hashCode * 31) + hashCode2) * 31) + (appView == null ? 0 : appView.hashCode());
        }

        public String toString() {
            InterfaceC8366diy interfaceC8366diy = this.d;
            TrackingInfoHolder trackingInfoHolder = this.a;
            AppView appView = this.c;
            return "Play(videoDetails=" + interfaceC8366diy + ", trackingInfo=" + trackingInfoHolder + ", appView=" + appView + ")";
        }

        public /* synthetic */ h(InterfaceC8366diy interfaceC8366diy, TrackingInfoHolder trackingInfoHolder, AppView appView, int i, C8627dsp c8627dsp) {
            this(interfaceC8366diy, trackingInfoHolder, (i & 4) != 0 ? null : appView);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC8366diy interfaceC8366diy, TrackingInfoHolder trackingInfoHolder, AppView appView) {
            super(null);
            C8632dsu.c((Object) interfaceC8366diy, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.d = interfaceC8366diy;
            this.a = trackingInfoHolder;
            this.c = appView;
        }
    }

    /* renamed from: o.dau$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC7938dau {
        private final AppView a;
        private final String b;
        private final TrackingInfoHolder c;
        private final String d;
        private final String e;
        private final VideoType f;

        public final AppView a() {
            return this.a;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public final TrackingInfoHolder d() {
            return this.c;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return C8632dsu.c((Object) this.d, (Object) cVar.d) && this.f == cVar.f && C8632dsu.c((Object) this.b, (Object) cVar.b) && C8632dsu.c(this.c, cVar.c) && this.a == cVar.a && C8632dsu.c((Object) this.e, (Object) cVar.e);
            }
            return false;
        }

        public final VideoType f() {
            return this.f;
        }

        public int hashCode() {
            return (((((((((this.d.hashCode() * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.d;
            VideoType videoType = this.f;
            String str2 = this.b;
            TrackingInfoHolder trackingInfoHolder = this.c;
            AppView appView = this.a;
            String str3 = this.e;
            return "OpenDetailPage(videoId=" + str + ", videoType=" + videoType + ", videoTitle=" + str2 + ", trackingInfo=" + trackingInfoHolder + ", appView=" + appView + ", source=" + str3 + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, VideoType videoType, String str2, TrackingInfoHolder trackingInfoHolder, AppView appView, String str3) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) appView, "");
            C8632dsu.c((Object) str3, "");
            this.d = str;
            this.f = videoType;
            this.b = str2;
            this.c = trackingInfoHolder;
            this.a = appView;
            this.e = str3;
        }
    }

    /* renamed from: o.dau$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC7938dau {
        private final TrackingInfoHolder a;
        private final GameDetails d;
        private final boolean e;

        public final GameDetails a() {
            return this.d;
        }

        public final boolean d() {
            return this.e;
        }

        public final TrackingInfoHolder e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.a, aVar.a) && C8632dsu.c(this.d, aVar.d) && this.e == aVar.e;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            TrackingInfoHolder trackingInfoHolder = this.a;
            GameDetails gameDetails = this.d;
            boolean z = this.e;
            return "LaunchGame(trackingInfoHolder=" + trackingInfoHolder + ", gameDetails=" + gameDetails + ", isGameInstalled=" + z + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TrackingInfoHolder trackingInfoHolder, GameDetails gameDetails, boolean z) {
            super(null);
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) gameDetails, "");
            this.a = trackingInfoHolder;
            this.d = gameDetails;
            this.e = z;
        }
    }

    /* renamed from: o.dau$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC7938dau {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    /* renamed from: o.dau$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC7938dau {
        private final int a;
        private final TrackingInfoHolder b;
        private final boolean c;
        private final String d;
        private final VideoType e;

        public final VideoType a() {
            return this.e;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.d;
        }

        public final TrackingInfoHolder d() {
            return this.b;
        }

        public final boolean e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.a == gVar.a && C8632dsu.c((Object) this.d, (Object) gVar.d) && this.e == gVar.e && this.c == gVar.c && C8632dsu.c(this.b, gVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.a) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31) + this.b.hashCode();
        }

        public String toString() {
            int i = this.a;
            String str = this.d;
            VideoType videoType = this.e;
            boolean z = this.c;
            TrackingInfoHolder trackingInfoHolder = this.b;
            return "ToggleMyList(actionId=" + i + ", videoId=" + str + ", videoType=" + videoType + ", add=" + z + ", trackingInfo=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, String str, VideoType videoType, boolean z, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.a = i;
            this.d = str;
            this.e = videoType;
            this.c = z;
            this.b = trackingInfoHolder;
        }
    }

    /* renamed from: o.dau$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC7938dau {
        private final boolean a;
        private final TrackingInfoHolder b;
        private final String c;
        private final int d;
        private final String e;
        private final VideoType j;

        public final boolean a() {
            return this.a;
        }

        public final int b() {
            return this.d;
        }

        public final String c() {
            return this.e;
        }

        public final String d() {
            return this.c;
        }

        public final TrackingInfoHolder e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return this.d == iVar.d && C8632dsu.c((Object) this.c, (Object) iVar.c) && this.j == iVar.j && this.a == iVar.a && C8632dsu.c((Object) this.e, (Object) iVar.e) && C8632dsu.c(this.b, iVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.d) * 31) + this.c.hashCode()) * 31) + this.j.hashCode()) * 31) + Boolean.hashCode(this.a)) * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
        }

        public final VideoType j() {
            return this.j;
        }

        public String toString() {
            int i = this.d;
            String str = this.c;
            VideoType videoType = this.j;
            boolean z = this.a;
            String str2 = this.e;
            TrackingInfoHolder trackingInfoHolder = this.b;
            return "ToggleRemindMe(actionId=" + i + ", videoId=" + str + ", videoType=" + videoType + ", remindMe=" + z + ", videoTitle=" + str2 + ", trackingInfo=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i, String str, VideoType videoType, boolean z, String str2, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) videoType, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.d = i;
            this.c = str;
            this.j = videoType;
            this.a = z;
            this.e = str2;
            this.b = trackingInfoHolder;
        }
    }

    /* renamed from: o.dau$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC7938dau {
        private final boolean c;
        private final int d;

        public d() {
            this(0, false, 3, null);
        }

        public final boolean b() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.d == dVar.d && this.c == dVar.c;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.d) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            int i = this.d;
            boolean z = this.c;
            return "MoreCWTitlesNeeded(from=" + i + ", force=" + z + ")";
        }

        public /* synthetic */ d(int i, boolean z, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }

        public d(int i, boolean z) {
            super(null);
            this.d = i;
            this.c = z;
        }
    }

    /* renamed from: o.dau$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC7938dau {
        private final boolean b;
        private final int d;

        public e() {
            this(0, false, 3, null);
        }

        public final int d() {
            return this.d;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.d == eVar.d && this.b == eVar.b;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.d) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            int i = this.d;
            boolean z = this.b;
            return "MoreGamesNeeded(from=" + i + ", force=" + z + ")";
        }

        public /* synthetic */ e(int i, boolean z, int i2, C8627dsp c8627dsp) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }

        public e(int i, boolean z) {
            super(null);
            this.d = i;
            this.b = z;
        }
    }

    /* renamed from: o.dau$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC7938dau {
        private final AppView b;
        private final TrackingInfoHolder c;
        private final String d;

        public final String a() {
            return this.d;
        }

        public final AppView b() {
            return this.b;
        }

        public final TrackingInfoHolder c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.d, (Object) bVar.d) && C8632dsu.c(this.c, bVar.c) && this.b == bVar.b;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.d.hashCode();
            int hashCode2 = this.c.hashCode();
            AppView appView = this.b;
            return (((hashCode * 31) + hashCode2) * 31) + (appView == null ? 0 : appView.hashCode());
        }

        public String toString() {
            String str = this.d;
            TrackingInfoHolder trackingInfoHolder = this.c;
            AppView appView = this.b;
            return "JoinNow(videoId=" + str + ", trackingInfo=" + trackingInfoHolder + ", appView=" + appView + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, TrackingInfoHolder trackingInfoHolder, AppView appView) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.d = str;
            this.c = trackingInfoHolder;
            this.b = appView;
        }
    }
}
