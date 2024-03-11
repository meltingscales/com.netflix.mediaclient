package o;

import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.util.MslContext;

/* loaded from: classes5.dex */
public class djU extends djK {
    final InterfaceC8423dla a;

    public djU(InterfaceC8423dla interfaceC8423dla) {
        super(djL.t);
        this.a = interfaceC8423dla;
    }

    @Override // o.djK
    public djG e(MslContext mslContext, C8401dkf c8401dkf) {
        return new djR(c8401dkf);
    }

    @Override // o.djK
    public AbstractC8393djy e(MslContext mslContext, djG djg) {
        if (!(djg instanceof djR)) {
            throw new MslInternalException("Incorrect authentication data type " + djg.getClass().getName() + ".");
        }
        String b = ((djR) djg).b();
        if (!this.a.b(b, e())) {
            C8373dje c8373dje = C8377dji.eD;
            throw new MslEntityAuthException(c8373dje, "Authentication Scheme for ESN Not Supported " + b + ":" + e());
        } else if (this.a.c(b)) {
            throw new MslEntityAuthException(C8377dji.eg, b);
        } else {
            return new djD();
        }
    }
}
