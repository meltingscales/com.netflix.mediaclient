package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;
import o.InterfaceC3825bMa;

/* renamed from: o.bQh  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3940bQh extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    public drO<? extends TrackingInfo> b;
    private boolean c;
    public AppView d;
    private InterfaceC3825bMa.a g;
    private View.OnClickListener h;
    private boolean j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.ad;
    }

    public final void d(boolean z) {
        this.j = z;
    }

    public final void e_(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final View.OnClickListener k() {
        return this.h;
    }

    public final boolean l() {
        return this.j;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.g;
    }

    public final boolean o() {
        return this.c;
    }

    public final void v_(boolean z) {
        this.c = z;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.b;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.d;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        if (this.j) {
            a(aVar);
        } else if (this.c) {
            d(aVar, true);
        } else {
            d(aVar, false);
        }
        C1203Sq d = aVar.d();
        View.OnClickListener onClickListener = this.h;
        d.setOnClickListener(onClickListener);
        d.setClickable(onClickListener != null);
        C1203Sq b = aVar.b();
        View.OnClickListener onClickListener2 = this.h;
        b.setOnClickListener(onClickListener2);
        b.setClickable(onClickListener2 != null);
    }

    private final void a(a aVar) {
        aVar.b().setVisibility(8);
        aVar.d().setVisibility(0);
    }

    private final void d(a aVar, boolean z) {
        aVar.b().setVisibility(0);
        aVar.d().setVisibility(8);
        if (z) {
            aVar.b().setText(aVar.b().getContext().getResources().getString(C3895bOq.e.h));
            return;
        }
        aVar.b().setText(aVar.b().getContext().getResources().getString(C3895bOq.e.d));
        aVar.b().setEnabled(false);
        aVar.b().setClickable(false);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        C1203Sq d = aVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
        C1203Sq b = aVar.b();
        b.setOnClickListener(null);
        b.setClickable(false);
        super.b((AbstractC3940bQh) aVar);
    }

    /* renamed from: o.bQh$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "installButton", "getInstallButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0)), dsA.c(new PropertyReference1Impl(a.class, "launchButton", "getLaunchButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ d = bIF.d(this, C3895bOq.b.C, false, 2, null);
        private final dsZ e = bIF.d(this, C3895bOq.b.K, false, 2, null);

        public final boolean a() {
            return true;
        }

        public final C1203Sq b() {
            return (C1203Sq) this.d.getValue(this, c[0]);
        }

        public final C1203Sq d() {
            return (C1203Sq) this.e.getValue(this, c[1]);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).a();
    }
}
