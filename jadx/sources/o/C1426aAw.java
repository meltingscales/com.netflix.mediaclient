package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.UXConfigDeviceResolution;

/* renamed from: o.aAw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1426aAw implements InterfaceC8949gP<UXConfigDeviceResolution> {
    public static final C1426aAw d = new C1426aAw();

    private C1426aAw() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public UXConfigDeviceResolution b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return UXConfigDeviceResolution.d.e(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, UXConfigDeviceResolution uXConfigDeviceResolution) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) uXConfigDeviceResolution, "");
        interfaceC9069id.d(uXConfigDeviceResolution.e());
    }
}
