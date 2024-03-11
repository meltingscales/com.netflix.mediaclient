package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* loaded from: classes4.dex */
public abstract class bJI extends AbstractC3336ax<c> {
    private String b;
    private Integer c;
    private Float d;
    private View.OnClickListener g;
    private Drawable h;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.f13518o;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void b_(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final void d(Drawable drawable) {
        this.h = drawable;
    }

    public final void d(Float f) {
        this.d = f;
    }

    public final void d(Integer num) {
        this.c = num;
    }

    public final Integer i() {
        return this.c;
    }

    public final Float l() {
        return this.d;
    }

    public final Drawable m() {
        return this.h;
    }

    public final View.OnClickListener n() {
        return this.g;
    }

    public final String o() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        super.e((bJI) cVar);
        FloatingActionButton d = cVar.d();
        View.OnClickListener onClickListener = this.g;
        d.setOnClickListener(onClickListener);
        d.setClickable(onClickListener != null);
        Float f = this.d;
        if (f != null) {
            cVar.d().setCompatElevation(f.floatValue());
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            cVar.d().setImageDrawable(drawable);
        }
        Integer num = this.c;
        if (num != null) {
            cVar.d().setBackgroundTintList(ColorStateList.valueOf(num.intValue()));
        }
        String str = this.b;
        if (str != null) {
            cVar.d().setContentDescription(str);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        FloatingActionButton d = cVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
        super.b((bJI) cVar);
    }

    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(c.class, "floatingActionButton", "getFloatingActionButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0))};
        public static final int e = 8;
        private final dsZ d = bIF.d(this, C3796bKz.a.g, false, 2, null);

        public final FloatingActionButton d() {
            return (FloatingActionButton) this.d.getValue(this, b[0]);
        }
    }
}
