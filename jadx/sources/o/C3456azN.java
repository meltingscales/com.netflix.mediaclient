package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.ThumbRating;

/* renamed from: o.azN  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3456azN implements InterfaceC8949gP<ThumbRating> {
    public static final C3456azN d = new C3456azN();

    private C3456azN() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public ThumbRating b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return ThumbRating.a.e(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, ThumbRating thumbRating) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) thumbRating, "");
        interfaceC9069id.d(thumbRating.e());
    }
}
