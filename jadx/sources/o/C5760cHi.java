package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import o.cIE;

/* renamed from: o.cHi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5760cHi extends cGC implements cFY {
    private final TextView e;

    @Override // o.AbstractC9944zY
    /* renamed from: g */
    public TextView e() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5760cHi(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.W, viewGroup, false);
        C8632dsu.d(inflate);
        this.e = (TextView) inflate;
        viewGroup.addView(e());
        e().setVisibility(8);
    }

    @Override // o.cFY
    public void b(String str) {
        e().setText(str);
        e().setContentDescription(str);
    }
}
