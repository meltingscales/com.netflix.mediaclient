package o;

import com.netflix.mediaclient.ui.epoxymodels.api.RowModel;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC3073as;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public final class bJE implements InterfaceC2023aX, bKI {
    private final bKK c;
    private final List<AbstractC3073as<?>> e;

    public bJE() {
        this(null, 1, null);
    }

    public bKI a(InterfaceC3825bMa.a aVar) {
        return this.c.b(aVar);
    }

    public final bKK a() {
        return this.c;
    }

    public bKI b(CharSequence charSequence) {
        return this.c.a(charSequence);
    }

    public bKI b(C1729aMb c1729aMb) {
        return this.c.e(c1729aMb);
    }

    public bKI b(AbstractC3073as.b bVar) {
        return this.c.a(bVar);
    }

    public bKI c(int i) {
        return this.c.a(i);
    }

    public bKI c(InterfaceC4467bf<bKK, RowModel.b> interfaceC4467bf) {
        return this.c.e(interfaceC4467bf);
    }

    public bKI c(drX<? super AbstractC3179au, ? super Integer, dpR> drx) {
        return this.c.b(drx);
    }

    public bKI d(int i) {
        return this.c.e(i);
    }

    public bKI d(InterfaceC4414be<bKK, RowModel.b> interfaceC4414be) {
        return this.c.e(interfaceC4414be);
    }

    public bKI e(List<? extends AbstractC3073as<?>> list) {
        C8632dsu.c((Object) list, "");
        return this.c.b(list);
    }

    public bKI e(boolean z) {
        return this.c.c(z);
    }

    public bJE(bKK bkk) {
        C8632dsu.c((Object) bkk, "");
        this.c = bkk;
        this.e = new ArrayList();
    }

    public /* synthetic */ bJE(bKK bkk, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? new bKK() : bkk);
    }

    @Override // o.InterfaceC2023aX
    public void add(AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) abstractC3073as, "");
        this.e.add(abstractC3073as);
        e(this.e);
    }
}
