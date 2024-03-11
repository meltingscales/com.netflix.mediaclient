package o;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.den  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8143den {
    public static void a(String str, Uri uri) {
    }

    public static List<String> e(List<?> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next == null ? null : next.toString());
        }
        return arrayList;
    }

    /* renamed from: o.den$d */
    /* loaded from: classes5.dex */
    public static class d extends Pair<String, String> {
        public d(String str, String str2) {
            super(str, str2);
        }

        public d(String str, int i) {
            super(str, String.valueOf(i));
        }

        public d(String str, boolean z) {
            super(str, String.valueOf(z));
        }
    }
}
