package o;

import android.view.View;
import android.view.ViewParent;
import o.C3796bKz;
import o.aLX;

/* loaded from: classes4.dex */
public abstract class bKT extends AbstractC3336ax<bIG> {
    private boolean b;
    private View.OnClickListener c;
    private Integer d;
    private int g;
    private Integer j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.e;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void b(Integer num) {
        this.j = num;
    }

    public final void c(Integer num) {
        this.d = num;
    }

    public final void e(int i) {
        this.g = i;
    }

    public final View.OnClickListener i() {
        return this.c;
    }

    public final Integer k() {
        return this.d;
    }

    public final int m() {
        return this.g;
    }

    public final Integer n() {
        return this.j;
    }

    public final boolean o() {
        return this.b;
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        b() {
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            view.setId(C3796bKz.a.u);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public bIG b(ViewParent viewParent) {
        C8632dsu.c((Object) viewParent, "");
        return new b();
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(bIG big) {
        C8632dsu.c((Object) big, "");
        big.r().setTag(aLX.a.e, Boolean.valueOf(this.b));
        big.r().setVisibility(this.g);
        Integer num = this.j;
        if (num != null) {
            big.r().getLayoutParams().width = num.intValue();
        }
        Integer num2 = this.d;
        if (num2 != null) {
            big.r().getLayoutParams().height = num2.intValue();
        }
        big.r().requestLayout();
        View r = big.r();
        View.OnClickListener onClickListener = this.c;
        r.setOnClickListener(onClickListener);
        r.setClickable(onClickListener != null);
    }
}
