package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.gS  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8952gS<T> implements InterfaceC8949gP<AbstractC8997hK<T>> {
    private final InterfaceC8949gP<T> a;

    public C8952gS(InterfaceC8949gP<T> interfaceC8949gP) {
        C8632dsu.c((Object) interfaceC8949gP, "");
        this.a = interfaceC8949gP;
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public AbstractC8997hK<T> b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        if (jsonReader.l() == JsonReader.Token.f) {
            jsonReader.s();
            return AbstractC8997hK.e.c;
        }
        return new AbstractC8997hK.b(this.a.b(jsonReader, c9028hp));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, AbstractC8997hK<? extends T> abstractC8997hK) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) abstractC8997hK, "");
        if (abstractC8997hK instanceof AbstractC8997hK.b) {
            this.a.e(interfaceC9069id, c9028hp, ((AbstractC8997hK.b) abstractC8997hK).a());
        } else {
            interfaceC9069id.j();
        }
    }
}
