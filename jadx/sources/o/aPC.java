package o;

import android.util.Base64;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.crypto.CryptoProvider;

/* loaded from: classes3.dex */
public interface aPC {
    public static final byte[] n = {10, 122, 0, 108, 56, 43};

    /* loaded from: classes3.dex */
    public interface e {
        void a();

        void d();

        void d(Status status);
    }

    boolean a(a aVar, c cVar, byte[] bArr, byte[] bArr2);

    byte[] a(a aVar, c cVar, byte[] bArr);

    C1833aPy b();

    a c(c cVar);

    a c(C8418dkw c8418dkw, byte[] bArr, c cVar, c cVar2);

    C8418dkw c();

    void d(a aVar);

    byte[] d(a aVar, c cVar, byte[] bArr, byte[] bArr2);

    byte[] e(a aVar, c cVar, byte[] bArr, byte[] bArr2);

    boolean f();

    void g();

    void i();

    CryptoProvider l();

    void o();

    /* loaded from: classes3.dex */
    public static class a {
        public byte[] a;
        public c b;
        public byte[] e;

        public byte[] a() {
            return this.a;
        }

        public String e() {
            byte[] bArr = this.a;
            if (bArr == null) {
                return null;
            }
            return Base64.encodeToString(bArr, 2);
        }

        public String toString() {
            return "CryptoSession{keySetId=" + this.b + ", sessionId=" + C8137deh.e(this.e) + ", keyRequestData=" + e() + '}';
        }

        public boolean d() {
            byte[] bArr = this.a;
            return bArr == null || bArr.length <= 0;
        }
    }

    /* loaded from: classes3.dex */
    public static class c {
        private String d;
        private byte[] e;

        public byte[] a() {
            return this.e;
        }

        public String b() {
            return this.d;
        }

        public c(String str) {
            if (C8168dfL.g(str)) {
                throw new IllegalStateException("Key Set ID can not be empty!");
            }
            this.d = str;
            this.e = C8137deh.c(str);
            e();
        }

        public c(byte[] bArr) {
            this.e = bArr;
            e();
            this.d = C8137deh.a(bArr);
        }

        public String toString() {
            return "KeyId{" + this.d + '}';
        }

        private void e() {
            byte[] bArr = this.e;
            if (bArr == null || bArr.length == 0) {
                throw new IllegalStateException("Key Set ID can not be empty!");
            }
        }
    }
}
