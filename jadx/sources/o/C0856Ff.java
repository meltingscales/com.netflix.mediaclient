package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSModalPresentation;

/* renamed from: o.Ff  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0856Ff implements InterfaceC8949gP<CLCSModalPresentation> {
    public static final C0856Ff a = new C0856Ff();

    private C0856Ff() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public CLCSModalPresentation b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSModalPresentation.d.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSModalPresentation cLCSModalPresentation) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSModalPresentation, "");
        interfaceC9069id.d(cLCSModalPresentation.a());
    }
}
