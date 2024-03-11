package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* loaded from: classes2.dex */
public final class EW implements InterfaceC8949gP<DQ> {
    public static final EW e = new EW();

    private EW() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public DQ b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, DQ dq) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) dq, "");
        if (dq.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("stringValue");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) dq.e());
        }
        if (dq.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("intValue");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) dq.c());
        }
        if (dq.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("booleanValue");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) dq.d());
        }
        if (dq.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("encryptedStringValue");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) dq.a());
        }
    }
}
