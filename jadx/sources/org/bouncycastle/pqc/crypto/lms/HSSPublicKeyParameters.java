package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes6.dex */
public class HSSPublicKeyParameters extends LMSKeyParameters {
    private final int l;
    private final LMSPublicKeyParameters lmsPublicKey;

    public HSSPublicKeyParameters(int i, LMSPublicKeyParameters lMSPublicKeyParameters) {
        super(false);
        this.l = i;
        this.lmsPublicKey = lMSPublicKeyParameters;
    }

    public static HSSPublicKeyParameters getInstance(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof HSSPublicKeyParameters) {
            return (HSSPublicKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            return new HSSPublicKeyParameters(((DataInputStream) obj).readInt(), LMSPublicKeyParameters.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
            dataInputStream = null;
        }
        try {
            HSSPublicKeyParameters hSSPublicKeyParameters = getInstance(dataInputStream);
            dataInputStream.close();
            return hSSPublicKeyParameters;
        } catch (Throwable th2) {
            th = th2;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            throw th;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) obj;
        if (this.l != hSSPublicKeyParameters.l) {
            return false;
        }
        return this.lmsPublicKey.equals(hSSPublicKeyParameters.lmsPublicKey);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return Composer.compose().u32str(this.l).bytes(this.lmsPublicKey.getEncoded()).build();
    }

    public int getL() {
        return this.l;
    }

    public LMSPublicKeyParameters getLMSPublicKey() {
        return this.lmsPublicKey;
    }

    public int hashCode() {
        return (this.l * 31) + this.lmsPublicKey.hashCode();
    }
}
