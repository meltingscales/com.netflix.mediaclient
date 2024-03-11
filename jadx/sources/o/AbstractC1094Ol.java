package o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.airbnb.epoxy.LifecycleAwareEpoxyViewBinder;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import o.AbstractC1094Ol;
import o.C8632dsu;
import o.InterfaceC2023aX;
import o.dpR;

/* renamed from: o.Ol  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1094Ol extends NetflixFrag {
    public static final c e = new c(null);
    public static final int b = 8;
    private final InterfaceC8554dpx k = C1565aG.a(this, com.netflix.mediaclient.ui.R.g.cp, false, false, new drM<LifecycleAwareEpoxyViewBinder, dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixEpoxyFrag$headerViewBinder$2
        public final void d(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
            C8632dsu.c((Object) lifecycleAwareEpoxyViewBinder, "");
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
            d(lifecycleAwareEpoxyViewBinder);
            return dpR.c;
        }
    }, new drX<InterfaceC2023aX, Context, dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixEpoxyFrag$headerViewBinder$3
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
            AbstractC1094Ol.this.c(interfaceC2023aX);
        }
    }, 6, null);
    private final InterfaceC8554dpx j = C1565aG.a(this, com.netflix.mediaclient.ui.R.g.cd, false, false, new drM<LifecycleAwareEpoxyViewBinder, dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixEpoxyFrag$footerViewBinder$2
        public final void d(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
            C8632dsu.c((Object) lifecycleAwareEpoxyViewBinder, "");
        }

        @Override // o.drM
        public /* synthetic */ dpR invoke(LifecycleAwareEpoxyViewBinder lifecycleAwareEpoxyViewBinder) {
            d(lifecycleAwareEpoxyViewBinder);
            return dpR.c;
        }
    }, new drX<InterfaceC2023aX, Context, dpR>() { // from class: com.netflix.mediaclient.android.fragment.NetflixEpoxyFrag$footerViewBinder$3
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
            AbstractC1094Ol.this.b(interfaceC2023aX);
        }
    }, 6, null);

    public void b(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
    }

    public void c(InterfaceC2023aX interfaceC2023aX) {
        C8632dsu.c((Object) interfaceC2023aX, "");
    }

    /* renamed from: o.Ol$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NetflixEpoxyFrag");
        }
    }

    private final LifecycleAwareEpoxyViewBinder F() {
        return (LifecycleAwareEpoxyViewBinder) this.k.getValue();
    }

    private final LifecycleAwareEpoxyViewBinder I() {
        return (LifecycleAwareEpoxyViewBinder) this.j.getValue();
    }

    public final void a() {
        LifecycleAwareEpoxyViewBinder I = I();
        if (I != null) {
            I.e();
        }
        LifecycleAwareEpoxyViewBinder F = F();
        if (F != null) {
            F.e();
        }
    }

    public final void e() {
        LifecycleAwareEpoxyViewBinder I = I();
        if (I != null) {
            I.e();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        a();
    }
}
