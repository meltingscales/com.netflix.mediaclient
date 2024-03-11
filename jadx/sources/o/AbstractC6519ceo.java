package o;

import android.view.View;
import android.widget.ImageButton;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.ceo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6519ceo extends AbstractC3336ax<a> {
    private CharSequence b;
    private View.OnClickListener d;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.I;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void d(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final View.OnClickListener i() {
        return this.d;
    }

    public final CharSequence o() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.e().setText(this.b);
        ImageButton d = aVar.d();
        View.OnClickListener onClickListener = this.d;
        d.setOnClickListener(onClickListener);
        d.setClickable(onClickListener != null);
    }

    /* renamed from: o.ceo$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.be, false, 2, null);
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.az, false, 2, null);
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "textView", "getTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "iconView", "getIconView()Landroid/widget/ImageButton;", 0))};
        public static final int b = 8;

        public final C1204Sr e() {
            return (C1204Sr) this.a.getValue(this, c[0]);
        }

        public final ImageButton d() {
            return (ImageButton) this.e.getValue(this, c[1]);
        }
    }
}
