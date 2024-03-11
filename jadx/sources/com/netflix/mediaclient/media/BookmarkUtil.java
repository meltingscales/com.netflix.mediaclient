package com.netflix.mediaclient.media;

import java.util.ArrayList;
import java.util.Map;
import o.C1045Mp;
import o.C5096bsM;
import o.C5290bvv;
import o.C5328bwg;
import o.C8632dsu;

/* loaded from: classes.dex */
public final class BookmarkUtil extends C1045Mp {
    public static final BookmarkUtil INSTANCE = new BookmarkUtil();

    private BookmarkUtil() {
        super("BookmarkUtil");
    }

    public final void migrateDataToRoom(C5290bvv c5290bvv, Map<String, ? extends Map<String, ? extends C5096bsM>> map) {
        C8632dsu.c((Object) c5290bvv, "");
        C8632dsu.c((Object) map, "");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Map<String, ? extends C5096bsM>> entry : map.entrySet()) {
            String key = entry.getKey();
            for (Map.Entry<String, ? extends C5096bsM> entry2 : entry.getValue().entrySet()) {
                C5096bsM value = entry2.getValue();
                getLogTag();
                arrayList.add(new C5328bwg(entry2.getKey(), key, value.c, value.a));
            }
        }
        c5290bvv.d(arrayList);
    }
}
