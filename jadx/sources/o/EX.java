package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSInputSize;

/* loaded from: classes2.dex */
public final class EX implements InterfaceC8949gP<CLCSInputSize> {
    public static final EX b = new EX();

    private EX() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public CLCSInputSize b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSInputSize.b.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSInputSize cLCSInputSize) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSInputSize, "");
        interfaceC9069id.d(cLCSInputSize.c());
    }
}
