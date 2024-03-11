package o;

import com.apollographql.apollo3.api.json.JsonReader;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import o.AbstractC8997hK;

/* renamed from: o.azd  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3472azd implements InterfaceC8949gP<C3163atk> {
    public static final C3472azd e = new C3472azd();

    private C3472azd() {
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: d */
    public C3163atk b(JsonReader jsonReader, C9028hp c9028hp) {
        C8632dsu.c((Object) jsonReader, "");
        C8632dsu.c((Object) c9028hp, "");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // o.InterfaceC8949gP
    /* renamed from: a */
    public void e(InterfaceC9069id interfaceC9069id, C9028hp c9028hp, C3163atk c3163atk) {
        C8632dsu.c((Object) interfaceC9069id, "");
        C8632dsu.c((Object) c9028hp, "");
        C8632dsu.c((Object) c3163atk, "");
        if (c3163atk.e() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.WIDTH);
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3163atk.e());
        }
        if (c3163atk.c() instanceof AbstractC8997hK.b) {
            interfaceC9069id.e(InteractiveAnimation.ANIMATION_TYPE.HEIGHT);
            C8953gT.e(C8953gT.n).e(interfaceC9069id, c9028hp, (AbstractC8997hK.b) c3163atk.c());
        }
    }
}
