package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* renamed from: o.bKb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3772bKb extends AbstractC3336ax<c> {
    private String b;
    private Integer c;
    private Drawable d;
    private View.OnClickListener f;
    private Integer h;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.n;
    }

    public final void a_(Drawable drawable) {
        this.d = drawable;
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public final void e(Integer num) {
        this.c = num;
    }

    public final void g_(Integer num) {
        this.h = num;
    }

    public final String i() {
        return this.b;
    }

    public final Integer k() {
        return this.c;
    }

    public final View.OnClickListener l() {
        return this.f;
    }

    public final Integer m() {
        return this.h;
    }

    public final Drawable o() {
        return this.d;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(c cVar) {
        dpR dpr;
        C8632dsu.c((Object) cVar, "");
        Integer num = this.h;
        if (num != null) {
            cVar.a().setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(cVar.r().getContext(), num.intValue())));
        }
        Integer num2 = this.c;
        if (num2 != null) {
            cVar.a().setImageResource(num2.intValue());
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            cVar.a().setImageDrawable(null);
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            cVar.a().setImageDrawable(drawable);
        }
        NetflixImageView a = cVar.a();
        View.OnClickListener onClickListener = this.f;
        a.setOnClickListener(onClickListener);
        a.setClickable(onClickListener != null);
        cVar.a().setContentDescription(this.b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        NetflixImageView a = cVar.a();
        a.setOnClickListener(null);
        a.setClickable(false);
        super.b((AbstractC3772bKb) cVar);
    }

    /* renamed from: o.bKb$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(c.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        public static final int b = 8;
        private final dsZ e = bIF.d(this, C3796bKz.a.h, false, 2, null);

        public final NetflixImageView a() {
            return (NetflixImageView) this.e.getValue(this, a[0]);
        }
    }
}
