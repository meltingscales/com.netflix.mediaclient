package o;

import kotlinx.coroutines.flow.internal.SafeCollector;
import o.C7646dAc;
import o.C8632dsu;
import o.dqZ;
import o.dxD;

/* renamed from: o.dAc  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7646dAc {
    public static final void b(final SafeCollector<?> safeCollector, dqZ dqz) {
        if (((Number) dqz.fold(0, new drX<Integer, dqZ.b, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ Integer invoke(Integer num, dqZ.b bVar) {
                return b(num.intValue(), bVar);
            }

            public final Integer b(int i, dqZ.b bVar) {
                dqZ.d<?> key = bVar.getKey();
                dqZ.b bVar2 = safeCollector.c.get(key);
                if (key != dxD.b) {
                    return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : i + 1);
                }
                dxD dxd = (dxD) bVar2;
                C8632dsu.d(bVar);
                dxD d = C7646dAc.d((dxD) bVar, dxd);
                if (d != dxd) {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d + ", expected child of " + dxd + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                }
                if (dxd != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
        })).intValue() == safeCollector.d) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.c + ",\n\t\tbut emission happened in " + dqz + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final dxD d(dxD dxd, dxD dxd2) {
        while (dxd != null) {
            if (dxd == dxd2 || !(dxd instanceof dAE)) {
                return dxd;
            }
            dxd = dxd.j();
        }
        return null;
    }
}
