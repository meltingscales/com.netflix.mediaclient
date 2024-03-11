package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6035cRo;

/* renamed from: o.cUx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6128cUx extends AbstractC3336ax<a> {
    private View.OnClickListener c;

    @Override // o.AbstractC3073as
    public int a() {
        return C6035cRo.e.j;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        C1203Sq c = aVar.c();
        View.OnClickListener onClickListener = this.c;
        c.setOnClickListener(onClickListener);
        c.setClickable(onClickListener != null);
    }

    /* renamed from: o.cUx$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "btn", "getBtn()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        private final dsZ b = bIF.d(this, C6035cRo.d.m, false, 2, null);

        public final C1203Sq c() {
            return (C1203Sq) this.b.getValue(this, c[0]);
        }
    }
}
