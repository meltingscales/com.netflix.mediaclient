package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;
import o.C5398bxx;
import o.cPU;

/* loaded from: classes4.dex */
public abstract class bGA extends AbstractC3336ax<c> {
    public static final a b = new a(null);
    private int c;
    private drM<? super Integer, dpR> d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.f;
    }

    public final void c(int i) {
        this.c = i;
    }

    public final void d(drM<? super Integer, dpR> drm) {
        this.d = drm;
    }

    public final drM<Integer, dpR> i() {
        return this.d;
    }

    public final int l() {
        return this.c;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.a().setRating(this.c);
        cVar.a().setDark(!BrowseExperience.e());
        C8310dhv.c(cVar.a().c());
        NetflixActivity requireNetflixActivity = NetflixActivity.requireNetflixActivity(cVar.a().c());
        C8632dsu.a(requireNetflixActivity, "");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) requireNetflixActivity.findViewById(com.netflix.mediaclient.ui.R.g.aG);
        if (coordinatorLayout != null) {
            cVar.a().setOnRateListener(coordinatorLayout, new d(cVar), false, 1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements cPP {
        final /* synthetic */ c c;

        @Override // o.cPP
        public void a(cPT cpt) {
            C8632dsu.c((Object) cpt, "");
        }

        d(c cVar) {
            this.c = cVar;
        }

        @Override // o.cPP
        public void d(cPT cpt, int i) {
            C8632dsu.c((Object) cpt, "");
            drM<Integer, dpR> i2 = bGA.this.i();
            if (i2 != null) {
                i2.invoke(Integer.valueOf(i));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(c.class, "ratingButtonContainer", "getRatingButtonContainer()Landroid/view/ViewGroup;", 0))};
        public cPT d;
        private final dsZ e = bIF.d(this, C3670bGh.a.e, false, 2, null);

        public final void d(cPT cpt) {
            C8632dsu.c((Object) cpt, "");
            this.d = cpt;
        }

        private final ViewGroup c() {
            return (ViewGroup) this.e.getValue(this, c[0]);
        }

        public final cPT a() {
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
            cPT c2 = e.c(context2, c(), Integer.valueOf(view.getContext().getResources().getDimensionPixelSize(C5398bxx.c.d)));
            c2.c().setId(C3670bGh.a.i);
            d(c2);
            c().addView(a().c(), -1, -1);
        }
    }
}
