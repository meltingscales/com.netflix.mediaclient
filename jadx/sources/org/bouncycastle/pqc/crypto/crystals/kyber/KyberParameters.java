package org.bouncycastle.pqc.crypto.crystals.kyber;

import com.netflix.android.org.json.zip.JSONzip;
import org.bouncycastle.pqc.crypto.KEMParameters;

/* loaded from: classes6.dex */
public class KyberParameters implements KEMParameters {
    private final int k;
    private final String name;
    private final int sessionKeySize;
    private final boolean usingAes;
    public static final KyberParameters kyber512 = new KyberParameters("kyber512", 2, JSONzip.end, false);
    public static final KyberParameters kyber768 = new KyberParameters("kyber768", 3, JSONzip.end, false);
    public static final KyberParameters kyber1024 = new KyberParameters("kyber1024", 4, JSONzip.end, false);

    private KyberParameters(String str, int i, int i2, boolean z) {
        this.name = str;
        this.k = i;
        this.sessionKeySize = i2;
        this.usingAes = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KyberEngine getEngine() {
        return new KyberEngine(this.k, this.usingAes);
    }

    public String getName() {
        return this.name;
    }
}
