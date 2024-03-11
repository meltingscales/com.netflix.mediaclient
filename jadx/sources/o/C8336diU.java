package o;

import java.util.Objects;

/* renamed from: o.diU  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8336diU extends C8329diN {
    private final InterfaceC5160btX d;

    @Override // o.C8329diN, o.InterfaceC5179btq
    public InterfaceC5160btX aE_() {
        return this.d;
    }

    public C8336diU(InterfaceC5160btX interfaceC5160btX) {
        super(null);
        Objects.requireNonNull(interfaceC5160btX);
        this.d = interfaceC5160btX;
    }

    @Override // o.C8329diN, o.InterfaceC5160btX
    public boolean isAvailableToPlay() {
        return this.d.isAvailableToPlay();
    }
}
