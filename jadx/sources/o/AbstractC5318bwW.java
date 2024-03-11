package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Cfour;
import o.AbstractC5316bwU;
import o.AbstractC5318bwW;
import o.C1026Lt;
import o.C3796bKz;
import o.C5319bwX;
import o.C6676chm;
import o.C9834xU;
import o.C9935zP;
import o.dpR;

/* renamed from: o.bwW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5318bwW extends AbstractC6677chn {
    public static final e c = new e(null);
    private final C5311bwP a;
    private final C9935zP b;

    public /* synthetic */ AbstractC5318bwW(C9935zP c9935zP, C5311bwP c5311bwP, C8627dsp c8627dsp) {
        this(c9935zP, c5311bwP);
    }

    public final C9935zP a() {
        return this.b;
    }

    private AbstractC5318bwW(C9935zP c9935zP, C5311bwP c5311bwP) {
        this.b = c9935zP;
        this.a = c5311bwP;
    }

    /* renamed from: o.bwW$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    /* renamed from: o.bwW$b */
    /* loaded from: classes4.dex */
    public static final class b extends c {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(java.lang.String r10, o.C9935zP r11, o.C5311bwP r12) {
            /*
                r9 = this;
                java.lang.String r0 = ""
                o.C8632dsu.c(r10, r0)
                o.C8632dsu.c(r11, r0)
                o.C8632dsu.c(r12, r0)
                int r3 = o.C5319bwX.d.d
                int r1 = o.C5319bwX.b.m
                java.lang.String r4 = o.C8168dfL.d(r1)
                o.C8632dsu.a(r4, r0)
                int r1 = o.C5319bwX.b.l
                java.lang.String r5 = o.C8168dfL.d(r1)
                o.C8632dsu.a(r5, r0)
                java.lang.String r8 = "Cfour.ChangePlanScreen.Content.Modal"
                r1 = r9
                r2 = r10
                r6 = r11
                r7 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.AbstractC5318bwW.b.<init>(java.lang.String, o.zP, o.bwP):void");
        }
    }

    /* renamed from: o.bwW$c */
    /* loaded from: classes4.dex */
    public static abstract class c extends AbstractC5318bwW {
        private final int a;
        private final String b;
        private final String e;
        private final String f;
        private final String h;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, int i, String str2, String str3, C9935zP c9935zP, C5311bwP c5311bwP, String str4) {
            super(c9935zP, c5311bwP, null);
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) str2, "");
            C8632dsu.c((Object) str3, "");
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) c5311bwP, "");
            C8632dsu.c((Object) str4, "");
            this.b = str;
            this.a = i;
            this.f = str2;
            this.h = str3;
            this.e = str4;
        }

        @Override // o.AbstractC6677chn
        public boolean b(Context context) {
            C8632dsu.c((Object) context, "");
            return C8153dex.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(c cVar, View view) {
            C8632dsu.c((Object) cVar, "");
            cVar.a().b(AbstractC5316bwU.class, new AbstractC5316bwU.d(cVar.g()));
        }

        @Override // o.bJF
        /* renamed from: a */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            C3771bKa c3771bKa = new C3771bKa();
            c3771bKa.d(C5319bwX.a.c);
            c3771bKa.c(Integer.valueOf(C1026Lt.a.RC));
            c3771bKa.e((CharSequence) "close");
            c3771bKa.b(new View.OnClickListener() { // from class: o.bwV
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC5318bwW.c.a(AbstractC5318bwW.c.this, view);
                }
            });
            interfaceC2023aX.add(c3771bKa);
            bJX bjx = new bJX();
            bjx.b((CharSequence) "logo");
            bjx.d(C5319bwX.a.f);
            bjx.a(Integer.valueOf(this.a));
            interfaceC2023aX.add(bjx);
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
            c3814bLq.d((CharSequence) this.f);
            c3814bLq.d(C5319bwX.a.e);
            interfaceC2023aX.add(c3814bLq);
            bKU bku = new bKU();
            bku.d((CharSequence) "0spacer-1");
            bku.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.ak)));
            interfaceC2023aX.add(bku);
            C3814bLq c3814bLq2 = new C3814bLq();
            c3814bLq2.b((CharSequence) "subtitle");
            c3814bLq2.d((CharSequence) this.h);
            c3814bLq2.d(C6676chm.a.c);
            interfaceC2023aX.add(c3814bLq2);
            bKU bku2 = new bKU();
            bku2.d((CharSequence) "0spacer-2");
            bku2.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.v)));
            interfaceC2023aX.add(bku2);
            C3814bLq c3814bLq3 = new C3814bLq();
            c3814bLq3.b((CharSequence) "learn-more");
            c3814bLq3.d((CharSequence) C8168dfL.d(C5319bwX.b.i));
            c3814bLq3.d(C5319bwX.a.g);
            interfaceC2023aX.add(c3814bLq3);
            bKU bku3 = new bKU();
            bku3.d((CharSequence) "0spacer-3");
            bku3.a(Integer.valueOf(context.getResources().getDimensionPixelSize(C9834xU.a.aa)));
            interfaceC2023aX.add(bku3);
            if (Config_FastProperty_Cfour.Companion.a()) {
                C3814bLq c3814bLq4 = new C3814bLq();
                c3814bLq4.b((CharSequence) "link");
                c3814bLq4.d((CharSequence) "netflix.com/ChangePlan");
                c3814bLq4.d(C5319bwX.a.i);
                interfaceC2023aX.add(c3814bLq4);
            } else {
                C3764bJu c3764bJu = new C3764bJu();
                c3764bJu.c((CharSequence) "copy-link");
                c3764bJu.e(C3796bKz.g.h);
                c3764bJu.b((CharSequence) "netflix.com/ChangePlan");
                c3764bJu.d((CharSequence) this.b);
                c3764bJu.e((CharSequence) C8168dfL.d(C9834xU.h.h));
                c3764bJu.b((drX<? super View, ? super CharSequence, dpR>) new drX<View, CharSequence, dpR>() { // from class: com.netflix.mediaclient.ui.adsplan.impl.messaging.AdsPlanScreen$UpSell$models$10$1
                    {
                        super(2);
                    }

                    @Override // o.drX
                    public /* synthetic */ dpR invoke(View view, CharSequence charSequence) {
                        c(view, charSequence);
                        return dpR.c;
                    }

                    public final void c(View view, CharSequence charSequence) {
                        String str;
                        C9935zP a = AbstractC5318bwW.c.this.a();
                        str = AbstractC5318bwW.c.this.b;
                        a.b(AbstractC5316bwU.class, new AbstractC5316bwU.a(str, AbstractC5318bwW.c.this.g()));
                    }
                });
                interfaceC2023aX.add(c3764bJu);
            }
            bKU bku4 = new bKU();
            bku4.d((CharSequence) "0spacer-4");
            C1332Xp c1332Xp = C1332Xp.b;
            bku4.a(Integer.valueOf((int) TypedValue.applyDimension(1, 40, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku4);
        }
    }

    /* renamed from: o.bwW$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC5318bwW {
        private final String a;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.a;
        }

        @Override // o.AbstractC6677chn
        public boolean e() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9935zP c9935zP, C5311bwP c5311bwP) {
            super(c9935zP, c5311bwP, null);
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) c5311bwP, "");
            this.a = "Cfour.ChangePlanScreen.SwitchedIntoCfourPlan.Modal";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(d dVar, View view) {
            C8632dsu.c((Object) dVar, "");
            dVar.a().b(AbstractC5316bwU.class, new AbstractC5316bwU.e(dVar.g()));
        }

        @Override // o.bJF
        /* renamed from: b */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            bKU bku = new bKU();
            bku.d((CharSequence) "0spacer-0");
            C1332Xp c1332Xp = C1332Xp.b;
            bku.a(Integer.valueOf((int) TypedValue.applyDimension(1, 16, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku);
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
            c3814bLq.d((CharSequence) C8168dfL.d(C5319bwX.b.g));
            c3814bLq.d(C5319bwX.a.b);
            interfaceC2023aX.add(c3814bLq);
            bKU bku2 = new bKU();
            bku2.d((CharSequence) "0spacer-1");
            float f = 8;
            bku2.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku2);
            C3814bLq c3814bLq2 = new C3814bLq();
            c3814bLq2.b((CharSequence) "subtitle");
            c3814bLq2.d((CharSequence) C8168dfL.d(C5319bwX.b.d));
            c3814bLq2.d(C6676chm.a.c);
            interfaceC2023aX.add(c3814bLq2);
            bKU bku3 = new bKU();
            bku3.d((CharSequence) "0spacer-2");
            bku3.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku3);
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.e((CharSequence) "positive");
            c3805bLh.c(C5319bwX.a.a);
            c3805bLh.b((CharSequence) C8168dfL.d(com.netflix.mediaclient.ui.R.o.f13253fi));
            c3805bLh.b(new View.OnClickListener() { // from class: o.bwT
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractC5318bwW.d.c(AbstractC5318bwW.d.this, view);
                }
            });
            interfaceC2023aX.add(c3805bLh);
            bKU bku4 = new bKU();
            bku4.d((CharSequence) "0spacer-3");
            bku4.a(Integer.valueOf((int) TypedValue.applyDimension(1, 12, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku4);
        }
    }

    /* renamed from: o.bwW$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC5318bwW {
        private final String a;
        private final String b;

        @Override // o.AbstractC6677chn
        public String c() {
            return this.b;
        }

        @Override // o.AbstractC6677chn
        public boolean e() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9935zP c9935zP, C5311bwP c5311bwP, String str) {
            super(c9935zP, c5311bwP, null);
            C8632dsu.c((Object) c9935zP, "");
            C8632dsu.c((Object) c5311bwP, "");
            C8632dsu.c((Object) str, "");
            this.a = str;
            this.b = "Cfour.ChangePlanScreen.SwitchedOutOfCfourPlan.Modal";
        }

        @Override // o.bJF
        /* renamed from: b */
        public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) dpr, "");
            bKU bku = new bKU();
            bku.d((CharSequence) "0spacer-1");
            C1332Xp c1332Xp = C1332Xp.b;
            bku.a(Integer.valueOf((int) TypedValue.applyDimension(1, 36, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku);
            C3774bKd c3774bKd = new C3774bKd();
            c3774bKd.c((CharSequence) "loading_spinner");
            c3774bKd.d(C5319bwX.a.j);
            interfaceC2023aX.add(c3774bKd);
            bKU bku2 = new bKU();
            bku2.d((CharSequence) "0spacer-2");
            float f = 8;
            bku2.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku2);
            C3814bLq c3814bLq = new C3814bLq();
            c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
            c3814bLq.d((CharSequence) "");
            c3814bLq.d((CharSequence) C8168dfL.d(C5319bwX.b.h));
            c3814bLq.d(C5319bwX.a.e);
            interfaceC2023aX.add(c3814bLq);
            bKU bku3 = new bKU();
            bku3.d((CharSequence) "0spacer-3");
            bku3.a(Integer.valueOf((int) TypedValue.applyDimension(1, f, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku3);
            C3814bLq c3814bLq2 = new C3814bLq();
            c3814bLq2.b((CharSequence) "subtitle");
            c3814bLq2.d((CharSequence) this.a);
            c3814bLq2.d(C6676chm.a.c);
            interfaceC2023aX.add(c3814bLq2);
            bKU bku4 = new bKU();
            bku4.d((CharSequence) "0spacer-4");
            bku4.a(Integer.valueOf((int) TypedValue.applyDimension(1, 48, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            interfaceC2023aX.add(bku4);
        }
    }
}
