package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.BillboardType;

/* renamed from: o.axJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3346axJ implements InterfaceC8949gP<BillboardType> {
    public static final C3346axJ b = new C3346axJ();

    private C3346axJ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public BillboardType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return BillboardType.b.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BillboardType billboardType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) billboardType, "");
        interfaceC9069id.d(billboardType.c());
    }
}
