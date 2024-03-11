package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.netflix.android.org.json.zip.JSONzip;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric;

/* loaded from: classes6.dex */
class DilithiumEngine {
    private final int CryptoBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int DilithiumBeta;
    private final int DilithiumCTilde;
    private final int DilithiumEta;
    private final int DilithiumGamma1;
    private final int DilithiumGamma2;
    private final int DilithiumK;
    private final int DilithiumL;
    private final int DilithiumMode;
    private final int DilithiumOmega;
    private final int DilithiumPolyEtaPackedBytes;
    private final int DilithiumPolyVecHPackedBytes;
    private final int DilithiumPolyW1PackedBytes;
    private final int DilithiumPolyZPackedBytes;
    private final int DilithiumTau;
    private final int PolyUniformGamma1NBlocks;
    private final SecureRandom random;
    private final SHAKEDigest shake128Digest = new SHAKEDigest(128);
    private final SHAKEDigest shake256Digest = new SHAKEDigest(JSONzip.end);
    private final Symmetric symmetric;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DilithiumEngine(int i, SecureRandom secureRandom, boolean z) {
        int i2;
        int i3;
        int i4;
        this.DilithiumMode = i;
        if (i != 2) {
            if (i == 3) {
                this.DilithiumK = 6;
                this.DilithiumL = 5;
                this.DilithiumEta = 4;
                this.DilithiumTau = 49;
                this.DilithiumBeta = 196;
                this.DilithiumGamma1 = 524288;
                this.DilithiumGamma2 = 261888;
                this.DilithiumOmega = 55;
                this.DilithiumPolyZPackedBytes = 640;
                this.DilithiumPolyW1PackedBytes = 128;
                this.DilithiumPolyEtaPackedBytes = 128;
                i4 = 48;
            } else if (i != 5) {
                throw new IllegalArgumentException("The mode " + i + "is not supported by Crystals Dilithium!");
            } else {
                this.DilithiumK = 8;
                this.DilithiumL = 7;
                this.DilithiumEta = 2;
                this.DilithiumTau = 60;
                this.DilithiumBeta = 120;
                this.DilithiumGamma1 = 524288;
                this.DilithiumGamma2 = 261888;
                this.DilithiumOmega = 75;
                this.DilithiumPolyZPackedBytes = 640;
                this.DilithiumPolyW1PackedBytes = 128;
                this.DilithiumPolyEtaPackedBytes = 96;
                i4 = 64;
            }
            this.DilithiumCTilde = i4;
        } else {
            this.DilithiumK = 4;
            this.DilithiumL = 4;
            this.DilithiumEta = 2;
            this.DilithiumTau = 39;
            this.DilithiumBeta = 78;
            this.DilithiumGamma1 = 131072;
            this.DilithiumGamma2 = 95232;
            this.DilithiumOmega = 80;
            this.DilithiumPolyZPackedBytes = 576;
            this.DilithiumPolyW1PackedBytes = 192;
            this.DilithiumPolyEtaPackedBytes = 96;
            this.DilithiumCTilde = 32;
        }
        Symmetric aesSymmetric = z ? new Symmetric.AesSymmetric() : new Symmetric.ShakeSymmetric();
        this.symmetric = aesSymmetric;
        this.random = secureRandom;
        int i5 = this.DilithiumOmega;
        int i6 = this.DilithiumK;
        int i7 = i5 + i6;
        this.DilithiumPolyVecHPackedBytes = i7;
        this.CryptoPublicKeyBytes = (i6 * 320) + 32;
        int i8 = this.DilithiumL;
        int i9 = this.DilithiumPolyEtaPackedBytes;
        this.CryptoSecretKeyBytes = (i8 * i9) + 96 + (i9 * i6) + (i6 * 416);
        this.CryptoBytes = this.DilithiumCTilde + (i8 * this.DilithiumPolyZPackedBytes) + i7;
        int i10 = this.DilithiumGamma1;
        if (i10 == 131072) {
            i2 = aesSymmetric.stream256BlockBytes;
            i3 = i2 + 575;
        } else if (i10 != 524288) {
            throw new RuntimeException("Wrong Dilithium Gamma1!");
        } else {
            i2 = aesSymmetric.stream256BlockBytes;
            i3 = i2 + 639;
        }
        this.PolyUniformGamma1NBlocks = i3 / i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDilithiumK() {
        return this.DilithiumK;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDilithiumL() {
        return this.DilithiumL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDilithiumPolyEtaPackedBytes() {
        return this.DilithiumPolyEtaPackedBytes;
    }
}
