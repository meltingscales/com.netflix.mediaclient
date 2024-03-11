package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes6.dex */
public class HSSPrivateKeyParameters extends LMSKeyParameters {
    private long index;
    private final long indexLimit;
    private final boolean isShard;
    private List<LMSPrivateKeyParameters> keys;
    private final int l;
    private HSSPublicKeyParameters publicKey;
    private List<LMSSignature> sig;

    private HSSPrivateKeyParameters(int i, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j, long j2, boolean z) {
        super(true);
        this.index = 0L;
        this.l = i;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j;
        this.indexLimit = j2;
        this.isShard = z;
    }

    public static HSSPrivateKeyParameters getInstance(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof HSSPrivateKeyParameters) {
            return (HSSPrivateKeyParameters) obj;
        }
        if (!(obj instanceof DataInputStream)) {
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
                HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream);
                dataInputStream.close();
                return hSSPrivateKeyParameters;
            } catch (Throwable th2) {
                th = th2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        }
        DataInputStream dataInputStream2 = (DataInputStream) obj;
        if (dataInputStream2.readInt() == 0) {
            int readInt = dataInputStream2.readInt();
            long readLong = dataInputStream2.readLong();
            long readLong2 = dataInputStream2.readLong();
            boolean readBoolean = dataInputStream2.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                arrayList.add(LMSPrivateKeyParameters.getInstance(obj));
            }
            for (int i2 = 0; i2 < readInt - 1; i2++) {
                arrayList2.add(LMSSignature.getInstance(obj));
            }
            return new HSSPrivateKeyParameters(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
        }
        throw new IllegalStateException("unknown version for hss private key");
    }

    public static HSSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) {
        HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(bArr);
        hSSPrivateKeyParameters.publicKey = HSSPublicKeyParameters.getInstance(bArr2);
        return hSSPrivateKeyParameters;
    }

    private static HSSPrivateKeyParameters makeCopy(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        try {
            return getInstance(hSSPrivateKeyParameters.getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    protected Object clone() {
        return makeCopy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) obj;
        if (this.l == hSSPrivateKeyParameters.l && this.isShard == hSSPrivateKeyParameters.isShard && this.indexLimit == hSSPrivateKeyParameters.indexLimit && this.index == hSSPrivateKeyParameters.index && this.keys.equals(hSSPrivateKeyParameters.keys)) {
            return this.sig.equals(hSSPrivateKeyParameters.sig);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        byte[] build;
        synchronized (this) {
            Composer bool = Composer.compose().u32str(0).u32str(this.l).u64str(this.index).u64str(this.indexLimit).bool(this.isShard);
            for (LMSPrivateKeyParameters lMSPrivateKeyParameters : this.keys) {
                bool.bytes(lMSPrivateKeyParameters);
            }
            for (LMSSignature lMSSignature : this.sig) {
                bool.bytes(lMSSignature);
            }
            build = bool.build();
        }
        return build;
    }

    public int getL() {
        return this.l;
    }

    public HSSPublicKeyParameters getPublicKey() {
        HSSPublicKeyParameters hSSPublicKeyParameters;
        synchronized (this) {
            hSSPublicKeyParameters = new HSSPublicKeyParameters(this.l, getRootKey().getPublicKey());
        }
        return hSSPublicKeyParameters;
    }

    LMSPrivateKeyParameters getRootKey() {
        return this.keys.get(0);
    }

    public int hashCode() {
        int i = this.l;
        boolean z = this.isShard;
        int hashCode = this.keys.hashCode();
        int hashCode2 = this.sig.hashCode();
        long j = this.indexLimit;
        long j2 = this.index;
        return (((((((((i * 31) + (z ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
