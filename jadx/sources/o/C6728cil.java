package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoModel$clPlayableTrackingInfo$2;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import kotlin.LazyThreadSafetyMode;

/* renamed from: o.cil  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6728cil {
    public static final e d = new e(null);
    private final int A;
    private final Observable<Boolean> B;
    private final int C;
    private final BehaviorSubject<Boolean> D;
    private final String E;
    private final String F;
    private final boolean G;
    private final boolean H;
    private final int I;
    private final String L;
    private final Boolean M;
    private final VideoType N;
    private final long a;
    private final String b;
    private final int c;
    private final AppView e;
    private final BehaviorSubject<Boolean> f;
    private final Observable<Boolean> g;
    private final BehaviorSubject<Boolean> h;
    private final Observable<Boolean> i;
    private final InterfaceC8554dpx j;
    private final boolean k;
    private final String l;
    private final String m;
    private Integer n;

    /* renamed from: o  reason: collision with root package name */
    private final Integer f13733o;
    private final BehaviorSubject<Integer> p;
    private final PlayContext q;
    private final Observable<Integer> r;
    private final Observable<Integer> s;
    private final String t;
    private final String u;
    private final Observable<Boolean> v;
    private final BehaviorSubject<Boolean> w;
    private final BehaviorSubject<Integer> x;
    private final String y;
    private final PublishSubject<dpR> z;

    public final boolean D() {
        return this.k;
    }

    public final int a() {
        return this.c;
    }

    public final AppView b() {
        return this.e;
    }

    public final long d() {
        return this.a;
    }

    public final Observable<Boolean> e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6728cil) {
            C6728cil c6728cil = (C6728cil) obj;
            return this.C == c6728cil.C && this.A == c6728cil.A && C8632dsu.c(this.q, c6728cil.q) && C8632dsu.c((Object) this.y, (Object) c6728cil.y) && C8632dsu.c((Object) this.u, (Object) c6728cil.u) && this.I == c6728cil.I && C8632dsu.c((Object) this.F, (Object) c6728cil.F) && C8632dsu.c((Object) this.L, (Object) c6728cil.L) && C8632dsu.c((Object) this.b, (Object) c6728cil.b) && this.N == c6728cil.N && C8632dsu.c((Object) this.m, (Object) c6728cil.m) && C8632dsu.c(this.f13733o, c6728cil.f13733o) && C8632dsu.c((Object) this.l, (Object) c6728cil.l) && this.G == c6728cil.G && this.k == c6728cil.k && this.e == c6728cil.e && C8632dsu.c((Object) this.t, (Object) c6728cil.t) && C8632dsu.c((Object) this.E, (Object) c6728cil.E) && this.H == c6728cil.H && this.c == c6728cil.c && C8632dsu.c(this.M, c6728cil.M) && this.a == c6728cil.a;
        }
        return false;
    }

    public final String f() {
        return this.m;
    }

    public final Observable<Boolean> g() {
        return this.i;
    }

    public final String h() {
        return this.l;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.C);
        int hashCode2 = Integer.hashCode(this.A);
        int hashCode3 = this.q.hashCode();
        int hashCode4 = this.y.hashCode();
        int hashCode5 = this.u.hashCode();
        int hashCode6 = Integer.hashCode(this.I);
        String str = this.F;
        int hashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.L;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.b;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        VideoType videoType = this.N;
        int hashCode10 = videoType == null ? 0 : videoType.hashCode();
        String str4 = this.m;
        int hashCode11 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.f13733o;
        int hashCode12 = num == null ? 0 : num.hashCode();
        String str5 = this.l;
        int hashCode13 = str5 == null ? 0 : str5.hashCode();
        int hashCode14 = Boolean.hashCode(this.G);
        int hashCode15 = Boolean.hashCode(this.k);
        int hashCode16 = this.e.hashCode();
        int hashCode17 = this.t.hashCode();
        String str6 = this.E;
        int hashCode18 = str6 == null ? 0 : str6.hashCode();
        int hashCode19 = Boolean.hashCode(this.H);
        int hashCode20 = Integer.hashCode(this.c);
        Boolean bool = this.M;
        return (((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + Long.hashCode(this.a);
    }

    public final String i() {
        return this.t;
    }

    public final Integer j() {
        return this.f13733o;
    }

    public final String k() {
        return this.y;
    }

    public final Observable<Integer> l() {
        return this.s;
    }

    public final Observable<Integer> m() {
        return this.r;
    }

    public final PlayContext n() {
        return this.q;
    }

    public final String o() {
        return this.u;
    }

    public final PublishSubject<dpR> p() {
        return this.z;
    }

    public final int q() {
        return this.I;
    }

    public final int r() {
        return this.A;
    }

    public final int s() {
        return this.C;
    }

    public final Observable<Boolean> t() {
        return this.B;
    }

    public String toString() {
        int i = this.C;
        int i2 = this.A;
        PlayContext playContext = this.q;
        String str = this.y;
        String str2 = this.u;
        int i3 = this.I;
        String str3 = this.F;
        String str4 = this.L;
        String str5 = this.b;
        VideoType videoType = this.N;
        String str6 = this.m;
        Integer num = this.f13733o;
        String str7 = this.l;
        boolean z = this.G;
        boolean z2 = this.k;
        AppView appView = this.e;
        String str8 = this.t;
        String str9 = this.E;
        boolean z3 = this.H;
        int i4 = this.c;
        Boolean bool = this.M;
        long j = this.a;
        return "MiniPlayerVideoModel(position=" + i + ", row=" + i2 + ", playContext=" + playContext + ", playableId=" + str + ", playlistId=" + str2 + ", runtimeSeconds=" + i3 + ", videoId=" + str3 + ", videoTitle=" + str4 + ", certificationRating=" + str5 + ", videoType=" + videoType + ", imageUrl=" + str6 + ", imageResId=" + num + ", imageId=" + str7 + ", shouldLoop=" + z + ", isSilent=" + z2 + ", appView=" + appView + ", location=" + str8 + ", supplementalVideoType=" + str9 + ", tapToPlayPauseEnabled=" + z3 + ", adapterPosition=" + i4 + ", zoomed=" + bool + ", bookmarkMs=" + j + ")";
    }

    public final boolean u() {
        return this.G;
    }

    public final boolean v() {
        return this.H;
    }

    public final String w() {
        return this.F;
    }

    public final Boolean x() {
        return this.M;
    }

    public final VideoType y() {
        return this.N;
    }

    public C6728cil(int i, int i2, PlayContext playContext, String str, String str2, int i3, String str3, String str4, String str5, VideoType videoType, String str6, Integer num, String str7, boolean z, boolean z2, AppView appView, String str8, String str9, boolean z3, int i4, Boolean bool, long j) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) playContext, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) str8, "");
        this.C = i;
        this.A = i2;
        this.q = playContext;
        this.y = str;
        this.u = str2;
        this.I = i3;
        this.F = str3;
        this.L = str4;
        this.b = str5;
        this.N = videoType;
        this.m = str6;
        this.f13733o = num;
        this.l = str7;
        this.G = z;
        this.k = z2;
        this.e = appView;
        this.t = str8;
        this.E = str9;
        this.H = z3;
        this.c = i4;
        this.M = bool;
        this.a = j;
        b = dpB.b(LazyThreadSafetyMode.e, new MiniPlayerVideoModel$clPlayableTrackingInfo$2(this));
        this.j = b;
        Boolean bool2 = Boolean.FALSE;
        BehaviorSubject<Boolean> createDefault = BehaviorSubject.createDefault(bool2);
        C8632dsu.a(createDefault, "");
        this.h = createDefault;
        Observable<Boolean> distinctUntilChanged = createDefault.distinctUntilChanged();
        C8632dsu.a(distinctUntilChanged, "");
        this.g = distinctUntilChanged;
        BehaviorSubject<Boolean> createDefault2 = BehaviorSubject.createDefault(bool2);
        C8632dsu.a(createDefault2, "");
        this.f = createDefault2;
        this.i = createDefault2;
        BehaviorSubject<Boolean> createDefault3 = BehaviorSubject.createDefault(bool2);
        C8632dsu.a(createDefault3, "");
        this.w = createDefault3;
        this.v = createDefault3;
        BehaviorSubject<Boolean> createDefault4 = BehaviorSubject.createDefault(Boolean.TRUE);
        C8632dsu.a(createDefault4, "");
        this.D = createDefault4;
        this.B = createDefault4;
        BehaviorSubject<Integer> createDefault5 = BehaviorSubject.createDefault(-1);
        C8632dsu.a(createDefault5, "");
        this.p = createDefault5;
        this.r = createDefault5;
        BehaviorSubject<Integer> createDefault6 = BehaviorSubject.createDefault(0);
        C8632dsu.a(createDefault6, "");
        this.x = createDefault6;
        this.s = createDefault6;
        this.z = null;
    }

    /* renamed from: o.cil$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    public final TrackingInfo c() {
        return (TrackingInfo) this.j.getValue();
    }

    public final void c(boolean z) {
        this.h.onNext(Boolean.valueOf(z));
    }

    public final void a(boolean z) {
        this.f.onNext(Boolean.valueOf(z));
    }

    public final void b(boolean z) {
        this.w.onNext(Boolean.valueOf(z));
    }

    public final void e(int i) {
        this.x.onNext(Integer.valueOf(i));
    }

    public final boolean z() {
        return C8632dsu.c(this.w.getValue(), Boolean.TRUE);
    }

    public final boolean C() {
        return C8632dsu.c(this.h.getValue(), Boolean.TRUE);
    }

    public final void e(boolean z) {
        this.D.onNext(Boolean.valueOf(z));
    }

    public final void d(int i) {
        boolean z = i == 31 || i == 30;
        Integer num = this.n;
        if (num != null && num.intValue() == 10 && z) {
            return;
        }
        this.p.onNext(Integer.valueOf(i));
        this.n = Integer.valueOf(i);
    }
}
