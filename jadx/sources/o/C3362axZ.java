package o;

import com.apollographql.apollo3.api.json.JsonReader;
import o.AbstractC8997hK;

/* renamed from: o.axZ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3362axZ implements InterfaceC8949gP<C3003aqj> {
    public static final C3362axZ b = new C3362axZ();

    private C3362axZ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public C3003aqj b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: b */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3003aqj c3003aqj) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3003aqj, "");
        if (c3003aqj.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("billboardTypesSupported");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.t))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3003aqj.c());
        }
        if (c3003aqj.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportedBillboardTypes");
            C8953gT.e(C8953gT.d(C8953gT.a(C3346axJ.b))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3003aqj.a());
        }
        if (c3003aqj.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("supportedLolomoFeatures");
            C8953gT.e(C8953gT.d(C8953gT.a(C8953gT.t))).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3003aqj.e());
        }
        if (c3003aqj.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("idiom");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3003aqj.b());
        }
        if (c3003aqj.d() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("platform");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3003aqj.d());
        }
        if (c3003aqj.f() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("uiVersion");
            C8953gT.e(C8953gT.t).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3003aqj.f());
        }
    }
}
