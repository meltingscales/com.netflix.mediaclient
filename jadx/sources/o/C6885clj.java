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
import o.C6885clj;
import o.C6891clp;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

/* renamed from: o.clj  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6885clj extends AbstractC6833ckk {
    public static final b e = new b(null);
    private final String a;
    private final AppView b;
    private final C9935zP c;
    private final C6891clp g;
    private final String h;

    @Override // o.AbstractC6833ckk
    public AppView b() {
        return this.b;
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.a;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.h;
    }

    @Override // o.AbstractC6677chn
    public boolean o() {
        return true;
    }

    public C6885clj(C6891clp c6891clp, C9935zP c9935zP) {
        C8632dsu.c((Object) c6891clp, "");
        C8632dsu.c((Object) c9935zP, "");
        this.g = c6891clp;
        this.c = c9935zP;
        this.b = AppView.mhuUpdateHouseholdContext;
        this.h = "Multihousehold.General.Modal";
        this.a = "UpdatePrimaryHome.Screen";
    }

    /* renamed from: o.clj$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }
    }

    @Override // o.AbstractC6677chn
    public boolean h() {
        this.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.update.UpdatePrimaryHomeScreen$handleBackPressed$1
            {
                super(1);
            }

            public final void c(NetworkRequestResponseListener networkRequestResponseListener) {
                C6891clp c6891clp;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6891clp = C6885clj.this.g;
                c6891clp.e(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                c(networkRequestResponseListener);
                return dpR.c;
            }
        }));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final C6885clj c6885clj, View view) {
        C8632dsu.c((Object) c6885clj, "");
        c6885clj.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.update.UpdatePrimaryHomeScreen$models$1$1$1
            {
                super(1);
            }

            public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
                C6891clp c6891clp;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6891clp = C6885clj.this.g;
                c6891clp.e(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                a(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final C6885clj c6885clj, View view) {
        C8632dsu.c((Object) c6885clj, "");
        Logger.INSTANCE.logEvent(new Selected(c6885clj.b(), null, CommandValue.ForwardCommand, null));
        c6885clj.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.update.UpdatePrimaryHomeScreen$models$8$1$1
            {
                super(1);
            }

            public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
                C6891clp c6891clp;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6891clp = C6885clj.this.g;
                c6891clp.a(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                d(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final C6885clj c6885clj, View view) {
        C8632dsu.c((Object) c6885clj, "");
        Logger.INSTANCE.logEvent(new Selected(c6885clj.b(), null, CommandValue.VerifyTravelCommand, null));
        c6885clj.c.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.update.UpdatePrimaryHomeScreen$models$9$1$1
            {
                super(1);
            }

            public final void b(NetworkRequestResponseListener networkRequestResponseListener) {
                C6891clp c6891clp;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6891clp = C6885clj.this.g;
                c6891clp.d(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                b(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    @Override // o.bJF
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        C3771bKa c3771bKa = new C3771bKa();
        c3771bKa.e((CharSequence) "back");
        c3771bKa.c(Integer.valueOf(C1026Lt.a.aT));
        c3771bKa.b(new View.OnClickListener() { // from class: o.cli
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6885clj.e(C6885clj.this, view);
            }
        });
        c3771bKa.d(C6832ckj.b.a);
        c3771bKa.d(!this.g.e());
        interfaceC2023aX.add(c3771bKa);
        bJX bjx = new bJX();
        bjx.b((CharSequence) "logo");
        bjx.a(Integer.valueOf(C6832ckj.c.e));
        interfaceC2023aX.add(bjx);
        bKU bku = new bKU();
        bku.d((CharSequence) "0spacer-1");
        bku.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.f13911o)));
        interfaceC2023aX.add(bku);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) this.g.d());
        c3814bLq.d(C6832ckj.b.e);
        interfaceC2023aX.add(c3814bLq);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "0spacer-2");
        bku2.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.x)));
        interfaceC2023aX.add(bku2);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "body");
        c3814bLq2.d((CharSequence) this.g.c());
        c3814bLq2.d(C6832ckj.b.m);
        interfaceC2023aX.add(c3814bLq2);
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-ctas");
        interfaceC2023aX.add(bjk);
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "instructions-cta");
        c3805bLh.b((CharSequence) this.g.a());
        c3805bLh.c(C6832ckj.b.i);
        c3805bLh.b(new View.OnClickListener() { // from class: o.cll
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6885clj.h(C6885clj.this, view);
            }
        });
        c3805bLh.d(!this.g.e());
        interfaceC2023aX.add(c3805bLh);
        C3805bLh c3805bLh2 = new C3805bLh();
        c3805bLh2.e((CharSequence) "update-household-cta");
        c3805bLh2.b((CharSequence) this.g.b());
        c3805bLh2.c(C6832ckj.b.i);
        c3805bLh2.b(new View.OnClickListener() { // from class: o.clq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6885clj.c(C6885clj.this, view);
            }
        });
        c3805bLh2.d(!this.g.e());
        interfaceC2023aX.add(c3805bLh2);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "0spacer-8");
        bku3.a(Integer.valueOf((int) context.getResources().getDimension(C6832ckj.d.e)));
        interfaceC2023aX.add(bku3);
    }
}
