package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import o.AbstractC9791we;
import o.C8632dsu;
import o.C9795wi;
import o.C9805ws;
import o.dpR;

/* renamed from: o.ws  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9805ws extends AbstractC9710vY implements InterfaceC9802wp {
    public static final c e = new c(null);
    private final C1204Sr a;
    private final C1193Sg c;
    private final int d;
    private Object f;
    private boolean g;
    private final C1193Sg h;
    private String i;
    private String j;
    private int k;
    private final C1193Sg l;
    private boolean m;
    private final View n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13906o;

    private final boolean r() {
        return (this.j == null || this.i == null) ? false : true;
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return this.n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9805ws(View view, C9812wz c9812wz) {
        super(view);
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) c9812wz, "");
        C1193Sg c1193Sg = c9812wz.d;
        C8632dsu.a(c1193Sg, "");
        this.c = c1193Sg;
        C1193Sg c1193Sg2 = c9812wz.z;
        C8632dsu.a(c1193Sg2, "");
        this.l = c1193Sg2;
        C1193Sg c1193Sg3 = c9812wz.m;
        C8632dsu.a(c1193Sg3, "");
        this.h = c1193Sg3;
        C1204Sr c1204Sr = c9812wz.g;
        C8632dsu.a(c1204Sr, "");
        this.a = c1204Sr;
        c1193Sg.setOnClickListener(new View.OnClickListener() { // from class: o.wr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C9805ws.b(C9805ws.this, view2);
            }
        });
        c1193Sg2.setOnClickListener(new View.OnClickListener() { // from class: o.wo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C9805ws.g(C9805ws.this, view2);
            }
        });
        c1193Sg3.setOnClickListener(new View.OnClickListener() { // from class: o.wq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C9805ws.h(C9805ws.this, view2);
            }
        });
        c1204Sr.setOnClickListener(new View.OnClickListener() { // from class: o.wu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C9805ws.i(C9805ws.this, view2);
            }
        });
        this.n = view;
        this.d = e().getId();
        this.g = true;
    }

    /* renamed from: o.ws$c */
    /* loaded from: classes2.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("MdxButtonsUIViewImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C9805ws c9805ws, View view) {
        C8632dsu.c((Object) c9805ws, "");
        c9805ws.b((C9805ws) AbstractC9791we.a.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C9805ws c9805ws, View view) {
        C8632dsu.c((Object) c9805ws, "");
        Object obj = c9805ws.f;
        if (obj != null) {
            c9805ws.b((C9805ws) new AbstractC9791we.p(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final C9805ws c9805ws, View view) {
        C8632dsu.c((Object) c9805ws, "");
        C9726vo.d(c9805ws.j, c9805ws.i, new drX<String, String, dpR>() { // from class: com.netflix.android.mdxpanel.buttons.MdxButtonsUIViewImpl$3$1
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(String str, String str2) {
                a(str, str2);
                return dpR.c;
            }

            public final void a(String str, String str2) {
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) str2, "");
                C9805ws.this.b((C9805ws) new AbstractC9791we.b(str, str2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C9805ws c9805ws, View view) {
        C8632dsu.c((Object) c9805ws, "");
        c9805ws.b((C9805ws) AbstractC9791we.c.a);
    }

    private final void e(int i) {
        if (i != this.k) {
            this.l.setVisibility(i);
            if (r()) {
                this.h.setVisibility(i);
            }
            this.k = i;
        }
    }

    private final void e(boolean z) {
        if (z != this.g) {
            this.c.setEnabled(z);
            this.l.setEnabled(z);
            this.h.setEnabled(z);
            this.g = z;
        }
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        e(8);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        e(true);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        e(false);
    }

    @Override // o.InterfaceC9802wp
    public void h() {
        g();
        this.a.setText((CharSequence) null);
        this.f = null;
        this.j = null;
        this.i = null;
        this.h.setVisibility(8);
    }

    @Override // o.InterfaceC9802wp
    public void c(String str, String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        this.j = str2;
        this.i = str;
        this.h.setVisibility(0);
    }

    @Override // o.InterfaceC9802wp
    public void f() {
        this.j = null;
        this.i = null;
        this.h.setVisibility(8);
    }

    @Override // o.InterfaceC9802wp
    public void b(boolean z, boolean z2) {
        if (z || z2) {
            this.c.setImageDrawable(ContextCompat.getDrawable(o_().getContext(), z2 ? C9795wi.d.d : C9795wi.d.e));
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        this.m = z;
        this.f13906o = z2;
    }

    @Override // o.InterfaceC9802wp
    public void a(Object obj) {
        this.l.setEnabled(true);
        this.f = obj;
    }

    @Override // o.InterfaceC9802wp
    public void g() {
        this.l.setEnabled(false);
        this.f = null;
    }

    @Override // o.InterfaceC9802wp
    public void c(CharSequence charSequence) {
        C8632dsu.c((Object) charSequence, "");
        this.a.setText(charSequence);
    }

    @Override // o.InterfaceC9802wp
    public void b(float f, int i) {
        C9789wc.d(this.l, c(j_(), f));
        this.l.setTranslationY(e(l_(), f));
        C9789wc.d(this.c, c(j_(), f));
        this.c.setTranslationY(e(l_(), f));
        C9789wc.d(this.h, c(j_(), f));
        this.h.setTranslationY(e(l_(), f));
    }
}
