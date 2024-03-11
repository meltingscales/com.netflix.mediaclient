package o;

import java.util.List;
import o.AbstractC7716dCs;
import o.C7703dCf;
import o.C8632dsu;
import o.dpR;

/* renamed from: o.dCp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7713dCp {
    public static final InterfaceC7707dCj e(String str, InterfaceC7707dCj[] interfaceC7707dCjArr, drM<? super C7703dCf, dpR> drm) {
        boolean g;
        List D;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC7707dCjArr, "");
        C8632dsu.c((Object) drm, "");
        g = C8691duz.g(str);
        if (!(!g)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        C7703dCf c7703dCf = new C7703dCf(str);
        drm.invoke(c7703dCf);
        AbstractC7716dCs.b bVar = AbstractC7716dCs.b.d;
        int size = c7703dCf.a().size();
        D = C8563dqf.D(interfaceC7707dCjArr);
        return new C7711dCn(str, bVar, size, D, c7703dCf);
    }

    public static final InterfaceC7707dCj b(String str, AbstractC7709dCl abstractC7709dCl) {
        boolean g;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC7709dCl, "");
        g = C8691duz.g(str);
        if (!(!g)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        return dDZ.e(str, abstractC7709dCl);
    }

    public static /* synthetic */ InterfaceC7707dCj b(String str, AbstractC7715dCr abstractC7715dCr, InterfaceC7707dCj[] interfaceC7707dCjArr, drM drm, int i, Object obj) {
        if ((i & 8) != 0) {
            drm = new drM<C7703dCf, dpR>() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
                public final void c(C7703dCf c7703dCf) {
                    C8632dsu.c((Object) c7703dCf, "");
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C7703dCf c7703dCf) {
                    c(c7703dCf);
                    return dpR.c;
                }
            };
        }
        return a(str, abstractC7715dCr, interfaceC7707dCjArr, drm);
    }

    public static final InterfaceC7707dCj a(String str, AbstractC7715dCr abstractC7715dCr, InterfaceC7707dCj[] interfaceC7707dCjArr, drM<? super C7703dCf, dpR> drm) {
        boolean g;
        List D;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) abstractC7715dCr, "");
        C8632dsu.c((Object) interfaceC7707dCjArr, "");
        C8632dsu.c((Object) drm, "");
        g = C8691duz.g(str);
        if (!(!g)) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!C8632dsu.c(abstractC7715dCr, AbstractC7716dCs.b.d))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        C7703dCf c7703dCf = new C7703dCf(str);
        drm.invoke(c7703dCf);
        int size = c7703dCf.a().size();
        D = C8563dqf.D(interfaceC7707dCjArr);
        return new C7711dCn(str, abstractC7715dCr, size, D, c7703dCf);
    }
}
