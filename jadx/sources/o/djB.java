package o;

import com.netflix.msl.MslMasterTokenException;
import com.netflix.msl.crypto.MslCiphertextEnvelope;
import com.netflix.msl.util.MslContext;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public class djB extends djF {
    public static String d(dkO dko, MslCiphertextEnvelope.Version version, String str) {
        if (version == MslCiphertextEnvelope.Version.V2) {
            return null;
        }
        if (str == null || (dko.a() != null && dko.a().a())) {
            return Long.toString(dko.e());
        }
        return str + "_" + dko.e();
    }

    public djB(MslContext mslContext, dkO dko) {
        this(mslContext, dko, MslCiphertextEnvelope.Version.V1);
    }

    public djB(MslContext mslContext, dkO dko, MslCiphertextEnvelope.Version version) {
        this(mslContext, dko, dko.b(), dko.d(), dko.j(), version);
        if (!dko.g()) {
            throw new MslMasterTokenException(C8373dje.aK, dko);
        }
    }

    public djB(MslContext mslContext, dkO dko, String str, SecretKey secretKey, SecretKey secretKey2, MslCiphertextEnvelope.Version version) {
        super(mslContext, null, secretKey, null, null, secretKey2, version, d(dko, version, str));
    }
}
