package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSFieldValueProvider;

/* loaded from: classes2.dex */
public final class EU implements InterfaceC8949gP<CLCSFieldValueProvider> {
    public static final EU e = new EU();

    private EU() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public CLCSFieldValueProvider b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSFieldValueProvider.d.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSFieldValueProvider cLCSFieldValueProvider) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSFieldValueProvider, "");
        interfaceC9069id.d(cLCSFieldValueProvider.e());
    }
}
