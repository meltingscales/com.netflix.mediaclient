package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* loaded from: classes6.dex */
public class RainbowParameters implements CipherParameters {
    public static final RainbowParameters rainbowIIIcircumzenithal;
    public static final RainbowParameters rainbowIIIclassic;
    public static final RainbowParameters rainbowIIIcompressed;
    public static final RainbowParameters rainbowVcircumzenithal;
    public static final RainbowParameters rainbowVclassic;
    public static final RainbowParameters rainbowVcompressed;
    private final Digest hash_algo;
    private final int m;
    private final int n;
    private final String name;
    private final int o1;
    private final int o2;
    private final int v1;
    private final int v2;
    private final Version version;

    static {
        Version version = Version.CLASSIC;
        rainbowIIIclassic = new RainbowParameters("rainbow-III-classic", 3, version);
        Version version2 = Version.CIRCUMZENITHAL;
        rainbowIIIcircumzenithal = new RainbowParameters("rainbow-III-circumzenithal", 3, version2);
        Version version3 = Version.COMPRESSED;
        rainbowIIIcompressed = new RainbowParameters("rainbow-III-compressed", 3, version3);
        rainbowVclassic = new RainbowParameters("rainbow-V-classic", 5, version);
        rainbowVcircumzenithal = new RainbowParameters("rainbow-V-circumzenithal", 5, version2);
        rainbowVcompressed = new RainbowParameters("rainbow-V-compressed", 5, version3);
    }

    private RainbowParameters(String str, int i, Version version) {
        Digest sHA384Digest;
        this.name = str;
        if (i == 3) {
            this.v1 = 68;
            this.o1 = 32;
            this.o2 = 48;
            sHA384Digest = new SHA384Digest();
        } else if (i != 5) {
            throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
        } else {
            this.v1 = 96;
            this.o1 = 36;
            this.o2 = 64;
            sHA384Digest = new SHA512Digest();
        }
        this.hash_algo = sHA384Digest;
        int i2 = this.v1;
        int i3 = this.o1;
        int i4 = i2 + i3;
        this.v2 = i4;
        int i5 = this.o2;
        this.n = i4 + i5;
        this.m = i3 + i5;
        this.version = version;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Digest getHash_algo() {
        return this.hash_algo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getLen_pkseed() {
        return 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getLen_skseed() {
        return 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getM() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getN() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getO1() {
        return this.o1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getO2() {
        return this.o2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getV1() {
        return this.v1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Version getVersion() {
        return this.version;
    }
}
