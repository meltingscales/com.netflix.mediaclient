package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ScaleStrategy;

/* renamed from: o.azw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3491azw implements InterfaceC8949gP<ScaleStrategy> {
    public static final C3491azw b = new C3491azw();

    private C3491azw() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public ScaleStrategy b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ScaleStrategy.a.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ScaleStrategy scaleStrategy) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) scaleStrategy, "");
        interfaceC9069id.d(scaleStrategy.d());
    }
}
