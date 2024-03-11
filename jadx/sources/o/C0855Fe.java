package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSItemAlignment;

/* renamed from: o.Fe  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0855Fe implements InterfaceC8949gP<CLCSItemAlignment> {
    public static final C0855Fe e = new C0855Fe();

    private C0855Fe() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public CLCSItemAlignment b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSItemAlignment.e.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSItemAlignment cLCSItemAlignment) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSItemAlignment, "");
        interfaceC9069id.d(cLCSItemAlignment.e());
    }
}
