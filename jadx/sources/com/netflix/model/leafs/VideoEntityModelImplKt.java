package com.netflix.model.leafs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C8333diR;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.IF;
import o.InterfaceC1240Ub;
import o.InterfaceC1242Ud;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC8322diG;

/* loaded from: classes5.dex */
public final class VideoEntityModelImplKt {
    public static final List<InterfaceC5222bug<InterfaceC5223buh>> listItemMapToEntityModels(InterfaceC1240Ub<?> interfaceC1240Ub, List<C8333diR> list, int i) {
        InterfaceC1242Ud b;
        C8632dsu.c((Object) interfaceC1240Ub, "");
        C8632dsu.c((Object) list, "");
        ArrayList arrayList = new ArrayList(list.size());
        for (C8333diR c8333diR : list) {
            IF d = c8333diR.d();
            if (d != null && (b = d.b()) != null) {
                InterfaceC8322diG b2 = interfaceC1240Ub.b(b);
                C8632dsu.d(b2);
                arrayList.add(new VideoEntityModelImpl((InterfaceC5223buh) b2, c8333diR.a(), i));
            }
            i++;
        }
        return arrayList;
    }

    public static final /* synthetic */ <T extends InterfaceC5223buh> List<InterfaceC5222bug<T>> toEntities(List<? extends T> list, int i) {
        C8632dsu.c((Object) list, "");
        return videosToEntitiesFromJava(list, i);
    }

    public static final <T extends InterfaceC5223buh> List<InterfaceC5222bug<T>> videosToEntitiesFromJava(List<? extends T> list, int i) {
        int d;
        C8632dsu.c((Object) list, "");
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        int i2 = 0;
        for (Object obj : list) {
            if (i2 < 0) {
                C8569dql.h();
            }
            arrayList.add(new VideoEntityModelImpl((InterfaceC5223buh) obj, null, i2 + i));
            i2++;
        }
        return arrayList;
    }

    public static final <T extends InterfaceC5223buh> List<T> entitiesToVideos(List<? extends InterfaceC5222bug<T>> list) {
        int d;
        if (list != null) {
            d = C8572dqo.d(list, 10);
            ArrayList arrayList = new ArrayList(d);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC5222bug) it.next()).getVideo());
            }
            return arrayList;
        }
        return null;
    }
}
