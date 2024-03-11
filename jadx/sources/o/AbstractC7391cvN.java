package o;

import android.view.View;
import android.widget.ProgressBar;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7373cuw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cvN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7391cvN extends AbstractC3336ax<c> {
    private float b;
    private float c;
    private boolean d = true;
    private float j;

    @Override // o.AbstractC3073as
    public int a() {
        return C7373cuw.b.j;
    }

    public final void b(float f) {
        this.j = f;
    }

    public final void b_(float f) {
        this.c = f;
    }

    public final void d(float f) {
        this.b = f;
    }

    public final void e(boolean z) {
        this.d = z;
    }

    public final float i() {
        return this.c;
    }

    public final boolean k() {
        return this.d;
    }

    public final float m() {
        return this.b;
    }

    public final float o() {
        return this.j;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(c cVar) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) cVar, "");
        if (this.b <= 0.0f) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("DownloadContentModel: missing/invalid required params", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c2 = errorType.c();
                    c1596aHd.a(c2 + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        cVar.d().setSecondaryProgress((int) ((this.j * 100.0d) / this.b));
        cVar.d().setProgress(((int) ((this.c * 100.0d) / this.b)) + cVar.d().getSecondaryProgress());
        cVar.r().setEnabled(this.d);
        cVar.a().setVisibility(this.d ? 8 : 0);
        float max = Math.max((this.b - this.j) - this.c, 0.0f);
        C1204Sr e = cVar.e();
        int i = com.netflix.mediaclient.ui.R.o.bm;
        dsE dse = dsE.b;
        String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(max)}, 1));
        C8632dsu.a(format, "");
        e.setText(C8168dfL.a(i, format));
        C1204Sr b2 = cVar.b();
        int i2 = com.netflix.mediaclient.ui.R.o.bo;
        String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(this.c)}, 1));
        C8632dsu.a(format2, "");
        b2.setText(C8168dfL.a(i2, format2));
    }

    /* renamed from: o.cvN$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(c.class, "progress", "getProgress()Landroid/widget/ProgressBar;", 0)), dsA.c(new PropertyReference1Impl(c.class, "elected", "getElected()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "remaining", "getRemaining()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "overlay", "getOverlay()Landroid/view/View;", 0))};
        public static final int e = 8;
        private final dsZ d = bIF.d(this, C7373cuw.c.R, false, 2, null);
        private final dsZ a = bIF.d(this, C7373cuw.c.t, false, 2, null);
        private final dsZ j = bIF.d(this, C7373cuw.c.F, false, 2, null);
        private final dsZ c = bIF.d(this, C7373cuw.c.z, false, 2, null);

        public final ProgressBar d() {
            return (ProgressBar) this.d.getValue(this, b[0]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.a.getValue(this, b[1]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.j.getValue(this, b[2]);
        }

        public final View a() {
            return (View) this.c.getValue(this, b[3]);
        }
    }
}
