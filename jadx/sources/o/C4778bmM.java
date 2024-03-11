package o;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import com.netflix.mediaclient.service.player.common.NetflixIdMetadataEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.bmM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4778bmM {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(Format format) {
        return format.id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Format format) {
        return NetflixIdMetadataEntry.e(format).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Format d(C4726bju c4726bju, int i) {
        C8654dtp g;
        int d;
        Object obj;
        Object x;
        g = C8657dts.g(0, c4726bju.getPeriodCount());
        ArrayList<Period> arrayList = new ArrayList();
        Iterator<Integer> it = g.iterator();
        while (it.hasNext()) {
            Period period = c4726bju.getPeriod(((dqB) it).nextInt());
            if (period != null) {
                arrayList.add(period);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Period period2 : arrayList) {
            List<AdaptationSet> list = period2.adaptationSets;
            C8632dsu.a(list, "");
            C8571dqn.b(arrayList2, list);
        }
        ArrayList<AdaptationSet> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((AdaptationSet) obj2).type == i) {
                arrayList3.add(obj2);
            }
        }
        ArrayList<Representation> arrayList4 = new ArrayList();
        for (AdaptationSet adaptationSet : arrayList3) {
            List<Representation> list2 = adaptationSet.representations;
            C8632dsu.a(list2, "");
            C8571dqn.b(arrayList4, list2);
        }
        d = C8572dqo.d(arrayList4, 10);
        ArrayList arrayList5 = new ArrayList(d);
        for (Representation representation : arrayList4) {
            arrayList5.add(representation.format);
        }
        if (i == 2) {
            x = C8576dqs.x(arrayList5);
            Format format = (Format) x;
            if (format != null) {
                return format;
            }
        }
        Iterator it2 = arrayList5.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if ((((Format) obj).selectionFlags & 1) != 0) {
                break;
            }
        }
        Format format2 = (Format) obj;
        if (format2 != null) {
            return format2;
        }
        return null;
    }
}
