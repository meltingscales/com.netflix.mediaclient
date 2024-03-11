package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.NGPRedeemBeaconFailureReason;

/* renamed from: o.ayj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3425ayj implements InterfaceC8949gP<NGPRedeemBeaconFailureReason> {
    public static final C3425ayj b = new C3425ayj();

    private C3425ayj() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public NGPRedeemBeaconFailureReason b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return NGPRedeemBeaconFailureReason.j.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, NGPRedeemBeaconFailureReason nGPRedeemBeaconFailureReason) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) nGPRedeemBeaconFailureReason, "");
        interfaceC9069id.d(nGPRedeemBeaconFailureReason.c());
    }
}
