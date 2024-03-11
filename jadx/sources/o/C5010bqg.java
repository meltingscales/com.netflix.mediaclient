package o;

/* renamed from: o.bqg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5010bqg implements InterfaceC5093bsJ {
    private String a;
    private InterfaceC5093bsJ b;
    private AbstractC8424dlb e;

    @Override // o.InterfaceC5093bsJ
    public AbstractC8424dlb c() {
        return this.e;
    }

    @Override // o.InterfaceC5093bsJ
    public String d() {
        return this.a;
    }

    public C5010bqg(String str) {
        this(str, null, null);
    }

    public C5010bqg(String str, AbstractC8424dlb abstractC8424dlb, InterfaceC5093bsJ interfaceC5093bsJ) {
        this.a = str;
        this.e = abstractC8424dlb;
        this.b = interfaceC5093bsJ;
    }

    public String toString() {
        return "SimpleMSLUserCredentialRegistryImpl{userId='" + this.a + "', userAuthenticationData=" + this.e + ", baseMSLUserCredentialRegistry=" + this.b + '}';
    }
}
