package o;

import kotlin.LazyThreadSafetyMode;
import o.dBT;
import o.dER;

@InterfaceC7700dCc(e = dER.class)
/* loaded from: classes5.dex */
public final class dEQ extends dET {
    private static final /* synthetic */ InterfaceC8554dpx<dBT<Object>> c;
    public static final dEQ INSTANCE = new dEQ();
    private static final String d = "null";

    @Override // o.dET
    public String d() {
        return d;
    }

    @Override // o.dET
    public boolean e() {
        return false;
    }

    static {
        InterfaceC8554dpx<dBT<Object>> b;
        b = dpB.b(LazyThreadSafetyMode.a, new drO<dBT<Object>>() { // from class: kotlinx.serialization.json.JsonNull$1
            @Override // o.drO
            /* renamed from: a */
            public final dBT<Object> invoke() {
                return dER.b;
            }
        });
        c = b;
    }

    private final /* synthetic */ dBT b() {
        return c.getValue();
    }

    public final dBT<dEQ> serializer() {
        return b();
    }

    private dEQ() {
        super(null);
    }
}
