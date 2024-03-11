package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSImageFormat;

/* loaded from: classes2.dex */
public final class ES implements InterfaceC8949gP<CLCSImageFormat> {
    public static final ES d = new ES();

    private ES() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSImageFormat b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSImageFormat.e.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSImageFormat cLCSImageFormat) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSImageFormat, "");
        interfaceC9069id.d(cLCSImageFormat.e());
    }
}
