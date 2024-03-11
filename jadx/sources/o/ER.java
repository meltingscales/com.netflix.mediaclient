package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSImageResolutionMode;

/* loaded from: classes2.dex */
public final class ER implements InterfaceC8949gP<CLCSImageResolutionMode> {
    public static final ER d = new ER();

    private ER() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public CLCSImageResolutionMode b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSImageResolutionMode.i.e(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSImageResolutionMode cLCSImageResolutionMode) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSImageResolutionMode, "");
        interfaceC9069id.d(cLCSImageResolutionMode.b());
    }
}
