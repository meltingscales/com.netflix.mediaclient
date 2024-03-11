package o;

import android.view.ViewGroup;

/* renamed from: o.uq  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9675uq extends C9682ux {
    private Runnable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9675uq(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
    }

    @Override // o.C9682ux, o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        if (this.b == null) {
            this.b = new Runnable() { // from class: o.uo
                @Override // java.lang.Runnable
                public final void run() {
                    C9675uq.a(C9675uq.this);
                }
            };
            e().postDelayed(this.b, 400L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C9675uq c9675uq) {
        C8632dsu.c((Object) c9675uq, "");
        c9675uq.e().bringToFront();
        c9675uq.e().setVisibility(0);
        c9675uq.b = null;
    }

    @Override // o.C9682ux, o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        if (g()) {
            Runnable runnable = this.b;
            if (runnable != null) {
                e().removeCallbacks(runnable);
                this.b = null;
            }
            e().setVisibility(8);
        }
    }
}
