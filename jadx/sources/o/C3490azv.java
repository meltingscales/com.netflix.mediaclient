package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.RoundedCornerType;

/* renamed from: o.azv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3490azv implements InterfaceC8949gP<RoundedCornerType> {
    public static final C3490azv e = new C3490azv();

    private C3490azv() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public RoundedCornerType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return RoundedCornerType.b.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, RoundedCornerType roundedCornerType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) roundedCornerType, "");
        interfaceC9069id.d(roundedCornerType.d());
    }
}
