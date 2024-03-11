package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.BrandSizeBoost;

/* renamed from: o.axK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3347axK implements InterfaceC8949gP<BrandSizeBoost> {
    public static final C3347axK b = new C3347axK();

    private C3347axK() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public BrandSizeBoost b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return BrandSizeBoost.e.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, BrandSizeBoost brandSizeBoost) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) brandSizeBoost, "");
        interfaceC9069id.d(brandSizeBoost.a());
    }
}
