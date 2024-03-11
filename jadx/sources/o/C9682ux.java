package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import o.C9634uB;
import o.C9682ux;
import o.C9703vR;

/* renamed from: o.ux  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9682ux extends AbstractC9944zY<AbstractC9672un> implements InterfaceC9680uv {
    private final InterfaceC8554dpx a;
    private final int c;
    private final InterfaceC8554dpx d;
    private boolean e;

    public final void a(boolean z) {
        this.e = z;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9682ux(final ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) viewGroup, "");
        b = dpB.b(new drO<View>() { // from class: com.netflix.android.components.LoadingUIView$uiView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final View invoke() {
                View e = C9703vR.e(viewGroup, C9634uB.e.a, 0, 2, null);
                e.setVisibility(8);
                this.a(true);
                return e;
            }
        });
        this.a = b;
        b2 = dpB.b(new drO<TextView>() { // from class: com.netflix.android.components.LoadingUIView$label$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final TextView invoke() {
                return (TextView) C9682ux.this.e().findViewById(C9634uB.d.e);
            }
        });
        this.d = b2;
        this.c = C9634uB.d.a;
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return (View) this.a.getValue();
    }

    public final TextView j() {
        return (TextView) this.d.getValue();
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e().bringToFront();
        e().setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        if (this.e) {
            e().setVisibility(8);
        }
    }

    @Override // o.InterfaceC9680uv
    public void h() {
        j().setVisibility(0);
    }

    @Override // o.InterfaceC9680uv
    public void i() {
        if (this.e) {
            j().setVisibility(8);
        }
    }
}
