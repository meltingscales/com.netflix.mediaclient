package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.mediaclient.graphql.models.type.TitleGroupMemberKind;

/* renamed from: o.azP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3458azP implements InterfaceC8949gP<TitleGroupMemberKind> {
    public static final C3458azP a = new C3458azP();

    private C3458azP() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public TitleGroupMemberKind b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return TitleGroupMemberKind.d.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, TitleGroupMemberKind titleGroupMemberKind) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) titleGroupMemberKind, "");
        interfaceC9069id.d(titleGroupMemberKind.a());
    }
}
