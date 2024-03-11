package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.StringFormat;

/* renamed from: o.Fr  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0868Fr implements InterfaceC8949gP<StringFormat> {
    public static final C0868Fr b = new C0868Fr();

    private C0868Fr() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public StringFormat b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return StringFormat.d.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, StringFormat stringFormat) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) stringFormat, "");
        interfaceC9069id.d(stringFormat.c());
    }
}
