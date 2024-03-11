package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSRdidAccessState;

/* renamed from: o.Fi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0859Fi implements InterfaceC8949gP<CLCSRdidAccessState> {
    public static final C0859Fi a = new C0859Fi();

    private C0859Fi() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public CLCSRdidAccessState b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSRdidAccessState.c.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSRdidAccessState cLCSRdidAccessState) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSRdidAccessState, "");
        interfaceC9069id.d(cLCSRdidAccessState.b());
    }
}
