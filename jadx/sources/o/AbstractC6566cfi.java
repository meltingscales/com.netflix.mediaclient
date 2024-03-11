package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.cfi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6566cfi extends AbstractC3336ax<c> {
    private View.OnClickListener b;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.u;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        C1203Sq b = cVar.b();
        View.OnClickListener onClickListener = this.b;
        b.setOnClickListener(onClickListener);
        b.setClickable(onClickListener != null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.b((AbstractC6566cfi) cVar);
        C1203Sq b = cVar.b();
        b.setOnClickListener(null);
        b.setClickable(false);
    }

    /* renamed from: o.cfi$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(c.class, "helpButton", "getHelpButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        public static final int d = 8;
        private final dsZ c = bIF.d(this, com.netflix.mediaclient.ui.R.g.cw, false, 2, null);

        public final C1203Sq b() {
            return (C1203Sq) this.c.getValue(this, b[0]);
        }
    }
}
