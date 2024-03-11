package o;

import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import o.AbstractC7715dCr;

/* loaded from: classes5.dex */
public final class dFC {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(dBZ<?> dbz, dBZ<Object> dbz2, String str) {
        if ((dbz instanceof dBX) && C7743dDs.a(dbz2.e()).contains(str)) {
            String d = dbz.e().d();
            String d2 = dbz2.e().d();
            throw new IllegalStateException(("Sealed class '" + d2 + "' cannot be serialized as base class '" + d + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final void e(AbstractC7715dCr abstractC7715dCr) {
        C8632dsu.c((Object) abstractC7715dCr, "");
        if (abstractC7715dCr instanceof AbstractC7715dCr.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (abstractC7715dCr instanceof AbstractC7709dCl) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (abstractC7715dCr instanceof AbstractC7710dCm) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final <T> T c(dEH deh, dBP<? extends T> dbp) {
        dET e;
        C8632dsu.c((Object) deh, "");
        C8632dsu.c((Object) dbp, "");
        if (!(dbp instanceof dCC) || deh.k().a().k()) {
            return dbp.b(deh);
        }
        String c = c(dbp.e(), deh.k());
        dEI l = deh.l();
        InterfaceC7707dCj e2 = dbp.e();
        if (l instanceof dEP) {
            dEP dep = (dEP) l;
            dEI dei = (dEI) dep.get(c);
            String d = (dei == null || (e = dEG.e(dei)) == null) ? null : e.d();
            dBP<T> d2 = ((dCC) dbp).d(deh, d);
            if (d2 == null) {
                c(d, dep);
                throw new KotlinNothingValueException();
            }
            return (T) dFM.b(deh.k(), c, dep, d2);
        }
        throw C7797dFs.c(-1, "Expected " + dsA.a(dEP.class) + " as the serialized body of " + e2.d() + ", but had " + dsA.a(l.getClass()));
    }

    public static final Void c(String str, dEP dep) {
        String str2;
        C8632dsu.c((Object) dep, "");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw C7797dFs.a(-1, "Polymorphic serializer was not found for " + str2, dep.toString());
    }

    public static final String c(InterfaceC7707dCj interfaceC7707dCj, AbstractC7773dEv abstractC7773dEv) {
        C8632dsu.c((Object) interfaceC7707dCj, "");
        C8632dsu.c((Object) abstractC7773dEv, "");
        for (Annotation annotation : interfaceC7707dCj.c()) {
            if (annotation instanceof dEA) {
                return ((dEA) annotation).c();
            }
        }
        return abstractC7773dEv.a().d();
    }
}
