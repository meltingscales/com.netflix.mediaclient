package org.bouncycastle.pqc.crypto.saber;

import com.netflix.android.org.json.zip.JSONzip;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;

/* loaded from: classes6.dex */
abstract class Symmetric {

    /* loaded from: classes6.dex */
    static class AesSymmetric extends Symmetric {
        private final SHA256Digest sha256Digest = new SHA256Digest();
        private final SHA512Digest sha512Digest = new SHA512Digest();
        private final StreamCipher cipher = SICBlockCipher.newInstance(AESEngine.newInstance());
    }

    /* loaded from: classes6.dex */
    static class ShakeSymmetric extends Symmetric {
        private final Xof shakeDigest = new SHAKEDigest(128);
        private final SHA3Digest sha3Digest256 = new SHA3Digest(JSONzip.end);
        private final SHA3Digest sha3Digest512 = new SHA3Digest(512);
    }

    Symmetric() {
    }
}
