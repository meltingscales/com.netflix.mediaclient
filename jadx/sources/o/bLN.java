package o;

import com.netflix.mediaclient.ui.epoxymodels.api.player.PlayerSimpleStatusAware$listener$2;
import o.AbstractC3179au;
import o.AbstractC3827bMc;
import o.C8632dsu;
import o.InterfaceC3826bMb;
import o.bLN;
import o.bLZ;
import o.dpR;

/* loaded from: classes4.dex */
public abstract class bLN<T extends AbstractC3179au> extends AbstractC3336ax<T> {
    private final InterfaceC8554dpx b;
    private T c;
    private bLZ d;

    public abstract void a(T t, AbstractC3827bMc abstractC3827bMc);

    public final void c(bLZ blz) {
        this.d = blz;
    }

    public final T i() {
        return this.c;
    }

    public final bLZ n() {
        return this.d;
    }

    public bLN() {
        InterfaceC8554dpx b;
        b = dpB.b(new drO<PlayerSimpleStatusAware$listener$2.d>(this) { // from class: com.netflix.mediaclient.ui.epoxymodels.api.player.PlayerSimpleStatusAware$listener$2
            final /* synthetic */ bLN<T> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.a = this;
            }

            /* loaded from: classes4.dex */
            public static final class d implements InterfaceC3826bMb {
                final /* synthetic */ bLN<T> c;

                d(bLN<T> bln) {
                    this.c = bln;
                }

                @Override // o.InterfaceC3826bMb
                public void c(AbstractC3827bMc abstractC3827bMc) {
                    C8632dsu.c((Object) abstractC3827bMc, "");
                    AbstractC3179au i = this.c.i();
                    if (i != null) {
                        this.c.a((bLN<T>) i, abstractC3827bMc);
                    }
                }
            }

            @Override // o.drO
            /* renamed from: d */
            public final d invoke() {
                if (this.a.n() != null) {
                    return new d(this.a);
                }
                return null;
            }
        });
        this.b = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void c(Object obj) {
        e((bLN<T>) ((AbstractC3179au) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    public /* synthetic */ void e(Object obj) {
        b((bLN<T>) ((AbstractC3179au) obj));
    }

    public final InterfaceC3826bMb m() {
        return (InterfaceC3826bMb) this.b.getValue();
    }

    @Override // o.AbstractC3336ax
    public void e(T t) {
        C8632dsu.c((Object) t, "");
        super.e((bLN<T>) t);
        this.c = t;
        C9726vo.d(this.d, m(), new drX<bLZ, InterfaceC3826bMb, dpR>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.player.PlayerSimpleStatusAware$bind$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(bLZ blz, InterfaceC3826bMb interfaceC3826bMb) {
                c(blz, interfaceC3826bMb);
                return dpR.c;
            }

            public final void c(bLZ blz, InterfaceC3826bMb interfaceC3826bMb) {
                C8632dsu.c((Object) blz, "");
                C8632dsu.c((Object) interfaceC3826bMb, "");
                blz.b(interfaceC3826bMb);
            }
        });
    }

    @Override // o.AbstractC3336ax
    public void b(T t) {
        C8632dsu.c((Object) t, "");
        this.c = null;
        C9726vo.d(this.d, m(), new drX<bLZ, InterfaceC3826bMb, dpR>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.player.PlayerSimpleStatusAware$unbind$1
            @Override // o.drX
            public /* synthetic */ dpR invoke(bLZ blz, InterfaceC3826bMb interfaceC3826bMb) {
                d(blz, interfaceC3826bMb);
                return dpR.c;
            }

            public final void d(bLZ blz, InterfaceC3826bMb interfaceC3826bMb) {
                C8632dsu.c((Object) blz, "");
                C8632dsu.c((Object) interfaceC3826bMb, "");
                blz.e(interfaceC3826bMb);
            }
        });
        super.b((bLN<T>) t);
    }
}
