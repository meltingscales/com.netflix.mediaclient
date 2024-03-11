package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.AbstractC8997hK;

/* renamed from: o.azD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3446azD implements InterfaceC8949gP<C3225auu> {
    public static final C3446azD b = new C3446azD();

    private C3446azD() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public C3225auu b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3225auu c3225auu) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3225auu, "");
        if (c3225auu.a() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("color");
            C8953gT.e(C8953gT.d(C3445azC.b)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3225auu.a());
        }
        if (c3225auu.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.OPACITY);
            C8953gT.e(C8953gT.d(C3450azH.e)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3225auu.e());
        }
    }
}
