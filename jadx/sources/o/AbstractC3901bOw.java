package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3895bOq;

/* renamed from: o.bOw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3901bOw extends AbstractC3336ax<d> {
    public static final c c = new c(null);
    private String b;
    private String d;
    private String f;
    private View.OnClickListener g;
    private boolean h;
    private String i;
    private String j;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f13529o;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.e;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void c(Drawable drawable) {
        this.f13529o = drawable;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public final String i() {
        return this.d;
    }

    public final boolean k() {
        return this.h;
    }

    public final View.OnClickListener l() {
        return this.g;
    }

    public final String m() {
        return this.f;
    }

    public final String n() {
        return this.b;
    }

    public final String o() {
        return this.j;
    }

    public final void p_(String str) {
        this.d = str;
    }

    public final String q() {
        return this.i;
    }

    public final void q_(String str) {
        this.b = str;
    }

    public final Drawable r() {
        return this.f13529o;
    }

    public final void r_(String str) {
        this.j = str;
    }

    public final void s_(String str) {
        this.f = str;
    }

    public final void t_(String str) {
        this.i = str;
    }

    /* renamed from: o.bOw$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("GameBillboardIconAndTitleModel");
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        if (this.f13529o != null) {
            dVar.d().setVisibility(8);
            dVar.e().setVisibility(0);
            dVar.e().setImageDrawable(this.f13529o);
            NetflixImageView e = dVar.e();
            String str = this.i;
            e.setContentDescription((str == null || !C8632dsu.c((Object) this.b, (Object) str)) ? this.b : null);
        } else {
            e(dVar.d(), this.d);
            dVar.e().setVisibility(8);
        }
        e(dVar.b(), this.i);
        dVar.a().setVisibility(this.h ? 0 : 8);
        e(dVar.c(), this.f);
        View f = dVar.f();
        View.OnClickListener onClickListener = this.g;
        f.setOnClickListener(onClickListener);
        f.setClickable(onClickListener != null);
    }

    private final void e(TextView textView, String str) {
        int i;
        boolean g;
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                i = 0;
                textView.setVisibility(i);
                textView.setText(str);
            }
        }
        i = 8;
        textView.setVisibility(i);
        textView.setText(str);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        View f = dVar.f();
        f.setOnClickListener(null);
        f.setClickable(false);
    }

    /* renamed from: o.bOw$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(d.class, "genreText", "getGenreText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "ratingText", "getRatingText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "installedText", "getInstalledText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "certificationIcon", "getCertificationIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "ratingsView", "getRatingsView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(d.class, "ratingDescriptionText", "getRatingDescriptionText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ d = bIF.d(this, C3895bOq.b.q, false, 2, null);
        private final dsZ j = bIF.d(this, C3895bOq.b.Z, false, 2, null);
        private final dsZ a = bIF.d(this, C3895bOq.b.B, false, 2, null);
        private final dsZ e = bIF.d(this, C3895bOq.b.j, false, 2, null);
        private final dsZ f = bIF.d(this, C3895bOq.b.Y, false, 2, null);
        private final dsZ c = bIF.d(this, C3895bOq.b.W, false, 2, null);

        public final C1204Sr c() {
            return (C1204Sr) this.d.getValue(this, b[0]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.j.getValue(this, b[1]);
        }

        public final C1204Sr a() {
            return (C1204Sr) this.a.getValue(this, b[2]);
        }

        public final NetflixImageView e() {
            return (NetflixImageView) this.e.getValue(this, b[3]);
        }

        public final View f() {
            return (View) this.f.getValue(this, b[4]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.c.getValue(this, b[5]);
        }
    }
}
