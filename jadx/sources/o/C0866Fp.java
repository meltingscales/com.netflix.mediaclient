package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSStreamQuality;

/* renamed from: o.Fp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0866Fp implements InterfaceC8949gP<CLCSStreamQuality> {
    public static final C0866Fp c = new C0866Fp();

    private C0866Fp() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSStreamQuality b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSStreamQuality.b.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSStreamQuality cLCSStreamQuality) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSStreamQuality, "");
        interfaceC9069id.d(cLCSStreamQuality.e());
    }
}
