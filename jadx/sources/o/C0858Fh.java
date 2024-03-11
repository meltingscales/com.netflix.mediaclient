package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSSpaceSize;

/* renamed from: o.Fh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0858Fh implements InterfaceC8949gP<CLCSSpaceSize> {
    public static final C0858Fh b = new C0858Fh();

    private C0858Fh() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public CLCSSpaceSize b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSSpaceSize.c.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSSpaceSize cLCSSpaceSize) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSSpaceSize, "");
        interfaceC9069id.d(cLCSSpaceSize.a());
    }
}
