package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSInputStyle;

/* loaded from: classes2.dex */
public final class EZ implements InterfaceC8949gP<CLCSInputStyle> {
    public static final EZ d = new EZ();

    private EZ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public CLCSInputStyle b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSInputStyle.e.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSInputStyle cLCSInputStyle) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSInputStyle, "");
        interfaceC9069id.d(cLCSInputStyle.e());
    }
}
