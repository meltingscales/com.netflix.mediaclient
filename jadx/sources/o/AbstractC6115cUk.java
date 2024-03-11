package o;

import android.view.View;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6035cRo;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cUk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6115cUk extends AbstractC3336ax<c> {
    @Override // o.AbstractC3073as
    public int a() {
        return C6035cRo.e.n;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void c(int i, c cVar) {
        C8632dsu.c((Object) cVar, "");
        AnimatedVectorDrawableCompat c2 = cVar.c();
        if (c2 != null) {
            if (i == 0) {
                if (c2.isRunning()) {
                    return;
                }
                c2.start();
            } else if (i == 1 && c2.isRunning()) {
                c2.stop();
            }
        }
    }

    /* renamed from: o.cUk$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(c.class, "loadingView", "getLoadingView()Landroid/view/View;", 0))};
        private AnimatedVectorDrawableCompat a;
        private final dsZ e = bIF.d(this, C6035cRo.d.d, false, 2, null);

        public final AnimatedVectorDrawableCompat c() {
            return this.a;
        }

        private final View a() {
            return (View) this.e.getValue(this, b[0]);
        }

        @Override // o.bIG
        public void a(View view) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) view, "");
            if (C8141del.a()) {
                return;
            }
            try {
                this.a = AnimatedVectorDrawableCompat.create(a().getContext(), com.netflix.mediaclient.ui.R.e.b);
                a().setBackground(this.a);
            } catch (Exception e) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("Unable to load avd_lolomo_single_row_loading_more_skeleton", e, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b2);
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
                } else {
                    dVar.e().b(c1596aHd, th);
                }
            }
        }
    }
}
