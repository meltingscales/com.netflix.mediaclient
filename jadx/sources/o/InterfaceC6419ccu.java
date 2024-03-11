package o;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.lomo.LoMoUtils;
import o.C1729aMb;
import o.C1864aRb;
import o.C9834xU;
import o.aQS;

/* renamed from: o.ccu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6419ccu {

    /* renamed from: o.ccu$b */
    /* loaded from: classes4.dex */
    public interface b {
        public static final a e = a.c;

        static int d() {
            return e.a();
        }

        /* renamed from: o.ccu$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            static final /* synthetic */ a c = new a();

            private a() {
            }

            public final int a() {
                aQS.e e = aQS.a.e();
                return e.b() ? e.e() : C8171dfO.e() ? 2 : 5;
            }
        }
    }

    /* renamed from: o.ccu$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public static final d d = new d();

        private d() {
        }

        public final C1729aMb d(Context context) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(4, C4000bSn.e(context), 0.7f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.25f, 0, null, true, false, false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.an, null, 0, 0, false, 8124056, null);
        }

        public final C1729aMb d() {
            return new C1729aMb(3, 1, 0.0f, 1, 0, 0, 0, 0, 0.0f, 0, null, false, false, false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.K, null, 0, 0, false, 7995284, null);
        }

        public final C1729aMb c() {
            return new C1729aMb(25, 1, 0.0f, 1, 0, 0, 0, 0, 0.0f, 0, null, false, false, false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.aB, null, 0, 0, false, 7995284, null);
        }

        public static final C1729aMb i(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, C4000bSn.e(context), 0.71f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.25f, 0, null, true, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.fX, null, 0, 0, false, 8119960, null);
        }

        public static final C1729aMb k(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, C4000bSn.e(context), 0.71f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.25f, 0, new b(), true, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.dL, null, 0, 0, false, 8118936, null);
        }

        /* renamed from: o.ccu$d$b */
        /* loaded from: classes4.dex */
        public static final class b implements C1729aMb.b {
            b() {
            }

            @Override // o.C1729aMb.b
            public RecyclerView.ItemDecoration d(AppCompatActivity appCompatActivity) {
                C8632dsu.c((Object) appCompatActivity, "");
                return new C9908yp(appCompatActivity, BrowseExperience.a(appCompatActivity, 16842836), appCompatActivity.getResources().getDimensionPixelSize(C9834xU.a.aj), appCompatActivity.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v));
            }
        }

        public static final C1729aMb l(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, C4000bSn.e(context), 0.0f, 0, 0, 0, LoMoUtils.e(), 0, 0.25f, 0, null, true, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.eH, null, 0, 0, false, 8119964, null);
        }

        public static final C1729aMb j(Context context, int i) {
            int i2;
            C8632dsu.c((Object) context, "");
            int e = C4000bSn.e(context);
            C1864aRb.a aVar = C1864aRb.b;
            if (aVar.a().b()) {
                i2 = 3;
                if (e != 3) {
                    i2 = 2;
                }
            } else {
                i2 = 1;
            }
            return new C1729aMb(i, e, 0.0f, 0, 0, !aVar.a().b() ? 0 : context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.25f, 0, null, true, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.cJ, null, 0, i2, false, 6022812, null);
        }

        public static final C1729aMb c(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, 1, 0.0f, 1, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.0f, 0, null, false, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.ch, null, 0, 0, false, 7990932, null);
        }

        public static final C1729aMb a(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, 1, 0.0f, 1, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.0f, 0, null, false, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.bW, null, 0, 0, false, 8122004, null);
        }

        public static final C1729aMb h(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, 1, 0.0f, 1, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.0f, 0, null, false, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.cf, null, 0, 0, false, 8122004, null);
        }

        public static final C1729aMb e(Context context, int i, int i2) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, i2, 3.0f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.25f, 0, null, true, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.fj, null, 0, 0, false, 8119960, null);
        }

        public static final C1729aMb b(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, C4000bSn.e(context), 0.0f, 0, 0, 0, LoMoUtils.e(), 0, 0.25f, 0, null, true, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.bm, null, 0, 0, false, 8119964, null);
        }

        public static final C1729aMb f(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, 1, 1.0f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.0f, 0, null, false, BrowseExperience.e(), false, 1, 1, 0, false, com.netflix.mediaclient.ui.R.g.ce, null, 0, 0, false, 7942040, null);
        }

        public static final C1729aMb b(Context context, int i, int i2) {
            C8632dsu.c((Object) context, "");
            return new C1729aMb(i, i2, 0.71f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), 0, 0.0f, 0, null, true, BrowseExperience.e(), false, i2, 0, 0, false, com.netflix.mediaclient.ui.R.g.cb, null, 0, 0, false, 8103576, null);
        }

        public static final C1729aMb e(Context context, int i) {
            C8632dsu.c((Object) context, "");
            int e = C4000bSn.e(context);
            C1729aMb c1729aMb = new C1729aMb(i, e, C8150deu.h() ? 0.58823526f : 0.5555556f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.0f, 0, null, false, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.aE, null, 0, 0, false, 8122264, null);
            if (e > 1) {
                C1729aMb i2 = i(context, i);
                return C1729aMb.b(c1729aMb, 0, 0, 0.0f, i2.n(), 0, 0, 0, 0, i2.l(), 0, null, i2.e(), false, false, 0, 0, 0, false, 0, null, 0, 0, false, 8386295, null);
            }
            return c1729aMb;
        }

        public static final C1729aMb m(Context context, int i) {
            C8632dsu.c((Object) context, "");
            if (aSC.a()) {
                int e = LoMoUtils.e();
                C1729aMb i2 = i(context, i);
                float l = i2.l();
                boolean e2 = BrowseExperience.e();
                return new C1729aMb(i, 2, 0.5f, i2.n(), 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), e, 0, (l * 2) / 3, 0, null, i2.e(), e2, false, 0, 0, 1, false, com.netflix.mediaclient.ui.R.g.fo, null, 0, 0, false, 8054416, null);
            }
            return i(context, i);
        }

        public final C1729aMb r(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return C1729aMb.b(i(context, i), 0, C4000bSn.d(context), 1.778f, 0, 0, 0, 0, 0, 0.39f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, false, 8388345, null);
        }

        public final C1729aMb s(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return C1729aMb.b(i(context, i), 0, C4000bSn.d(context), 1.778f, 0, 0, 0, 0, 0, 0.39f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, false, 8388345, null);
        }

        public final C1729aMb n(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return C1729aMb.b(i(context, i), 0, 0, 1.0f, 0, 0, 0, 0, 0, 0.0f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, false, 8388603, null);
        }

        public static final C1729aMb d(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return C1729aMb.b(i(context, i), 0, C4000bSn.e(context) - 1, 2.0f, 0, 0, 0, 0, 0, 0.41f, 0, null, false, false, false, 2, 0, 0, false, 0, null, 0, 0, false, 8371961, null);
        }

        public static final C1729aMb g(Context context, int i) {
            C8632dsu.c((Object) context, "");
            C1729aMb i2 = i(context, i);
            return C1857aQv.b.b().d() ? C1729aMb.b(i2, 0, 2, 1.0f, 0, 0, 0, 0, 0, 0.32f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, false, 8388345, null) : i2;
        }

        public static final C1729aMb b(Context context, CollectTaste collectTaste, int i) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) collectTaste, "");
            int e = LoMoUtils.e() + context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v);
            return new C1729aMb(i, 2, 0.54f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), e, 0, 0.65f, 0, new c(collectTaste, e), true, BrowseExperience.e(), false, 0, 0, 0, false, com.netflix.mediaclient.ui.R.g.ad, null, 0, 0, false, 7987864, null);
        }

        /* renamed from: o.ccu$d$c */
        /* loaded from: classes4.dex */
        public static final class c implements C1729aMb.b {
            final /* synthetic */ int c;
            final /* synthetic */ CollectTaste e;

            c(CollectTaste collectTaste, int i) {
                this.e = collectTaste;
                this.c = i;
            }

            @Override // o.C1729aMb.b
            public RecyclerView.ItemDecoration d(AppCompatActivity appCompatActivity) {
                C8632dsu.c((Object) appCompatActivity, "");
                return this.e.e(this.c);
            }
        }

        public final C1729aMb o(Context context, int i) {
            C8632dsu.c((Object) context, "");
            int a = LoMoUtils.a((Activity) C9737vz.e(context, Activity.class));
            return new C1729aMb(i, a, 0.71f, 0, 0, context.getResources().getDimensionPixelSize(com.netflix.mediaclient.ui.R.b.v), LoMoUtils.e(), 0, 0.0f, 0, null, false, BrowseExperience.e(), false, a, 1, 0, false, com.netflix.mediaclient.ui.R.g.cb, null, 0, 0, false, 7942040, null);
        }
    }

    /* renamed from: o.ccu$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public static final c e = new c();

        private c() {
        }

        public static final boolean b(Context context) {
            C8632dsu.c((Object) context, "");
            return C8150deu.g() && C8150deu.i(context) < 0.6896551f;
        }

        public final int a(Context context) {
            C8632dsu.c((Object) context, "");
            return (int) (C8150deu.l(context) * 0.6d);
        }

        public final int d(Context context, boolean z) {
            C8632dsu.c((Object) context, "");
            return a(context, z, LoMoUtils.LoMoWidthType.STANDARD);
        }

        private final int a(Context context, boolean z, LoMoUtils.LoMoWidthType loMoWidthType) {
            if (z) {
                return (C8150deu.p(context) - LoMoUtils.c(context)) - LoMoUtils.c(context, loMoWidthType);
            }
            return C8150deu.p(context);
        }
    }

    /* renamed from: o.ccu$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final int b(int i, C1729aMb c1729aMb) {
            C8632dsu.c((Object) c1729aMb, "");
            return (i % c1729aMb.o()) + c1729aMb.o() + 1;
        }

        public static final int d(Context context, int i) {
            C8632dsu.c((Object) context, "");
            return (i + C4000bSn.b(context, LoMoType.FLAT_GENRE)) - 1;
        }
    }
}
