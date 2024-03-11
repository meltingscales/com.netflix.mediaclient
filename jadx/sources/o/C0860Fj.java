package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSStackContentJustification;

/* renamed from: o.Fj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0860Fj implements InterfaceC8949gP<CLCSStackContentJustification> {
    public static final C0860Fj e = new C0860Fj();

    private C0860Fj() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSStackContentJustification b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSStackContentJustification.a.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSStackContentJustification cLCSStackContentJustification) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSStackContentJustification, "");
        interfaceC9069id.d(cLCSStackContentJustification.e());
    }
}
