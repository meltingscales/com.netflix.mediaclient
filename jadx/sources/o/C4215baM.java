package o;

/* renamed from: o.baM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4215baM extends AbstractC5999cQf<InterfaceC4208baF> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC5999cQf
    /* renamed from: b */
    public InterfaceC4208baF a() {
        InterfaceC4208baF l = AbstractApplicationC1040Mh.getInstance().i().l();
        if (l != null) {
            return l;
        }
        throw new IllegalStateException("offlineAgent is null");
    }
}
