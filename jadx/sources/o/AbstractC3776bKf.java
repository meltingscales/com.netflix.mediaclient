package o;

import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* renamed from: o.bKf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3776bKf extends AbstractC3336ax<e> {
    private String c;
    private long d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.t;
    }

    public final void d(long j) {
        this.d = j;
    }

    public final long i() {
        return this.d;
    }

    public final String l() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        if (this.c != null) {
            eVar.e().setText(this.c);
            eVar.e().setVisibility(0);
        } else {
            eVar.e().setVisibility(8);
        }
        if (this.d > 0) {
            eVar.b().setAlpha(0.0f);
            eVar.e().setAlpha(0.0f);
            return;
        }
        eVar.b().setAlpha(1.0f);
        eVar.e().setAlpha(1.0f);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, e eVar) {
        C8632dsu.c((Object) eVar, "");
        super.a(i, (int) eVar);
        if (i == 1) {
            eVar.b().animate().cancel();
            eVar.e().animate().cancel();
        } else if (i != 2) {
        } else {
            if (this.d != 0) {
                eVar.b().animate().alpha(1.0f).setStartDelay(this.d);
                eVar.e().animate().alpha(1.0f).setStartDelay(this.d);
                return;
            }
            eVar.b().setAlpha(1.0f);
            eVar.e().setAlpha(1.0f);
        }
    }

    /* renamed from: o.bKf$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        private final dsZ a = bIF.d(this, C3796bKz.a.n, false, 2, null);
        private final dsZ c = bIF.d(this, C3796bKz.a.j, false, 2, null);
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(e.class, "spinner", "getSpinner()Landroid/widget/ProgressBar;", 0)), dsA.c(new PropertyReference1Impl(e.class, "label", "getLabel()Landroid/widget/TextView;", 0))};
        public static final int b = 8;

        public final ProgressBar b() {
            return (ProgressBar) this.a.getValue(this, e[0]);
        }

        public final TextView e() {
            return (TextView) this.c.getValue(this, e[1]);
        }
    }
}
