package o;

import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.ContentAdvisoryIcon;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bRn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3973bRn {
    public static final List<String> e(ContentAdvisory contentAdvisory) {
        ArrayList arrayList;
        List<String> i;
        int d;
        C8632dsu.c((Object) contentAdvisory, "");
        List<ContentAdvisoryIcon> icons = contentAdvisory.getIcons();
        List<String> list = null;
        if (icons != null) {
            d = C8572dqo.d(icons, 10);
            arrayList = new ArrayList(d);
            for (ContentAdvisoryIcon contentAdvisoryIcon : icons) {
                arrayList.add(contentAdvisoryIcon.getText());
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            String ratingDescription = contentAdvisory.getRatingDescription();
            if (ratingDescription != null) {
                list = C8566dqi.e(ratingDescription);
            }
        } else {
            list = arrayList;
        }
        if (list == null) {
            i = C8569dql.i();
            return i;
        }
        return list;
    }
}
