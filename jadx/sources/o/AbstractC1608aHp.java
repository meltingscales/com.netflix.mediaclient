package o;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.Map;
import o.C1596aHd;
import o.C7017coI;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import o.dqE;

/* renamed from: o.aHp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1608aHp<SOURCE, DATA> extends C7017coI.b<SOURCE, DATA> {
    public static final b c = new b(null);
    private static final drM<C7017coI.e<dpR, dpR>, dpR> d = new drM<C7017coI.e<dpR, dpR>, dpR>() { // from class: com.netflix.mediaclient.modules.routes.NetflixRoutes$Companion$defaultNavigate$1
        @Override // o.drM
        public /* synthetic */ dpR invoke(C7017coI.e<dpR, dpR> eVar) {
            a(eVar);
            return dpR.c;
        }

        public final void a(C7017coI.e<dpR, dpR> eVar) {
            Map d2;
            Map k;
            Throwable th;
            C8632dsu.c((Object) eVar, "");
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = "No route to " + eVar.a();
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    };

    public /* synthetic */ AbstractC1608aHp(String str, C8627dsp c8627dsp) {
        this(str);
    }

    private AbstractC1608aHp(String str) {
        super(str);
    }

    /* renamed from: o.aHp$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final drM<C7017coI.e<dpR, dpR>, dpR> e() {
            return AbstractC1608aHp.d;
        }
    }

    /* renamed from: o.aHp$e */
    /* loaded from: classes.dex */
    public static final class e {
        private final String b;
        private final boolean d;
        private final boolean e;

        public final boolean b() {
            return this.e;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c((Object) this.b, (Object) eVar.b) && this.d == eVar.d && this.e == eVar.e;
            }
            return false;
        }

        public int hashCode() {
            String str = this.b;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e);
        }

        public String toString() {
            String str = this.b;
            boolean z = this.d;
            boolean z2 = this.e;
            return "LolopiData(profileId=" + str + ", isKidsProfile=" + z + ", isDeeplink=" + z2 + ")";
        }

        public e(String str, boolean z, boolean z2) {
            this.b = str;
            this.d = z;
            this.e = z2;
        }
    }

    /* renamed from: o.aHp$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC1608aHp<Fragment, e> {
        public static final f d = new f();

        private f() {
            super("LolopiFromFragment", null);
        }
    }

    /* renamed from: o.aHp$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC1608aHp<Activity, e> {
        public static final a e = new a();

        private a() {
            super("LolopiFromActivity", null);
        }
    }

    /* renamed from: o.aHp$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC1608aHp<NetflixActivity, b> {
        public static final i a = new i();

        /* renamed from: o.aHp$i$b */
        /* loaded from: classes6.dex */
        public static final class b {
            private final boolean b;

            public b() {
                this(false, 1, null);
            }

            public final boolean e() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public String toString() {
                boolean z = this.b;
                return "Data(useFakes=" + z + ")";
            }

            public b(boolean z) {
                this.b = z;
            }

            public /* synthetic */ b(boolean z, int i, C8627dsp c8627dsp) {
                this((i & 1) != 0 ? false : z);
            }
        }

        private i() {
            super("TVMobileDiscoveryReady", null);
        }
    }

    /* renamed from: o.aHp$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC1608aHp<Activity, String> {
        public static final g d = new g();

        private g() {
            super("MultiMonth", null);
        }
    }

    /* renamed from: o.aHp$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC1608aHp<NetflixActivity, b> {
        public static final d b = new d();

        /* renamed from: o.aHp$d$b */
        /* loaded from: classes3.dex */
        public static final class b {
            private final TrackingInfoHolder a;
            private final String c;
            private final InterfaceC5223buh d;
            private final String e;

            public final TrackingInfoHolder b() {
                return this.a;
            }

            public final InterfaceC5223buh c() {
                return this.d;
            }

            public final String d() {
                return this.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return C8632dsu.c(this.d, bVar.d) && C8632dsu.c(this.a, bVar.a) && C8632dsu.c((Object) this.c, (Object) bVar.c) && C8632dsu.c((Object) this.e, (Object) bVar.e);
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.d.hashCode();
                int hashCode2 = this.a.hashCode();
                int hashCode3 = this.c.hashCode();
                String str = this.e;
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                InterfaceC5223buh interfaceC5223buh = this.d;
                TrackingInfoHolder trackingInfoHolder = this.a;
                String str = this.c;
                String str2 = this.e;
                return "Data(video=" + interfaceC5223buh + ", trackingInfoHolder=" + trackingInfoHolder + ", sourceForDebug=" + str + ", characterUrl=" + str2 + ")";
            }

            public b(InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, String str, String str2) {
                C8632dsu.c((Object) interfaceC5223buh, "");
                C8632dsu.c((Object) trackingInfoHolder, "");
                C8632dsu.c((Object) str, "");
                this.d = interfaceC5223buh;
                this.a = trackingInfoHolder;
                this.c = str;
                this.e = str2;
            }
        }

        private d() {
            super("DetailPage", null);
        }
    }

    /* renamed from: o.aHp$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC1608aHp<Context, e> {
        public static final c a = new c();

        /* renamed from: o.aHp$c$e */
        /* loaded from: classes3.dex */
        public static final class e {
            private final String a;
            private final boolean b;
            private final String c;
            private final TrackingInfoHolder d;
            private final String e;
            private final VideoType g;

            public final TrackingInfoHolder a() {
                return this.d;
            }

            public final String b() {
                return this.a;
            }

            public final String c() {
                return this.c;
            }

            public final VideoType d() {
                return this.g;
            }

            public final String e() {
                return this.e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return C8632dsu.c((Object) this.a, (Object) eVar.a) && this.g == eVar.g && C8632dsu.c(this.d, eVar.d) && C8632dsu.c((Object) this.e, (Object) eVar.e) && C8632dsu.c((Object) this.c, (Object) eVar.c) && this.b == eVar.b;
                }
                return false;
            }

            public int hashCode() {
                return (((((((((this.a.hashCode() * 31) + this.g.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.b);
            }

            public String toString() {
                String str = this.a;
                VideoType videoType = this.g;
                TrackingInfoHolder trackingInfoHolder = this.d;
                String str2 = this.e;
                String str3 = this.c;
                boolean z = this.b;
                return "Data(videoId=" + str + ", videoType=" + videoType + ", trackingInfoHolder=" + trackingInfoHolder + ", title=" + str2 + ", source=" + str3 + ", checkAllRoutesHoldBack=" + z + ")";
            }
        }

        private c() {
            super("DetailPageFromAnywhere", null);
        }
    }
}
