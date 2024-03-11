package o;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
class Mi$b implements InterfaceC8376djh {
    private final SecretKey a;
    private final int b;
    private final String e;

    @Override // o.InterfaceC8376djh
    public String a() {
        return this.e;
    }

    @Override // o.InterfaceC8376djh
    public SecretKey c() {
        return this.a;
    }

    @Override // o.InterfaceC8376djh
    public int e() {
        return this.b;
    }

    public Mi$b(String str, int i, String str2) {
        if (C8168dfL.g(str)) {
            throw new IllegalArgumentException("AppId can not be null");
        }
        if (C8168dfL.g(str2)) {
            throw new IllegalArgumentException("Secret key can not be null");
        }
        this.e = str;
        this.b = i;
        byte[] d = C8071ddU.d(str2);
        this.a = new SecretKeySpec(d, 0, d.length, "HmacSHA256");
    }

    public String toString() {
        return "ClientAppIdProviderImpl{appId='" + this.e + "', version=" + this.b + ", secretKey=" + this.a + '}';
    }
}
