package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.TextEvidenceClassification;

/* renamed from: o.azL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3454azL implements InterfaceC8949gP<TextEvidenceClassification> {
    public static final C3454azL e = new C3454azL();

    private C3454azL() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public TextEvidenceClassification b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return TextEvidenceClassification.e.d(k);
    }

    @Override // o.InterfaceC8949gP
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, TextEvidenceClassification textEvidenceClassification) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) textEvidenceClassification, "");
        interfaceC9069id.d(textEvidenceClassification.e());
    }
}
