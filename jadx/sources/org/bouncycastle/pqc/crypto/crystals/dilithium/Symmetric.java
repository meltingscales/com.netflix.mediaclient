package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.netflix.android.org.json.zip.JSONzip;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;

/* loaded from: classes6.dex */
abstract class Symmetric {
    final int stream128BlockBytes;
    final int stream256BlockBytes;

    @Deprecated
    /* loaded from: classes6.dex */
    static class AesSymmetric extends Symmetric {
        private final StreamCipher cipher;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AesSymmetric() {
            super(64, 64);
            this.cipher = SICBlockCipher.newInstance(AESEngine.newInstance());
        }
    }

    /* loaded from: classes6.dex */
    static class ShakeSymmetric extends Symmetric {
        private final SHAKEDigest digest128;
        private final SHAKEDigest digest256;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ShakeSymmetric() {
            super(168, 136);
            this.digest128 = new SHAKEDigest(128);
            this.digest256 = new SHAKEDigest(JSONzip.end);
        }
    }

    Symmetric(int i, int i2) {
        this.stream128BlockBytes = i;
        this.stream256BlockBytes = i2;
    }
}
