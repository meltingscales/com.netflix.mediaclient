package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSInputType;

/* loaded from: classes2.dex */
public final class EY implements InterfaceC8949gP<CLCSInputType> {
    public static final EY d = new EY();

    private EY() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public CLCSInputType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSInputType.d.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSInputType cLCSInputType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSInputType, "");
        interfaceC9069id.d(cLCSInputType.c());
    }
}
