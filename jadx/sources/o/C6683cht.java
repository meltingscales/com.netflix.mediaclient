package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import com.netflix.mediaclient.ui.messaging.impl.MessagingEpoxyController;
import o.AbstractC6684chu;
import o.InterfaceC6682chs;

/* renamed from: o.cht  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6683cht extends AbstractC6684chu<a> {
    public static final d j = new d(null);

    /* renamed from: o.cht$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MessagingTooltipFrag");
        }
    }

    /* renamed from: o.cht$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC6684chu.d {
        private final InterfaceC6682chs c;
        private View e;

        @Override // o.AbstractC6684chu.d
        public View b() {
            return this.e;
        }

        public final InterfaceC6682chs e() {
            return this.c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MessagingEpoxyController messagingEpoxyController, InterfaceC6682chs interfaceC6682chs) {
            super(messagingEpoxyController);
            C8632dsu.c((Object) messagingEpoxyController, "");
            C8632dsu.c((Object) interfaceC6682chs, "");
            this.c = interfaceC6682chs;
            this.e = interfaceC6682chs.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6684chu
    /* renamed from: c */
    public a e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, MessagingEpoxyController messagingEpoxyController) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) layoutInflater, "");
        C8632dsu.c((Object) messagingEpoxyController, "");
        C6643chF c6643chF = new C6643chF(null, 0, null, false, false, false, 0, null, 0, false, null, null, 0, null, null, 32767, null);
        Bundle arguments = getArguments();
        c6643chF.b(arguments != null ? arguments.getInt("messaging.api.screen.anchorViewId") : 0);
        if (c6643chF.e() == 0) {
            c6643chF.b(com.netflix.mediaclient.ui.R.g.W);
            c6643chF.d(false);
        }
        AbstractC6677chn g = g();
        if (g instanceof MessagingTooltipScreen) {
            MessagingTooltipScreen messagingTooltipScreen = (MessagingTooltipScreen) g;
            c6643chF.d(messagingTooltipScreen.p());
            c6643chF.e(messagingTooltipScreen.k());
            c6643chF.b(messagingTooltipScreen.n());
            c6643chF.d(messagingTooltipScreen.t());
            c6643chF.a(messagingTooltipScreen.l());
            c6643chF.a(messagingTooltipScreen.s());
            c6643chF.c(messagingTooltipScreen.j());
            c6643chF.e(messagingTooltipScreen.q());
            c6643chF.d(messagingTooltipScreen.r());
            c6643chF.e(messagingTooltipScreen.m());
            c6643chF.e(messagingTooltipScreen.b());
            c6643chF.c(messagingTooltipScreen.d());
            c6643chF.e(messagingTooltipScreen.a());
        }
        return new a(messagingEpoxyController, c6643chF.b(this, messagingEpoxyController));
    }

    public final InterfaceC6682chs o() {
        a d2 = d();
        if (d2 != null) {
            return d2.e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6684chu
    /* renamed from: d */
    public void a(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.e().a();
    }

    @Override // o.AbstractC6684chu, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC6682chs e;
        super.onDestroyView();
        a d2 = d();
        if (d2 == null || (e = d2.e()) == null) {
            return;
        }
        InterfaceC6682chs.c.e(e, null, 1, null);
    }

    @Override // o.bMW, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC6677chn g = g();
        MessagingTooltipScreen messagingTooltipScreen = g instanceof MessagingTooltipScreen ? (MessagingTooltipScreen) g : null;
        if (messagingTooltipScreen != null) {
            messagingTooltipScreen.d(this);
        }
    }

    @Override // o.AbstractC6684chu, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC6682chs e;
        C8632dsu.c((Object) layoutInflater, "");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        AbstractC6677chn g = g();
        View view = null;
        MessagingTooltipScreen messagingTooltipScreen = g instanceof MessagingTooltipScreen ? (MessagingTooltipScreen) g : null;
        if (messagingTooltipScreen != null) {
            a d2 = d();
            if (d2 != null && (e = d2.e()) != null) {
                view = e.d();
            }
            View e2 = messagingTooltipScreen.e(onCreateView, layoutInflater, viewGroup, view);
            return e2 == null ? onCreateView : e2;
        }
        return onCreateView;
    }

    public final void e(drO<dpR> dro) {
        dpR dpr;
        InterfaceC6682chs e;
        C8632dsu.c((Object) dro, "");
        a d2 = d();
        if (d2 == null || (e = d2.e()) == null) {
            dpr = null;
        } else {
            e.b(dro);
            dpr = dpR.c;
        }
        if (dpr == null) {
            dismiss();
        }
    }
}
