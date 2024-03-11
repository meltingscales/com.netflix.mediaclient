package o;

import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AbstractC9791we;
import o.C1194Sh;
import o.C1204Sr;
import o.C8174dfR;
import o.C9795wi;
import o.C9806wt;
import o.C9834xU;
import o.SJ;
import o.dpR;

/* renamed from: o.wt  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9806wt extends AbstractC9710vY implements InterfaceC9810wx {
    public static final c c;
    private static byte e$ss2$3519 = 0;
    private static int p = 0;
    private static int v = 1;
    private final View a;
    private final int d;
    private final C1204Sr e;
    private final C1204Sr f;
    private drO<dpR> g;
    private boolean h;
    private boolean i;
    private final C1193Sg j;
    private final SJ k;
    private final C1204Sr l;
    private final ConstraintLayout m;
    private final C1194Sh n;

    /* renamed from: o  reason: collision with root package name */
    private final SJ f13907o;
    private boolean q;
    private int r;
    private final View s;
    private final C1193Sg t;

    static {
        r();
        c = new c(null);
    }

    static void r() {
        e$ss2$3519 = (byte) 24;
    }

    @Override // o.InterfaceC9810wx
    public void c(drO<dpR> dro) {
        this.g = dro;
    }

    public void c(boolean z) {
        this.q = z;
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return this.s;
    }

    @Override // o.InterfaceC9810wx
    public boolean i() {
        return this.i;
    }

    @Override // o.InterfaceC9810wx
    public boolean j() {
        return this.q;
    }

    public drO<dpR> t() {
        return this.g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9806wt(View view, C9812wz c9812wz) {
        super(view);
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) c9812wz, "");
        SJ sj = c9812wz.v;
        C8632dsu.a(sj, "");
        this.f13907o = sj;
        C1193Sg c1193Sg = c9812wz.q;
        C8632dsu.a(c1193Sg, "");
        this.j = c1193Sg;
        C1204Sr c1204Sr = c9812wz.f13908o;
        C8632dsu.a(c1204Sr, "");
        this.f = c1204Sr;
        C1204Sr c1204Sr2 = c9812wz.w;
        C8632dsu.a(c1204Sr2, "");
        this.l = c1204Sr2;
        C1194Sh c1194Sh = c9812wz.y;
        C8632dsu.a(c1194Sh, "");
        this.n = c1194Sh;
        SJ sj2 = (SJ) view.findViewById(C9795wi.a.F);
        this.k = sj2;
        C1193Sg c1193Sg2 = (C1193Sg) view.findViewById(C9795wi.a.I);
        this.t = c1193Sg2;
        C1204Sr c1204Sr3 = c9812wz.g;
        C8632dsu.a(c1204Sr3, "");
        this.e = c1204Sr3;
        ConstraintLayout constraintLayout = c9812wz.u;
        C8632dsu.a(constraintLayout, "");
        this.m = constraintLayout;
        View view2 = c9812wz.k;
        C8632dsu.a(view2, "");
        this.a = view2;
        this.i = true;
        c1193Sg.setOnClickListener(new View.OnClickListener() { // from class: o.wA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C9806wt.e(C9806wt.this, view3);
            }
        });
        if (c1193Sg2 != null) {
            c1193Sg2.setOnClickListener(new View.OnClickListener() { // from class: o.wB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C9806wt.c(C9806wt.this, view3);
                }
            });
        }
        b bVar = new b();
        sj.setOnSeekButtonListener(bVar);
        if (sj2 != null) {
            sj2.setOnSeekButtonListener(bVar);
        }
        c1194Sh.setOnSeekBarChangeListener(new C1194Sh.d() { // from class: o.wt.3
            private final Map<View, Integer> b = new LinkedHashMap();
            private boolean e;

            @Override // o.C1194Sh.d
            public void d(C1194Sh c1194Sh2, int i) {
                C1194Sh.d.e.c(this, c1194Sh2, i);
            }

            @Override // o.C1194Sh.d
            public void e(C1194Sh c1194Sh2) {
                C8632dsu.c((Object) c1194Sh2, "");
                this.e = true;
                C9806wt.this.b((C9806wt) AbstractC9791we.l.b);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                C8632dsu.c((Object) seekBar, "");
                if (z) {
                    C9806wt.this.b((C9806wt) new AbstractC9791we.n(i));
                }
                C9806wt c9806wt = C9806wt.this;
                c9806wt.c(c9806wt.n.getProgress());
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                C8632dsu.c((Object) seekBar, "");
                this.e = false;
                C9806wt.this.c(true);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                C8632dsu.c((Object) seekBar, "");
                if (!this.e) {
                    drO<dpR> t = C9806wt.this.t();
                    if (t != null) {
                        t.invoke();
                    }
                    C9806wt.this.b((C9806wt) new AbstractC9791we.m(seekBar.getProgress()));
                }
                this.b.clear();
                C9806wt c9806wt = C9806wt.this;
                c9806wt.c(c9806wt.n.getProgress());
                C9806wt.this.c(false);
            }
        });
        this.s = view;
        this.d = e().getId();
        this.h = true;
    }

    /* renamed from: o.wt$c */
    /* loaded from: classes2.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MdxControlsUIViewImpl");
        }
    }

    @Override // o.InterfaceC9810wx
    public void e(boolean z) {
        int i;
        int i2 = 2 % 2;
        this.i = z;
        C1193Sg c1193Sg = this.j;
        String string = c1193Sg.getContext().getString(z ? C9834xU.h.b : C9834xU.h.a);
        if (string.startsWith("'!#+")) {
            int i3 = p + 43;
            v = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            u(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        c1193Sg.setContentDescription(string);
        C1193Sg c1193Sg2 = this.j;
        if (i()) {
            int i5 = v + 21;
            p = i5 % 128;
            int i6 = i5 % 2;
            i = C9795wi.d.b;
        } else {
            i = C9795wi.d.a;
        }
        c1193Sg2.setImageResource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C9806wt c9806wt, View view) {
        C8632dsu.c((Object) c9806wt, "");
        if (!c9806wt.i()) {
            c9806wt.b((C9806wt) AbstractC9791we.j.c);
        } else {
            c9806wt.b((C9806wt) AbstractC9791we.i.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C9806wt c9806wt, View view) {
        C8632dsu.c((Object) c9806wt, "");
        c9806wt.b((C9806wt) AbstractC9791we.s.c);
    }

    /* renamed from: o.wt$b */
    /* loaded from: classes2.dex */
    public static final class b implements SJ.a {
        b() {
        }

        @Override // o.SJ.a
        public void c(SJ sj, int i, int i2) {
            C8632dsu.c((Object) sj, "");
            C9806wt.this.b((C9806wt) new AbstractC9791we.q(i2));
        }

        @Override // o.SJ.a
        public void e(SJ sj, int i, int i2) {
            C8632dsu.c((Object) sj, "");
            drO<dpR> t = C9806wt.this.t();
            if (t != null) {
                t.invoke();
            }
            int e = sj.e() * i;
            C1194Sh c1194Sh = C9806wt.this.n;
            c1194Sh.setProgress(c1194Sh.getProgress() + e);
            C9806wt.this.b((C9806wt) new AbstractC9791we.k(i2, e));
        }
    }

    private final void d(int i) {
        if (i != this.r) {
            this.m.setVisibility(i);
            this.a.setVisibility(i);
            this.r = i;
        }
    }

    private final void d(boolean z) {
        if (z != this.h) {
            this.f13907o.setEnabled(z);
            SJ sj = this.k;
            if (sj != null) {
                sj.setEnabled(z);
            }
            this.j.setEnabled(z);
            C1193Sg c1193Sg = this.t;
            if (c1193Sg != null) {
                c1193Sg.setEnabled(z);
            }
            this.f.setEnabled(z);
            this.l.setEnabled(z);
            this.n.setEnabled(z);
            this.h = z;
        }
    }

    @Override // o.InterfaceC9810wx
    public void f() {
        this.n.setProgress(0);
        this.n.setMax(0);
        this.f.setText((CharSequence) null);
        this.l.setText((CharSequence) null);
    }

    @Override // o.InterfaceC9810wx
    public void h() {
        this.j.setVisibility(4);
    }

    @Override // o.InterfaceC9810wx
    public void l() {
        this.f13907o.setVisibility(4);
    }

    @Override // o.InterfaceC9810wx
    public void k() {
        this.j.setVisibility(0);
    }

    @Override // o.InterfaceC9810wx
    public void o() {
        this.f13907o.setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        d(true);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        d(false);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        d(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        d(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i) {
        C9726vo.d(Integer.valueOf(i), Integer.valueOf(this.n.getMax()), new drX<Integer, Integer, dpR>() { // from class: com.netflix.android.mdxpanel.controls.MdxControlsUIViewImpl$setTimeTexts$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Integer num, Integer num2) {
                d(num.intValue(), num2.intValue());
                return dpR.c;
            }

            public final void d(int i2, int i3) {
                C1204Sr c1204Sr;
                C8174dfR p2;
                C1204Sr c1204Sr2;
                C8174dfR p3;
                c1204Sr = C9806wt.this.f;
                p2 = C9806wt.this.p();
                c1204Sr.setText(p2.d(i2));
                c1204Sr2 = C9806wt.this.l;
                p3 = C9806wt.this.p();
                c1204Sr2.setText(p3.d(i3 - i2));
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r0 != r3.intValue()) goto L25;
     */
    @Override // o.InterfaceC9810wx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.lang.Integer r3, java.lang.Integer r4) {
        /*
            r2 = this;
            o.Sr r0 = r2.f
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L1f
            o.Sr r0 = r2.l
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L1f
            o.Sh r0 = r2.n
            int r0 = r0.getProgress()
            if (r3 != 0) goto L19
            goto L1f
        L19:
            int r1 = r3.intValue()
            if (r0 == r1) goto L2f
        L1f:
            o.Sh r0 = r2.n
            if (r3 == 0) goto L28
            int r1 = r3.intValue()
            goto L2c
        L28:
            int r1 = r0.getProgress()
        L2c:
            r0.setProgress(r1)
        L2f:
            o.Sh r0 = r2.n
            if (r4 == 0) goto L38
            int r4 = r4.intValue()
            goto L3c
        L38:
            int r4 = r0.getMax()
        L3c:
            r0.setMax(r4)
            if (r3 == 0) goto L61
            o.Sh r4 = r2.n
            int r4 = r4.getMax()
            if (r4 != 0) goto L61
            int r4 = r3.intValue()
            if (r4 <= 0) goto L61
            o.Sh r4 = r2.n
            int r0 = r3.intValue()
            r4.setMax(r0)
            o.Sh r4 = r2.n
            int r3 = r3.intValue()
            r4.setProgress(r3)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9806wt.d(java.lang.Integer, java.lang.Integer):void");
    }

    @Override // o.InterfaceC9810wx
    public void m() {
        this.f.setVisibility(0);
        this.l.setVisibility(0);
    }

    @Override // o.InterfaceC9810wx
    public void g() {
        this.f.setVisibility(4);
        this.l.setVisibility(4);
    }

    @Override // o.InterfaceC9810wx
    public void c(float f, int i) {
        C9789wc.d(this.f, c(j_(), f));
        this.f.setTranslationY(e(l_(), f));
        C9789wc.d(this.l, c(j_(), f));
        this.l.setTranslationY(e(l_(), f));
        C9789wc.d(this.n, c(j_(), f));
        this.n.setTranslationY(e(l_(), f));
        C1193Sg c1193Sg = this.t;
        if (c1193Sg != null) {
            C9789wc.d(c1193Sg, c(j_(), f));
        }
        SJ sj = this.k;
        if (sj != null) {
            C9789wc.d(sj, c(j_(), f));
        }
        if (f > 0.5f) {
            c(f, this.f13907o, this.j, this.t, this.k);
        } else {
            c(f, this.f13907o, this.j);
        }
        this.j.setScaleX(e(n(), f));
        this.j.setScaleY(e(n(), f));
        int bottom = this.n.getBottom() + this.m.getTop();
        m_()[1] = -((this.j.getTop() - bottom) - ((((this.e.getTop() + (this.e.getMeasuredHeight() / 2)) - ((this.n.getMeasuredHeight() / 2) + bottom)) / 2) - (this.j.getMeasuredHeight() / 2)));
        float a = a(m_(), f);
        this.f13907o.setTranslationY(a);
        this.j.setTranslationY(a);
        C1193Sg c1193Sg2 = this.t;
        if (c1193Sg2 != null) {
            c1193Sg2.setTranslationY(a);
        }
        SJ sj2 = this.k;
        if (sj2 != null) {
            sj2.setTranslationY(a);
        }
        float f2 = -((o_().getMeasuredWidth() - i) / 2);
        n_()[0] = f2;
        k_()[0] = f2;
        int measuredWidth = this.j.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        C8632dsu.a(layoutParams, "");
        int c2 = C9687vB.c(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.j.getLayoutParams();
        C8632dsu.a(layoutParams2, "");
        k_()[1] = (i / 2) - (((measuredWidth + c2) + C9687vB.b(layoutParams2)) / 2);
        float a2 = a(n_(), f);
        this.f13907o.setTranslationX(a2);
        C1193Sg c1193Sg3 = this.t;
        if (c1193Sg3 != null) {
            c1193Sg3.setTranslationX(-a2);
        }
        SJ sj3 = this.k;
        if (sj3 != null) {
            sj3.setTranslationX(-a2);
        }
        this.j.setTranslationX(-a(k_(), f));
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$3519);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
