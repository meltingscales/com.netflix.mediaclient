package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
public final class XMSSMTPublicKeyParameters extends XMSSMTKeyParameters implements Encodable {
    private final int oid;
    private final XMSSMTParameters params;
    private final byte[] publicSeed;
    private final byte[] root;

    /* loaded from: classes6.dex */
    public static class Builder {
        private final XMSSMTParameters params;
        private byte[] root = null;
        private byte[] publicSeed = null;
        private byte[] publicKey = null;

        public Builder(XMSSMTParameters xMSSMTParameters) {
            this.params = xMSSMTParameters;
        }

        public XMSSMTPublicKeyParameters build() {
            return new XMSSMTPublicKeyParameters(this);
        }

        public Builder withPublicKey(byte[] bArr) {
            this.publicKey = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withPublicSeed(byte[] bArr) {
            this.publicSeed = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withRoot(byte[] bArr) {
            this.root = XMSSUtil.cloneArray(bArr);
            return this;
        }
    }

    private XMSSMTPublicKeyParameters(Builder builder) {
        super(false, builder.params.getTreeDigest());
        XMSSMTParameters xMSSMTParameters = builder.params;
        this.params = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.publicKey;
        if (bArr != null) {
            if (bArr.length == treeDigestSize + treeDigestSize) {
                this.oid = 0;
                this.root = XMSSUtil.extractBytesAtOffset(bArr, 0, treeDigestSize);
                this.publicSeed = XMSSUtil.extractBytesAtOffset(bArr, treeDigestSize, treeDigestSize);
                return;
            }
            int i = treeDigestSize + 4;
            if (bArr.length != i + treeDigestSize) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.oid = Pack.bigEndianToInt(bArr, 0);
            this.root = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            this.publicSeed = XMSSUtil.extractBytesAtOffset(bArr, i, treeDigestSize);
            return;
        }
        if (xMSSMTParameters.getOid() != null) {
            this.oid = xMSSMTParameters.getOid().getOid();
        } else {
            this.oid = 0;
        }
        byte[] bArr2 = builder.root;
        if (bArr2 == null) {
            this.root = new byte[treeDigestSize];
        } else if (bArr2.length != treeDigestSize) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.root = bArr2;
        }
        byte[] bArr3 = builder.publicSeed;
        if (bArr3 == null) {
            this.publicSeed = new byte[treeDigestSize];
        } else if (bArr3.length != treeDigestSize) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.publicSeed = bArr3;
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return toByteArray();
    }

    public XMSSMTParameters getParameters() {
        return this.params;
    }

    public byte[] getPublicSeed() {
        return XMSSUtil.cloneArray(this.publicSeed);
    }

    public byte[] getRoot() {
        return XMSSUtil.cloneArray(this.root);
    }

    public byte[] toByteArray() {
        byte[] bArr;
        int treeDigestSize = this.params.getTreeDigestSize();
        int i = this.oid;
        int i2 = 0;
        if (i != 0) {
            bArr = new byte[treeDigestSize + 4 + treeDigestSize];
            Pack.intToBigEndian(i, bArr, 0);
            i2 = 4;
        } else {
            bArr = new byte[treeDigestSize + treeDigestSize];
        }
        XMSSUtil.copyBytesAtOffset(bArr, this.root, i2);
        XMSSUtil.copyBytesAtOffset(bArr, this.publicSeed, i2 + treeDigestSize);
        return bArr;
    }
}
