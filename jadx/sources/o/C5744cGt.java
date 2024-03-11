package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.reactivex.Observable;
import o.cIE;

/* renamed from: o.cGt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5744cGt extends AbstractC5765cHn implements cFM {
    private final View d;
    private final Observable<cBO> e;

    @Override // o.AbstractC9944zY
    public View e() {
        return this.d;
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public Observable<cBO> v() {
        return this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5744cGt(ViewGroup viewGroup) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(cIE.c.q, viewGroup, false);
        C8632dsu.a(inflate, "");
        this.d = inflate;
        Observable<cBO> empty = Observable.empty();
        C8632dsu.a(empty, "");
        this.e = empty;
        viewGroup.addView(e());
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void a() {
        AbstractC5765cHn.a(this, true, 0L, 0L, false, 14, null);
    }

    @Override // o.AbstractC9944zY, o.InterfaceC9939zT
    public void c() {
        AbstractC5765cHn.a(this, false, 0L, 0L, false, 14, null);
    }
}
