package o;

import android.content.Context;
import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC6828ckf;
import o.C1026Lt;
import o.C6812ckP;
import o.C6817ckU;
import o.C6832ckj;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

/* renamed from: o.ckP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6812ckP extends AbstractC6833ckk {
    public static final c a = new c(null);
    private final AppView b;
    private final C9935zP c;
    private final String e;
    private final C6817ckU g;
    private final TrackingInfo h;
    private final String i;

    @Override // o.AbstractC6833ckk
    public AppView b() {
        return this.b;
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.e;
    }

    @Override // o.AbstractC6833ckk
    public TrackingInfo d() {
        return this.h;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.i;
    }

    @Override // o.AbstractC6677chn
    public boolean o() {
        return true;
    }

    /* renamed from: o.ckP$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public C6812ckP(C6817ckU c6817ckU, C9935zP c9935zP) {
        C8632dsu.c((Object) c6817ckU, "");
        C8632dsu.c((Object) c9935zP, "");
        this.g = c6817ckU;
        this.c = c9935zP;
        this.b = c6817ckU.c();
        this.h = c6817ckU.j();
        this.i = "Multihousehold.General.Modal";
        this.e = "ManagePrimaryHomeScreen.Screen";
    }

    @Override // o.AbstractC6677chn
    public boolean h() {
        this.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.manage.ManagePrimaryHomeScreen$handleBackPressed$1
            {
                super(1);
            }

            public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
                C6817ckU c6817ckU;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6817ckU = C6812ckP.this.g;
                c6817ckU.e(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                a(networkRequestResponseListener);
                return dpR.c;
            }
        }));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final C6812ckP c6812ckP, View view) {
        C8632dsu.c((Object) c6812ckP, "");
        c6812ckP.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.manage.ManagePrimaryHomeScreen$models$1$1$1
            {
                super(1);
            }

            public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
                C6817ckU c6817ckU;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6817ckU = C6812ckP.this.g;
                c6817ckU.e(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                e(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final C6812ckP c6812ckP, View view) {
        C8632dsu.c((Object) c6812ckP, "");
        c6812ckP.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.manage.ManagePrimaryHomeScreen$models$11$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                d(networkRequestResponseListener);
                return dpR.c;
            }

            public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
                C6817ckU c6817ckU;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6817ckU = C6812ckP.this.g;
                c6817ckU.e(networkRequestResponseListener);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final C6812ckP c6812ckP, View view) {
        C8632dsu.c((Object) c6812ckP, "");
        Logger.INSTANCE.logEvent(new Selected(c6812ckP.b(), null, CommandValue.UpdateHouseholdCommand, null));
        c6812ckP.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.manage.ManagePrimaryHomeScreen$models$12$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                c(networkRequestResponseListener);
                return dpR.c;
            }

            public final void c(NetworkRequestResponseListener networkRequestResponseListener) {
                C6817ckU c6817ckU;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6817ckU = C6812ckP.this.g;
                c6817ckU.c(networkRequestResponseListener);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final C6812ckP c6812ckP, View view) {
        C8632dsu.c((Object) c6812ckP, "");
        c6812ckP.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.manage.ManagePrimaryHomeScreen$models$13$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                d(networkRequestResponseListener);
                return dpR.c;
            }

            public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
                C6817ckU c6817ckU;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6817ckU = C6812ckP.this.g;
                c6817ckU.a(networkRequestResponseListener);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C6812ckP c6812ckP, View view) {
        C8632dsu.c((Object) c6812ckP, "");
        Logger.INSTANCE.logEvent(new Selected(c6812ckP.b(), null, CommandValue.SignOutCommand, null));
        c6812ckP.c.b(AbstractC6828ckf.class, AbstractC6828ckf.b.c);
    }

    @Override // o.bJF
    /* renamed from: a */
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        float dimension;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        C3761bJr c3761bJr = new C3761bJr();
        c3761bJr.b((CharSequence) "close");
        c3761bJr.e(Integer.valueOf(C1026Lt.a.RF));
        c3761bJr.b(new View.OnClickListener() { // from class: o.ckQ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6812ckP.h(C6812ckP.this, view);
            }
        });
        interfaceC2023aX.add(c3761bJr);
        bJX bjx = new bJX();
        bjx.b((CharSequence) "logo");
        bjx.a(Integer.valueOf(C6832ckj.c.e));
        interfaceC2023aX.add(bjx);
        bKU bku = new bKU();
        bku.d((CharSequence) "0spacer-1");
        if (C8150deu.h()) {
            dimension = context.getResources().getDimension(C9834xU.a.aa);
        } else {
            dimension = context.getResources().getDimension(C9834xU.a.f13911o);
        }
        bku.a(Integer.valueOf((int) dimension));
        interfaceC2023aX.add(bku);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) this.g.f());
        c3814bLq.d(C6832ckj.b.e);
        interfaceC2023aX.add(c3814bLq);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "0spacer-2");
        bku2.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.x)));
        interfaceC2023aX.add(bku2);
        if (!this.g.a()) {
            C3814bLq c3814bLq2 = new C3814bLq();
            c3814bLq2.b((CharSequence) "body");
            c3814bLq2.d(this.g.b());
            c3814bLq2.d(C6832ckj.b.m);
            interfaceC2023aX.add(c3814bLq2);
            C6837cko c6837cko = new C6837cko();
            c6837cko.c((CharSequence) "profile-name");
            c6837cko.d(this.g.h().a());
            c6837cko.e(this.g.h().e());
            c6837cko.b(this.g.h().b());
            interfaceC2023aX.add(c6837cko);
            bKU bku3 = new bKU();
            bku3.d((CharSequence) "0spacer-4");
            bku3.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.x)));
            interfaceC2023aX.add(bku3);
            C3814bLq c3814bLq3 = new C3814bLq();
            c3814bLq3.b((CharSequence) "body-continued");
            c3814bLq3.d(this.g.e());
            c3814bLq3.d(C6832ckj.b.m);
            interfaceC2023aX.add(c3814bLq3);
        }
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-ctas");
        interfaceC2023aX.add(bjk);
        if (this.g.a()) {
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.e((CharSequence) "manage-household-cta");
            c3805bLh.b((CharSequence) this.g.d());
            c3805bLh.c(C6832ckj.b.i);
            c3805bLh.b(new View.OnClickListener() { // from class: o.ckS
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6812ckP.i(C6812ckP.this, view);
                }
            });
            c3805bLh.d(!this.g.m());
            interfaceC2023aX.add(c3805bLh);
        } else {
            C3805bLh c3805bLh2 = new C3805bLh();
            c3805bLh2.e((CharSequence) "manage-household-cta");
            c3805bLh2.b((CharSequence) this.g.n());
            c3805bLh2.c(C6832ckj.b.i);
            c3805bLh2.b(new View.OnClickListener() { // from class: o.ckW
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6812ckP.g(C6812ckP.this, view);
                }
            });
            c3805bLh2.d(!this.g.m());
            interfaceC2023aX.add(c3805bLh2);
        }
        if (this.g.g()) {
            C3805bLh c3805bLh3 = new C3805bLh();
            c3805bLh3.e((CharSequence) "troubleshoot-device-cta");
            c3805bLh3.b((CharSequence) this.g.o());
            c3805bLh3.c(C6832ckj.b.i);
            c3805bLh3.b(new View.OnClickListener() { // from class: o.ckX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6812ckP.j(C6812ckP.this, view);
                }
            });
            c3805bLh3.d(!this.g.m());
            interfaceC2023aX.add(c3805bLh3);
        }
        C3805bLh c3805bLh4 = new C3805bLh();
        c3805bLh4.e((CharSequence) "sign-out-cta");
        c3805bLh4.b((CharSequence) this.g.i());
        c3805bLh4.c(C6832ckj.b.h);
        c3805bLh4.b(new View.OnClickListener() { // from class: o.ckT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6812ckP.f(C6812ckP.this, view);
            }
        });
        c3805bLh4.d(!this.g.m());
        interfaceC2023aX.add(c3805bLh4);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "0spacer-8");
        bku4.a(Integer.valueOf((int) context.getResources().getDimension(C6832ckj.d.e)));
        interfaceC2023aX.add(bku4);
    }
}
