package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Pair;
import o.cIE;

/* renamed from: o.cHo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5766cHo extends cGC implements InterfaceC5727cGc {
    private final TextView b;

    @Override // o.AbstractC9944zY
    /* renamed from: f */
    public TextView e() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5766cHo(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.S, viewGroup, false);
        C8632dsu.d(inflate);
        this.b = (TextView) inflate;
        viewGroup.addView(e());
        e().setAlpha(0.0f);
        e().setVisibility(4);
    }

    @Override // o.InterfaceC5727cGc
    public void e(Pair<String, String> pair) {
        C8632dsu.c((Object) pair, "");
        e().setText(pair.d());
        e().setContentDescription(pair.a());
    }
}
