package o;

import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6035cRo;

/* loaded from: classes4.dex */
public abstract class cTZ extends AbstractC3336ax<b> {
    private String b;
    private String c;
    private View.OnClickListener d;

    @Override // o.AbstractC3073as
    public int a() {
        return C6035cRo.e.k;
    }

    public final void ad_(String str) {
        this.b = str;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void e(String str) {
        this.c = str;
    }

    public final String i() {
        return this.c;
    }

    public final String l() {
        return this.b;
    }

    public final View.OnClickListener n() {
        return this.d;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.a().showImage(this.c);
        bVar.a().setContentDescription(this.b);
        bVar.a().setOnClickListener(this.d);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.a().clearImage();
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, "bannerImageView", "getBannerImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        private final dsZ c = bIF.d(this, C6035cRo.d.a, false, 2, null);

        public final NetflixImageView a() {
            return (NetflixImageView) this.c.getValue(this, e[0]);
        }
    }
}
