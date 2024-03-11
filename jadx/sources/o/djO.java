package o;

import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.crypto.RsaCryptoContext;
import com.netflix.msl.util.MslContext;
import java.security.PrivateKey;
import java.security.PublicKey;

/* loaded from: classes5.dex */
public class djO extends djK {
    private final String a;
    final InterfaceC8423dla b;
    private final djT c;

    public djO(djT djt, InterfaceC8423dla interfaceC8423dla) {
        this(null, djt, interfaceC8423dla);
    }

    public djO(String str, djT djt, InterfaceC8423dla interfaceC8423dla) {
        super(djI.j);
        this.a = str;
        this.c = djt;
        this.b = interfaceC8423dla;
    }

    @Override // o.djK
    public djG e(MslContext mslContext, C8401dkf c8401dkf) {
        return new djP(c8401dkf);
    }

    @Override // o.djK
    public AbstractC8393djy e(MslContext mslContext, djG djg) {
        if (!(djg instanceof djP)) {
            throw new MslInternalException("Incorrect authentication data type " + djg.getClass().getName() + ".");
        }
        djP djp = (djP) djg;
        String d = djp.d();
        if (this.b.c(d)) {
            C8373dje c8373dje = C8373dje.w;
            throw new MslEntityAuthException(c8373dje, "rsa " + d).d(djp);
        }
        this.b.e(d, e());
        String e = djp.e();
        PublicKey e2 = this.c.e(e);
        PrivateKey b = this.c.b(e);
        if (e.equals(this.a) && b == null) {
            throw new MslEntityAuthException(C8373dje.bC, e).d(djp);
        }
        if (!e.equals(this.a) && e2 == null) {
            throw new MslEntityAuthException(C8373dje.bD, e).d(djp);
        }
        return new RsaCryptoContext(mslContext, d, b, e2, RsaCryptoContext.Mode.SIGN_VERIFY);
    }
}
