package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* loaded from: classes3.dex */
public final class aBS implements InterfaceC8949gP<C3308awY> {
    public static final aBS a = new aBS();

    private aBS() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3308awY b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3308awY c3308awY) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3308awY, "");
        if (c3308awY.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1406aAc.d, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3308awY.b());
        }
    }
}
