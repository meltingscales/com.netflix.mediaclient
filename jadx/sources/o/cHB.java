package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import o.cIE;

/* loaded from: classes4.dex */
public final class cHB extends AbstractC5765cHn implements InterfaceC5728cGd {
    private final View b;
    private final ViewGroup c;
    private final TextView e;

    @Override // o.AbstractC9944zY
    /* renamed from: j */
    public TextView e() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cHB(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.c = viewGroup;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.z, viewGroup, true);
        C8632dsu.a(inflate, "");
        this.b = inflate;
        View findViewById = inflate.findViewById(cIE.b.bg);
        C8632dsu.a(findViewById, "");
        this.e = (TextView) findViewById;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        e().setVisibility(0);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        e().setVisibility(8);
    }

    @Override // o.InterfaceC5728cGd
    public void b(String str) {
        C8632dsu.c((Object) str, "");
        e().setText(this.c.getContext().getString(com.netflix.mediaclient.ui.R.o.gR, str));
    }

    @Override // o.InterfaceC5728cGd
    public void e(float f) {
        e().setAlpha(f);
    }
}
