package o;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.InterfaceC3825bMa;
import o.bAG;
import o.bAH;

/* loaded from: classes4.dex */
public abstract class bAH extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    public CharSequence b;
    public CharSequence c;
    public AppView d;
    public TrackingInfoHolder f;
    private InterfaceC3825bMa.a h;
    private View.OnClickListener i;
    private drO<? extends TrackingInfo> j = new drO<TrackingInfo>() { // from class: com.netflix.mediaclient.ui.collecttaste.impl.lolomo.CollectTasteLolomoMessageModel$trackingInfoBuilder$1
        {
            super(0);
        }

        @Override // o.drO
        /* renamed from: d */
        public final TrackingInfo invoke() {
            return TrackingInfoHolder.e(bAH.this.t(), null, 1, null);
        }
    };

    @Override // o.AbstractC3073as
    public int a() {
        return bAG.b.a;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        return this.j;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    public final View.OnClickListener o() {
        return this.i;
    }

    public final CharSequence l() {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    public final CharSequence k() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
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

    public final TrackingInfoHolder t() {
        TrackingInfoHolder trackingInfoHolder = this.f;
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
        C1193Sg d = aVar.d();
        View.OnClickListener onClickListener = this.i;
        d.setOnClickListener(onClickListener);
        d.setClickable(onClickListener != null);
        aVar.e().setText(l());
        aVar.b().setText(k());
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        C1193Sg d = aVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(a.class, "headline", "getHeadline()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "body", "getBody()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "close", "getClose()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0))};
        private final dsZ a = bIF.d(this, bAG.a.m, false, 2, null);
        private final dsZ d = bIF.d(this, bAG.a.l, false, 2, null);
        private final dsZ c = bIF.d(this, bAG.a.e, false, 2, null);

        public final boolean c() {
            return true;
        }

        public final C1204Sr e() {
            return (C1204Sr) this.a.getValue(this, e[0]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.d.getValue(this, e[1]);
        }

        public final C1193Sg d() {
            return (C1193Sg) this.c.getValue(this, e[2]);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).c();
    }
}
