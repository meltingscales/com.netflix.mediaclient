package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSToastPosition;

/* renamed from: o.Fm  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0863Fm implements InterfaceC8949gP<CLCSToastPosition> {
    public static final C0863Fm d = new C0863Fm();

    private C0863Fm() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSToastPosition b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSToastPosition.a.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSToastPosition cLCSToastPosition) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSToastPosition, "");
        interfaceC9069id.d(cLCSToastPosition.d());
    }
}
