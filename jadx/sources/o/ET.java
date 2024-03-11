package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSIconSize;

/* loaded from: classes2.dex */
public final class ET implements InterfaceC8949gP<CLCSIconSize> {
    public static final ET a = new ET();

    private ET() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public CLCSIconSize b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSIconSize.c.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSIconSize cLCSIconSize) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSIconSize, "");
        interfaceC9069id.d(cLCSIconSize.b());
    }
}
