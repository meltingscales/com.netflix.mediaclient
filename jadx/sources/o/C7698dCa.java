package o;

import java.util.List;
import o.C7701dCd;
import o.C7706dCi;
import o.C8632dsu;
import o.InterfaceC8660dtv;
import o.InterfaceC8662dtx;
import o.dBT;
import o.dFU;
import o.drO;
import o.dtH;

/* renamed from: o.dCa  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7698dCa {
    private static final InterfaceC7753dEb<? extends Object> b = dCM.b(new drM<InterfaceC8660dtv<?>, dBT<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE$1
        @Override // o.drM
        /* renamed from: c */
        public final dBT<? extends Object> invoke(InterfaceC8660dtv<?> interfaceC8660dtv) {
            C8632dsu.c((Object) interfaceC8660dtv, "");
            return C7701dCd.e(interfaceC8660dtv);
        }
    });
    private static final InterfaceC7753dEb<Object> c = dCM.b(new drM<InterfaceC8660dtv<?>, dBT<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1
        @Override // o.drM
        /* renamed from: b */
        public final dBT<Object> invoke(InterfaceC8660dtv<?> interfaceC8660dtv) {
            dBT<Object> a2;
            C8632dsu.c((Object) interfaceC8660dtv, "");
            dBT e2 = C7701dCd.e(interfaceC8660dtv);
            if (e2 == null || (a2 = C7706dCi.a(e2)) == null) {
                return null;
            }
            return a2;
        }
    });
    private static final dDN<? extends Object> d = dCM.e(new drX<InterfaceC8660dtv<Object>, List<? extends dtH>, dBT<? extends Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1
        @Override // o.drX
        /* renamed from: a */
        public final dBT<? extends Object> invoke(InterfaceC8660dtv<Object> interfaceC8660dtv, final List<? extends dtH> list) {
            C8632dsu.c((Object) interfaceC8660dtv, "");
            C8632dsu.c((Object) list, "");
            List<dBT<Object>> b2 = C7701dCd.b(dFU.a(), list, true);
            C8632dsu.d(b2);
            return C7701dCd.d(interfaceC8660dtv, b2, new drO<InterfaceC8662dtx>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final InterfaceC8662dtx invoke() {
                    return list.get(0).a();
                }
            });
        }
    });
    private static final dDN<Object> e = dCM.e(new drX<InterfaceC8660dtv<Object>, List<? extends dtH>, dBT<Object>>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1
        @Override // o.drX
        /* renamed from: c */
        public final dBT<Object> invoke(InterfaceC8660dtv<Object> interfaceC8660dtv, final List<? extends dtH> list) {
            dBT<Object> a;
            C8632dsu.c((Object) interfaceC8660dtv, "");
            C8632dsu.c((Object) list, "");
            List<dBT<Object>> b2 = C7701dCd.b(dFU.a(), list, true);
            C8632dsu.d(b2);
            dBT<? extends Object> d2 = C7701dCd.d(interfaceC8660dtv, b2, new drO<InterfaceC8662dtx>() { // from class: kotlinx.serialization.SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // o.drO
                /* renamed from: e */
                public final InterfaceC8662dtx invoke() {
                    return list.get(0).a();
                }
            });
            if (d2 == null || (a = C7706dCi.a(d2)) == null) {
                return null;
            }
            return a;
        }
    });

    public static final dBT<Object> d(InterfaceC8660dtv<Object> interfaceC8660dtv, boolean z) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        if (!z) {
            dBT<? extends Object> c2 = b.c(interfaceC8660dtv);
            if (c2 != null) {
                return c2;
            }
            return null;
        }
        return c.c(interfaceC8660dtv);
    }

    public static final Object e(InterfaceC8660dtv<Object> interfaceC8660dtv, List<? extends dtH> list, boolean z) {
        C8632dsu.c((Object) interfaceC8660dtv, "");
        C8632dsu.c((Object) list, "");
        if (!z) {
            return d.b(interfaceC8660dtv, list);
        }
        return e.b(interfaceC8660dtv, list);
    }
}
