package o;

import android.view.View;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* loaded from: classes4.dex */
public abstract class bGC extends AbstractC3336ax<b> {
    private View.OnClickListener c;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.b;
    }

    public final void a(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final View.OnClickListener i() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        View c = bVar.c();
        View.OnClickListener onClickListener = this.c;
        c.setOnClickListener(onClickListener);
        c.setClickable(onClickListener != null);
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(b.class, "shareButton", "getShareButton()Landroid/view/View;", 0))};
        private final dsZ a = bIF.d(this, C3670bGh.a.y, false, 2, null);

        public final View c() {
            return (View) this.a.getValue(this, b[0]);
        }
    }
}
