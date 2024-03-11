package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC4068bVa;
import o.C4022bTi;
import o.InterfaceC3825bMa;

/* renamed from: o.bVa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4068bVa extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    public TrackingInfoHolder b;
    public AppView c;
    private InterfaceC3825bMa.a d;
    private View.OnClickListener h;
    private drO<? extends TrackingInfo> i = new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.models.GameIdentityRowModel$trackingInfoBuilder$1
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: a */
        public final TrackingInfo invoke() {
            return TrackingInfoHolder.e(AbstractC4068bVa.this.o(), null, 1, null);
        }
    };

    @Override // o.AbstractC3073as
    public int a() {
        return C4022bTi.a.r;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public final View.OnClickListener k() {
        return this.h;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        return this.i;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.d;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.c;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    public final TrackingInfoHolder o() {
        TrackingInfoHolder trackingInfoHolder = this.b;
        if (trackingInfoHolder != null) {
            return trackingInfoHolder;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        C1203Sq c = aVar.c();
        View.OnClickListener onClickListener = this.h;
        c.setOnClickListener(onClickListener);
        c.setClickable(onClickListener != null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        C1203Sq c = aVar.c();
        c.setOnClickListener(null);
        c.setClickable(false);
    }

    /* renamed from: o.bVa$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(a.class, "button", "getButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ e = bIF.d(this, C4022bTi.e.f13544o, false, 2, null);

        public final C1203Sq c() {
            return (C1203Sq) this.e.getValue(this, a[0]);
        }

        public final boolean e() {
            return c().isClickable();
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).e();
    }
}
