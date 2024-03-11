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
import o.C6807ckK;
import o.C6809ckM;
import o.C6832ckj;
import o.C8632dsu;
import o.C9834xU;
import o.dpR;

/* renamed from: o.ckM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6809ckM extends AbstractC6833ckk {
    public static final b c = new b(null);
    private final C9935zP a;
    private final AppView b;
    private final String e;
    private final String f;
    private final C6807ckK g;

    @Override // o.AbstractC6833ckk
    public AppView b() {
        return this.b;
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.e;
    }

    @Override // o.AbstractC6677chn
    public String g() {
        return this.f;
    }

    @Override // o.AbstractC6677chn
    public boolean o() {
        return true;
    }

    public C6809ckM(C6807ckK c6807ckK, C9935zP c9935zP) {
        C8632dsu.c((Object) c6807ckK, "");
        C8632dsu.c((Object) c9935zP, "");
        this.g = c6807ckK;
        this.a = c9935zP;
        this.b = AppView.mhuUpdateHouseholdHelp;
        this.f = "Multihousehold.General.Modal";
        this.e = "UpdateInstructionsScreen.Screen";
    }

    /* renamed from: o.ckM$b */
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
        this.a.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.instructions.UpdateInstructionsScreen$handleBackPressed$1
            {
                super(1);
            }

            public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
                C6807ckK c6807ckK;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6807ckK = C6809ckM.this.g;
                c6807ckK.e(networkRequestResponseListener);
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
    public static final void e(final C6809ckM c6809ckM, View view) {
        C8632dsu.c((Object) c6809ckM, "");
        c6809ckM.a.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.instructions.UpdateInstructionsScreen$models$1$1$1
            {
                super(1);
            }

            public final void d(NetworkRequestResponseListener networkRequestResponseListener) {
                C6807ckK c6807ckK;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6807ckK = C6809ckM.this.g;
                c6807ckK.e(networkRequestResponseListener);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                d(networkRequestResponseListener);
                return dpR.c;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C6809ckM c6809ckM, View view) {
        C8632dsu.c((Object) c6809ckM, "");
        Logger.INSTANCE.logEvent(new Selected(c6809ckM.b(), null, CommandValue.BackCommand, null));
        c6809ckM.a.b(AbstractC6828ckf.class, new AbstractC6828ckf.c(new drM<NetworkRequestResponseListener, dpR>() { // from class: com.netflix.mediaclient.ui.multihouseholdebi.impl.screens.instructions.UpdateInstructionsScreen$models$8$1$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(NetworkRequestResponseListener networkRequestResponseListener) {
                a(networkRequestResponseListener);
                return dpR.c;
            }

            public final void a(NetworkRequestResponseListener networkRequestResponseListener) {
                C6807ckK c6807ckK;
                C8632dsu.c((Object) networkRequestResponseListener, "");
                c6807ckK = C6809ckM.this.g;
                c6807ckK.e(networkRequestResponseListener);
            }
        }));
    }

    @Override // o.bJF
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        C3771bKa c3771bKa = new C3771bKa();
        c3771bKa.e((CharSequence) "back-local");
        c3771bKa.c(Integer.valueOf(C1026Lt.a.aT));
        c3771bKa.b(new View.OnClickListener() { // from class: o.ckJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6809ckM.e(C6809ckM.this, view);
            }
        });
        c3771bKa.d(C6832ckj.b.a);
        c3771bKa.d(!this.g.a());
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
        bku2.a(Integer.valueOf((int) context.getResources().getDimension(C9834xU.a.q)));
        interfaceC2023aX.add(bku2);
        C3814bLq c3814bLq2 = new C3814bLq();
        c3814bLq2.b((CharSequence) "body");
        c3814bLq2.d(this.g.e());
        c3814bLq2.d(C6832ckj.b.m);
        interfaceC2023aX.add(c3814bLq2);
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-ctas");
        interfaceC2023aX.add(bjk);
        C3805bLh c3805bLh = new C3805bLh();
        c3805bLh.e((CharSequence) "go-back-cta");
        c3805bLh.b((CharSequence) this.g.c());
        c3805bLh.c(C6832ckj.b.i);
        c3805bLh.b(new View.OnClickListener() { // from class: o.ckN
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6809ckM.b(C6809ckM.this, view);
            }
        });
        c3805bLh.d(!this.g.a());
        interfaceC2023aX.add(c3805bLh);
        bKU bku3 = new bKU();
        bku3.d((CharSequence) "0spacer-8");
        bku3.a(Integer.valueOf((int) context.getResources().getDimension(C6832ckj.d.e)));
        interfaceC2023aX.add(bku3);
    }
}
