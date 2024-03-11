package o;

import com.apollographql.apollo3.api.json.JsonReader;
import j$.time.Instant;
import j$.time.OffsetDateTime;

/* renamed from: o.gQ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8950gQ implements InterfaceC8949gP<Instant> {
    public static final C8950gQ c = new C8950gQ();

    private C8950gQ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: e */
    public Instant b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        Instant d = OffsetDateTime.c(k).d();
        C8632dsu.a(d, "");
        return d;
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, Instant instant) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) instant, "");
        String instant2 = instant.toString();
        C8632dsu.a(instant2, "");
        interfaceC9069id.d(instant2);
    }
}
