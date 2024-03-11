package o;

import android.view.View;
import android.view.ViewGroup;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;
import o.InterfaceC3825bMa;

/* renamed from: o.bHg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3696bHg extends AbstractC3336ax<a> implements InterfaceC3829bMe {
    public AppView b;
    private Integer c;
    public drO<? extends TrackingInfo> d;
    private int f;
    private View.OnClickListener g;
    private InterfaceC3825bMa.a h;
    private String i;
    private int j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.K;
    }

    public final void c(String str) {
        this.i = str;
    }

    public final void d(Integer num) {
        this.c = num;
    }

    public final void g_(int i) {
        this.f = i;
    }

    public final void h_(int i) {
        this.j = i;
    }

    public final Integer k() {
        return this.c;
    }

    public final int l() {
        return this.f;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.h;
    }

    public final View.OnClickListener o() {
        return this.g;
    }

    public final int p() {
        return this.j;
    }

    public final String t() {
        return this.i;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.d;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.b;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            View r = aVar.r();
            ViewGroup.LayoutParams layoutParams = r.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.leftMargin = marginLayoutParams.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(intValue);
                marginLayoutParams.setMarginEnd(intValue);
                r.requestLayout();
            }
        }
        C1204Sr c = aVar.c();
        c.setPadding(c.getPaddingLeft(), this.j, c.getPaddingRight(), this.f);
        aVar.c().setText(C8168dfL.b(this.i));
        C1204Sr c2 = aVar.c();
        View.OnClickListener onClickListener = this.g;
        c2.setOnClickListener(onClickListener);
        c2.setClickable(onClickListener != null);
    }

    /* renamed from: o.bHg$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(a.class, "synopsisView", "getSynopsisView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ a = bIF.d(this, C3670bGh.a.r, false, 2, null);

        public final boolean d() {
            return true;
        }

        public final C1204Sr c() {
            return (C1204Sr) this.a.getValue(this, b[0]);
        }
    }

    @Override // o.InterfaceC3829bMe
    public boolean h(AbstractC3179au abstractC3179au) {
        C8632dsu.c((Object) abstractC3179au, "");
        return ((a) C9726vo.d(abstractC3179au, a.class)).d();
    }
}
