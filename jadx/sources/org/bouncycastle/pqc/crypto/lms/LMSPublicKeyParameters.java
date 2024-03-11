package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes6.dex */
public class LMSPublicKeyParameters extends LMSKeyParameters {
    private final byte[] I;
    private final byte[] T1;
    private final LMOtsParameters lmOtsType;
    private final LMSigParameters parameterSet;

    public LMSPublicKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        super(false);
        this.parameterSet = lMSigParameters;
        this.lmOtsType = lMOtsParameters;
        this.I = Arrays.clone(bArr2);
        this.T1 = Arrays.clone(bArr);
    }

    public static LMSPublicKeyParameters getInstance(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof LMSPublicKeyParameters) {
            return (LMSPublicKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream2.readInt());
            LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[parametersForType.getM()];
            dataInputStream2.readFully(bArr2);
            return new LMSPublicKeyParameters(parametersForType, parametersForType2, bArr2, bArr);
        } else if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse " + obj);
        } else {
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
            }
            try {
                LMSPublicKeyParameters lMSPublicKeyParameters = getInstance(dataInputStream);
                dataInputStream.close();
                return lMSPublicKeyParameters;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKeyParameters = (LMSPublicKeyParameters) obj;
        if (this.parameterSet.equals(lMSPublicKeyParameters.parameterSet) && this.lmOtsType.equals(lMSPublicKeyParameters.lmOtsType) && Arrays.areEqual(this.I, lMSPublicKeyParameters.I)) {
            return Arrays.areEqual(this.T1, lMSPublicKeyParameters.T1);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return toByteArray();
    }

    public int hashCode() {
        return (((((this.parameterSet.hashCode() * 31) + this.lmOtsType.hashCode()) * 31) + Arrays.hashCode(this.I)) * 31) + Arrays.hashCode(this.T1);
    }

    byte[] toByteArray() {
        return Composer.compose().u32str(this.parameterSet.getType()).u32str(this.lmOtsType.getType()).bytes(this.I).bytes(this.T1).build();
    }
}
