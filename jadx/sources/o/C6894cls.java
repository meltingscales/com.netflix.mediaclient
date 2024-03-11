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
import o.C6832ckj;
import o.C6851clB;
import o.C6894cls;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;
import org.json.JSONObject;

/* renamed from: o.cls  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6894cls extends AbstractC6833ckk {
    public static final c e = new c(null);
    private final C9935zP a;
    private final String b;
    private final AppView c;
    private final C6851clB f;
    private final String h;
    private final TrackingInfo i;

    @Override // o.AbstractC6833ckk
    public AppView b() {
        return this.c;
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.b;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.h;
    }

    @Override // o.AbstractC6677chn
    public boolean o() {
        return true;
    }

    public C6894cls(C6851clB c6851clB, C9935zP c9935zP, TrackingInfo trackingInfo) {
        C8632dsu.c((Object) c6851clB, "");
        C8632dsu.c((Object) c9935zP, "");
        this.f = c6851clB;
        this.a = c9935zP;
        this.i = trackingInfo;
        this.c = AppView.mhuVerifyTravel;
        this.h = "Multihousehold.General.Modal";
        this.b = "VerifyTravel.Screen";
    }

    /* renamed from: o.cls$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }
    }

    @Override // o.AbstractC6677chn
    public boolean h() {
        this.a.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.verifytravel.VerifyTravelScreen$handleBackPressed$1
            {
                super(1);
            }

            public final void b(NetworkRequestResponseListener networkRequestResponseListener) {
                C6851clB c6851clB;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6851clB = C6894cls.this.f;
                c6851clB.a(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                b(networkRequestResponseListener);
                return dpR.c;
            }
        }));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final C6894cls c6894cls, View view) {
        C8632dsu.c((Object) c6894cls, "");
        c6894cls.a.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.verifytravel.VerifyTravelScreen$models$1$1$1
            {
                super(1);
            }

            public final void e(NetworkRequestResponseListener networkRequestResponseListener) {
                C6851clB c6851clB;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6851clB = C6894cls.this.f;
                c6851clB.a(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                e(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final C6894cls c6894cls, View view) {
        TrackingInfo trackingInfo;
        JSONObject jSONObject;
        C8632dsu.c((Object) c6894cls, "");
        Logger logger = Logger.INSTANCE;
        AppView b = c6894cls.b();
        CommandValue commandValue = CommandValue.SendEmailCommand;
        TrackingInfo trackingInfo2 = c6894cls.i;
        if (trackingInfo2 == null || (jSONObject = trackingInfo2.toJSONObject()) == null) {
            trackingInfo = null;
        } else {
            jSONObject.put("dynecomSessionId", c6894cls.f.a());
            dpR dpr = dpR.c;
            trackingInfo = C1281Vq.d(jSONObject);
        }
        logger.logEvent(new Selected(b, null, commandValue, trackingInfo));
        c6894cls.a.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.verifytravel.VerifyTravelScreen$models$9$1$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                b(networkRequestResponseListener);
                return dpR.c;
            }

            public final void b(NetworkRequestResponseListener networkRequestResponseListener) {
                C6851clB c6851clB;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6851clB = C6894cls.this.f;
                c6851clB.e(networkRequestResponseListener);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final C6894cls c6894cls, View view) {
        TrackingInfo trackingInfo;
        JSONObject jSONObject;
        C8632dsu.c((Object) c6894cls, "");
        Logger logger = Logger.INSTANCE;
        AppView b = c6894cls.b();
        CommandValue commandValue = CommandValue.SendTextCommand;
        TrackingInfo trackingInfo2 = c6894cls.i;
        if (trackingInfo2 == null || (jSONObject = trackingInfo2.toJSONObject()) == null) {
            trackingInfo = null;
        } else {
            jSONObject.put("dynecomSessionId", c6894cls.f.a());
            dpR dpr = dpR.c;
            trackingInfo = C1281Vq.d(jSONObject);
        }
        logger.logEvent(new Selected(b, null, commandValue, trackingInfo));
        c6894cls.a.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.verifytravel.VerifyTravelScreen$models$10$1$2
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                c(networkRequestResponseListener);
                return dpR.c;
            }

            public final void c(NetworkRequestResponseListener networkRequestResponseListener) {
                C6851clB c6851clB;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6851clB = C6894cls.this.f;
                c6851clB.b(networkRequestResponseListener);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C6894cls c6894cls, View view) {
        C8632dsu.c((Object) c6894cls, "");
        Logger.INSTANCE.logEvent(new Selected(c6894cls.b(), null, CommandValue.SignOutCommand, null));
        c6894cls.a.b(AbstractC6828ckf.class, AbstractC6828ckf.b.c);
    }

    @Override // o.bJF
    /* renamed from: c */
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        C3761bJr c3761bJr = new C3761bJr();
        c3761bJr.b((CharSequence) "close");
        c3761bJr.e(Integer.valueOf(C1026Lt.a.RF));
        c3761bJr.b(new View.OnClickListener() { // from class: o.clu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6894cls.c(C6894cls.this, view);
            }
        });
        interfaceC2023aX.add(c3761bJr);
        bJX bjx = new bJX();
        bjx.b((CharSequence) "logo");
        bjx.a(Integer.valueOf(C6832ckj.c.b));
        interfaceC2023aX.add(bjx);
        bKU bku = new bKU();
        bku.d((CharSequence) "0spacer-1");
        bku.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.f13911o)));
        interfaceC2023aX.add(bku);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) this.f.i());
        c3814bLq.d(C6832ckj.b.e);
        interfaceC2023aX.add(c3814bLq);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "0spacer-2");
        bku2.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.x)));
        interfaceC2023aX.add(bku2);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "body");
        c3814bLq2.d(this.f.e());
        c3814bLq2.d(C6832ckj.b.m);
        interfaceC2023aX.add(c3814bLq2);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "0spacer-3");
        bku3.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.v)));
        interfaceC2023aX.add(bku3);
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-ctas");
        interfaceC2023aX.add(bjk);
        if (this.f.d()) {
            C3805bLh c3805bLh = new C3805bLh();
            c3805bLh.e((CharSequence) "email-cta");
            c3805bLh.b((CharSequence) this.f.b());
            c3805bLh.c(C6832ckj.b.i);
            c3805bLh.b(new View.OnClickListener() { // from class: o.clw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6894cls.f(C6894cls.this, view);
                }
            });
            c3805bLh.d(!this.f.h());
            interfaceC2023aX.add(c3805bLh);
        }
        if (this.f.c()) {
            C3805bLh c3805bLh2 = new C3805bLh();
            c3805bLh2.e((CharSequence) "text-cta");
            c3805bLh2.b((CharSequence) this.f.g());
            c3805bLh2.c(C6832ckj.b.i);
            c3805bLh2.b(new View.OnClickListener() { // from class: o.clv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6894cls.h(C6894cls.this, view);
                }
            });
            c3805bLh2.d(!this.f.h());
            interfaceC2023aX.add(c3805bLh2);
        }
        C3805bLh c3805bLh3 = new C3805bLh();
        c3805bLh3.e((CharSequence) "sign-out-cta");
        c3805bLh3.b((CharSequence) this.f.f());
        c3805bLh3.c(C6832ckj.b.h);
        c3805bLh3.b(new View.OnClickListener() { // from class: o.clt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6894cls.g(C6894cls.this, view);
            }
        });
        c3805bLh3.d(!this.f.h());
        interfaceC2023aX.add(c3805bLh3);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "0spacer-8");
        bku4.a(Integer.valueOf((int) context.getResources().getDimension(C6832ckj.d.e)));
        interfaceC2023aX.add(bku4);
    }
}
