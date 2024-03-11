package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.SubtitleDeviceGroup;

/* renamed from: o.azB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3444azB implements InterfaceC8949gP<SubtitleDeviceGroup> {
    public static final C3444azB b = new C3444azB();

    private C3444azB() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public SubtitleDeviceGroup b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return SubtitleDeviceGroup.a.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, SubtitleDeviceGroup subtitleDeviceGroup) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) subtitleDeviceGroup, "");
        interfaceC9069id.d(subtitleDeviceGroup.e());
    }
}
