package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.aze  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3473aze implements InterfaceC8949gP<C3159atg> {
    public static final C3473aze d = new C3473aze();

    private C3473aze() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3159atg b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3159atg c3159atg) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3159atg, "");
        if (c3159atg.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("fallbackStrategy");
            C8953gT.e(C8953gT.d(C3470azb.e)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3159atg.c());
        }
        if (c3159atg.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("enableLockBadgeChecks");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3159atg.d());
        }
        if (c3159atg.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("enableAvifFormatTest");
            C8953gT.e(C8953gT.l).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3159atg.e());
        }
    }
}
