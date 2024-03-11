package org.bouncycastle.pqc.crypto.frodo;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoMatrixGenerator;
import org.linphone.core.Privacy;

/* loaded from: classes6.dex */
public class FrodoParameters implements KEMParameters {
    private static final short[] cdf_table1344;
    private static final short[] cdf_table640;
    private static final short[] cdf_table976;
    public static final FrodoParameters frodokem1344aes;
    public static final FrodoParameters frodokem1344shake;
    public static final FrodoParameters frodokem640aes;
    public static final FrodoParameters frodokem640shake;
    public static final FrodoParameters frodokem976aes;
    public static final FrodoParameters frodokem976shake;
    private final int B;
    private final int D;
    private final int defaultKeySize;
    private final FrodoEngine engine;
    private final int n;
    private final String name;

    static {
        short[] sArr = {4643, 13363, 20579, 25843, 29227, 31145, 32103, 32525, 32689, 32745, 32762, 32766, Short.MAX_VALUE};
        cdf_table640 = sArr;
        short[] sArr2 = {5638, 15915, 23689, 28571, 31116, 32217, 32613, 32731, 32760, 32766, Short.MAX_VALUE};
        cdf_table976 = sArr2;
        short[] sArr3 = {9142, 23462, 30338, 32361, 32725, 32765, Short.MAX_VALUE};
        cdf_table1344 = sArr3;
        frodokem640aes = new FrodoParameters("frodokem640aes", 640, 15, 2, sArr, new SHAKEDigest(128), new FrodoMatrixGenerator.Aes128MatrixGenerator(640, Privacy.DEFAULT));
        frodokem640shake = new FrodoParameters("frodokem640shake", 640, 15, 2, sArr, new SHAKEDigest(128), new FrodoMatrixGenerator.Shake128MatrixGenerator(640, Privacy.DEFAULT));
        frodokem976aes = new FrodoParameters("frodokem976aes", 976, 16, 3, sArr2, new SHAKEDigest(JSONzip.end), new FrodoMatrixGenerator.Aes128MatrixGenerator(976, AleCryptoBouncyCastle.MAX_RANDOM_BYTES));
        frodokem976shake = new FrodoParameters("frodokem976shake", 976, 16, 3, sArr2, new SHAKEDigest(JSONzip.end), new FrodoMatrixGenerator.Shake128MatrixGenerator(976, AleCryptoBouncyCastle.MAX_RANDOM_BYTES));
        frodokem1344aes = new FrodoParameters("frodokem1344aes", 1344, 16, 4, sArr3, new SHAKEDigest(JSONzip.end), new FrodoMatrixGenerator.Aes128MatrixGenerator(1344, AleCryptoBouncyCastle.MAX_RANDOM_BYTES));
        frodokem1344shake = new FrodoParameters("frodokem1344shake", 1344, 16, 4, sArr3, new SHAKEDigest(JSONzip.end), new FrodoMatrixGenerator.Shake128MatrixGenerator(1344, AleCryptoBouncyCastle.MAX_RANDOM_BYTES));
    }

    private FrodoParameters(String str, int i, int i2, int i3, short[] sArr, Xof xof, FrodoMatrixGenerator frodoMatrixGenerator) {
        this.name = str;
        this.n = i;
        this.D = i2;
        this.B = i3;
        this.defaultKeySize = i3 * 64;
        this.engine = new FrodoEngine(i, i2, i3, sArr, xof, frodoMatrixGenerator);
    }
}
