package o;

import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.crypto.EccCryptoContext;
import com.netflix.msl.util.MslContext;
import java.security.PrivateKey;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public class djJ extends djK {
    private final String c;
    private final djH d;
    private final InterfaceC8423dla e;

    public djJ(djH djh, InterfaceC8423dla interfaceC8423dla) {
        this(null, djh, interfaceC8423dla);
    }

    public djJ(String str, djH djh, InterfaceC8423dla interfaceC8423dla) {
        super(djI.b);
        this.c = str;
        this.d = djh;
        this.e = interfaceC8423dla;
    }

    @Override // o.djK
    public djG e(MslContext mslContext, C8401dkf c8401dkf) {
        return new djC(c8401dkf);
    }

    @Override // o.djK
    public AbstractC8393djy e(MslContext mslContext, djG djg) {
        if (!(djg instanceof djC)) {
            throw new MslInternalException("Incorrect authentication data type " + djg.getClass().getName() + ".");
        }
        djC djc = (djC) djg;
        String d = djc.d();
        if (this.e.c(d)) {
            C8373dje c8373dje = C8373dje.w;
            throw new MslEntityAuthException(c8373dje, "ecc" + d).d(djc);
        }
        this.e.e(d, e());
        String c = djc.c();
        PublicKey d2 = this.d.d(c);
        PrivateKey c2 = this.d.c(c);
        if (c.equals(this.c) && c2 == null) {
            throw new MslEntityAuthException(C8373dje.g, c).d(djc);
        }
        if (!c.equals(this.c) && d2 == null) {
            throw new MslEntityAuthException(C8373dje.f13848o, c).d(djc);
        }
        return new EccCryptoContext(d, c2, d2, EccCryptoContext.Mode.SIGN_VERIFY);
    }
}
