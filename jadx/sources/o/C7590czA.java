package o;

import com.netflix.model.leafs.blades.CreditMarks;
import com.netflix.model.leafs.blades.SkipContentData;
import java.util.List;

/* renamed from: o.czA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7590czA {
    public static boolean c(CreditMarks creditMarks, long j, int i) {
        return creditMarks.startCredit() >= 0 && creditMarks.endCredit() >= 0 && j > ((long) creditMarks.startCredit()) && j < ((long) (creditMarks.endCredit() - i));
    }

    public static boolean e(CreditMarks creditMarks, long j, int i) {
        return creditMarks.startRecap() >= 0 && creditMarks.endRecap() >= 0 && j > ((long) creditMarks.startRecap()) && j < ((long) (creditMarks.endRecap() - i));
    }

    public static boolean c(List<SkipContentData> list, long j, int i) {
        boolean z = false;
        if (list != null) {
            for (SkipContentData skipContentData : list) {
                if (skipContentData.start() >= 0 && skipContentData.end() >= 0 && j > skipContentData.start() && j < skipContentData.end() - i) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static SkipContentData d(List<SkipContentData> list, long j, int i) {
        if (list != null) {
            for (SkipContentData skipContentData : list) {
                if (skipContentData.start() >= 0 && skipContentData.end() >= 0 && j > skipContentData.start() && j < skipContentData.end() - i) {
                    return skipContentData;
                }
            }
            return null;
        }
        return null;
    }
}
