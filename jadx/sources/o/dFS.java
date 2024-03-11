package o;

import java.util.List;
import o.C8632dsu;
import o.dBT;

/* loaded from: classes5.dex */
public interface dFS {
    <T> void a(InterfaceC8660dtv<T> interfaceC8660dtv, dBT<T> dbt);

    <T> void a(InterfaceC8660dtv<T> interfaceC8660dtv, drM<? super List<? extends dBT<?>>, ? extends dBT<?>> drm);

    <Base, Sub extends Base> void a(InterfaceC8660dtv<Base> interfaceC8660dtv, InterfaceC8660dtv<Sub> interfaceC8660dtv2, dBT<Sub> dbt);

    <Base> void b(InterfaceC8660dtv<Base> interfaceC8660dtv, drM<? super Base, ? extends dBZ<? super Base>> drm);

    <Base> void c(InterfaceC8660dtv<Base> interfaceC8660dtv, drM<? super String, ? extends dBP<? extends Base>> drm);

    /* loaded from: classes5.dex */
    public static final class a {
        public static <T> void a(dFS dfs, InterfaceC8660dtv<T> interfaceC8660dtv, final dBT<T> dbt) {
            C8632dsu.c((Object) interfaceC8660dtv, "");
            C8632dsu.c((Object) dbt, "");
            dfs.a(interfaceC8660dtv, new drM<List<? extends dBT<?>>, dBT<?>>() { // from class: kotlinx.serialization.modules.SerializersModuleCollector$contextual$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final dBT<?> invoke(List<? extends dBT<?>> list) {
                    C8632dsu.c((Object) list, "");
                    return dbt;
                }
            });
        }
    }
}
