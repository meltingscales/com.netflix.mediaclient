package o;

import com.netflix.msl.MslCryptoException;
import com.netflix.msl.MslEncodingException;
import com.netflix.msl.MslEntityAuthException;
import com.netflix.msl.MslException;
import com.netflix.msl.MslMasterTokenException;
import com.netflix.msl.io.MslEncoderException;
import com.netflix.msl.util.MslContext;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class djN extends djG {
    private static final Logger a = LoggerFactory.getLogger(djN.class);
    private final MslContext b;
    private final dkO c;
    private final djG d;
    private String e;
    private final Map<C8404dki, C8401dkf> h;

    public djG b() {
        return this.d;
    }

    public dkO e() {
        return this.c;
    }

    private static AbstractC8393djy a(MslContext mslContext, dkO dko) {
        AbstractC8393djy d = mslContext.h().d(dko);
        return d != null ? d : new djB(mslContext, dko);
    }

    public djN(MslContext mslContext, dkO dko, djG djg, String str) {
        super(djL.q);
        this.h = new HashMap();
        this.b = mslContext;
        this.c = dko;
        this.d = djg;
        this.e = str == null ? "" : str;
        try {
            a.debug("Target ESN = {}", djg.d());
        } catch (MslCryptoException e) {
            a.info("Target ESN = Unknown", (Throwable) e);
        }
    }

    public djN(MslContext mslContext, C8401dkf c8401dkf) {
        super(djL.q);
        this.h = new HashMap();
        this.b = mslContext;
        AbstractC8399dkd e = mslContext.e();
        try {
            byte[] e2 = c8401dkf.e("authdata");
            byte[] e3 = c8401dkf.e("signature");
            try {
                dkO dko = new dkO(mslContext, c8401dkf.b("mastertoken", e));
                this.c = dko;
                Logger logger = a;
                logger.debug("Found source MasterToken with ESN {}", dko.b());
                try {
                    AbstractC8393djy a2 = a(mslContext, dko);
                    logger.debug("Got crypto context for MasterToken with ESN {}", dko.b());
                    try {
                        if (!a2.b(e2, e3, e)) {
                            logger.error("Entity migration received ciphertext that failed verification with source (old) session keys, there is some sort of mismatch");
                            C8373dje c8373dje = C8373dje.u;
                            throw new MslEntityAuthException(c8373dje, "migration authdata " + c8401dkf.toString());
                        }
                        C8401dkf c = e.c(a2.e(e2, e));
                        logger.debug("Target auth data: {}", c);
                        this.d = djG.e(mslContext, c);
                        try {
                            String g = c8401dkf.g("auxinfo");
                            this.e = g;
                            logger.debug("Auxiliary info: {}", g);
                        } catch (MslEncoderException unused) {
                            a.info("No optional auxiliary info field received");
                        }
                        a.debug("Source ESN = {}, Target ESN = {}", this.c.b(), this.d.d());
                    } catch (MslEncoderException e4) {
                        a.info("Error parsing decrypted data", (Throwable) e4);
                        C8373dje c8373dje2 = C8373dje.bd;
                        throw new MslEncodingException(c8373dje2, "migration authdata " + c8401dkf.toString(), e4);
                    }
                } catch (MslMasterTokenException e5) {
                    a.info("Unable to get crypto context for this MasterToken", (Throwable) e5);
                    throw new MslEntityAuthException(C8373dje.q, e5);
                }
            } catch (MslException e6) {
                a.info("Could not create MasterToken", (Throwable) e6);
                C8373dje c8373dje3 = C8373dje.t;
                throw new MslEntityAuthException(c8373dje3, "migration authdata " + c8401dkf.toString(), e6);
            }
        } catch (MslEncoderException e7) {
            a.info("Trouble extracting auth data fields", (Throwable) e7);
            C8373dje c8373dje4 = C8373dje.bd;
            throw new MslEncodingException(c8373dje4, "migration protected authdata " + c8401dkf.toString(), e7);
        }
    }

    @Override // o.djG
    public String d() {
        return this.d.d();
    }

    @Override // o.djG
    public C8401dkf e(AbstractC8399dkd abstractC8399dkd, C8404dki c8404dki) {
        if (this.h.containsKey(c8404dki)) {
            return this.h.get(c8404dki);
        }
        try {
            AbstractC8393djy a2 = a(this.b, this.c);
            try {
                byte[] a3 = a2.a(this.d.c(abstractC8399dkd, c8404dki), abstractC8399dkd, c8404dki);
                Object b = a2.b(a3, abstractC8399dkd, c8404dki);
                C8401dkf e = abstractC8399dkd.e();
                e.e("mastertoken", this.c);
                e.e("authdata", (Object) a3);
                e.e("signature", b);
                e.e("auxinfo", this.e);
                C8401dkf c = abstractC8399dkd.c(abstractC8399dkd.c(e, c8404dki));
                this.h.put(c8404dki, c);
                return c;
            } catch (MslCryptoException e2) {
                throw new MslEncoderException("Error encrypting and signing the authentication data.", e2);
            }
        } catch (MslMasterTokenException e3) {
            throw new MslEncoderException("Master token crypto context cannot be retrieved or created.", e3);
        }
    }

    @Override // o.djG
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djN) {
            djN djn = (djN) obj;
            return super.equals(obj) && this.c.equals(djn.c) && this.d.equals(djn.d) && this.e.equals(djn.e);
        }
        return false;
    }

    @Override // o.djG
    public int hashCode() {
        return ((super.hashCode() ^ this.c.hashCode()) ^ this.d.hashCode()) ^ this.e.hashCode();
    }
}
