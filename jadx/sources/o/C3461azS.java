package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3461azS implements InterfaceC8949gP<C3204auZ> {
    public static final C3461azS e = new C3461azS();

    private C3461azS() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public C3204auZ b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3204auZ c3204auZ) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3204auZ, "");
        interfaceC9069id.e("testId");
        C8953gT.j.e(interfaceC9069id, c9028hp, Integer.valueOf(c3204auZ.d()));
        if (c3204auZ.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("cell");
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3204auZ.b());
        }
    }
}
