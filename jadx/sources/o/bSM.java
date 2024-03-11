package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.impl.HomeLoadingScreens$renderShimmerRow$2;
import com.netflix.mediaclient.util.EchoShowUtils;
import o.AbstractC3073as;
import o.C3796bKz;
import o.C4022bTi;
import o.InterfaceC6419ccu;
import o.bSM;

/* loaded from: classes4.dex */
public abstract class bSM implements bJF<C4049bUi> {
    private static final long a;
    private static final Rect c;
    public static final a e = new a(null);

    public /* synthetic */ bSM(C8627dsp c8627dsp) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i2, int i3, int i4) {
        return i2;
    }

    private bSM() {
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final Rect a() {
            return bSM.c;
        }

        public final long b() {
            return bSM.a;
        }

        public final void d(Context context, AbstractC2914ap abstractC2914ap, C4049bUi c4049bUi) {
            bJF bjf;
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) abstractC2914ap, "");
            C8632dsu.c((Object) c4049bUi, "");
            if (C9737vz.d(context)) {
                bjf = d.b;
            } else if (C8120deQ.a()) {
                bjf = d.b;
            } else if (EchoShowUtils.d.c(context)) {
                bjf = d.b;
            } else if (c4049bUi.d()) {
                if (c4049bUi.h()) {
                    bjf = c.b;
                } else {
                    bjf = (c4049bUi.i() && InterfaceC6419ccu.c.b(context)) ? e.a : b.d;
                }
            } else {
                bjf = i.a;
            }
            bJH.c(bjf, abstractC2914ap, context, c4049bUi);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends bSM {
        public static final e a = new e();

        private e() {
            super(null);
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, C4049bUi c4049bUi) {
            int i;
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) c4049bUi, "");
            boolean f = C8153dex.f();
            if (f) {
                bKU bku = new bKU();
                bku.d((CharSequence) ("spacer-0"));
                bku.a(Integer.valueOf(c4049bUi.a()));
                interfaceC2023aX.add(bku);
                i = 1;
            } else {
                i = 0;
            }
            bSS.d(interfaceC2023aX, context, i, f, null, 8, null);
            dpR dpr = dpR.c;
            bSM.d(this, interfaceC2023aX, i + 1, c(context), 4, null, null, 24, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends bSM {
        public static final d b = new d();

        /* JADX INFO: Access modifiers changed from: private */
        public static final int b(int i, int i2, int i3) {
            return i;
        }

        private d() {
            super(null);
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, C4049bUi c4049bUi) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) c4049bUi, "");
            C3774bKd c3774bKd = new C3774bKd();
            c3774bKd.c((CharSequence) "lolomo-loading-spinner");
            c3774bKd.d(C3796bKz.g.m);
            c3774bKd.d(new AbstractC3073as.b() { // from class: o.bSL
                @Override // o.AbstractC3073as.b
                public final int b(int i, int i2, int i3) {
                    int b2;
                    b2 = bSM.d.b(i, i2, i3);
                    return b2;
                }
            });
            interfaceC2023aX.add(c3774bKd);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends bSM {
        public static final c b = new c();

        private c() {
            super(null);
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, C4049bUi c4049bUi) {
            int i;
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) c4049bUi, "");
            boolean z = C8153dex.v() && !C8632dsu.c((Object) c4049bUi.b(), (Object) "games");
            if (z) {
                bKU bku = new bKU();
                bku.d((CharSequence) ("spacer-0"));
                bku.a(Integer.valueOf(c4049bUi.a()));
                interfaceC2023aX.add(bku);
                i = 1;
            } else {
                i = 0;
            }
            bSS.a(interfaceC2023aX, context, i, z, null, null, 24, null);
            dpR dpr = dpR.c;
            bSM.d(this, interfaceC2023aX, 0, c(context), 4, null, null, 24, null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends bSM {
        public static final b d = new b();

        private b() {
            super(null);
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, C4049bUi c4049bUi) {
            int i;
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) c4049bUi, "");
            boolean N = C8153dex.N();
            if (N) {
                bKU bku = new bKU();
                bku.d((CharSequence) ("spacer-0"));
                bku.a(Integer.valueOf(c4049bUi.a()));
                interfaceC2023aX.add(bku);
                i = 1;
            } else {
                i = 0;
            }
            bSS.b(interfaceC2023aX, context, i, N, null, 8, null);
            dpR dpr = dpR.c;
            bSM.d(this, interfaceC2023aX, 0, c(context), 4, null, null, 24, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends bSM {
        public static final i a = new i();

        private i() {
            super(null);
        }

        @Override // o.bJF
        /* renamed from: a */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, C4049bUi c4049bUi) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) c4049bUi, "");
            bSM.d(this, interfaceC2023aX, 0, c(context), 5, null, null, 24, null);
        }
    }

    public static /* synthetic */ void d(bSM bsm, InterfaceC2023aX interfaceC2023aX, int i2, C1729aMb c1729aMb, int i3, Integer num, Boolean bool, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderShimmerRow");
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        bsm.e(interfaceC2023aX, i2, c1729aMb, i3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : bool);
    }

    protected final C1729aMb c(Context context) {
        C8632dsu.c((Object) context, "");
        return C1729aMb.b(InterfaceC6419ccu.d.i(context, 1), 0, 0, 0.0f, 0, 0, 0, 0, 0, 0.0f, 0, null, false, false, false, 0, 0, 0, false, 0, null, 0, 0, true, 4194303, null);
    }

    protected final void e(InterfaceC2023aX interfaceC2023aX, int i2, C1729aMb c1729aMb, int i3, Integer num, Boolean bool) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) c1729aMb, "");
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            C3787bKq c3787bKq = new C3787bKq();
            String d2 = bSS.d(i5);
            c3787bKq.b((CharSequence) ("row-title-load-" + d2));
            c3787bKq.a(BrowseExperience.e());
            c3787bKq.c(C4022bTi.a.F);
            c3787bKq.d(true);
            c3787bKq.c(a);
            c3787bKq.d(c);
            c3787bKq.e(new AbstractC3073as.b() { // from class: o.bSO
                @Override // o.AbstractC3073as.b
                public final int b(int i6, int i7, int i8) {
                    int c2;
                    c2 = bSM.c(i6, i7, i8);
                    return c2;
                }
            });
            interfaceC2023aX.add(c3787bKq);
            bKB.d(interfaceC2023aX, new HomeLoadingScreens$renderShimmerRow$2(i5, c1729aMb, num, bool));
        }
    }

    static {
        float f = 4;
        C1332Xp c1332Xp = C1332Xp.b;
        c = new Rect(0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), 0, (int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        a = 400L;
    }
}
