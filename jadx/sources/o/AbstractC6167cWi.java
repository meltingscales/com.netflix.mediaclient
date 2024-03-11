package o;

import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC6184cWz;
import o.cVP;

/* renamed from: o.cWi  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC6167cWi extends AbstractC3336ax<c> {
    private C9935zP b;
    private Integer c;
    private Integer g;
    private Integer h;
    private boolean d = true;
    private final View.OnClickListener i = new View.OnClickListener() { // from class: o.cWp
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC6167cWi.d(AbstractC6167cWi.this, view);
        }
    };

    public final void M_(boolean z) {
        this.d = z;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return cVP.b.a;
    }

    public final void c(Integer num) {
        this.c = num;
    }

    public final void e(C9935zP c9935zP) {
        this.b = c9935zP;
    }

    public final boolean i() {
        return this.d;
    }

    public final Integer l() {
        return this.c;
    }

    public final C9935zP m() {
        return this.b;
    }

    public final Integer n() {
        return this.g;
    }

    public final Integer o() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC6167cWi abstractC6167cWi, View view) {
        C8632dsu.c((Object) abstractC6167cWi, "");
        C9935zP c9935zP = abstractC6167cWi.b;
        if (c9935zP != null) {
            c9935zP.b(AbstractC6184cWz.class, AbstractC6184cWz.d.e.c);
        }
    }

    @Override // o.AbstractC3336ax
    public void e(c cVar) {
        dpR dpr;
        C8632dsu.c((Object) cVar, "");
        Integer num = this.c;
        if (num != null) {
            cVar.c().setImageResource(num.intValue());
            Integer num2 = this.h;
            int intValue = num2 != null ? num2.intValue() : cVar.c().getResources().getDimensionPixelSize(cVP.a.c);
            Integer num3 = this.g;
            int intValue2 = num3 != null ? num3.intValue() : cVar.c().getResources().getDimensionPixelSize(cVP.a.b);
            NetflixImageView c2 = cVar.c();
            c2.setPadding(c2.getPaddingLeft(), c2.getPaddingTop(), c2.getPaddingRight(), intValue);
            NetflixImageView c3 = cVar.c();
            ViewGroup.LayoutParams layoutParams = c3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = intValue2;
                c3.setLayoutParams(layoutParams);
                NetflixImageView a = cVar.a();
                ViewGroup.LayoutParams layoutParams2 = a.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = intValue2;
                    a.setLayoutParams(layoutParams2);
                    dpr = dpR.c;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else {
            dpr = null;
        }
        if (dpr == null) {
            cVar.c().setImageDrawable(null);
        }
        if (this.d) {
            cVar.b().setVisibility(0);
            cVar.b().setOnClickListener(this.i);
            return;
        }
        cVar.b().setVisibility(8);
        cVar.b().setOnClickListener(null);
    }

    /* renamed from: o.cWi$c */
    /* loaded from: classes6.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(c.class, "tvFrame", "getTvFrame()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "image", "getImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "close", "getClose()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0))};
        private final dsZ d = bIF.d(this, cVP.c.m, false, 2, null);
        private final dsZ a = bIF.d(this, cVP.c.e, false, 2, null);
        private final dsZ c = bIF.d(this, cVP.c.a, false, 2, null);

        public final NetflixImageView a() {
            return (NetflixImageView) this.d.getValue(this, e[0]);
        }

        public final NetflixImageView c() {
            return (NetflixImageView) this.a.getValue(this, e[1]);
        }

        public final C1193Sg b() {
            return (C1193Sg) this.c.getValue(this, e[2]);
        }
    }
}
