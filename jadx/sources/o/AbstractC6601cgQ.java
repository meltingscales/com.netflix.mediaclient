package o;

import android.content.Context;
import android.view.View;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.util.Map;
import o.AbstractC6589cgE;
import o.AbstractC6601cgQ;
import o.C6597cgM;
import o.C6676chm;
import o.C9834xU;

/* renamed from: o.cgQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6601cgQ extends AbstractC6677chn {
    public static final a a = new a(null);
    private static final Map<String, String> b;
    private final C9935zP c;
    private final C6585cgA e;
    private final boolean g;
    private final String i;

    public /* synthetic */ AbstractC6601cgQ(C9935zP c9935zP, C6585cgA c6585cgA, boolean z, C8627dsp c8627dsp) {
        this(c9935zP, c6585cgA, z);
    }

    public final C9935zP a() {
        return this.c;
    }

    public final C6585cgA d() {
        return this.e;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.i;
    }

    public final boolean j() {
        return this.g;
    }

    private AbstractC6601cgQ(C9935zP c9935zP, C6585cgA c6585cgA, boolean z) {
        this.c = c9935zP;
        this.e = c6585cgA;
        this.g = z;
        this.i = "UpSellTray";
    }

    /* renamed from: o.cgQ$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    static {
        Map<String, String> c2;
        c2 = dqE.c(dpD.a("5001", "basic_with_ads"), dpD.a("5200", "standard_with_ads"));
        b = c2;
    }

    /* renamed from: o.cgQ$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6601cgQ {
        public static final C0114d b = new C0114d(null);
        private final String e;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9935zP c9935zP, C6585cgA c6585cgA, boolean z) {
            super(c9935zP, c6585cgA, z, null);
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) c6585cgA, "");
            this.e = "UpSellTrayLoading";
        }

        /* renamed from: o.cgQ$d$d  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0114d extends C1045Mp {
            public /* synthetic */ C0114d(C8627dsp c8627dsp) {
                this();
            }

            private C0114d() {
                super("UpSellTrayLoading");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(d dVar, View view) {
            C8632dsu.c((Object) dVar, "");
            dVar.a().b(AbstractC6589cgE.class, AbstractC6589cgE.a.d);
        }

        @Override // o.AbstractC6677chn
        public boolean h() {
            a().b(AbstractC6589cgE.class, new AbstractC6589cgE.c(this));
            return true;
        }

        @Override // o.AbstractC6677chn
        public void f() {
            d().d();
        }

        @Override // o.bJF
        /* renamed from: e */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            C3761bJr c3761bJr = new C3761bJr();
            c3761bJr.b((CharSequence) "close");
            c3761bJr.b(new View.OnClickListener() { // from class: o.cgO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC6601cgQ.d.e(AbstractC6601cgQ.d.this, view);
                }
            });
            interfaceC2023aX.add(c3761bJr);
            C3787bKq c3787bKq = new C3787bKq();
            c3787bKq.b((CharSequence) "shim-emojis");
            c3787bKq.a(true);
            c3787bKq.c(C6597cgM.a.b);
            c3787bKq.d(true);
            interfaceC2023aX.add(c3787bKq);
            C3787bKq c3787bKq2 = new C3787bKq();
            c3787bKq2.b((CharSequence) "shim-2");
            c3787bKq2.a(true);
            c3787bKq2.c(C6597cgM.a.d);
            c3787bKq2.d(true);
            interfaceC2023aX.add(c3787bKq2);
            C1781aO c1781aO = new C1781aO();
            c1781aO.b("plan-card");
            c1781aO.e(C6597cgM.a.f);
            C1781aO c1781aO2 = new C1781aO();
            c1781aO2.b((CharSequence) "plan-list");
            c1781aO2.e(C6597cgM.a.j);
            C3787bKq c3787bKq3 = new C3787bKq();
            c3787bKq3.b((CharSequence) "shim-1");
            c3787bKq3.a(true);
            c3787bKq3.c(C6597cgM.a.e);
            c3787bKq3.d(true);
            c1781aO2.add(c3787bKq3);
            C3787bKq c3787bKq4 = new C3787bKq();
            c3787bKq4.b((CharSequence) "shim-2");
            c3787bKq4.a(true);
            c3787bKq4.c(C6597cgM.a.e);
            c3787bKq4.d(true);
            c1781aO2.add(c3787bKq4);
            C3787bKq c3787bKq5 = new C3787bKq();
            c3787bKq5.b((CharSequence) "shim-3");
            c3787bKq5.a(true);
            c3787bKq5.c(C6597cgM.a.e);
            c3787bKq5.d(true);
            c1781aO2.add(c3787bKq5);
            bKR bkr = new bKR();
            bkr.d((CharSequence) "plan-separator");
            c1781aO2.add(bkr);
            C3787bKq c3787bKq6 = new C3787bKq();
            c3787bKq6.b((CharSequence) "shim-4");
            c3787bKq6.a(true);
            c3787bKq6.c(C6597cgM.a.e);
            c3787bKq6.d(true);
            c1781aO2.add(c3787bKq6);
            C3787bKq c3787bKq7 = new C3787bKq();
            c3787bKq7.b((CharSequence) "shim-5");
            c3787bKq7.a(true);
            c3787bKq7.c(C6597cgM.a.e);
            c3787bKq7.d(true);
            c1781aO2.add(c3787bKq7);
            C3787bKq c3787bKq8 = new C3787bKq();
            c3787bKq8.b((CharSequence) "shim-6");
            c3787bKq8.a(true);
            c3787bKq8.c(C6597cgM.a.e);
            c3787bKq8.d(true);
            c1781aO2.add(c3787bKq8);
            c1781aO.add(c1781aO2);
            interfaceC2023aX.add(c1781aO);
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.e((CharSequence) "positive");
            c3805bLh.c(C6676chm.a.a);
            c3805bLh.b((CharSequence) C8168dfL.d(C6597cgM.d.b));
            c3805bLh.d(false);
            interfaceC2023aX.add(c3805bLh);
            C3805bLh c3805bLh2 = new C3805bLh();
            c3805bLh2.e((CharSequence) "negative");
            c3805bLh2.c(C6676chm.a.b);
            c3805bLh2.b((CharSequence) C8168dfL.d(C6597cgM.d.a));
            c3805bLh2.d(false);
            interfaceC2023aX.add(c3805bLh2);
            bKU bku = new bKU();
            bku.d((CharSequence) "bottom-padding");
            bku.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
            interfaceC2023aX.add(bku);
        }
    }

    /* renamed from: o.cgQ$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC6601cgQ {
        public static final C0115e e = new C0115e(null);
        private final String b;
        private final C1333Xq c;
        private final C6672chi h;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C6672chi c6672chi, C9935zP c9935zP, C6585cgA c6585cgA, boolean z) {
            super(c9935zP, c6585cgA, z, null);
            C8632dsu.c((Object) c6672chi, "");
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) c6585cgA, "");
            this.h = c6672chi;
            this.b = "UpSellTrayPage1";
            this.c = C1333Xq.d(C6597cgM.d.i);
        }

        /* renamed from: o.cgQ$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0115e extends C1045Mp {
            public /* synthetic */ C0115e(C8627dsp c8627dsp) {
                this();
            }

            private C0115e() {
                super("UpSellTrayPage1");
            }
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            C6670chg h = this.h.h();
            if (h == null) {
                throw new IllegalArgumentException("former member should have a previous plan".toString());
            }
            C3761bJr c3761bJr = new C3761bJr();
            c3761bJr.b((CharSequence) "close");
            c3761bJr.b(new View.OnClickListener() { // from class: o.cgP
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC6601cgQ.e.d(AbstractC6601cgQ.e.this, view);
                }
            });
            interfaceC2023aX.add(c3761bJr);
            bJX bjx = new bJX();
            bjx.b((CharSequence) "emojis");
            bjx.a(Integer.valueOf(C6597cgM.b.b));
            interfaceC2023aX.add(bjx);
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
            c3814bLq.d(C6676chm.a.d);
            c3814bLq.d((CharSequence) C8168dfL.d(C6597cgM.d.e));
            interfaceC2023aX.add(c3814bLq);
            C1781aO c1781aO = new C1781aO();
            c1781aO.b("plan-card");
            c1781aO.e(C6597cgM.a.f);
            C1781aO c1781aO2 = new C1781aO();
            c1781aO2.b((CharSequence) "plan-list");
            c1781aO2.e(C6597cgM.a.j);
            C3814bLq c3814bLq2 = new C3814bLq();
            c3814bLq2.d(C6597cgM.a.i);
            c3814bLq2.b((CharSequence) "previous-title");
            c3814bLq2.d((CharSequence) C8168dfL.d(C6597cgM.d.j));
            c1781aO2.add(c3814bLq2);
            C6665chb c6665chb = new C6665chb();
            c6665chb.e((CharSequence) "previous-plan");
            C1333Xq d = this.c.d("name", h.a());
            String str = (String) AbstractC6601cgQ.b.get(h.b());
            c6665chb.c((CharSequence) d.d(SignupConstants.Field.PLAN_ID, str != null ? str : "").c());
            c6665chb.b((CharSequence) h.d());
            c6665chb.d((CharSequence) h.e());
            c1781aO2.add(c6665chb);
            c1781aO.add(c1781aO2);
            interfaceC2023aX.add(c1781aO);
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.e((CharSequence) "positive");
            c3805bLh.c(C6676chm.a.a);
            c3805bLh.b((CharSequence) C8168dfL.d(C6597cgM.d.b));
            c3805bLh.b(new View.OnClickListener() { // from class: o.cgN
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC6601cgQ.e.a(AbstractC6601cgQ.e.this, view);
                }
            });
            interfaceC2023aX.add(c3805bLh);
            bKU bku = new bKU();
            bku.d((CharSequence) "bottom-padding");
            bku.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
            interfaceC2023aX.add(bku);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(e eVar, View view) {
            C8632dsu.c((Object) eVar, "");
            eVar.a().b(AbstractC6589cgE.class, AbstractC6589cgE.a.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(e eVar, View view) {
            C8632dsu.c((Object) eVar, "");
            if (eVar.h.n()) {
                eVar.a().b(AbstractC6589cgE.class, new AbstractC6589cgE.e(null));
            } else {
                eVar.a().b(AbstractC6589cgE.class, new AbstractC6589cgE.e(new c(eVar.h, eVar.a(), eVar.d(), false, false, eVar.j(), 24, null)));
            }
        }

        @Override // o.AbstractC6677chn
        public boolean h() {
            a().b(AbstractC6589cgE.class, new AbstractC6589cgE.c(this));
            return true;
        }

        @Override // o.AbstractC6677chn
        public void f() {
            d().d();
        }
    }

    /* renamed from: o.cgQ$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC6601cgQ {
        public static final C0113c c = new C0113c(null);
        private final String b;
        private final C1333Xq e;
        private final C1333Xq f;
        private final boolean g;
        private final boolean h;
        private final C6672chi i;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.b;
        }

        public /* synthetic */ c(C6672chi c6672chi, C9935zP c9935zP, C6585cgA c6585cgA, boolean z, boolean z2, boolean z3, int i, C8627dsp c8627dsp) {
            this(c6672chi, c9935zP, c6585cgA, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, z3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6672chi c6672chi, C9935zP c9935zP, C6585cgA c6585cgA, boolean z, boolean z2, boolean z3) {
            super(c9935zP, c6585cgA, z3, null);
            C8632dsu.c((Object) c6672chi, "");
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) c6585cgA, "");
            this.i = c6672chi;
            this.g = z;
            this.h = z2;
            this.b = "UpSellTrayPage2";
            this.f = C1333Xq.d(C6597cgM.d.i);
            this.e = C1333Xq.d(C6597cgM.d.f);
        }

        /* renamed from: o.cgQ$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0113c extends C1045Mp {
            public /* synthetic */ C0113c(C8627dsp c8627dsp) {
                this();
            }

            private C0113c() {
                super("UpSellTrayPage2");
            }
        }

        private final boolean l() {
            StringField g;
            return (!this.i.o() || ((g = this.i.g()) != null && g.isValid())) && this.i.b() && this.i.e().hasAcceptedRequiredCheckboxes();
        }

        private final String k() {
            if (this.i.m().getRequiresPaidTextInRestartCta()) {
                String d = C8168dfL.d(C6597cgM.d.h);
                C8632dsu.d((Object) d);
                return d;
            }
            String d2 = C8168dfL.d(C6597cgM.d.g);
            C8632dsu.d((Object) d2);
            return d2;
        }

        @Override // o.bJF
        /* renamed from: c */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            C6670chg h = this.i.h();
            if (h == null) {
                throw new IllegalArgumentException("former member should have a previous plan".toString());
            }
            C3761bJr c3761bJr = new C3761bJr();
            c3761bJr.b((CharSequence) "close");
            c3761bJr.b(new View.OnClickListener() { // from class: o.cgR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC6601cgQ.c.f(AbstractC6601cgQ.c.this, view);
                }
            });
            interfaceC2023aX.add(c3761bJr);
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
            c3814bLq.d(C6676chm.a.d);
            c3814bLq.d((CharSequence) C8168dfL.d(C6597cgM.d.d));
            interfaceC2023aX.add(c3814bLq);
            C1781aO c1781aO = new C1781aO();
            c1781aO.b("payment-card");
            c1781aO.e(C6597cgM.a.f);
            C1781aO c1781aO2 = new C1781aO();
            c1781aO2.b((CharSequence) "payment-container");
            c1781aO2.e(C6597cgM.a.j);
            C6665chb c6665chb = new C6665chb();
            c6665chb.e((CharSequence) "previous-plan-price");
            C1333Xq d = this.f.d("name", h.a());
            String str = (String) AbstractC6601cgQ.b.get(h.b());
            c6665chb.c((CharSequence) d.d(SignupConstants.Field.PLAN_ID, str != null ? str : "").c());
            c6665chb.b((CharSequence) h.d());
            c1781aO2.add(c6665chb);
            bKR bkr = new bKR();
            bkr.d((CharSequence) "payment-separator");
            c1781aO2.add(bkr);
            C6608cgX c6608cgX = new C6608cgX();
            c6608cgX.e((CharSequence) "payment");
            c6608cgX.b((CharSequence) this.i.i());
            c6608cgX.c((CharSequence) this.i.l());
            c6608cgX.e(this.g);
            c6608cgX.d(this.i.o());
            c6608cgX.e(this.i.d());
            c6608cgX.c(new View.OnClickListener() { // from class: o.cgU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC6601cgQ.c.a(AbstractC6601cgQ.c.this, view);
                }
            });
            c1781aO2.add(c6608cgX);
            if (this.i.o()) {
                bKU bku = new bKU();
                bku.d((CharSequence) "bottom-padding");
                bku.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
                c1781aO2.add(bku);
            }
            c1781aO.add(c1781aO2);
            interfaceC2023aX.add(c1781aO);
            this.i.m().setCtaText(k());
            C6668che c6668che = new C6668che();
            c6668che.c((CharSequence) "tou-view");
            c6668che.c(this.i.m());
            c6668che.d(this.g);
            interfaceC2023aX.add(c6668che);
            if (this.i.e().getShowKoreaCheckBoxes()) {
                C6610cgZ c6610cgZ = new C6610cgZ();
                c6610cgZ.d((CharSequence) "korea-checkboxes");
                c6610cgZ.a(this.i.e());
                c6610cgZ.e(this.g);
                interfaceC2023aX.add(c6610cgZ);
            }
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.e((CharSequence) "positive");
            c3805bLh.c(C6676chm.a.a);
            c3805bLh.b((CharSequence) k());
            if (this.h) {
                c3805bLh.d(false);
            } else {
                c3805bLh.b(new View.OnClickListener() { // from class: o.cgT
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbstractC6601cgQ.c.e(AbstractC6601cgQ.c.this, view);
                    }
                });
            }
            interfaceC2023aX.add(c3805bLh);
            bKU bku2 = new bKU();
            bku2.d((CharSequence) "bottom-padding");
            bku2.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.f13911o)));
            interfaceC2023aX.add(bku2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(c cVar, View view) {
            C8632dsu.c((Object) cVar, "");
            cVar.a().b(AbstractC6589cgE.class, AbstractC6589cgE.a.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(c cVar, View view) {
            C8632dsu.c((Object) cVar, "");
            cVar.a().b(AbstractC6589cgE.class, AbstractC6589cgE.b.e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(c cVar, View view) {
            C8632dsu.c((Object) cVar, "");
            if (cVar.l()) {
                cVar.a().b(AbstractC6589cgE.class, AbstractC6589cgE.g.e);
            } else {
                cVar.a().b(AbstractC6589cgE.class, new AbstractC6589cgE.e(new c(cVar.i, cVar.a(), cVar.d(), true, false, cVar.j(), 16, null)));
            }
        }

        @Override // o.AbstractC6677chn
        public boolean h() {
            a().b(AbstractC6589cgE.class, new AbstractC6589cgE.c(this));
            return true;
        }

        @Override // o.AbstractC6677chn
        public void f() {
            d().e();
        }
    }
}
