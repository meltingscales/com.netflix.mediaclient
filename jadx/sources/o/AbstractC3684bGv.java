package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* renamed from: o.bGv  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3684bGv extends AbstractC3336ax<b> {
    private View.OnClickListener c;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.e;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.b().setVisibility(0);
        C1203Sq b2 = bVar.b();
        View.OnClickListener onClickListener = this.c;
        b2.setOnClickListener(onClickListener);
        b2.setClickable(onClickListener != null);
    }

    /* renamed from: o.bGv$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, "restartButton", "getRestartButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ c = bIF.d(this, com.netflix.mediaclient.ui.R.g.gR, false, 2, null);

        public final C1203Sq b() {
            return (C1203Sq) this.c.getValue(this, e[0]);
        }
    }
}
