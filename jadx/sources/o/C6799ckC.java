package o;

import android.content.Context;
import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.cl.model.event.discrete.Submitted;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Map;
import o.AbstractC6828ckf;
import o.C1026Lt;
import o.C1208Sv;
import o.C6799ckC;
import o.C6832ckj;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

/* renamed from: o.ckC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6799ckC extends AbstractC6833ckk {
    public static final c c = new c(null);
    private final String a;
    private final AppView b;
    private final C9935zP e;
    private final String f;
    private final C6803ckG h;
    private final TrackingInfo i;

    @Override // o.AbstractC6833ckk
    public AppView b() {
        return this.b;
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.a;
    }

    @Override // o.AbstractC6833ckk
    public TrackingInfo d() {
        return this.i;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.f;
    }

    @Override // o.AbstractC6677chn
    public boolean o() {
        return true;
    }

    /* renamed from: o.ckC$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    public C6799ckC(C6803ckG c6803ckG, C9935zP c9935zP) {
        TrackingInfo trackingInfo;
        Map b2;
        C8632dsu.c((Object) c6803ckG, "");
        C8632dsu.c((Object) c9935zP, "");
        this.h = c6803ckG;
        this.e = c9935zP;
        this.b = AppView.mhuVerifyFactor;
        String b3 = c6803ckG.b();
        if (b3 != null) {
            b2 = dqD.b(dpD.a(UmaAlert.ICON_ERROR, b3));
            trackingInfo = CLv2Utils.a(b2);
        } else {
            trackingInfo = null;
        }
        this.i = trackingInfo;
        this.f = "Multihousehold.General.Modal";
        this.a = "CodeEntry.Screen";
    }

    @Override // o.AbstractC6677chn
    public boolean h() {
        this.e.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryScreen$handleBackPressed$1
            {
                super(1);
            }

            public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
                C8632dsu.c((Object) networkRequestResponseListener, "");
                C6799ckC.this.h.c(networkRequestResponseListener);
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
    public static final void f(final C6799ckC c6799ckC, View view) {
        C8632dsu.c((Object) c6799ckC, "");
        c6799ckC.e.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryScreen$models$1$1$1
            {
                super(1);
            }

            public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
                C8632dsu.c((Object) networkRequestResponseListener, "");
                C6799ckC.this.h.c(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                a(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    /* renamed from: o.ckC$b */
    /* loaded from: classes6.dex */
    public static final class b implements C1208Sv.d {
        private String c = "";

        public final String d() {
            return this.c;
        }

        b() {
        }

        @Override // o.C1208Sv.d
        public void b(final String str) {
            C8632dsu.c((Object) str, "");
            this.c = str;
            if (C6799ckC.this.h.b(str)) {
                Logger.INSTANCE.logEvent(new Submitted(C6799ckC.this.b(), null, CommandValue.ForwardCommand, null));
            }
            C9935zP c9935zP = C6799ckC.this.e;
            final C6799ckC c6799ckC = C6799ckC.this;
            c9935zP.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryScreen$models$8$1$1$onPinChange$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                    d(networkRequestResponseListener);
                    return dpR.c;
                }

                public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
                    C8632dsu.c((Object) networkRequestResponseListener, "");
                    C6799ckC.this.h.c(str, networkRequestResponseListener);
                }
            }));
        }

        @Override // o.C1208Sv.d
        public void e() {
            Logger.INSTANCE.logEvent(new Submitted(C6799ckC.this.b(), null, CommandValue.ForwardCommand, null));
            C9935zP c9935zP = C6799ckC.this.e;
            final C6799ckC c6799ckC = C6799ckC.this;
            c9935zP.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryScreen$models$8$1$1$onSubmitPin$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                    e(networkRequestResponseListener);
                    return dpR.c;
                }

                public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
                    C8632dsu.c((Object) networkRequestResponseListener, "");
                    C6799ckC.this.h.c(this.d(), networkRequestResponseListener);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final C6799ckC c6799ckC, View view) {
        C8632dsu.c((Object) c6799ckC, "");
        Logger.INSTANCE.logEvent(new Submitted(c6799ckC.b(), null, CommandValue.ResendCommand, null));
        c6799ckC.e.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryScreen$models$10$1$1
            {
                super(1);
            }

            public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
                C8632dsu.c((Object) networkRequestResponseListener, "");
                C6799ckC.this.h.b(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                d(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final C6799ckC c6799ckC, View view) {
        C8632dsu.c((Object) c6799ckC, "");
        Logger.INSTANCE.logEvent(new Selected(c6799ckC.b(), null, CommandValue.TryAnotherWayCommand, null));
        c6799ckC.e.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.codeentry.CodeEntryScreen$models$11$1$1
            {
                super(1);
            }

            public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
                C8632dsu.c((Object) networkRequestResponseListener, "");
                C6799ckC.this.h.c(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                e(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    @Override // o.bJF
    /* renamed from: e */
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        C3771bKa c3771bKa = new C3771bKa();
        c3771bKa.e((CharSequence) "back");
        c3771bKa.c(Integer.valueOf(C1026Lt.a.aV));
        c3771bKa.b(new View.OnClickListener() { // from class: o.ckz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6799ckC.f(C6799ckC.this, view);
            }
        });
        c3771bKa.d(C6832ckj.b.a);
        c3771bKa.d(!this.h.h());
        interfaceC2023aX.add(c3771bKa);
        bJX bjx = new bJX();
        bjx.b((CharSequence) "logo");
        bjx.a(Integer.valueOf(this.h.c()));
        interfaceC2023aX.add(bjx);
        bKU bku = new bKU();
        bku.d((CharSequence) "0spacer-1");
        bku.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.f13911o)));
        interfaceC2023aX.add(bku);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) this.h.g());
        c3814bLq.d(C6832ckj.b.e);
        interfaceC2023aX.add(c3814bLq);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "0spacer-2");
        bku2.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.x)));
        interfaceC2023aX.add(bku2);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "body");
        c3814bLq2.d(this.h.d());
        c3814bLq2.d(C6832ckj.b.m);
        interfaceC2023aX.add(c3814bLq2);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "0spacer-3");
        bku3.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.v)));
        interfaceC2023aX.add(bku3);
        String a = this.h.a();
        if (a != null) {
            C3791bKu c3791bKu = new C3791bKu();
            c3791bKu.d((CharSequence) a);
            c3791bKu.e(C6832ckj.b.j);
            c3791bKu.c((C1208Sv.d) new b());
            interfaceC2023aX.add(c3791bKu);
        }
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-ctas");
        interfaceC2023aX.add(bjk);
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "email-cta");
        c3805bLh.b((CharSequence) this.h.e());
        c3805bLh.c(C6832ckj.b.i);
        c3805bLh.b(new View.OnClickListener() { // from class: o.ckD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6799ckC.c(C6799ckC.this, view);
            }
        });
        c3805bLh.d(!this.h.h());
        interfaceC2023aX.add(c3805bLh);
        C3805bLh c3805bLh2 = new C3805bLh();
        c3805bLh2.e((CharSequence) "try-another-way-cta");
        c3805bLh2.b((CharSequence) this.h.f());
        c3805bLh2.c(C6832ckj.b.i);
        c3805bLh2.b(new View.OnClickListener() { // from class: o.ckB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6799ckC.a(C6799ckC.this, view);
            }
        });
        c3805bLh2.d(!this.h.h());
        interfaceC2023aX.add(c3805bLh2);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "0spacer-8");
        bku4.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.ak)));
        interfaceC2023aX.add(bku4);
        C3814bLq c3814bLq3 = new C3814bLq();
        c3814bLq3.b((CharSequence) "sharing-link");
        c3814bLq3.d((CharSequence) this.h.j());
        c3814bLq3.d(C6832ckj.b.b);
        c3814bLq3.b(true);
        interfaceC2023aX.add(c3814bLq3);
        bKU bku5 = new bKU();
        bku5.d((CharSequence) "0spacer-9");
        bku5.a(Integer.valueOf((int) context.getResources().getDimension(C6832ckj.d.e)));
        interfaceC2023aX.add(bku5);
    }
}
