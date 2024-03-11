package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: o.zI  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9928zI extends AbstractC3336ax<b> {
    private int b;
    private float c = 1.0f;
    private View.OnClickListener d;
    private int f;
    private CharSequence h;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.aE;
    }

    public final void a(float f) {
        this.c = f;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void e(int i) {
        this.f = i;
    }

    public final void e(CharSequence charSequence) {
        this.h = charSequence;
    }

    public final float i() {
        return this.c;
    }

    public final int k() {
        return this.f;
    }

    public final CharSequence l() {
        return this.h;
    }

    public final View.OnClickListener n() {
        return this.d;
    }

    public final int o() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.r().setAlpha(this.c);
        View r = bVar.r();
        r.setPadding(r.getPaddingLeft(), this.f, r.getPaddingRight(), this.b);
        View r2 = bVar.r();
        View.OnClickListener onClickListener = this.d;
        r2.setOnClickListener(onClickListener);
        r2.setClickable(onClickListener != null);
        bVar.r().setImportantForAccessibility(4);
        bVar.d().setClickable(true);
        bVar.d().setText(this.h);
    }

    /* renamed from: o.zI$b */
    /* loaded from: classes2.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(b.class, "textView", "getTextView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        public static final int e = 8;
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.gn, false, 2, null);

        public final C1204Sr d() {
            return (C1204Sr) this.a.getValue(this, b[0]);
        }
    }
}
