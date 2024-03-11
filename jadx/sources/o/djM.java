package o;

import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.util.MslContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class djM extends djK {
    private static final Logger b = LoggerFactory.getLogger(djM.class);
    final dkO a;
    final InterfaceC8423dla e;

    public djM(InterfaceC8423dla interfaceC8423dla, dkO dko) {
        super(djL.q);
        this.a = dko;
        this.e = interfaceC8423dla;
    }

    @Override // o.djK
    public djG e(MslContext mslContext, C8401dkf c8401dkf) {
        return new djN(mslContext, c8401dkf);
    }

    @Override // o.djK
    public AbstractC8393djy e(MslContext mslContext, djG djg) {
        if (!(djg instanceof djN)) {
            String format = String.format("expected %s, received %s", djN.class.getName(), djg.getClass().getName());
            b.error("Incorrect authentication data type: {}", format);
            throw new MslInternalException("Incorrect authentication data type: " + format + ".");
        }
        djN djn = (djN) djg;
        if (djn.e() != this.a) {
            b.info("MasterToken mismatch between entity auth data and MSL context.");
            throw new MslEntityAuthException(C8373dje.t);
        }
        djG b2 = djn.b();
        djI a = b2.a();
        djK d = mslContext.d(a);
        if (d == null) {
            b.info("Could not find entity auth factory for scheme {}", a);
            throw new MslEntityAuthException(C8373dje.p, a.c()).d(djn);
        }
        return d.e(mslContext, b2);
    }
}
