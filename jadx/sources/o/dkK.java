package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslInternalException;
import com.netflix.msl.MslKeyExchangeException;
import com.netflix.msl.MslMasterTokenException;
import com.netflix.msl.util.MslContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import o.AbstractC8411dkp;

/* loaded from: classes5.dex */
public class dkK extends dkB {
    private static AbstractC8411dkp.d c(MslContext mslContext, C8404dki c8404dki, Set<AbstractC8412dkq> set, dkO dko, djG djg) {
        Iterator<AbstractC8411dkp> it = mslContext.d().iterator();
        MslEntityAuthException e = null;
        while (it.hasNext()) {
            AbstractC8411dkp next = it.next();
            for (AbstractC8412dkq abstractC8412dkq : set) {
                if (next.c().equals(abstractC8412dkq.e())) {
                    try {
                        if (dko != null) {
                            return next.d(mslContext, c8404dki, abstractC8412dkq, dko);
                        }
                        return next.c(mslContext, c8404dki, abstractC8412dkq, djg);
                    } catch (MslCryptoException e2) {
                        e = e2;
                        if (!it.hasNext()) {
                            throw e;
                        }
                    } catch (MslEncodingException e3) {
                        e = e3;
                        if (!it.hasNext()) {
                            throw e;
                        }
                    } catch (MslEntityAuthException e4) {
                        e = e4;
                        if (!it.hasNext()) {
                            throw e;
                        }
                    } catch (MslKeyExchangeException e5) {
                        e = e5;
                        if (!it.hasNext()) {
                            throw e;
                        }
                    } catch (MslMasterTokenException e6) {
                        e = e6;
                        if (!it.hasNext()) {
                            throw e;
                        }
                    }
                }
            }
        }
        if (e != null) {
            if (e instanceof MslCryptoException) {
                throw ((MslCryptoException) e);
            }
            if (e instanceof MslKeyExchangeException) {
                throw ((MslKeyExchangeException) e);
            }
            if (e instanceof MslEncodingException) {
                throw ((MslEncodingException) e);
            }
            if (e instanceof MslMasterTokenException) {
                throw ((MslMasterTokenException) e);
            }
            if (e instanceof MslEntityAuthException) {
                throw e;
            }
            throw new MslInternalException("Unexpected exception caught during key exchange.", e);
        }
        throw new MslKeyExchangeException(C8373dje.ae, Arrays.toString(set.toArray()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[Catch: MslException -> 0x0137, TryCatch #1 {MslException -> 0x0137, blocks: (B:7:0x003a, B:9:0x0044, B:12:0x004c, B:14:0x0052, B:16:0x0058, B:21:0x0066, B:24:0x0070, B:26:0x0076, B:28:0x007c, B:34:0x008e, B:30:0x0082, B:32:0x0088, B:35:0x0097, B:39:0x00a1, B:41:0x00a7, B:43:0x00b1, B:44:0x00ba, B:45:0x00d1, B:46:0x00d2, B:17:0x005d), top: B:73:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7 A[Catch: MslException -> 0x0137, TryCatch #1 {MslException -> 0x0137, blocks: (B:7:0x003a, B:9:0x0044, B:12:0x004c, B:14:0x0052, B:16:0x0058, B:21:0x0066, B:24:0x0070, B:26:0x0076, B:28:0x007c, B:34:0x008e, B:30:0x0082, B:32:0x0088, B:35:0x0097, B:39:0x00a1, B:41:0x00a7, B:43:0x00b1, B:44:0x00ba, B:45:0x00d1, B:46:0x00d2, B:17:0x005d), top: B:73:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dkK(com.netflix.msl.util.MslContext r22, o.dkG r23) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dkK.<init>(com.netflix.msl.util.MslContext, o.dkG):void");
    }
}
