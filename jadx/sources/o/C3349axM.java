package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.DimensionMatchStrategy;

/* renamed from: o.axM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3349axM implements InterfaceC8949gP<DimensionMatchStrategy> {
    public static final C3349axM e = new C3349axM();

    private C3349axM() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public DimensionMatchStrategy b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return DimensionMatchStrategy.a.b(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, DimensionMatchStrategy dimensionMatchStrategy) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) dimensionMatchStrategy, "");
        interfaceC9069id.d(dimensionMatchStrategy.b());
    }
}
