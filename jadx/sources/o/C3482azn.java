package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PinotSectionKind;

/* renamed from: o.azn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3482azn implements InterfaceC8949gP<PinotSectionKind> {
    public static final C3482azn d = new C3482azn();

    private C3482azn() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public PinotSectionKind b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PinotSectionKind.a.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PinotSectionKind pinotSectionKind) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) pinotSectionKind, "");
        interfaceC9069id.d(pinotSectionKind.d());
    }
}
