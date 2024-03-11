package o;

import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import o.C7703dCf;
import o.C7759dEh;
import o.C8632dsu;
import o.InterfaceC7717dCt;
import o.dBT;
import o.dpR;

/* renamed from: o.dEh  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7759dEh<A, B, C> implements dBT<Triple<? extends A, ? extends B, ? extends C>> {
    private final dBT<A> a;
    private final dBT<C> b;
    private final InterfaceC7707dCj c;
    private final dBT<B> e;

    @Override // o.dBT, o.dBZ, o.dBP
    public InterfaceC7707dCj e() {
        return this.c;
    }

    public C7759dEh(dBT<A> dbt, dBT<B> dbt2, dBT<C> dbt3) {
        C8632dsu.c((Object) dbt, "");
        C8632dsu.c((Object) dbt2, "");
        C8632dsu.c((Object) dbt3, "");
        this.a = dbt;
        this.e = dbt2;
        this.b = dbt3;
        this.c = C7713dCp.e("kotlin.Triple", new InterfaceC7707dCj[0], new drM<C7703dCf, dpR>(this) { // from class: kotlinx.serialization.internal.TripleSerializer$descriptor$1
            final /* synthetic */ C7759dEh<A, B, C> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.d = this;
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(C7703dCf c7703dCf) {
                a(c7703dCf);
                return dpR.c;
            }

            public final void a(C7703dCf c7703dCf) {
                dBT dbt4;
                dBT dbt5;
                dBT dbt6;
                C8632dsu.c((Object) c7703dCf, "");
                dbt4 = ((C7759dEh) this.d).a;
                C7703dCf.e(c7703dCf, "first", dbt4.e(), null, false, 12, null);
                dbt5 = ((C7759dEh) this.d).e;
                C7703dCf.e(c7703dCf, "second", dbt5.e(), null, false, 12, null);
                dbt6 = ((C7759dEh) this.d).b;
                C7703dCf.e(c7703dCf, "third", dbt6.e(), null, false, 12, null);
            }
        });
    }

    @Override // o.dBZ
    public /* bridge */ /* synthetic */ void e(InterfaceC7721dCx interfaceC7721dCx, Object obj) {
        e(interfaceC7721dCx, (Triple) ((Triple) obj));
    }

    public void e(InterfaceC7721dCx interfaceC7721dCx, Triple<? extends A, ? extends B, ? extends C> triple) {
        C8632dsu.c((Object) interfaceC7721dCx, "");
        C8632dsu.c((Object) triple, "");
        InterfaceC7719dCv e = interfaceC7721dCx.e(e());
        e.b(e(), 0, this.a, triple.c());
        e.b(e(), 1, this.e, triple.b());
        e.b(e(), 2, this.b, triple.f());
        e.d(e());
    }

    @Override // o.dBP
    /* renamed from: a */
    public Triple<A, B, C> b(InterfaceC7720dCw interfaceC7720dCw) {
        C8632dsu.c((Object) interfaceC7720dCw, "");
        InterfaceC7717dCt c = interfaceC7720dCw.c(e());
        if (c.h()) {
            return c(c);
        }
        return b(c);
    }

    private final Triple<A, B, C> c(InterfaceC7717dCt interfaceC7717dCt) {
        Object d = InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), 0, this.a, null, 8, null);
        Object d2 = InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), 1, this.e, null, 8, null);
        Object d3 = InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), 2, this.b, null, 8, null);
        interfaceC7717dCt.e(e());
        return new Triple<>(d, d2, d3);
    }

    private final Triple<A, B, C> b(InterfaceC7717dCt interfaceC7717dCt) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = C7763dEl.d;
        obj2 = C7763dEl.d;
        obj3 = C7763dEl.d;
        while (true) {
            int h = interfaceC7717dCt.h(e());
            if (h == -1) {
                interfaceC7717dCt.e(e());
                obj4 = C7763dEl.d;
                if (obj == obj4) {
                    throw new SerializationException("Element 'first' is missing");
                }
                obj5 = C7763dEl.d;
                if (obj2 == obj5) {
                    throw new SerializationException("Element 'second' is missing");
                }
                obj6 = C7763dEl.d;
                if (obj3 == obj6) {
                    throw new SerializationException("Element 'third' is missing");
                }
                return new Triple<>(obj, obj2, obj3);
            } else if (h == 0) {
                obj = InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), 0, this.a, null, 8, null);
            } else if (h == 1) {
                obj2 = InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), 1, this.e, null, 8, null);
            } else if (h == 2) {
                obj3 = InterfaceC7717dCt.d.d(interfaceC7717dCt, e(), 2, this.b, null, 8, null);
            } else {
                throw new SerializationException("Unexpected index " + h);
            }
        }
    }
}
