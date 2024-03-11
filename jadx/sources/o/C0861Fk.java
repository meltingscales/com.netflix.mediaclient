package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSPinEntrySize;

/* renamed from: o.Fk  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0861Fk implements InterfaceC8949gP<CLCSPinEntrySize> {
    public static final C0861Fk b = new C0861Fk();

    private C0861Fk() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSPinEntrySize b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSPinEntrySize.b.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSPinEntrySize cLCSPinEntrySize) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSPinEntrySize, "");
        interfaceC9069id.d(cLCSPinEntrySize.a());
    }
}
