package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.netflix.android.components.ErrorUIView$uiView$2;
import o.C9634uB;
import o.C9678ut;

/* renamed from: o.ut  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9678ut extends AbstractC9944zY<AbstractC9672un> implements InterfaceC9677us {
    private final int a;
    private final InterfaceC8554dpx c;
    private final InterfaceC8554dpx d;
    private boolean e;

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9678ut(ViewGroup viewGroup) {
        super(viewGroup);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        C8632dsu.c((Object) viewGroup, "");
        b = dpB.b(new ErrorUIView$uiView$2(viewGroup, this));
        this.c = b;
        b2 = dpB.b(new drO<Button>() { // from class: com.netflix.android.components.ErrorUIView$myDownloadButton$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: a */
            public final Button invoke() {
                return (Button) C9678ut.this.e().findViewById(C9634uB.d.d);
            }
        });
        this.d = b2;
        this.a = C9634uB.d.c;
    }

    @Override // o.AbstractC9944zY
    public View e() {
        return (View) this.c.getValue();
    }

    private final Button i() {
        return (Button) this.d.getValue();
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

    @Override // o.InterfaceC9677us
    public void j() {
        i().setVisibility(0);
    }

    @Override // o.InterfaceC9677us
    public void f() {
        if (this.e) {
            i().setVisibility(8);
        }
    }
}
