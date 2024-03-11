package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.cBO;
import o.cBQ;
import o.cIE;

/* renamed from: o.cGw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5747cGw extends AbstractC5765cHn implements cFP {
    private final ViewGroup d;

    @Override // o.AbstractC9944zY
    /* renamed from: h */
    public ViewGroup e() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5747cGw(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View e = C9703vR.e(viewGroup, cIE.c.T, 0, 2, null);
        C8632dsu.d(e);
        this.d = (ViewGroup) e;
        ViewGroup e2 = e();
        e2.setVisibility(8);
        e2.setOnClickListener(new View.OnClickListener() { // from class: o.cGy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5747cGw.a(C5747cGw.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5747cGw c5747cGw, View view) {
        C8632dsu.c((Object) c5747cGw, "");
        c5747cGw.b((C5747cGw) cBO.C5571g.e);
    }

    private final void f() {
        LayoutInflater.from(e().getContext()).inflate(cIE.c.U, e());
        e().findViewById(cIE.b.bn).setOnClickListener(new View.OnClickListener() { // from class: o.cGv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5747cGw.i(C5747cGw.this, view);
            }
        });
        e().findViewById(cIE.b.bs).setOnClickListener(new View.OnClickListener() { // from class: o.cGs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5747cGw.h(C5747cGw.this, view);
            }
        });
        e().findViewById(cIE.b.bu).setOnClickListener(new View.OnClickListener() { // from class: o.cGA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5747cGw.f(C5747cGw.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C5747cGw c5747cGw, View view) {
        C8632dsu.c((Object) c5747cGw, "");
        c5747cGw.b((C5747cGw) cBO.C5571g.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C5747cGw c5747cGw, View view) {
        C8632dsu.c((Object) c5747cGw, "");
        c5747cGw.b((C5747cGw) cBO.C5570f.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C5747cGw c5747cGw, View view) {
        C8632dsu.c((Object) c5747cGw, "");
        c5747cGw.i();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        if (e().getChildCount() == 0) {
            f();
        }
        AbstractC5765cHn.a(this, true, 0L, 0L, false, 14, null);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, 0L, 0L, false, 14, null);
    }

    @Override // o.cFP
    public void g() {
        b((C5747cGw) cBQ.f.a);
    }

    @Override // o.cFP
    public void i() {
        b((C5747cGw) cBO.C5574j.e);
    }
}
