package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.util.ViewUtils;
import java.util.Map;
import o.C1180Rt;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Rd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1164Rd extends RG {
    private final View g;
    private final AnimatedVectorDrawableCompat i;
    private final Runnable n;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f13393o;
    public static final e b = new e(null);
    public static final int d = 8;
    public static final c c = new c.e();
    public static final c a = new c.b();
    public static final c e = new c.C0088c();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1164Rd(View view, C1180Rt.d dVar, AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
        super(view, dVar, com.netflix.mediaclient.ui.R.g.k);
        C8632dsu.c((Object) view, "");
        this.g = view;
        this.i = animatedVectorDrawableCompat;
        this.n = new Runnable() { // from class: o.Rg
            @Override // java.lang.Runnable
            public final void run() {
                C1164Rd.d(C1164Rd.this);
            }
        };
        this.f13393o = new Runnable() { // from class: o.Rk
            @Override // java.lang.Runnable
            public final void run() {
                C1164Rd.b(C1164Rd.this);
            }
        };
        a(false);
        ((RG) this).f.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.Rh
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C1164Rd.d(C1164Rd.this, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* renamed from: o.Rd$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("AnimatedLoadingAndErrorWrapper");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AnimatedVectorDrawableCompat c(Context context, c cVar) {
            Map d;
            Map k;
            Throwable th;
            try {
                return AnimatedVectorDrawableCompat.create(context, cVar.d());
            } catch (Exception e) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                String str = "Unable to start or load animatedVectorDrawable " + cVar.d() + " as " + context.getResources().getResourceName(cVar.d());
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(str, e, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        c1596aHd.a(errorType.c() + " " + b);
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
                return null;
            }
        }
    }

    /* renamed from: o.Rd$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        public abstract int d();

        private c() {
        }

        /* renamed from: o.Rd$c$e */
        /* loaded from: classes3.dex */
        public static final class e extends c {
            private final int c;

            @Override // o.C1164Rd.c
            public int d() {
                return this.c;
            }

            public e() {
                super(null);
                this.c = com.netflix.mediaclient.ui.R.e.c;
            }
        }

        /* renamed from: o.Rd$c$b */
        /* loaded from: classes3.dex */
        public static final class b extends c {
            private final int e;

            @Override // o.C1164Rd.c
            public int d() {
                return this.e;
            }

            public b() {
                super(null);
                this.e = com.netflix.mediaclient.ui.R.e.d;
            }
        }

        /* renamed from: o.Rd$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0088c extends c {
            private final int c;

            @Override // o.C1164Rd.c
            public int d() {
                return this.c;
            }

            public C0088c() {
                super(null);
                this.c = com.netflix.mediaclient.ui.R.e.a;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1164Rd(android.view.View r4, o.C1180Rt.d r5, o.C1164Rd.c r6) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r4, r0)
            o.C8632dsu.c(r6, r0)
            o.Rd$e r1 = o.C1164Rd.b
            android.content.Context r2 = r4.getContext()
            o.C8632dsu.a(r2, r0)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r6 = o.C1164Rd.e.c(r1, r2, r6)
            r3.<init>(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1164Rd.<init>(android.view.View, o.Rt$d, o.Rd$c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1164Rd c1164Rd) {
        C8632dsu.c((Object) c1164Rd, "");
        C8166dfJ.e(null, false, 3, null);
        if (ViewUtils.e(((RG) c1164Rd).f)) {
            return;
        }
        b.getLogTag();
        C8254dgs.d(((RG) c1164Rd).f, false);
        c1164Rd.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1164Rd c1164Rd) {
        C8632dsu.c((Object) c1164Rd, "");
        C8166dfJ.e(null, false, 3, null);
        if (ViewUtils.e(((RG) c1164Rd).f)) {
            return;
        }
        b.getLogTag();
        C8254dgs.d(((RG) c1164Rd).f, true);
        c1164Rd.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C1164Rd c1164Rd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        C8632dsu.c((Object) c1164Rd, "");
        if ((i == i5 && i3 == i7) || (animatedVectorDrawableCompat = c1164Rd.i) == null) {
            return;
        }
        View view2 = ((RG) c1164Rd).f;
        C8632dsu.a(view2, "");
        C9870yD.c(view2, animatedVectorDrawableCompat, i3 - i);
    }

    @Override // o.RG
    public void a(boolean z) {
        d();
        super.b(z);
        if (((RG) this).f.getVisibility() == 0) {
            b.getLogTag();
            return;
        }
        b.getLogTag();
        this.h.postDelayed(z ? this.f13393o : this.n, RG.j);
    }

    @Override // o.RG
    protected void d() {
        this.h.removeCallbacks(this.n);
        this.h.removeCallbacks(this.f13393o);
        b();
    }

    private final void a() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        if (C8141del.a() || (animatedVectorDrawableCompat = this.i) == null) {
            return;
        }
        ((RG) this).f.setBackground(animatedVectorDrawableCompat);
        if (animatedVectorDrawableCompat.isRunning()) {
            return;
        }
        animatedVectorDrawableCompat.start();
    }

    private final void b() {
        if (C8141del.a()) {
            return;
        }
        Drawable background = ((RG) this).f.getBackground();
        if (background instanceof AnimatedVectorDrawableCompat) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) background;
            if (animatedVectorDrawableCompat.isRunning()) {
                animatedVectorDrawableCompat.stop();
            }
            ((RG) this).f.setBackground(null);
        }
    }
}
