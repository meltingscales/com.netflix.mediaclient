package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.azZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3468azZ implements InterfaceC8949gP<C3269avm> {
    public static final C3468azZ d = new C3468azZ();

    private C3468azZ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3269avm b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3269avm c3269avm) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3269avm, "");
        if (c3269avm.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("base");
            C8953gT.e(C8953gT.d(C8953gT.c(C1405aAb.e, false, 1, null))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3269avm.c());
        }
    }
}
