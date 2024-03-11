package o;

import java.util.List;
import o.AbstractC7715dCr;
import o.AbstractC7716dCs;
import o.dFS;

/* loaded from: classes5.dex */
public final class dFE implements dFS {
    private final boolean b;
    private final String d;

    @Override // o.dFS
    public <T> void a(InterfaceC8660dtv<T> interfaceC8660dtv, drM<? super List<? extends dBT<?>>, ? extends dBT<?>> drm) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) drm, "");
    }

    @Override // o.dFS
    public <Base> void b(InterfaceC8660dtv<Base> interfaceC8660dtv, drM<? super Base, ? extends dBZ<? super Base>> drm) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) drm, "");
    }

    @Override // o.dFS
    public <Base> void c(InterfaceC8660dtv<Base> interfaceC8660dtv, drM<? super String, ? extends dBP<? extends Base>> drm) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) drm, "");
    }

    public dFE(boolean z, String str) {
        C8632dsu.c((Object) str, "");
        this.b = z;
        this.d = str;
    }

    @Override // o.dFS
    public <T> void a(InterfaceC8660dtv<T> interfaceC8660dtv, dBT<T> dbt) {
        dFS.a.a(this, interfaceC8660dtv, dbt);
    }

    @Override // o.dFS
    public <Base, Sub extends Base> void a(InterfaceC8660dtv<Base> interfaceC8660dtv, InterfaceC8660dtv<Sub> interfaceC8660dtv2, dBT<Sub> dbt) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) interfaceC8660dtv2, "");
        C8632dsu.c((Object) dbt, "");
        InterfaceC7707dCj e = dbt.e();
        c(e, (InterfaceC8660dtv<?>) interfaceC8660dtv2);
        if (this.b) {
            return;
        }
        e(e, interfaceC8660dtv2);
    }

    private final void c(InterfaceC7707dCj interfaceC7707dCj, InterfaceC8660dtv<?> interfaceC8660dtv) {
        AbstractC7715dCr b = interfaceC7707dCj.b();
        if ((b instanceof AbstractC7710dCm) || C8632dsu.c(b, AbstractC7715dCr.a.a)) {
            throw new IllegalArgumentException("Serializer for " + interfaceC8660dtv.b() + " can't be registered as a subclass for polymorphic serialization because its kind " + b + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        } else if (this.b) {
        } else {
            if (C8632dsu.c(b, AbstractC7716dCs.c.d) || C8632dsu.c(b, AbstractC7716dCs.e.a) || (b instanceof AbstractC7709dCl) || (b instanceof AbstractC7715dCr.b)) {
                throw new IllegalArgumentException("Serializer for " + interfaceC8660dtv.b() + " of kind " + b + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    private final void e(InterfaceC7707dCj interfaceC7707dCj, InterfaceC8660dtv<?> interfaceC8660dtv) {
        int e = interfaceC7707dCj.e();
        for (int i = 0; i < e; i++) {
            String a = interfaceC7707dCj.a(i);
            if (C8632dsu.c((Object) a, (Object) this.d)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC8660dtv + " has property '" + a + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }
}
