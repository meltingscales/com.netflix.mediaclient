package o;

import android.content.Context;
import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import o.AbstractC6828ckf;
import o.C1026Lt;
import o.C6832ckj;
import o.C6877clb;
import o.C6883clh;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

/* renamed from: o.clb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6877clb extends AbstractC6833ckk {
    public static final d c = new d(null);
    private final String a;
    private final C9935zP b;
    private final AppView e;
    private final String f;
    private final C6883clh g;

    @Override // o.AbstractC6833ckk
    public AppView b() {
        return this.e;
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.a;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.f;
    }

    public C6877clb(C6883clh c6883clh, C9935zP c9935zP) {
        C8632dsu.c((Object) c6883clh, "");
        C8632dsu.c((Object) c9935zP, "");
        this.g = c6883clh;
        this.b = c9935zP;
        this.e = AppView.misdetectionResolutionCaptureDeviceLanding;
        this.f = "Multihousehold.General.Modal";
        this.a = "UpdateInstructionsScreen.Screen";
    }

    /* renamed from: o.clb$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }

    @Override // o.AbstractC6677chn
    public boolean h() {
        this.b.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.misdetection.MisdetectionResolutionScreen$handleBackPressed$1
            {
                super(1);
            }

            public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
                C6883clh c6883clh;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6883clh = C6877clb.this.g;
                c6883clh.b(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                e(networkRequestResponseListener);
                return dpR.c;
            }
        }));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final C6877clb c6877clb, View view) {
        C8632dsu.c((Object) c6877clb, "");
        c6877clb.b.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.misdetection.MisdetectionResolutionScreen$models$1$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                e(networkRequestResponseListener);
                return dpR.c;
            }

            public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
                C6883clh c6883clh;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6883clh = C6877clb.this.g;
                c6883clh.b(networkRequestResponseListener);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C6877clb c6877clb, View view) {
        C8632dsu.c((Object) c6877clb, "");
        c6877clb.g.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C6877clb c6877clb, View view) {
        C8632dsu.c((Object) c6877clb, "");
        c6877clb.g.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final C6877clb c6877clb, View view) {
        C8632dsu.c((Object) c6877clb, "");
        c6877clb.b.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.misdetection.MisdetectionResolutionScreen$models$14$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                d(networkRequestResponseListener);
                return dpR.c;
            }

            public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
                C6883clh c6883clh;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6883clh = C6877clb.this.g;
                c6883clh.b(networkRequestResponseListener);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C6877clb c6877clb, View view) {
        C8632dsu.c((Object) c6877clb, "");
        Logger.INSTANCE.logEvent(new Selected(c6877clb.b(), null, CommandValue.SignOutCommand, null));
        c6877clb.b.b(AbstractC6828ckf.class, AbstractC6828ckf.b.c);
    }

    @Override // o.bJF
    /* renamed from: a */
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        C3761bJr c3761bJr = new C3761bJr();
        c3761bJr.b((CharSequence) "close");
        c3761bJr.e(Integer.valueOf(C1026Lt.a.RF));
        c3761bJr.b(new View.OnClickListener() { // from class: o.clc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6877clb.i(C6877clb.this, view);
            }
        });
        interfaceC2023aX.add(c3761bJr);
        bKU bku = new bKU();
        bku.d((CharSequence) "0spacer-0");
        bku.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.m)));
        interfaceC2023aX.add(bku);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) this.g.f());
        c3814bLq.d(C6832ckj.b.e);
        interfaceC2023aX.add(c3814bLq);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "0spacer-1");
        bku2.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.f13911o)));
        interfaceC2023aX.add(bku2);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "body");
        c3814bLq2.d((CharSequence) this.g.c());
        c3814bLq2.d(C6832ckj.b.m);
        interfaceC2023aX.add(c3814bLq2);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "0spacer-2");
        bku3.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.w)));
        interfaceC2023aX.add(bku3);
        C3814bLq c3814bLq3 = new C3814bLq();
        c3814bLq3.b((CharSequence) "instructions");
        c3814bLq3.d((CharSequence) this.g.a());
        c3814bLq3.d(C6832ckj.b.n);
        interfaceC2023aX.add(c3814bLq3);
        C3814bLq c3814bLq4 = new C3814bLq();
        c3814bLq4.b((CharSequence) "instructions");
        c3814bLq4.d((CharSequence) this.g.g());
        c3814bLq4.d(C6832ckj.b.n);
        interfaceC2023aX.add(c3814bLq4);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "0spacer-3");
        bku4.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.w)));
        interfaceC2023aX.add(bku4);
        C3814bLq c3814bLq5 = new C3814bLq();
        c3814bLq5.b((CharSequence) "helpTitle");
        c3814bLq5.d((CharSequence) this.g.d());
        c3814bLq5.d(C6832ckj.b.f13745o);
        interfaceC2023aX.add(c3814bLq5);
        C3814bLq c3814bLq6 = new C3814bLq();
        c3814bLq6.b((CharSequence) "helpLink");
        c3814bLq6.d((CharSequence) this.g.b());
        c3814bLq6.a(new View.OnClickListener() { // from class: o.cla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6877clb.j(C6877clb.this, view);
            }
        });
        c3814bLq6.d(C6832ckj.b.f13745o);
        interfaceC2023aX.add(c3814bLq6);
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-ctas");
        interfaceC2023aX.add(bjk);
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "troubleShootCta");
        c3805bLh.b((CharSequence) this.g.j());
        c3805bLh.c(C6832ckj.b.g);
        c3805bLh.b(new View.OnClickListener() { // from class: o.cld
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6877clb.f(C6877clb.this, view);
            }
        });
        c3805bLh.d(!this.g.i());
        interfaceC2023aX.add(c3805bLh);
        C3805bLh c3805bLh2 = new C3805bLh();
        c3805bLh2.e((CharSequence) "goBackCta");
        c3805bLh2.b((CharSequence) this.g.e());
        c3805bLh2.c(C6832ckj.b.i);
        c3805bLh2.b(new View.OnClickListener() { // from class: o.clg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6877clb.g(C6877clb.this, view);
            }
        });
        c3805bLh2.d(!this.g.i());
        interfaceC2023aX.add(c3805bLh2);
        C3805bLh c3805bLh3 = new C3805bLh();
        c3805bLh3.e((CharSequence) "signOutCta");
        c3805bLh3.b((CharSequence) this.g.h());
        c3805bLh3.c(C6832ckj.b.h);
        c3805bLh3.b(new View.OnClickListener() { // from class: o.cle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6877clb.h(C6877clb.this, view);
            }
        });
        c3805bLh3.d(!this.g.i());
        interfaceC2023aX.add(c3805bLh3);
        bKU bku5 = new bKU();
        bku5.d((CharSequence) "0spacer-3");
        bku5.a(Integer.valueOf((int) context.getResources().getDimension(C6832ckj.d.e)));
        interfaceC2023aX.add(bku5);
    }
}
