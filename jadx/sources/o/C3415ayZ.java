package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.PinotDeviceResolution;

/* renamed from: o.ayZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3415ayZ implements InterfaceC8949gP<PinotDeviceResolution> {
    public static final C3415ayZ a = new C3415ayZ();

    private C3415ayZ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public PinotDeviceResolution b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return PinotDeviceResolution.d.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, PinotDeviceResolution pinotDeviceResolution) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) pinotDeviceResolution, "");
        interfaceC9069id.d(pinotDeviceResolution.c());
    }
}
