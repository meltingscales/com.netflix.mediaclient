package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;
import o.cPU;

/* renamed from: o.bQi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3941bQi extends AbstractC3336ax<c> {
    public static final a c = new a(null);
    private int b;
    private drM<? super Integer, dpR> d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.L;
    }

    public final void e(drM<? super Integer, dpR> drm) {
        this.d = drm;
    }

    public final drM<Integer, dpR> i() {
        return this.d;
    }

    public final int l() {
        return this.b;
    }

    public final void m_(int i) {
        this.b = i;
    }

    /* renamed from: o.bQi$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // o.AbstractC3336ax
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.e().setRating(this.b);
        cVar.e().setDark(!BrowseExperience.e());
        C8310dhv.c(cVar.e().c());
        NetflixActivity requireNetflixActivity = NetflixActivity.requireNetflixActivity(cVar.e().c());
        C8632dsu.a(requireNetflixActivity, "");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) requireNetflixActivity.findViewById(com.netflix.mediaclient.ui.R.g.aG);
        if (coordinatorLayout != null) {
            cVar.e().setOnRateListener(coordinatorLayout, new e(cVar), false, 1);
        }
    }

    /* renamed from: o.bQi$e */
    /* loaded from: classes4.dex */
    public static final class e implements cPP {
        final /* synthetic */ c d;

        @Override // o.cPP
        public void a(cPT cpt) {
            C8632dsu.c((Object) cpt, "");
        }

        e(c cVar) {
            this.d = cVar;
        }

        @Override // o.cPP
        public void d(cPT cpt, int i) {
            C8632dsu.c((Object) cpt, "");
            drM<Integer, dpR> i2 = AbstractC3941bQi.this.i();
            if (i2 != null) {
                i2.invoke(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: o.bQi$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(c.class, "ratingButtonContainer", "getRatingButtonContainer()Landroid/view/ViewGroup;", 0))};
        public cPT d;
        private final dsZ e = bIF.d(this, C3895bOq.b.r, false, 2, null);

        public final void a(cPT cpt) {
            C8632dsu.c((Object) cpt, "");
            this.d = cpt;
        }

        private final ViewGroup d() {
            return (ViewGroup) this.e.getValue(this, a[0]);
        }

        public final cPT e() {
            cPT cpt = this.d;
            if (cpt != null) {
                return cpt;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            cPU.e eVar = cPU.e;
            Context context = view.getContext();
            C8632dsu.a(context, "");
            cPU e = eVar.e((Activity) C9737vz.e(context, Activity.class));
            Context context2 = view.getContext();
            C8632dsu.a(context2, "");
            cPT a2 = cPU.d.a(e, context2, d(), null, 4, null);
            a2.c().setId(C3895bOq.b.p);
            a(a2);
            d().addView(e().c(), -1, -1);
        }
    }
}
