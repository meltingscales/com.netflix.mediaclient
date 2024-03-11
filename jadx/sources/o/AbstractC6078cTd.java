package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.util.PlayContext;
import com.netflix.model.leafs.SearchSectionSummary;
import java.util.List;

/* renamed from: o.cTd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6078cTd extends C9941zV {

    /* renamed from: o.cTd$b  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C6080b extends AbstractC6078cTd {
    }

    /* renamed from: o.cTd$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6078cTd {
        private final TrackingInfoHolder a;
        private final GenreItem c;

        public final TrackingInfoHolder d() {
            return this.a;
        }

        public final GenreItem e() {
            return this.c;
        }
    }

    public /* synthetic */ AbstractC6078cTd(C8627dsp c8627dsp) {
        this();
    }

    private AbstractC6078cTd() {
    }

    /* renamed from: o.cTd$a  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C6079a extends AbstractC6078cTd {
        public static final C6079a c = new C6079a();

        private C6079a() {
            super(null);
        }
    }

    /* renamed from: o.cTd$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC6078cTd {
        private final Status e;

        public final Status e() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Status status) {
            super(null);
            C8632dsu.c((Object) status, "");
            this.e = status;
        }
    }

    /* renamed from: o.cTd$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC6078cTd {
        public static final o e = new o();

        private o() {
            super(null);
        }
    }

    /* renamed from: o.cTd$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC6078cTd {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    /* renamed from: o.cTd$v */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC6078cTd {
        public static final v e = new v();

        private v() {
            super(null);
        }
    }

    /* renamed from: o.cTd$x */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC6078cTd {
        public static final x a = new x();

        private x() {
            super(null);
        }
    }

    /* renamed from: o.cTd$s */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC6078cTd {
        private final int c;

        public final int e() {
            return this.c;
        }

        public s(int i) {
            super(null);
            this.c = i;
        }
    }

    /* renamed from: o.cTd$B */
    /* loaded from: classes4.dex */
    public static final class B extends AbstractC6078cTd {
        private final Status b;
        private final InterfaceC5272bvd c;

        public final Status b() {
            return this.b;
        }

        public final InterfaceC5272bvd c() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(InterfaceC5272bvd interfaceC5272bvd, Status status) {
            super(null);
            C8632dsu.c((Object) interfaceC5272bvd, "");
            C8632dsu.c((Object) status, "");
            this.c = interfaceC5272bvd;
            this.b = status;
        }
    }

    /* renamed from: o.cTd$C */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC6078cTd {
        private final Status b;
        private final InterfaceC5280bvl d;

        public final InterfaceC5280bvl d() {
            return this.d;
        }

        public final Status e() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(InterfaceC5280bvl interfaceC5280bvl, Status status) {
            super(null);
            C8632dsu.c((Object) interfaceC5280bvl, "");
            C8632dsu.c((Object) status, "");
            this.d = interfaceC5280bvl;
            this.b = status;
        }
    }

    /* renamed from: o.cTd$A */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC6078cTd {
        private final InterfaceC5280bvl a;
        private final List<SearchSectionSummary> b;
        private final Status c;

        public final InterfaceC5280bvl a() {
            return this.a;
        }

        public final Status b() {
            return this.c;
        }

        public final List<SearchSectionSummary> e() {
            return this.b;
        }

        public /* synthetic */ A(InterfaceC5280bvl interfaceC5280bvl, List list, Status status, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? null : interfaceC5280bvl, list, status);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public A(InterfaceC5280bvl interfaceC5280bvl, List<? extends SearchSectionSummary> list, Status status) {
            super(null);
            C8632dsu.c((Object) list, "");
            C8632dsu.c((Object) status, "");
            this.a = interfaceC5280bvl;
            this.b = list;
            this.c = status;
        }
    }

    /* renamed from: o.cTd$z */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC6078cTd {
        private final PlayContext a;
        private final SearchSectionSummary b;
        private final int c;
        private final InterfaceC5223buh d;
        private final TrackingInfoHolder e;

        public final InterfaceC5223buh b() {
            return this.d;
        }

        public final TrackingInfoHolder c() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(SearchSectionSummary searchSectionSummary, int i, InterfaceC5223buh interfaceC5223buh, TrackingInfoHolder trackingInfoHolder, PlayContext playContext) {
            super(null);
            C8632dsu.c((Object) searchSectionSummary, "");
            C8632dsu.c((Object) interfaceC5223buh, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) playContext, "");
            this.b = searchSectionSummary;
            this.c = i;
            this.d = interfaceC5223buh;
            this.e = trackingInfoHolder;
            this.a = playContext;
        }
    }

    /* renamed from: o.cTd$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC6078cTd {
        private final TrackingInfoHolder a;
        private final SearchSectionSummary c;
        private final int d;
        private final InterfaceC5278bvj e;

        public final InterfaceC5278bvj a() {
            return this.e;
        }

        public final int d() {
            return this.d;
        }

        public final TrackingInfoHolder e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(SearchSectionSummary searchSectionSummary, int i, InterfaceC5278bvj interfaceC5278bvj, TrackingInfoHolder trackingInfoHolder) {
            super(null);
            C8632dsu.c((Object) searchSectionSummary, "");
            C8632dsu.c((Object) interfaceC5278bvj, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            this.c = searchSectionSummary;
            this.d = i;
            this.e = interfaceC5278bvj;
            this.a = trackingInfoHolder;
        }
    }

    /* renamed from: o.cTd$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC6078cTd {
        public static final n b = new n();

        private n() {
            super(null);
        }
    }

    /* renamed from: o.cTd$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC6078cTd {
        private final long a;
        private final String b;

        public final long b() {
            return this.a;
        }

        public final String e() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, long j) {
            super(null);
            C8632dsu.c((Object) str, "");
            this.b = str;
            this.a = j;
        }
    }

    /* renamed from: o.cTd$u */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC6078cTd {
        public static final u c = new u();

        private u() {
            super(null);
        }
    }

    /* renamed from: o.cTd$q */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC6078cTd {
        private final List<InterfaceC5223buh> b;

        public final List<InterfaceC5223buh> e() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(List<? extends InterfaceC5223buh> list) {
            super(null);
            C8632dsu.c((Object) list, "");
            this.b = list;
        }
    }

    /* renamed from: o.cTd$c  reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C6081c extends AbstractC6078cTd {
        private final Status c;

        public final Status e() {
            return this.c;
        }

        public C6081c(Status status) {
            super(null);
            this.c = status;
        }
    }

    /* renamed from: o.cTd$w */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC6078cTd {
        private final String a;
        private final String b;
        private final TrackingInfoHolder c;
        private final String d;
        private final String e;

        public final String a() {
            return this.e;
        }

        public final TrackingInfoHolder b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, String str2, String str3, TrackingInfoHolder trackingInfoHolder, String str4) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) str4, "");
            this.b = str;
            this.e = str2;
            this.d = str3;
            this.c = trackingInfoHolder;
            this.a = str4;
        }
    }

    /* renamed from: o.cTd$r */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC6078cTd {
        public static final r e = new r();

        private r() {
            super(null);
        }
    }

    /* renamed from: o.cTd$t */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC6078cTd {
        private final int c;

        public final int a() {
            return this.c;
        }

        public t(int i) {
            super(null);
            this.c = i;
        }
    }

    /* renamed from: o.cTd$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC6078cTd {
        private final int e;

        public final int b() {
            return this.e;
        }

        public m(int i) {
            super(null);
            this.e = i;
        }
    }

    /* renamed from: o.cTd$y */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC6078cTd {
        public static final y a = new y();

        private y() {
            super(null);
        }
    }

    /* renamed from: o.cTd$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC6078cTd {
        public static final g e = new g();

        private g() {
            super(null);
        }
    }

    /* renamed from: o.cTd$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC6078cTd {
        public static final e d = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: o.cTd$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC6078cTd {
        private final int e;

        public final int c() {
            return this.e;
        }

        public i(int i) {
            super(null);
            this.e = i;
        }
    }

    /* renamed from: o.cTd$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC6078cTd {
        private final String a;
        private final String b;
        private final TrackingInfoHolder c;
        private final String d;
        private final String e;

        public final TrackingInfoHolder a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final String e() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, String str3, TrackingInfoHolder trackingInfoHolder, String str4) {
            super(null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) trackingInfoHolder, "");
            C8632dsu.c((Object) str4, "");
            this.a = str;
            this.d = str2;
            this.b = str3;
            this.c = trackingInfoHolder;
            this.e = str4;
        }
    }

    /* renamed from: o.cTd$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC6078cTd {
        public static final l d = new l();

        private l() {
            super(null);
        }
    }
}
