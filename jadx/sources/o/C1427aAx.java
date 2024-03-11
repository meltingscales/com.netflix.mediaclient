package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.UXConfigDeviceLevel;

/* renamed from: o.aAx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1427aAx implements InterfaceC8949gP<UXConfigDeviceLevel> {
    public static final C1427aAx d = new C1427aAx();

    private C1427aAx() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public UXConfigDeviceLevel b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return UXConfigDeviceLevel.c.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, UXConfigDeviceLevel uXConfigDeviceLevel) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) uXConfigDeviceLevel, "");
        interfaceC9069id.d(uXConfigDeviceLevel.c());
    }
}
