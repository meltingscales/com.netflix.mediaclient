package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.GradientType;

/* renamed from: o.axS  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3355axS implements InterfaceC8949gP<GradientType> {
    public static final C3355axS c = new C3355axS();

    private C3355axS() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public GradientType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return GradientType.d.a(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, GradientType gradientType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) gradientType, "");
        interfaceC9069id.d(gradientType.d());
    }
}
