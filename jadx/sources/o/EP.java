package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSButtonType;

/* loaded from: classes2.dex */
public final class EP implements InterfaceC8949gP<CLCSButtonType> {
    public static final EP c = new EP();

    private EP() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSButtonType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSButtonType.c.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSButtonType cLCSButtonType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSButtonType, "");
        interfaceC9069id.d(cLCSButtonType.b());
    }
}
