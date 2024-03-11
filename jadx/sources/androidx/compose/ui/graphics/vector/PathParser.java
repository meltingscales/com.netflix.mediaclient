package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.List;
import o.C8564dqg;
import o.C8632dsu;
import org.chromium.net.NetError;

/* loaded from: classes.dex */
public final class PathParser {
    private final ArrayList<PathNode> nodes = new ArrayList<>();
    private float[] nodeData = new float[64];

    public final List<PathNode> toNodes() {
        return this.nodes;
    }

    public final PathParser parsePathString(String str) {
        int i;
        char charAt;
        int i2;
        this.nodes.clear();
        int length = str.length();
        int i3 = 0;
        while (i3 < length && C8632dsu.d(str.charAt(i3), 32) <= 0) {
            i3++;
        }
        while (length > i3 && C8632dsu.d(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                charAt = str.charAt(i3);
                int i5 = charAt | ' ';
                if ((i5 - 97) * (i5 + NetError.ERR_ALPN_NEGOTIATION_FAILED) <= 0 && i5 != 101) {
                    break;
                } else if (i >= length) {
                    charAt = 0;
                    break;
                } else {
                    i3 = i;
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i4 = 0;
                    while (true) {
                        if (i >= length || C8632dsu.d(str.charAt(i), 32) > 0) {
                            long nextFloat = FastFloatParserKt.nextFloat(str, i, length);
                            i2 = (int) (nextFloat >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (nextFloat & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i6 = i4 + 1;
                                fArr[i4] = intBitsToFloat;
                                if (i6 >= fArr.length) {
                                    float[] fArr2 = new float[i6 * 2];
                                    this.nodeData = fArr2;
                                    C8564dqg.c(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i4 = i6;
                            }
                            while (i2 < length && str.charAt(i2) == ',') {
                                i2++;
                            }
                            if (i2 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i = i2;
                        } else {
                            i++;
                        }
                    }
                    i = i2;
                }
                PathNodeKt.addPathNodes(charAt, this.nodes, this.nodeData, i4);
            }
            i3 = i;
        }
        return this;
    }
}
