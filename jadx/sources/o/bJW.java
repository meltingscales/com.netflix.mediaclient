package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* loaded from: classes4.dex */
public abstract class bJW extends AbstractC3336ax<b> {
    private Integer b;
    private boolean c = true;
    private String d;
    private View.OnClickListener i;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.l;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public void f_(Integer num) {
        this.b = num;
    }

    public Integer i() {
        return this.b;
    }

    public final View.OnClickListener l() {
        return this.i;
    }

    public final boolean n() {
        return this.c;
    }

    public final String o() {
        return this.d;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(b bVar) {
        dpR dpr;
        C8632dsu.c((Object) bVar, "");
        Integer i = i();
        if (i != null) {
            bVar.a().setImageResource(i.intValue());
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            bVar.a().setImageDrawable(null);
        }
        C1193Sg a = bVar.a();
        View.OnClickListener onClickListener = this.i;
        a.setOnClickListener(onClickListener);
        a.setClickable(onClickListener != null);
        bVar.a().setEnabled(this.c);
        if (this.d != null) {
            bVar.a().setContentDescription(this.d);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        C1193Sg a = bVar.a();
        a.setOnClickListener(null);
        a.setClickable(false);
        super.b((bJW) bVar);
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        private final dsZ d = bIF.d(this, C3796bKz.a.c, false, 2, null);
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, "button", "getButton()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0))};
        public static final int b = 8;

        public final C1193Sg a() {
            return (C1193Sg) this.d.getValue(this, e[0]);
        }
    }
}
