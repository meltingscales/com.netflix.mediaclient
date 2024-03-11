package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WOTSPlus {
    private final KeyedHashFunctions khf;
    private final WOTSPlusParameters params;
    private byte[] publicSeed;
    private byte[] secretKeySeed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WOTSPlus(WOTSPlusParameters wOTSPlusParameters) {
        if (wOTSPlusParameters == null) {
            throw new NullPointerException("params == null");
        }
        this.params = wOTSPlusParameters;
        int treeDigestSize = wOTSPlusParameters.getTreeDigestSize();
        this.khf = new KeyedHashFunctions(wOTSPlusParameters.getTreeDigest(), treeDigestSize);
        this.secretKeySeed = new byte[treeDigestSize];
        this.publicSeed = new byte[treeDigestSize];
    }

    private byte[] chain(byte[] bArr, int i, int i2, OTSHashAddress oTSHashAddress) {
        int treeDigestSize = this.params.getTreeDigestSize();
        if (bArr != null) {
            if (bArr.length != treeDigestSize) {
                throw new IllegalArgumentException("startHash needs to be " + treeDigestSize + "bytes");
            } else if (oTSHashAddress != null) {
                if (oTSHashAddress.toByteArray() != null) {
                    int i3 = i + i2;
                    if (i3 <= this.params.getWinternitzParameter() - 1) {
                        if (i2 == 0) {
                            return bArr;
                        }
                        byte[] chain = chain(bArr, i, i2 - 1, oTSHashAddress);
                        OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(oTSHashAddress.getChainAddress()).withHashAddress(i3 - 1).withKeyAndMask(0).build();
                        byte[] PRF = this.khf.PRF(this.publicSeed, oTSHashAddress2.toByteArray());
                        byte[] PRF2 = this.khf.PRF(this.publicSeed, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(oTSHashAddress2.getOTSAddress()).withChainAddress(oTSHashAddress2.getChainAddress()).withHashAddress(oTSHashAddress2.getHashAddress()).withKeyAndMask(1).build()).toByteArray());
                        byte[] bArr2 = new byte[treeDigestSize];
                        for (int i4 = 0; i4 < treeDigestSize; i4++) {
                            bArr2[i4] = (byte) (chain[i4] ^ PRF2[i4]);
                        }
                        return this.khf.F(PRF, bArr2);
                    }
                    throw new IllegalArgumentException("max chain length must not be greater than w");
                }
                throw new NullPointerException("otsHashAddress byte array == null");
            } else {
                throw new NullPointerException("otsHashAddress == null");
            }
        }
        throw new NullPointerException("startHash == null");
    }

    private byte[] expandSecretKeySeed(int i) {
        if (i < 0 || i >= this.params.getLen()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.khf.PRF(this.secretKeySeed, XMSSUtil.toBytesBigEndian(i, 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public KeyedHashFunctions getKhf() {
        return this.khf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WOTSPlusParameters getParams() {
        return this.params;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WOTSPlusPublicKeyParameters getPublicKey(OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress != null) {
            byte[][] bArr = new byte[this.params.getLen()];
            for (int i = 0; i < this.params.getLen(); i++) {
                oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
                bArr[i] = chain(expandSecretKeySeed(i), 0, this.params.getWinternitzParameter() - 1, oTSHashAddress);
            }
            return new WOTSPlusPublicKeyParameters(this.params, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] getPublicSeed() {
        return Arrays.clone(this.publicSeed);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] getWOTSPlusSecretKey(byte[] bArr, OTSHashAddress oTSHashAddress) {
        return this.khf.PRF(bArr, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).build()).toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void importKeys(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.secretKeySeed = bArr;
        this.publicSeed = bArr2;
    }
}
