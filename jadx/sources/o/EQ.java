package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSButtonSize;

/* loaded from: classes2.dex */
public final class EQ implements InterfaceC8949gP<CLCSButtonSize> {
    public static final EQ d = new EQ();

    private EQ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSButtonSize b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSButtonSize.d.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSButtonSize cLCSButtonSize) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSButtonSize, "");
        interfaceC9069id.d(cLCSButtonSize.b());
    }
}
