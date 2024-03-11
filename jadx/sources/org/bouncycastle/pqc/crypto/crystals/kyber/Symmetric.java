package org.bouncycastle.pqc.crypto.crystals.kyber;

import com.netflix.android.org.json.zip.JSONzip;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class Symmetric {
    final int xofBlockBytes;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* loaded from: classes6.dex */
    public static class AesSymmetric extends Symmetric {
        private final StreamCipher cipher;
        private final SHA256Digest sha256Digest;
        private final SHA512Digest sha512Digest;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AesSymmetric() {
            super(64);
            this.sha256Digest = new SHA256Digest();
            this.sha512Digest = new SHA512Digest();
            this.cipher = SICBlockCipher.newInstance(AESEngine.newInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class ShakeSymmetric extends Symmetric {
        private final SHA3Digest sha3Digest256;
        private final SHA3Digest sha3Digest512;
        private final SHAKEDigest shakeDigest;
        private final SHAKEDigest xof;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ShakeSymmetric() {
            super(168);
            this.xof = new SHAKEDigest(128);
            this.shakeDigest = new SHAKEDigest(JSONzip.end);
            this.sha3Digest256 = new SHA3Digest(JSONzip.end);
            this.sha3Digest512 = new SHA3Digest(512);
        }
    }

    Symmetric(int i) {
        this.xofBlockBytes = i;
    }
}
