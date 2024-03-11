package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.View;
import com.netflix.mediaclient.service.configuration.persistent.ab.Config_Ab55851_MobileNav;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import com.netflix.mediaclient.ui.nux.impl.NewUserExperienceCtaType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import o.AbstractC7196cre;
import o.AbstractC7200cri;
import o.AbstractC7210crs;
import o.AbstractC7215crx;
import o.C7212cru;
import o.C9834xU;

/* renamed from: o.cri  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7200cri extends MessagingTooltipScreen {
    private static int b;
    private final C9935zP f;
    private final String h;
    private final MessagingTooltipScreen.a i;
    public static final e c = new e(null);
    private static final PointF a = new PointF(50.0f, 150.0f);
    private static final PointF e = new PointF(150.0f, 50.0f);

    /* renamed from: o.cri$a */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[Config_Ab55851_MobileNav.LolomoTabName.values().length];
            try {
                iArr[Config_Ab55851_MobileNav.LolomoTabName.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Config_Ab55851_MobileNav.LolomoTabName.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            e = iArr;
        }
    }

    public /* synthetic */ AbstractC7200cri(C9935zP c9935zP, C8627dsp c8627dsp) {
        this(c9935zP);
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
    public MessagingTooltipScreen.a a() {
        return this.i;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.h;
    }

    public final C9935zP v() {
        return this.f;
    }

    private AbstractC7200cri(C9935zP c9935zP) {
        this.f = c9935zP;
        this.i = new C7192cra();
        this.h = "NewUserExperienceScreen";
    }

    /* renamed from: o.cri$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final int c() {
            return AbstractC7200cri.b;
        }

        public final void d(int i) {
            AbstractC7200cri.b = i;
        }
    }

    public final List<C7201crj> e(boolean z, boolean z2) {
        Pair pair;
        ArrayList arrayList;
        Pair pair2;
        Pair pair3 = new Pair(NewUserExperienceCtaType.a, C8168dfL.d(C7212cru.a.d));
        Pair pair4 = new Pair(NewUserExperienceCtaType.b, C8168dfL.d(C7212cru.a.b));
        Pair pair5 = new Pair(NewUserExperienceCtaType.c, C8168dfL.d(C7212cru.a.a));
        Pair pair6 = new Pair(NewUserExperienceCtaType.d, "");
        ArrayList arrayList2 = new ArrayList();
        Config_Ab55851_MobileNav.c cVar = Config_Ab55851_MobileNav.a;
        if (cVar.d().c()) {
            String d = C8168dfL.d(C7212cru.a.k);
            String d2 = C8168dfL.d(C7212cru.a.i);
            Pair pair7 = arrayList2.size() > 0 ? pair5 : pair6;
            int i = C9834xU.g.u;
            C1332Xp c1332Xp = C1332Xp.b;
            pair = pair5;
            arrayList2.add(new C7201crj(d, d2, pair3, pair7, Integer.valueOf(i), new PointF((int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 60, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())), false, null, 192, null));
        } else {
            pair = pair5;
            int i2 = C8153dex.R() ? com.netflix.mediaclient.ui.R.g.g : com.netflix.mediaclient.ui.R.g.b;
            arrayList2.add(new C7201crj(C8168dfL.d(C7212cru.a.l), z2 ? C8168dfL.d(C7212cru.a.n) : null, pair3, arrayList2.size() > 0 ? pair : pair6, Integer.valueOf(i2), e, false, null, 192, null));
        }
        if (cVar.d().c()) {
            String d3 = C8168dfL.d(C7212cru.a.j);
            int i3 = a.e[cVar.d().i().ordinal()];
            String d4 = C8168dfL.d(i3 != 1 ? i3 != 2 ? C7212cru.a.h : C7212cru.a.f : C7212cru.a.g);
            if (!z) {
                pair3 = pair4;
            }
            int i4 = com.netflix.mediaclient.ui.R.g.cu;
            C1332Xp c1332Xp2 = C1332Xp.b;
            PointF pointF = new PointF(0.0f, (int) TypedValue.applyDimension(1, 62, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
            Integer valueOf = Integer.valueOf(i4);
            arrayList = arrayList2;
            pair2 = pair;
            arrayList.add(new C7201crj(d3, d4, pair3, pair2, valueOf, pointF, false, null, 192, null));
        } else {
            arrayList = arrayList2;
            pair2 = pair;
            if (!C8153dex.S()) {
                arrayList.add(new C7201crj(C8168dfL.d(C7212cru.a.m), C8168dfL.d(C7212cru.a.f13765o), z ? pair3 : pair4, pair2, Integer.valueOf(com.netflix.mediaclient.ui.R.g.gL), a, false, null, 192, null));
            }
        }
        if (z) {
            arrayList.add(new C7201crj(C8168dfL.d(C7212cru.a.c), C8168dfL.d(C7212cru.a.e), pair4, pair2, null, a, true, "lottiefiles/downloads_nux.json"));
        }
        return arrayList;
    }

    /* renamed from: o.cri$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC7200cri {
        private final MessagingTooltipScreen.ScreenType a;
        private final String e;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.e;
        }

        @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
        public MessagingTooltipScreen.ScreenType r() {
            return this.a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9935zP c9935zP) {
            super(c9935zP, null);
            C8632dsu.c((Object) c9935zP, "");
            this.e = "NewUserExperienceTooltipWithRedDot";
            this.a = MessagingTooltipScreen.ScreenType.a;
        }

        @Override // o.bJF
        /* renamed from: a */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            int d;
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            final int i = 0;
            List<C7201crj> e = e(false, false);
            C3757bJn c3757bJn = new C3757bJn();
            c3757bJn.c((CharSequence) "carousel_nux");
            C1332Xp c1332Xp = C1332Xp.b;
            c3757bJn.b(-((int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            d = C8572dqo.d(e, 10);
            ArrayList arrayList = new ArrayList(d);
            for (Object obj : e) {
                if (i < 0) {
                    C8569dql.h();
                }
                final C7201crj c7201crj = (C7201crj) obj;
                C7167crB c7167crB = new C7167crB();
                c7167crB.c((CharSequence) ("nux_card_" + i));
                c7167crB.c(c7201crj);
                c7167crB.e(new InterfaceC4467bf() { // from class: o.crk
                    @Override // o.InterfaceC4467bf
                    public final void c(AbstractC3073as abstractC3073as, Object obj2, int i2) {
                        AbstractC7200cri.b.c(i, this, c7201crj, (C7167crB) abstractC3073as, (AbstractC7210crs.e) obj2, i2);
                    }
                });
                c7167crB.b(new InterfaceC4732bk() { // from class: o.crl
                    @Override // o.InterfaceC4732bk
                    public final void b(AbstractC3073as abstractC3073as, Object obj2, int i2) {
                        AbstractC7200cri.b.d(i, this, c7201crj, (C7167crB) abstractC3073as, (AbstractC7210crs.e) obj2, i2);
                    }
                });
                c7167crB.a(new View.OnClickListener() { // from class: o.crm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC7200cri.b.d(C7201crj.this, i, this, view);
                    }
                });
                c3757bJn.add(c7167crB);
                arrayList.add(dpR.c);
                i++;
            }
            c3757bJn.d(-65536);
            interfaceC2023aX.add(c3757bJn);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(int i, b bVar, C7201crj c7201crj, C7167crB c7167crB, AbstractC7210crs.e eVar, int i2) {
            C8632dsu.c((Object) bVar, "");
            C8632dsu.c((Object) c7201crj, "");
            if (i2 == 0) {
                C7193crb.d.d(i);
                bVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.e(c7201crj.j(), i, c7201crj.h()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(int i, b bVar, C7201crj c7201crj, C7167crB c7167crB, AbstractC7210crs.e eVar, int i2) {
            C8632dsu.c((Object) bVar, "");
            C8632dsu.c((Object) c7201crj, "");
            if (i2 == 1) {
                C7193crb.d.a();
                bVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.c(c7201crj.j()));
            } else if (i2 != 4) {
            } else {
                C7193crb.d.d(i);
                AbstractC7200cri.c.d(i);
                bVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.e(c7201crj.j(), i, c7201crj.h()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C7201crj c7201crj, int i, b bVar, View view) {
            C8632dsu.c((Object) c7201crj, "");
            C8632dsu.c((Object) bVar, "");
            if (c7201crj.e().d() == NewUserExperienceCtaType.b) {
                C7193crb.d.a(i);
            } else {
                C7193crb.d.c(i);
            }
            bVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.d(c7201crj.e().d(), i, c7201crj.j()));
        }
    }

    /* renamed from: o.cri$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC7200cri {
        private final boolean a;
        private final boolean b;
        private final String e;
        private final MessagingTooltipScreen.ScreenType i;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.e;
        }

        @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
        public MessagingTooltipScreen.ScreenType r() {
            return this.i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9935zP c9935zP, boolean z, boolean z2) {
            super(c9935zP, null);
            C8632dsu.c((Object) c9935zP, "");
            this.b = z;
            this.a = z2;
            this.e = "NewUserExperienceTooltipWithRedDotV2";
            this.i = MessagingTooltipScreen.ScreenType.a;
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            int d;
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            List<C7201crj> e = e(this.b, this.a);
            C3748bJe c3748bJe = new C3748bJe();
            c3748bJe.d((CharSequence) "carousel_nux");
            c3748bJe.e(C7212cru.c.b);
            d = C8572dqo.d(e, 10);
            ArrayList arrayList = new ArrayList(d);
            final int i = 0;
            for (Object obj : e) {
                if (i < 0) {
                    C8569dql.h();
                }
                final C7201crj c7201crj = (C7201crj) obj;
                C7166crA c7166crA = new C7166crA();
                c7166crA.c((CharSequence) ("nux_card_" + i));
                c7166crA.d(c7201crj);
                c7166crA.d(e.size());
                c7166crA.b(i);
                c7166crA.d(new InterfaceC4467bf() { // from class: o.crq
                    @Override // o.InterfaceC4467bf
                    public final void c(AbstractC3073as abstractC3073as, Object obj2, int i2) {
                        AbstractC7200cri.c.a(i, this, c7201crj, (C7166crA) abstractC3073as, (AbstractC7215crx.c) obj2, i2);
                    }
                });
                c7166crA.d(new InterfaceC4732bk() { // from class: o.cro
                    @Override // o.InterfaceC4732bk
                    public final void b(AbstractC3073as abstractC3073as, Object obj2, int i2) {
                        AbstractC7200cri.c.d(i, this, c7201crj, (C7166crA) abstractC3073as, (AbstractC7215crx.c) obj2, i2);
                    }
                });
                c7166crA.d(new View.OnClickListener() { // from class: o.crp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC7200cri.c.e(C7201crj.this, i, this, view);
                    }
                });
                c7166crA.c(new View.OnClickListener() { // from class: o.crr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC7200cri.c.e(i, this, c7201crj, view);
                    }
                });
                c7166crA.e(new View.OnClickListener() { // from class: o.crn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC7200cri.c.e(AbstractC7200cri.c.this, view);
                    }
                });
                c3748bJe.add(c7166crA);
                arrayList.add(dpR.c);
                i++;
            }
            interfaceC2023aX.add(c3748bJe);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(int i, c cVar, C7201crj c7201crj, C7166crA c7166crA, AbstractC7215crx.c cVar2, int i2) {
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) c7201crj, "");
            if (i2 == 0) {
                C7193crb.d.d(i);
                cVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.e(c7201crj.j(), i, c7201crj.h()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(int i, c cVar, C7201crj c7201crj, C7166crA c7166crA, AbstractC7215crx.c cVar2, int i2) {
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) c7201crj, "");
            if (i2 == 1) {
                C7193crb.d.a();
                cVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.c(c7201crj.j()));
            } else if (i2 != 4) {
            } else {
                C7193crb.d.d(i);
                AbstractC7200cri.c.d(i);
                cVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.e(c7201crj.j(), i, c7201crj.h()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(C7201crj c7201crj, int i, c cVar, View view) {
            C8632dsu.c((Object) c7201crj, "");
            C8632dsu.c((Object) cVar, "");
            if (c7201crj.e().d() == NewUserExperienceCtaType.b) {
                C7193crb.d.a(i);
            } else {
                C7193crb.d.c(i);
            }
            cVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.d(c7201crj.e().d(), i, c7201crj.j()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(int i, c cVar, C7201crj c7201crj, View view) {
            C8632dsu.c((Object) cVar, "");
            C8632dsu.c((Object) c7201crj, "");
            C7193crb.d.b(i);
            cVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.d(c7201crj.c().d(), i, c7201crj.j()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(c cVar, View view) {
            C8632dsu.c((Object) cVar, "");
            cVar.v().b(AbstractC7196cre.class, new AbstractC7196cre.a(AbstractC7200cri.c.c()));
        }
    }

    @Override // o.AbstractC6677chn
    public void f() {
        C7193crb c7193crb = C7193crb.d;
        c7193crb.a(b);
        c7193crb.a();
    }
}
