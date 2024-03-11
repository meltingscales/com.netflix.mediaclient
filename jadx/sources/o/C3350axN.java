package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.CountryCode;

/* renamed from: o.axN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3350axN implements InterfaceC8949gP<CountryCode> {
    public static final C3350axN c = new C3350axN();

    private C3350axN() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public CountryCode b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CountryCode.ae.c(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CountryCode countryCode) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) countryCode, "");
        interfaceC9069id.d(countryCode.a());
    }
}
