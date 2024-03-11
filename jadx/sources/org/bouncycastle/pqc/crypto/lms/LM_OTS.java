package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Pack;

/* loaded from: classes6.dex */
class LM_OTS {
    LM_OTS() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] lms_ots_generatePublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        Digest digest = DigestUtil.getDigest(lMOtsParameters);
        byte[] build = Composer.compose().bytes(bArr).u32str(i).u16str(-32640).padUntil(0, 22).build();
        digest.update(build, 0, build.length);
        Digest digest2 = DigestUtil.getDigest(lMOtsParameters);
        byte[] build2 = Composer.compose().bytes(bArr).u32str(i).padUntil(0, digest2.getDigestSize() + 23).build();
        SeedDerive seedDerive = new SeedDerive(bArr, bArr2, DigestUtil.getDigest(lMOtsParameters));
        seedDerive.setQ(i);
        seedDerive.setJ(0);
        int p = lMOtsParameters.getP();
        int n = lMOtsParameters.getN();
        int w = lMOtsParameters.getW();
        int i2 = 0;
        while (i2 < p) {
            seedDerive.deriveSeed(build2, i2 < p + (-1), 23);
            Pack.shortToBigEndian((short) i2, build2, 20);
            for (int i3 = 0; i3 < (1 << w) - 1; i3++) {
                build2[22] = (byte) i3;
                digest2.update(build2, 0, build2.length);
                digest2.doFinal(build2, 23);
            }
            digest.update(build2, 23, n);
            i2++;
        }
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return bArr3;
    }
}
