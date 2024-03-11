package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.zC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9922zC extends AbstractC3336ax<a> {
    public CharSequence b;
    private float c = 1.0f;
    private View.OnClickListener d;
    private boolean g;
    private Drawable h;
    private View.OnClickListener j;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.aC;
    }

    public final void b(Drawable drawable) {
        this.h = drawable;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public final void c(boolean z) {
        this.g = z;
    }

    public final void e(float f) {
        this.c = f;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final float i() {
        return this.c;
    }

    public final boolean k() {
        return this.g;
    }

    public final View.OnClickListener m() {
        return this.j;
    }

    public final View.OnClickListener n() {
        return this.d;
    }

    public final Drawable o() {
        return this.h;
    }

    public final CharSequence l() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        View r = aVar.r();
        View.OnClickListener onClickListener = this.j;
        r.setOnClickListener(onClickListener);
        r.setClickable(onClickListener != null);
        aVar.r().setAlpha(this.c);
        ViewGroup a2 = aVar.a();
        View.OnClickListener onClickListener2 = this.d;
        a2.setOnClickListener(onClickListener2);
        a2.setClickable(onClickListener2 != null);
        aVar.e().setImageDrawable(this.h);
        aVar.e().setVisibility(this.h != null ? 0 : 8);
        aVar.b().setText(l());
        if (this.g) {
            if (aVar.d() == null) {
                View inflate = aVar.c().inflate();
                C8632dsu.d(inflate);
                aVar.c((ProgressBar) inflate);
            }
            ProgressBar d = aVar.d();
            if (d == null) {
                return;
            }
            d.setVisibility(0);
            return;
        }
        ProgressBar d2 = aVar.d();
        if (d2 == null) {
            return;
        }
        d2.setVisibility(8);
    }

    /* renamed from: o.zC$a */
    /* loaded from: classes2.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(a.class, "tappableItemLayout", "getTappableItemLayout()Landroid/view/ViewGroup;", 0)), dsA.c(new PropertyReference1Impl(a.class, "iconView", "getIconView()Landroid/widget/ImageView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "textView", "getTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "progressStub", "getProgressStub()Landroid/view/ViewStub;", 0))};
        public static final int c = 8;
        private ProgressBar b;
        private final dsZ h = bIF.d(this, com.netflix.mediaclient.ui.R.g.cQ, false, 2, null);
        private final dsZ d = bIF.d(this, com.netflix.mediaclient.ui.R.g.cv, false, 2, null);
        private final dsZ f = bIF.d(this, com.netflix.mediaclient.ui.R.g.gn, false, 2, null);
        private final dsZ e = bIF.d(this, com.netflix.mediaclient.ui.R.g.eS, false, 2, null);

        public final void c(ProgressBar progressBar) {
            this.b = progressBar;
        }

        public final ProgressBar d() {
            return this.b;
        }

        public final ViewGroup a() {
            return (ViewGroup) this.h.getValue(this, a[0]);
        }

        public final ImageView e() {
            return (ImageView) this.d.getValue(this, a[1]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.f.getValue(this, a[2]);
        }

        public final ViewStub c() {
            return (ViewStub) this.e.getValue(this, a[3]);
        }
    }
}
