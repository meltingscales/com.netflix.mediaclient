package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSStaticListType;

/* renamed from: o.Fn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0864Fn implements InterfaceC8949gP<CLCSStaticListType> {
    public static final C0864Fn c = new C0864Fn();

    private C0864Fn() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CLCSStaticListType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSStaticListType.d.d(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSStaticListType cLCSStaticListType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSStaticListType, "");
        interfaceC9069id.d(cLCSStaticListType.c());
    }
}
