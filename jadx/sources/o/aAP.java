package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* loaded from: classes3.dex */
public final class aAP implements InterfaceC8949gP<C3250avT> {
    public static final aAP e = new aAP();

    private aAP() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3250avT b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3250avT c3250avT) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3250avT, "");
        if (c3250avT.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1404aAa.b, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3250avT.d());
        }
        if (c3250avT.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("allowEmpty");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3250avT.a());
        }
    }
}
