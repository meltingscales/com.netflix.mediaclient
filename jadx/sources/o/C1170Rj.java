package o;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.Rj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1170Rj {
    public static final C1170Rj e = new C1170Rj();

    /* renamed from: o.Rj$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private int a;
        private int b;

        public final int c() {
            return this.a;
        }

        public final void c(int i) {
            this.b = i;
        }

        public final int d() {
            return this.b;
        }

        public final void e(int i) {
            this.a = i;
        }
    }

    private final boolean c(int i) {
        return i == 0 || i == -2;
    }

    private C1170Rj() {
    }

    public final void c(a aVar, Float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        C8632dsu.c((Object) aVar, "");
        if (f == null || f.floatValue() <= 0.0f || layoutParams == null) {
            return;
        }
        if (c(layoutParams.height)) {
            aVar.e(View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.d()) - i) / f.floatValue()) + i2), aVar.c()), 1073741824));
        } else if (c(layoutParams.width)) {
            aVar.c(View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.c()) - i2) * f.floatValue()) + i), aVar.d()), 1073741824));
        }
    }
}
