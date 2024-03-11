package o;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* renamed from: o.bLu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3818bLu extends AbstractC3336ax<d> {
    private Integer b;
    private Integer c;
    private boolean d;
    private View.OnClickListener f;
    private CharSequence g;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.I;
    }

    public final void a(Integer num) {
        this.b = num;
    }

    public final void c_(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public final boolean i() {
        return this.d;
    }

    public final void k_(Integer num) {
        this.c = num;
    }

    public final View.OnClickListener l() {
        return this.f;
    }

    public final Integer m() {
        return this.c;
    }

    public final Integer n() {
        return this.b;
    }

    public final CharSequence o() {
        return this.g;
    }

    public final void r_(boolean z) {
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // o.AbstractC3336ax
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC3818bLu.d r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r7, r0)
            androidx.appcompat.widget.Toolbar r1 = r7.d()
            java.lang.CharSequence r2 = r6.g
            r1.setTitle(r2)
            java.lang.Integer r1 = r6.c
            r2 = 0
            if (r1 == 0) goto L5e
            int r1 = r1.intValue()
            androidx.appcompat.widget.Toolbar r3 = r7.d()
            android.view.View$OnClickListener r4 = r6.f
            r3.setNavigationOnClickListener(r4)
            androidx.appcompat.widget.Toolbar r3 = r7.d()
            android.content.Context r3 = r3.getContext()
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r3, r1)
            if (r1 == 0) goto L5e
            o.C8632dsu.d(r1)
            androidx.appcompat.widget.Toolbar r3 = r7.d()
            android.content.Context r3 = r3.getContext()
            o.C8632dsu.a(r3, r0)
            boolean r0 = r6.d
            int r4 = o.C3796bKz.b.b
            int r5 = o.C3796bKz.b.c
            o.C9690vE.c(r1, r3, r0, r4, r5)
            androidx.appcompat.widget.Toolbar r0 = r7.d()
            r0.setNavigationIcon(r1)
            java.lang.Integer r0 = r6.b
            if (r0 == 0) goto L5e
            int r0 = r0.intValue()
            androidx.appcompat.widget.Toolbar r1 = r7.d()
            r1.setNavigationContentDescription(r0)
            o.dpR r0 = o.dpR.c
            goto L5f
        L5e:
            r0 = r2
        L5f:
            if (r0 != 0) goto L6f
            androidx.appcompat.widget.Toolbar r0 = r7.d()
            r0.setNavigationOnClickListener(r2)
            androidx.appcompat.widget.Toolbar r7 = r7.d()
            r7.setNavigationIcon(r2)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3818bLu.e(o.bLu$d):void");
    }

    /* renamed from: o.bLu$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        private final dsZ a = bIF.d(this, C3796bKz.a.C, false, 2, null);
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(d.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0))};
        public static final int c = 8;

        public final Toolbar d() {
            return (Toolbar) this.a.getValue(this, e[0]);
        }
    }
}
