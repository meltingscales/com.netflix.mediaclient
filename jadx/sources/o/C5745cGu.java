package o;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: o.cGu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5745cGu extends AbstractC5765cHn implements cFL {
    private final ViewGroup b;

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
    }

    @Override // o.AbstractC9944zY
    /* renamed from: g */
    public ViewGroup e() {
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5745cGu(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        this.b = viewGroup;
    }

    @Override // o.cFL
    public void i() {
        C8150deu.b((Activity) C9737vz.b(e().getContext(), Activity.class));
    }

    @Override // o.cFL
    public void h() {
        C8150deu.a((Activity) C9737vz.b(e().getContext(), Activity.class));
    }
}
