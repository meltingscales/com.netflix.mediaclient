package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.clcs.codegen.type.CLCSLoggableSessionType;

/* renamed from: o.Fd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0854Fd implements InterfaceC8949gP<CLCSLoggableSessionType> {
    public static final C0854Fd c = new C0854Fd();

    private C0854Fd() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public CLCSLoggableSessionType b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        String k = jsonReader.k();
        C8632dsu.d((Object) k);
        return CLCSLoggableSessionType.a.d(k);
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, CLCSLoggableSessionType cLCSLoggableSessionType) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) cLCSLoggableSessionType, "");
        interfaceC9069id.d(cLCSLoggableSessionType.e());
    }
}