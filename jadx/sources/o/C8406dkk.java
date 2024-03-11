package o;

/* renamed from: o.dkk  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8406dkk extends AbstractC8409dkn {
    private C8410dko d;

    public C8406dkk(C8402dkg c8402dkg, InterfaceC8405dkj interfaceC8405dkj) {
        this.d = new C8410dko(c8402dkg, interfaceC8405dkj);
    }

    @Override // o.AbstractC8409dkn
    protected C8401dkf d(int i) {
        C8410dko c8410dko = this.d;
        if (c8410dko != null && c8410dko.a()) {
            C8401dkf d = this.d.d();
            this.d.e();
            return d;
        }
        return null;
    }
}
