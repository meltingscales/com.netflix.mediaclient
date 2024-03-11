package androidx.profileinstaller;

import java.util.Arrays;

/* loaded from: classes5.dex */
public class ProfileVersion {
    static final byte[] V015_S = {48, 49, 53, 0};
    static final byte[] V010_P = {48, 49, 48, 0};
    static final byte[] V009_O_MR1 = {48, 48, 57, 0};
    static final byte[] V005_O = {48, 48, 53, 0};
    static final byte[] V001_N = {48, 48, 49, 0};
    static final byte[] METADATA_V001_N = {48, 48, 49, 0};
    static final byte[] METADATA_V002 = {48, 48, 50, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String dexKeySeparator(byte[] bArr) {
        return (Arrays.equals(bArr, V001_N) || Arrays.equals(bArr, V005_O)) ? ":" : "!";
    }
}
