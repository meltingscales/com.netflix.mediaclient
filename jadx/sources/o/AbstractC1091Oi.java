package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import o.AbstractC1091Oi;
import o.C8632dsu;
import o.InterfaceC2023aX;
import o.dpR;

/* renamed from: o.Oi  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1091Oi extends NetflixDialogFrag {
    public static final d d = new d(null);
    public static final int e = 8;
    private final InterfaceC8554dpx a = C1565aG.a(this, com.netflix.mediaclient.ui.R.g.cp, false, false, new drM<LifecycleAwareEpoxyViewBinder, dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixEpoxyDialogFrag$headerViewBinder$2
        public final void b(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
            C8632dsu.c((Object) lifecycleAwareEpoxyViewBinder, "");
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
            b(lifecycleAwareEpoxyViewBinder);
            return dpR.c;
        }
    }, new drX<InterfaceC2023aX, Context, dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixEpoxyDialogFrag$headerViewBinder$3
        {
            super(2);
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(InterfaceC2023aX interfaceC2023aX, Context context) {
            e(interfaceC2023aX, context);
            return dpR.c;
        }

        public final void e(InterfaceC2023aX interfaceC2023aX, Context context) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            AbstractC1091Oi.this.c(interfaceC2023aX);
        }
    }, 6, null);
    private final InterfaceC8554dpx c = C1565aG.a(this, com.netflix.mediaclient.ui.R.g.cd, false, false, new drM<LifecycleAwareEpoxyViewBinder, dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixEpoxyDialogFrag$footerViewBinder$2
        public final void b(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
            C8632dsu.c((Object) lifecycleAwareEpoxyViewBinder, "");
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
            b(lifecycleAwareEpoxyViewBinder);
            return dpR.c;
        }
    }, new drX<InterfaceC2023aX, Context, dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixEpoxyDialogFrag$footerViewBinder$3
        {
            super(2);
        }

        @Override // o.drX
        public /* synthetic */ dpR invoke(InterfaceC2023aX interfaceC2023aX, Context context) {
            c(interfaceC2023aX, context);
            return dpR.c;
        }

        public final void c(InterfaceC2023aX interfaceC2023aX, Context context) {
            C8632dsu.c((Object) interfaceC2023aX, "");
            C8632dsu.c((Object) context, "");
            AbstractC1091Oi.this.a(interfaceC2023aX);
        }
    }, 6, null);

    public abstract void a(InterfaceC2023aX interfaceC2023aX);

    public abstract void c(InterfaceC2023aX interfaceC2023aX);

    /* renamed from: o.Oi$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("NetflixEpoxyDialogFrag");
        }
    }

    private final LifecycleAwareEpoxyViewBinder a() {
        return (LifecycleAwareEpoxyViewBinder) this.a.getValue();
    }

    private final LifecycleAwareEpoxyViewBinder d() {
        return (LifecycleAwareEpoxyViewBinder) this.c.getValue();
    }

    public final void e() {
        LifecycleAwareEpoxyViewBinder d2 = d();
        if (d2 != null) {
            d2.e();
        }
        LifecycleAwareEpoxyViewBinder a = a();
        if (a != null) {
            a.e();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        e();
    }
}
