package com.netflix.mediaclient.ui.upnextfeed.impl.data;

import com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$clearActionsUpToId$1;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.Lambda;
import o.C7978dbh;
import o.C8576dqs;
import o.C8632dsu;
import o.drM;

/* loaded from: classes5.dex */
public final class UpNextFeedViewModel$clearActionsUpToId$1 extends Lambda implements drM<C7978dbh, C7978dbh> {
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpNextFeedViewModel$clearActionsUpToId$1(int i) {
        super(1);
        this.c = i;
    }

    @Override // o.drM
    /* renamed from: b */
    public final C7978dbh invoke(C7978dbh c7978dbh) {
        Set V;
        C7978dbh b;
        C8632dsu.c((Object) c7978dbh, "");
        V = C8576dqs.V(c7978dbh.b());
        final int i = this.c;
        final drM<Integer, Boolean> drm = new drM<Integer, Boolean>() { // from class: com.netflix.mediaclient.ui.upnextfeed.impl.data.UpNextFeedViewModel$clearActionsUpToId$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: e */
            public final Boolean invoke(Integer num) {
                C8632dsu.c((Object) num, "");
                return Boolean.valueOf(num.intValue() <= i);
            }
        };
        V.removeIf(new Predicate() { // from class: o.dbl
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean b2;
                b2 = UpNextFeedViewModel$clearActionsUpToId$1.b(drM.this, obj);
                return b2;
            }
        });
        b = c7978dbh.b((r18 & 1) != 0 ? c7978dbh.i : null, (r18 & 2) != 0 ? c7978dbh.j : null, (r18 & 4) != 0 ? c7978dbh.c : null, (r18 & 8) != 0 ? c7978dbh.h : null, (r18 & 16) != 0 ? c7978dbh.a : V, (r18 & 32) != 0 ? c7978dbh.b : false, (r18 & 64) != 0 ? c7978dbh.d : null, (r18 & 128) != 0 ? c7978dbh.e : null);
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }
}
