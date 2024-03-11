package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.SerializationException;
import o.AbstractC7716dCs;
import o.C7703dCf;
import o.C7713dCp;
import o.C8632dsu;
import o.InterfaceC7707dCj;
import o.dDM;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class dDM<T> implements dBT<T> {
    private List<? extends Annotation> b;
    private final T c;
    private final InterfaceC8554dpx d;

    public dDM(final String str, T t) {
        List<? extends Annotation> i;
        InterfaceC8554dpx b;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) t, "");
        this.c = t;
        i = C8569dql.i();
        this.b = i;
        b = dpB.b(LazyThreadSafetyMode.a, new drO<InterfaceC7707dCj>() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final InterfaceC7707dCj invoke() {
                final dDM<T> ddm = this;
                return C7713dCp.a(str, AbstractC7716dCs.d.c, new InterfaceC7707dCj[0], new drM<C7703dCf, dpR>() { // from class: kotlinx.serialization.internal.ObjectSerializer$descriptor$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C7703dCf c7703dCf) {
                        b(c7703dCf);
                        return dpR.c;
                    }

                    public final void b(C7703dCf c7703dCf) {
                        List<? extends Annotation> list;
                        C8632dsu.c((Object) c7703dCf, "");
                        list = ((dDM) ddm).b;
                        c7703dCf.a(list);
                    }
                });
            }
        });
        this.d = b;
    }

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return (InterfaceC7707dCj) this.d.getValue();
    }

    @Override // o.dBZ
    public void e(InterfaceC7721dCx interfaceC7721dCx, T t) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) t, "");
        interfaceC7721dCx.e(e()).d(e());
    }

    @Override // o.dBP
    public T b(InterfaceC7720dCw interfaceC7720dCw) {
        int h;
        C8632dsu.c((Object) interfaceC7720dCw, "");
        InterfaceC7707dCj e = e();
        InterfaceC7717dCt c = interfaceC7720dCw.c(e);
        if (!c.h() && (h = c.h(e())) != -1) {
            throw new SerializationException("Unexpected index " + h);
        }
        dpR dpr = dpR.c;
        c.e(e);
        return this.c;
    }
}
