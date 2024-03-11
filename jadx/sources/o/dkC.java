package o;

import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslMessageException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class dkC implements InterfaceC8400dke {
    public static dkC e(MslContext mslContext, C8401dkf c8401dkf, Map<String, AbstractC8393djy> map) {
        try {
            AbstractC8399dkd e = mslContext.e();
            djG e2 = c8401dkf.h("entityauthdata") ? djG.e(mslContext, c8401dkf.b("entityauthdata", e)) : null;
            dkO dko = c8401dkf.h("mastertoken") ? new dkO(mslContext, c8401dkf.b("mastertoken", e)) : null;
            byte[] e3 = c8401dkf.e("signature");
            try {
                if (c8401dkf.h("headerdata")) {
                    byte[] e4 = c8401dkf.e("headerdata");
                    if (e4.length == 0) {
                        throw new MslMessageException(C8373dje.E).e(dko).d(e2);
                    }
                    return new dkG(mslContext, e4, e2, dko, e3, map);
                } else if (c8401dkf.h("errordata")) {
                    byte[] e5 = c8401dkf.e("errordata");
                    if (e5.length == 0) {
                        throw new MslMessageException(C8373dje.E).e(dko).d(e2);
                    }
                    return new C8416dku(mslContext, e5, e2, e3);
                } else {
                    throw new MslEncodingException(C8373dje.bd, c8401dkf.toString());
                }
            } catch (MslEncoderException e6) {
                C8373dje c8373dje = C8373dje.bd;
                throw new MslEncodingException(c8373dje, "header/errormsg " + c8401dkf, e6);
            }
        } catch (MslEncoderException e7) {
            C8373dje c8373dje2 = C8373dje.bd;
            throw new MslEncodingException(c8373dje2, "header/errormsg " + c8401dkf, e7);
        }
    }
}
