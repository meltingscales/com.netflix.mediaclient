package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.ceS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6497ceS extends AbstractC3336ax<a> {
    private CharSequence c;
    private View.OnClickListener d;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.t;
    }

    public final void c(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.d;
    }

    public final CharSequence l() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.c().setOnClickListener(this.d);
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            aVar.c().setContentDescription(charSequence);
        }
        aVar.a().setOnClickListener(this.d);
    }

    /* renamed from: o.ceS$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "iconView", "getIconView()Landroid/widget/ImageButton;", 0)), dsA.c(new PropertyReference1Impl(a.class, "tapArea", "getTapArea()Landroid/widget/FrameLayout;", 0))};
        public static final int e = 8;
        private final dsZ d = bIF.d(this, com.netflix.mediaclient.ui.R.g.az, false, 2, null);
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.ax, false, 2, null);

        public final ImageButton c() {
            return (ImageButton) this.d.getValue(this, c[0]);
        }

        public final FrameLayout a() {
            return (FrameLayout) this.b.getValue(this, c[1]);
        }
    }
}
