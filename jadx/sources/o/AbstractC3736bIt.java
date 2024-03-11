package o;

import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* renamed from: o.bIt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3736bIt extends AbstractC3336ax<e> {
    private CharSequence b;
    private String c;
    private View.OnClickListener d;
    private CharSequence g;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.F;
    }

    public final void d(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final CharSequence i() {
        return this.b;
    }

    public final void j_(String str) {
        this.c = str;
    }

    public final CharSequence k() {
        return this.g;
    }

    public final String m() {
        return this.c;
    }

    public final void m_(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final View.OnClickListener n() {
        return this.d;
    }

    public final void n_(CharSequence charSequence) {
        this.g = charSequence;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.d().setText(this.g);
        eVar.e().showImage(this.c);
        eVar.e().setContentDescription(this.b);
        NetflixImageView e2 = eVar.e();
        View.OnClickListener onClickListener = this.d;
        e2.setOnClickListener(onClickListener);
        e2.setClickable(onClickListener != null);
    }

    /* renamed from: o.bIt$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(e.class, "image", "getImage()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(e.class, "label", "getLabel()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ b = bIF.d(this, C3670bGh.a.v, false, 2, null);
        private final dsZ a = bIF.d(this, C3670bGh.a.w, false, 2, null);

        public final NetflixImageView e() {
            return (NetflixImageView) this.b.getValue(this, e[0]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.a.getValue(this, e[1]);
        }
    }
}
