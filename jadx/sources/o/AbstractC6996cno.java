package o;

import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.mylist.impl.tab.MyListTabItems;
import o.C6971cnP;

/* renamed from: o.cno  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6996cno extends C9941zV {
    public /* synthetic */ AbstractC6996cno(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC6996cno() {
    }

    /* renamed from: o.cno$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC6996cno {
        private final TrackingInfoHolder c;
        private final MyListTabItems.Type e;

        public final MyListTabItems.Type a() {
            return this.e;
        }

        public final TrackingInfoHolder c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return this.e == iVar.e && C8632dsu.c(this.c, iVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            MyListTabItems.Type type = this.e;
            TrackingInfoHolder trackingInfoHolder = this.c;
            return "MyListPresented(type=" + type + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MyListTabItems.Type type, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) type, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.e = type;
            this.c = trackingInfoHolder;
        }
    }

    /* renamed from: o.cno$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC6996cno {
        private final boolean a;

        public final boolean e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public String toString() {
            boolean z = this.a;
            return "UpdateVideoListContent(hasElements=" + z + ")";
        }

        public l(boolean z) {
            super(null);
            this.a = z;
        }
    }

    /* renamed from: o.cno$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6996cno {
        public static final c d = new c();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1787855812;
        }

        public String toString() {
            return "MoreVideosNeeded";
        }

        private c() {
            super(null);
        }
    }

    /* renamed from: o.cno$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC6996cno {
        public static final n e = new n();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1115659488;
        }

        public String toString() {
            return "RetryFetchingMyList";
        }

        private n() {
            super(null);
        }
    }

    /* renamed from: o.cno$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC6996cno {
        public static final g c = new g();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1674914038;
        }

        public String toString() {
            return "NavigateToFindVideoToAdd";
        }

        private g() {
            super(null);
        }
    }

    /* renamed from: o.cno$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC6996cno {
        private final TrackingInfoHolder b;
        private final InterfaceC5223buh d;

        public final InterfaceC5223buh a() {
            return this.d;
        }

        public final TrackingInfoHolder e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return C8632dsu.c(this.d, fVar.d) && C8632dsu.c(this.b, fVar.b);
            }
            return false;
        }

        public int hashCode() {
            return (this.d.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            InterfaceC5223buh interfaceC5223buh = this.d;
            TrackingInfoHolder trackingInfoHolder = this.b;
            return "OpenDetailsPage(video=" + interfaceC5223buh + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) interfaceC5223buh, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.d = interfaceC5223buh;
            this.b = trackingInfoHolder;
        }
    }

    /* renamed from: o.cno$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6996cno {
        private final TrackingInfoHolder a;
        private final InterfaceC5160btX b;

        public final InterfaceC5160btX a() {
            return this.b;
        }

        public final TrackingInfoHolder c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.a, dVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            InterfaceC5160btX interfaceC5160btX = this.b;
            TrackingInfoHolder trackingInfoHolder = this.a;
            return "LaunchPlayback(playable=" + interfaceC5160btX + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC5160btX interfaceC5160btX, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) interfaceC5160btX, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.b = interfaceC5160btX;
            this.a = trackingInfoHolder;
        }
    }

    /* renamed from: o.cno$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC6996cno {
        private final TrackingInfoHolder c;
        private final InterfaceC5223buh e;

        public final InterfaceC5223buh c() {
            return this.e;
        }

        public final TrackingInfoHolder d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return C8632dsu.c(this.e, kVar.e) && C8632dsu.c(this.c, kVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            InterfaceC5223buh interfaceC5223buh = this.e;
            TrackingInfoHolder trackingInfoHolder = this.c;
            return "RemoveVideo(video=" + interfaceC5223buh + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) interfaceC5223buh, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.e = interfaceC5223buh;
            this.c = trackingInfoHolder;
        }
    }

    /* renamed from: o.cno$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC6996cno {
        public static final e a = new e();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 2118086381;
        }

        public String toString() {
            return "ClearAllFilters";
        }

        private e() {
            super(null);
        }
    }

    /* renamed from: o.cno$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC6996cno {
        public static final b b = new b();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1135953127;
        }

        public String toString() {
            return "MoreGamesNeeded";
        }

        private b() {
            super(null);
        }
    }

    /* renamed from: o.cno$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC6996cno {
        public static final j c = new j();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 2097679573;
        }

        public String toString() {
            return "NavigateToFindGameToAdd";
        }

        private j() {
            super(null);
        }
    }

    /* renamed from: o.cno$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC6996cno {
        private final TrackingInfoHolder a;
        private final C6971cnP.a e;

        public final TrackingInfoHolder a() {
            return this.a;
        }

        public final C6971cnP.a b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return C8632dsu.c(this.e, hVar.e) && C8632dsu.c(this.a, hVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.e.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            C6971cnP.a aVar = this.e;
            TrackingInfoHolder trackingInfoHolder = this.a;
            return "OpenGameDetailPage(game=" + aVar + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C6971cnP.a aVar, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.e = aVar;
            this.a = trackingInfoHolder;
        }
    }

    /* renamed from: o.cno$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC6996cno {
        private final TrackingInfoHolder c;
        private final C6971cnP.a d;
        private final boolean e;

        public final C6971cnP.a a() {
            return this.d;
        }

        public final TrackingInfoHolder c() {
            return this.c;
        }

        public final boolean d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return C8632dsu.c(this.d, aVar.d) && this.e == aVar.e && C8632dsu.c(this.c, aVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.d.hashCode() * 31) + Boolean.hashCode(this.e)) * 31) + this.c.hashCode();
        }

        public String toString() {
            C6971cnP.a aVar = this.d;
            boolean z = this.e;
            TrackingInfoHolder trackingInfoHolder = this.c;
            return "LaunchOrDownloadGame(game=" + aVar + ", isInstalled=" + z + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6971cnP.a aVar, boolean z, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.d = aVar;
            this.e = z;
            this.c = trackingInfoHolder;
        }
    }

    /* renamed from: o.cno$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC6996cno {
        private final TrackingInfoHolder a;
        private final C6971cnP.a b;

        public final C6971cnP.a c() {
            return this.b;
        }

        public final TrackingInfoHolder e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return C8632dsu.c(this.b, mVar.b) && C8632dsu.c(this.a, mVar.a);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }

        public String toString() {
            C6971cnP.a aVar = this.b;
            TrackingInfoHolder trackingInfoHolder = this.a;
            return "RemoveGame(game=" + aVar + ", trackingInfoHolder=" + trackingInfoHolder + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C6971cnP.a aVar, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) aVar, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.b = aVar;
            this.a = trackingInfoHolder;
        }
    }

    /* renamed from: o.cno$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC6996cno {
        private final boolean b;

        public final boolean a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public String toString() {
            boolean z = this.b;
            return "UpdateGameListContent(hasElements=" + z + ")";
        }

        public o(boolean z) {
            super(null);
            this.b = z;
        }
    }
}
