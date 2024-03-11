package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSTextAlignment;

/* renamed from: o.Fo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0865Fo implements InterfaceC8949gP<CLCSTextAlignment> {
    public static final C0865Fo d = new C0865Fo();

    private C0865Fo() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public CLCSTextAlignment b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSTextAlignment.e.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSTextAlignment cLCSTextAlignment) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSTextAlignment, "");
        interfaceC9069id.d(cLCSTextAlignment.c());
    }
}
