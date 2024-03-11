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
import com.netflix.mediaclient.clutils.CLv2Utils;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import java.util.Map;
import o.AbstractC6828ckf;
import o.C6832ckj;
import o.C6838ckp;
import o.C6846ckx;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

/* renamed from: o.ckp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6838ckp extends AbstractC6833ckk {
    public static final c b = new c(null);
    private final C9935zP a;
    private final AppView c;
    private final String e;
    private final C6846ckx f;
    private final String g;
    private final TrackingInfo i;

    @Override // o.AbstractC6833ckk
    public AppView b() {
        return this.c;
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.e;
    }

    @Override // o.AbstractC6833ckk
    public TrackingInfo d() {
        return this.i;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.g;
    }

    @Override // o.AbstractC6677chn
    public boolean o() {
        return true;
    }

    public C6838ckp(C6846ckx c6846ckx, C9935zP c9935zP) {
        Map b2;
        C8632dsu.c((Object) c6846ckx, "");
        C8632dsu.c((Object) c9935zP, "");
        this.f = c6846ckx;
        this.a = c9935zP;
        this.c = AppView.mhuChallengeError;
        b2 = dqD.b(dpD.a(UmaAlert.ICON_ERROR, c6846ckx.d()));
        TrackingInfo a = CLv2Utils.a(b2);
        C8632dsu.a(a, "");
        this.i = a;
        this.g = "Multihousehold.General.Modal";
        this.e = "ChallegeError.Screen";
    }

    /* renamed from: o.ckp$c */
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
        this.a.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.challengeerror.ChallengeErrorScreen$handleBackPressed$1
            {
                super(1);
            }

            public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
                C6846ckx c6846ckx;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6846ckx = C6838ckp.this.f;
                c6846ckx.d(networkRequestResponseListener);
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
    public static final void e(C6838ckp c6838ckp, View view) {
        C8632dsu.c((Object) c6838ckp, "");
        Logger.INSTANCE.logEvent(new Selected(c6838ckp.b(), null, CommandValue.SignOutCommand, null));
        c6838ckp.a.b(AbstractC6828ckf.class, AbstractC6828ckf.b.c);
    }

    @Override // o.bJF
    /* renamed from: e */
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        bKU bku = new bKU();
        bku.d((CharSequence) "0spacer-0");
        bku.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.f13911o)));
        interfaceC2023aX.add(bku);
        bJX bjx = new bJX();
        bjx.b((CharSequence) "logo");
        bjx.a(Integer.valueOf(this.f.e()));
        interfaceC2023aX.add(bjx);
        bKU bku2 = new bKU();
        bku2.d((CharSequence) "0spacer-1");
        bku2.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.f13911o)));
        interfaceC2023aX.add(bku2);
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) SignupConstants.Field.VIDEO_TITLE);
        c3814bLq.d((CharSequence) this.f.g());
        c3814bLq.d(C6832ckj.b.e);
        interfaceC2023aX.add(c3814bLq);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "0spacer-2");
        bku3.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.x)));
        interfaceC2023aX.add(bku3);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "body");
        c3814bLq2.d(this.f.a());
        c3814bLq2.d(C6832ckj.b.m);
        interfaceC2023aX.add(c3814bLq2);
        bKU bku4 = new bKU();
        bku4.d((CharSequence) "0spacer-3");
        bku4.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.v)));
        interfaceC2023aX.add(bku4);
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-ctas");
        interfaceC2023aX.add(bjk);
        C3814bLq c3814bLq3 = new C3814bLq();
        c3814bLq3.b((CharSequence) "learn-more");
        c3814bLq3.d((CharSequence) C8168dfL.d(C6832ckj.a.p));
        c3814bLq3.d(C6832ckj.b.d);
        interfaceC2023aX.add(c3814bLq3);
        bKU bku5 = new bKU();
        bku5.d((CharSequence) "0spacer-4");
        bku5.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.aa)));
        interfaceC2023aX.add(bku5);
        C3764bJu c3764bJu = new C3764bJu();
        c3764bJu.c((CharSequence) "copy-link");
        c3764bJu.e(C6832ckj.b.f);
        c3764bJu.b((CharSequence) this.f.b());
        c3764bJu.d((CharSequence) this.f.j());
        c3764bJu.e((CharSequence) C8168dfL.d(C6832ckj.a.d));
        c3764bJu.b((drX<? super View, ? super CharSequence, dpR>) new drX<View, CharSequence, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.challengeerror.ChallengeErrorScreen$models$11$1
            public final void c(View view, CharSequence charSequence) {
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(View view, CharSequence charSequence) {
                c(view, charSequence);
                return dpR.c;
            }
        });
        interfaceC2023aX.add(c3764bJu);
        bKU bku6 = new bKU();
        bku6.d((CharSequence) "0spacer-5");
        bku6.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.v)));
        interfaceC2023aX.add(bku6);
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "cta-sign-out");
        c3805bLh.b((CharSequence) this.f.c());
        c3805bLh.c(C6832ckj.b.i);
        c3805bLh.b(new View.OnClickListener() { // from class: o.ckv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6838ckp.e(C6838ckp.this, view);
            }
        });
        c3805bLh.d(!this.f.f());
        interfaceC2023aX.add(c3805bLh);
        bKU bku7 = new bKU();
        bku7.d((CharSequence) "0spacer-8");
        bku7.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.m)));
        interfaceC2023aX.add(bku7);
        C3814bLq c3814bLq4 = new C3814bLq();
        c3814bLq4.b((CharSequence) "sharing-link");
        c3814bLq4.d((CharSequence) this.f.h());
        c3814bLq4.d(C6832ckj.b.b);
        c3814bLq4.b(true);
        interfaceC2023aX.add(c3814bLq4);
        bKU bku8 = new bKU();
        bku8.d((CharSequence) "0spacer-9");
        bku8.a(Integer.valueOf((int) context.getResources().getDimension(C6832ckj.d.e)));
        interfaceC2023aX.add(bku8);
    }
}
