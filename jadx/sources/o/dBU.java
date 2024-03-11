package o;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import o.AbstractC7710dCm;
import o.AbstractC7715dCr;
import o.C7703dCf;
import o.C7704dCg;
import o.C7706dCi;
import o.C7713dCp;
import o.C8632dsu;
import o.InterfaceC7707dCj;
import o.dBU;
import o.dpR;
import o.drM;
import o.dsE;

/* loaded from: classes5.dex */
public final class dBU<T> extends dCC<T> {
    private List<? extends Annotation> b;
    private final InterfaceC8660dtv<T> c;
    private final InterfaceC8554dpx d;

    @Override // o.dCC
    public InterfaceC8660dtv<T> d() {
        return this.c;
    }

    public dBU(InterfaceC8660dtv<T> interfaceC8660dtv) {
        List<? extends Annotation> i;
        InterfaceC8554dpx b;
        C8632dsu.c((Object) interfaceC8660dtv, "");
        this.c = interfaceC8660dtv;
        i = C8569dql.i();
        this.b = i;
        b = dpB.b(LazyThreadSafetyMode.a, new drO<InterfaceC7707dCj>(this) { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2
            final /* synthetic */ dBU<T> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.a = this;
            }

            @Override // o.drO
            /* renamed from: b */
            public final InterfaceC7707dCj invoke() {
                final dBU<T> dbu = this.a;
                return C7704dCg.d(C7713dCp.a("kotlinx.serialization.Polymorphic", AbstractC7710dCm.e.b, new InterfaceC7707dCj[0], new drM<C7703dCf, dpR>() { // from class: kotlinx.serialization.PolymorphicSerializer$descriptor$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(C7703dCf c7703dCf) {
                        d(c7703dCf);
                        return dpR.c;
                    }

                    public final void d(C7703dCf c7703dCf) {
                        List<? extends Annotation> list;
                        C8632dsu.c((Object) c7703dCf, "");
                        C7703dCf.e(c7703dCf, "type", C7706dCi.b(dsE.b).e(), null, false, 12, null);
                        C7703dCf.e(c7703dCf, "value", C7713dCp.b("kotlinx.serialization.Polymorphic<" + dbu.d().b() + '>', AbstractC7715dCr.a.a, new InterfaceC7707dCj[0], null, 8, null), null, false, 12, null);
                        list = ((dBU) dbu).b;
                        c7703dCf.a(list);
                    }
                }), this.a.d());
            }
        });
        this.d = b;
    }

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return (InterfaceC7707dCj) this.d.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + d() + ')';
    }
}
