package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSTemplateItemFlexibleSize;

/* renamed from: o.Fl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0862Fl implements InterfaceC8949gP<CLCSTemplateItemFlexibleSize> {
    public static final C0862Fl b = new C0862Fl();

    private C0862Fl() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public CLCSTemplateItemFlexibleSize b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSTemplateItemFlexibleSize.d.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSTemplateItemFlexibleSize cLCSTemplateItemFlexibleSize) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSTemplateItemFlexibleSize, "");
        interfaceC9069id.d(cLCSTemplateItemFlexibleSize.d());
    }
}
