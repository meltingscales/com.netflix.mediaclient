package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.AbstractC8997hK;

/* renamed from: o.azJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3452azJ implements InterfaceC8949gP<C3183auD> {
    public static final C3452azJ d = new C3452azJ();

    private C3452azJ() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3183auD b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: c */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3183auD c3183auD) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3183auD, "");
        if (c3183auD.b() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e("color");
            C8953gT.e(C8953gT.d(C3445azC.b)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3183auD.b());
        }
        if (c3183auD.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.OPACITY);
            C8953gT.e(C8953gT.d(C3450azH.e)).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3183auD.c());
        }
    }
}
