package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.DisplayCutoutCompat;
import o.cBO;
import o.cIE;

/* renamed from: o.cGm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5737cGm extends cGC {
    private final View e;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5737cGm(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.t, viewGroup, false);
        C8632dsu.d(inflate);
        this.e = inflate;
        viewGroup.addView(e());
        e().setOnClickListener(new View.OnClickListener() { // from class: o.cGl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5737cGm.b(C5737cGm.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C5737cGm c5737cGm, View view) {
        C8632dsu.c((Object) c5737cGm, "");
        c5737cGm.b((C5737cGm) cBO.F.a);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void d() {
        e().setEnabled(true);
        B().a(e(), true);
    }

    @Override // o.AbstractC5765cHn, o.AbstractC9944zY, o.InterfaceC9939zT
    public void b() {
        e().setEnabled(false);
        B().a(e(), false);
    }

    @Override // o.AbstractC9944zY
    public void b(DisplayCutoutCompat displayCutoutCompat) {
        C8632dsu.c((Object) displayCutoutCompat, "");
        e().setTranslationX(-displayCutoutCompat.getSafeInsetRight());
    }
}
