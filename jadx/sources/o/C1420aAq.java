package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aAq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1420aAq implements InterfaceC8949gP<C3277avu> {
    public static final C1420aAq e = new C1420aAq();

    private C1420aAq() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3277avu b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3277avu c3277avu) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3277avu, "");
        if (c3277avu.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3277avu.a());
        }
        if (c3277avu.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("maxTotalEntities");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3277avu.b());
        }
    }
}
