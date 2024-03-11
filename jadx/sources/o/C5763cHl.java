package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.core.view.DisplayCutoutCompat;
import o.C1026Lt;
import o.cBO;
import o.cIE;

/* renamed from: o.cHl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5763cHl extends cGC implements InterfaceC5729cGe {
    private final ImageButton b;
    private boolean c;
    private final View d;
    private final ImageButton e;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5763cHl(final ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.V, viewGroup, false);
        C8632dsu.d(inflate);
        this.d = inflate;
        View findViewById = e().findViewById(cIE.b.aM);
        C8632dsu.a(findViewById, "");
        ImageButton imageButton = (ImageButton) findViewById;
        this.b = imageButton;
        View findViewById2 = e().findViewById(cIE.b.be);
        C8632dsu.a(findViewById2, "");
        ImageButton imageButton2 = (ImageButton) findViewById2;
        this.e = imageButton2;
        this.c = true;
        viewGroup.addView(e());
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: o.cHp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5763cHl.e(C5763cHl.this, view);
            }
        });
        imageButton.setClickable(true);
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: o.cHu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5763cHl.a(C5763cHl.this, viewGroup, view);
            }
        });
        imageButton2.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5763cHl c5763cHl, View view) {
        C8632dsu.c((Object) c5763cHl, "");
        if (c5763cHl.c) {
            c5763cHl.b((C5763cHl) cBO.D.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5763cHl c5763cHl, ViewGroup viewGroup, View view) {
        C8632dsu.c((Object) c5763cHl, "");
        C8632dsu.c((Object) viewGroup, "");
        String string = viewGroup.getContext().getResources().getString(cIE.a.C);
        C8632dsu.a(string, "");
        c5763cHl.b((C5763cHl) new cBO.C5589z(string));
    }

    public void l() {
        B().a(this.b, true);
    }

    public void f() {
        B().a(this.b, false);
    }

    public void o() {
        B().a(this.e, true);
    }

    public void m() {
        B().a(this.e, false);
    }

    @Override // o.InterfaceC5729cGe
    public void c(boolean z) {
        this.c = z;
        this.b.setImageResource(z ? C1026Lt.a.dt : C1026Lt.a.dp);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        f();
        m();
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        l();
        o();
    }

    @Override // o.AbstractC9944zY
    public void b(DisplayCutoutCompat displayCutoutCompat) {
        C8632dsu.c((Object) displayCutoutCompat, "");
        e().setTranslationX(-displayCutoutCompat.getSafeInsetRight());
    }

    @Override // o.InterfaceC5729cGe
    public void i() {
        b((C5763cHl) new cBO.N(cIE.b.aM));
    }

    @Override // o.InterfaceC5729cGe
    public void g() {
        this.e.setVisibility(0);
    }

    @Override // o.InterfaceC5729cGe
    public void j() {
        this.e.setVisibility(8);
    }
}
