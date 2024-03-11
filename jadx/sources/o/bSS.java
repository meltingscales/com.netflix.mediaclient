package o;

import android.content.Context;
import android.util.TypedValue;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import kotlin.Pair;
import o.AbstractC3073as;
import o.C4022bTi;
import o.C9834xU;
import o.InterfaceC6419ccu;
import o.bSM;

/* loaded from: classes4.dex */
public final class bSS {
    public static final int c(int i, int i2, int i3) {
        return i;
    }

    public static final int g(int i, int i2, int i3) {
        return i;
    }

    public static final int h(int i, int i2, int i3) {
        return i;
    }

    public static final int j(int i, int i2, int i3) {
        return i;
    }

    public static /* synthetic */ void d(InterfaceC2023aX interfaceC2023aX, Context context, int i, boolean z, drO dro, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            dro = null;
        }
        d(interfaceC2023aX, context, i, z, dro);
    }

    public static final void d(InterfaceC2023aX interfaceC2023aX, Context context, int i, boolean z, drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        c(interfaceC2023aX, context, i, z ? C4022bTi.a.b : C4022bTi.a.G, z, dro);
    }

    public static /* synthetic */ void a(InterfaceC2023aX interfaceC2023aX, Context context, int i, boolean z, drO dro, Integer num, int i2, Object obj) {
        b(interfaceC2023aX, context, i, z, (i2 & 8) != 0 ? null : dro, (i2 & 16) != 0 ? null : num);
    }

    public static final void b(InterfaceC2023aX interfaceC2023aX, Context context, int i, boolean z, drO<dpR> dro, Integer num) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        e(interfaceC2023aX, context, i, z, dro, num);
    }

    public static final void e(InterfaceC2023aX interfaceC2023aX, Context context, int i, boolean z, final drO<dpR> dro, Integer num) {
        int d;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        if (num != null) {
            d = num.intValue();
        } else {
            d = (int) (InterfaceC6419ccu.c.e.d(context, false) * 1.25f);
        }
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) ("game-billboard-" + i));
        c3780bKj.e(z ? C4022bTi.a.c : C4022bTi.a.h);
        c3780bKj.c(new Pair<>(-1, Integer.valueOf(d)));
        c3780bKj.e(new AbstractC3073as.b() { // from class: o.bST
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int g;
                g = bSS.g(i2, i3, i4);
                return g;
            }
        });
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) d(i, 1));
        bSM.a aVar = bSM.e;
        c3787bKq.c(aVar.b());
        c3787bKq.d(true);
        c3787bKq.d(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.r)));
        c3787bKq.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) d(i, 2));
        c3787bKq2.c(aVar.b());
        c3787bKq2.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq2);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) d(i, 3));
        c3787bKq3.c(aVar.b());
        c3787bKq3.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq3);
        if (z) {
            C3787bKq c3787bKq4 = new C3787bKq();
            c3787bKq4.b((CharSequence) d(i, 4));
            c3787bKq4.c(aVar.b());
            c3787bKq4.a(BrowseExperience.e());
            c3780bKj.add(c3787bKq4);
        }
        if (dro != null) {
            c3780bKj.b(new InterfaceC4467bf() { // from class: o.bSP
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                    bSS.h(drO.this, (C3780bKj) abstractC3073as, (C2077aZ) obj, i2);
                }
            });
        }
        interfaceC2023aX.add(c3780bKj);
    }

    public static final void h(drO dro, C3780bKj c3780bKj, C2077aZ c2077aZ, int i) {
        dro.invoke();
    }

    public static /* synthetic */ void b(InterfaceC2023aX interfaceC2023aX, Context context, int i, boolean z, drO dro, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            dro = null;
        }
        e(interfaceC2023aX, context, i, z, dro);
    }

    public static final void e(InterfaceC2023aX interfaceC2023aX, Context context, int i, boolean z, drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        c(interfaceC2023aX, context, i, z ? C4022bTi.a.e : C4022bTi.a.d, z, dro);
    }

    public static final void a(drO dro, C3780bKj c3780bKj, C2077aZ c2077aZ, int i) {
        dro.invoke();
    }

    public static final void a(InterfaceC2023aX interfaceC2023aX, Context context, int i, drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        b(interfaceC2023aX, context, i, C4022bTi.a.G, dro);
    }

    public static final void b(InterfaceC2023aX interfaceC2023aX, Context context, int i, int i2, final drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        int p = C8150deu.p(context);
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) ("collection-page-evidence-" + i));
        c3780bKj.e(i2);
        c3780bKj.c(new Pair<>(Integer.valueOf(p), Integer.valueOf((int) (((float) p) * 0.5625f))));
        c3780bKj.e(new AbstractC3073as.b() { // from class: o.bSR
            @Override // o.AbstractC3073as.b
            public final int b(int i3, int i4, int i5) {
                int h;
                h = bSS.h(i3, i4, i5);
                return h;
            }
        });
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) d(i, 1));
        c3787bKq.d(true);
        bSM.a aVar = bSM.e;
        c3787bKq.c(aVar.b());
        c3787bKq.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) d(i, 2));
        c3787bKq2.d(true);
        c3787bKq2.c(aVar.b());
        c3787bKq2.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq2);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) d(i, 3));
        c3787bKq3.d(true);
        c3787bKq3.c(aVar.b());
        c3787bKq3.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq3);
        if (dro != null) {
            c3780bKj.b(new InterfaceC4467bf() { // from class: o.bSQ
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                    bSS.i(drO.this, (C3780bKj) abstractC3073as, (C2077aZ) obj, i3);
                }
            });
        }
        interfaceC2023aX.add(c3780bKj);
    }

    public static final void i(drO dro, C3780bKj c3780bKj, C2077aZ c2077aZ, int i) {
        dro.invoke();
    }

    public static final void f(drO dro, C3780bKj c3780bKj, C2077aZ c2077aZ, int i) {
        dro.invoke();
    }

    public static final String d(int i) {
        return "st-" + i;
    }

    public static final String d(int i, int i2) {
        return "si-" + i + "-" + i2;
    }

    public static final void c(InterfaceC2023aX interfaceC2023aX, Context context, int i, int i2, boolean z, final drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) ("billboard-" + i));
        c3780bKj.e(i2);
        c3780bKj.c(new Pair<>(-1, Integer.valueOf(C6469cdr.c(context, z))));
        c3780bKj.e(new AbstractC3073as.b() { // from class: o.bSU
            @Override // o.AbstractC3073as.b
            public final int b(int i3, int i4, int i5) {
                int c;
                c = bSS.c(i3, i4, i5);
                return c;
            }
        });
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) d(i, 1));
        c3787bKq.d(true);
        bSM.a aVar = bSM.e;
        c3787bKq.c(aVar.b());
        c3787bKq.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) d(i, 2));
        c3787bKq2.d(true);
        c3787bKq2.c(aVar.b());
        c3787bKq2.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq2);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) d(i, 3));
        c3787bKq3.d(true);
        c3787bKq3.c(aVar.b());
        c3787bKq3.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq3);
        if (z) {
            C3787bKq c3787bKq4 = new C3787bKq();
            c3787bKq4.b((CharSequence) d(i, 3));
            c3787bKq4.d(true);
            c3787bKq4.c(aVar.b());
            c3787bKq4.a(BrowseExperience.e());
            c3780bKj.add(c3787bKq4);
        }
        if (dro != null) {
            c3780bKj.b(new InterfaceC4467bf() { // from class: o.bSX
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i3) {
                    bSS.a(drO.this, (C3780bKj) abstractC3073as, (C2077aZ) obj, i3);
                }
            });
        }
        interfaceC2023aX.add(c3780bKj);
    }

    public static final void e(InterfaceC2023aX interfaceC2023aX, int i, final drO<dpR> dro) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C3780bKj c3780bKj = new C3780bKj();
        c3780bKj.e((CharSequence) ("collect-taste-" + i));
        c3780bKj.e(C4022bTi.a.a);
        c3780bKj.c(new Pair<>(-1, -2));
        c3780bKj.d(0);
        c3780bKj.e(new AbstractC3073as.b() { // from class: o.bSW
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int j;
                j = bSS.j(i2, i3, i4);
                return j;
            }
        });
        C3787bKq c3787bKq = new C3787bKq();
        c3787bKq.b((CharSequence) d(i, 0));
        c3787bKq.d(true);
        C1332Xp c1332Xp = C1332Xp.b;
        c3787bKq.d(Integer.valueOf((int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        c3787bKq.e(C8168dfL.d(C9834xU.h.e));
        bSM.a aVar = bSM.e;
        c3787bKq.c(aVar.b());
        c3787bKq.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq);
        C3787bKq c3787bKq2 = new C3787bKq();
        c3787bKq2.b((CharSequence) d(i, 1));
        c3787bKq2.c(aVar.b());
        c3787bKq2.e(C8168dfL.d(C9834xU.h.e));
        c3787bKq2.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq2);
        C3787bKq c3787bKq3 = new C3787bKq();
        c3787bKq3.b((CharSequence) d(i, 2));
        c3787bKq3.c(aVar.b());
        c3787bKq3.e(C8168dfL.d(C9834xU.h.e));
        c3787bKq3.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq3);
        C3787bKq c3787bKq4 = new C3787bKq();
        c3787bKq4.b((CharSequence) d(i, 3));
        c3787bKq4.d(true);
        c3787bKq4.d(Integer.valueOf((int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        c3787bKq4.e(C8168dfL.d(C9834xU.h.e));
        c3787bKq4.c(aVar.b());
        c3787bKq4.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq4);
        C3787bKq c3787bKq5 = new C3787bKq();
        c3787bKq5.b((CharSequence) d(i, 4));
        c3787bKq5.d(true);
        c3787bKq5.d(Integer.valueOf((int) TypedValue.applyDimension(1, 3, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        c3787bKq5.e(C8168dfL.d(C9834xU.h.e));
        c3787bKq5.c(aVar.b());
        c3787bKq5.a(BrowseExperience.e());
        c3780bKj.add(c3787bKq5);
        if (dro != null) {
            c3780bKj.b(new InterfaceC4467bf() { // from class: o.bSV
                @Override // o.InterfaceC4467bf
                public final void c(AbstractC3073as abstractC3073as, Object obj, int i2) {
                    bSS.f(drO.this, (C3780bKj) abstractC3073as, (C2077aZ) obj, i2);
                }
            });
        }
        interfaceC2023aX.add(c3780bKj);
    }
}
