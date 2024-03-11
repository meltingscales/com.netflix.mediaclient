package o;

import com.netflix.msl.io.MslEncoderException;
import java.io.InputStream;
import java.util.Set;

/* loaded from: classes5.dex */
public class djY extends AbstractC8399dkd {
    @Override // o.AbstractC8399dkd
    public C8404dki b(Set<C8404dki> set) {
        if (set == null) {
            return C8404dki.b;
        }
        C8404dki c8404dki = C8404dki.d;
        if (set.contains(c8404dki)) {
            return c8404dki;
        }
        C8404dki c8404dki2 = C8404dki.b;
        set.contains(c8404dki2);
        return c8404dki2;
    }

    @Override // o.AbstractC8399dkd
    protected AbstractC8409dkn d(InputStream inputStream, C8404dki c8404dki) {
        return new C8406dkk(null, InterfaceC8405dkj.e(inputStream, c8404dki));
    }

    @Override // o.AbstractC8399dkd
    public C8401dkf c(byte[] bArr) {
        C8410dko c8410dko = new C8410dko(null, InterfaceC8405dkj.c(bArr, d(bArr)));
        try {
            C8401dkf d = c8410dko.a() ? c8410dko.d() : null;
            c8410dko.close();
            return d;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c8410dko.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // o.AbstractC8399dkd
    public byte[] c(C8401dkf c8401dkf, C8404dki c8404dki) {
        if (!C8404dki.b.equals(c8404dki) && !C8404dki.d.equals(c8404dki)) {
            throw new MslEncoderException("Unsupported encoder format: " + c8404dki + ".");
        }
        return new djX(c8404dki, this).c(c8401dkf);
    }
}
