package o;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3670bGh;

/* renamed from: o.bIs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3735bIs extends AbstractC3336ax<b> {
    private CharSequence b;
    private CharSequence c;
    private float d;
    private CharSequence f;
    private CharSequence i;

    @Override // o.AbstractC3073as
    public int a() {
        return C3670bGh.e.G;
    }

    public final void a(float f) {
        this.d = f;
    }

    public final CharSequence i() {
        return this.b;
    }

    public final CharSequence k() {
        return this.c;
    }

    public final CharSequence l() {
        return this.f;
    }

    public final float n() {
        return this.d;
    }

    public final CharSequence o() {
        return this.i;
    }

    public final void o_(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final void p_(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void q_(CharSequence charSequence) {
        this.f = charSequence;
    }

    public final void r_(CharSequence charSequence) {
        this.i = charSequence;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        CharSequence charSequence = this.f;
        if (charSequence == null || charSequence.length() == 0) {
            bVar.c().setVisibility(8);
        } else {
            bVar.c().setVisibility(0);
            bVar.c().setText(this.f);
            C1204Sr c = bVar.c();
            CharSequence charSequence2 = this.i;
            if (charSequence2 == null) {
                charSequence2 = this.f;
            }
            c.setContentDescription(charSequence2);
        }
        if (this.d > 0.0f) {
            bVar.a().setVisibility(0);
            bVar.b().e(this.d);
            bVar.e().setBackground(bVar.b());
            bVar.d().setText(this.c);
            bVar.d().setContentDescription(this.b);
            return;
        }
        bVar.a().setVisibility(8);
    }

    /* renamed from: o.bIs$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, "progressContainer", "getProgressContainer()Landroid/view/ViewGroup;", 0)), dsA.c(new PropertyReference1Impl(b.class, "titleInfo", "getTitleInfo()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "progressView", "getProgressView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(b.class, "timeRemainingView", "getTimeRemainingView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ b = bIF.d(this, C3670bGh.a.x, false, 2, null);
        private final dsZ f = bIF.d(this, C3670bGh.a.c, false, 2, null);
        private final dsZ a = bIF.d(this, C3670bGh.a.a, false, 2, null);
        private final dsZ c = bIF.d(this, C3670bGh.a.d, false, 2, null);
        private final SC d = new SC(0, 0, 0.0f, 7, null);

        public final SC b() {
            return this.d;
        }

        public final ViewGroup a() {
            return (ViewGroup) this.b.getValue(this, e[0]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.f.getValue(this, e[1]);
        }

        public final View e() {
            return (View) this.a.getValue(this, e[2]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.c.getValue(this, e[3]);
        }
    }
}
