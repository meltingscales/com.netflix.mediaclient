package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.KnownBadgeText;

/* renamed from: o.axU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3357axU implements InterfaceC8949gP<KnownBadgeText> {
    public static final C3357axU e = new C3357axU();

    private C3357axU() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public KnownBadgeText b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return KnownBadgeText.e.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, KnownBadgeText knownBadgeText) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) knownBadgeText, "");
        interfaceC9069id.d(knownBadgeText.b());
    }
}
