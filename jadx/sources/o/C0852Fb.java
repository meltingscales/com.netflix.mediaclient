package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSLayoutDirection;

/* renamed from: o.Fb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0852Fb implements InterfaceC8949gP<CLCSLayoutDirection> {
    public static final C0852Fb c = new C0852Fb();

    private C0852Fb() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSLayoutDirection b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSLayoutDirection.b.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSLayoutDirection cLCSLayoutDirection) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSLayoutDirection, "");
        interfaceC9069id.d(cLCSLayoutDirection.a());
    }
}
