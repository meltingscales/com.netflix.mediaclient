package com.netflix.mediaclient.ui.usermarks.impl;

import com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$removeUserMark$1;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.Lambda;
import o.C5251bvI;
import o.C7969dbY;
import o.C8002dcE;
import o.C8049dcz;
import o.C8576dqs;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class UserMarksViewModel$removeUserMark$1 extends Lambda implements drM<C8049dcz, dpR> {
    final /* synthetic */ String b;
    final /* synthetic */ C8002dcE d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMarksViewModel$removeUserMark$1(C8002dcE c8002dcE, String str) {
        super(1);
        this.d = c8002dcE;
        this.b = str;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(C8049dcz c8049dcz) {
        c(c8049dcz);
        return dpR.c;
    }

    public final void c(C8049dcz c8049dcz) {
        final List n;
        C5251bvI c5251bvI;
        C8632dsu.c((Object) c8049dcz, "");
        n = C8576dqs.n(c8049dcz.a());
        final String str = this.b;
        final drM<C7969dbY, Boolean> drm = new drM<C7969dbY, Boolean>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$removeUserMark$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final Boolean invoke(C7969dbY c7969dbY) {
                C8632dsu.c((Object) c7969dbY, "");
                return Boolean.valueOf(C8632dsu.c((Object) c7969dbY.e(), (Object) str));
            }
        };
        n.removeIf(new Predicate() { // from class: o.dcD
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean b;
                b = UserMarksViewModel$removeUserMark$1.b(drM.this, obj);
                return b;
            }
        });
        c5251bvI = this.d.b;
        if (c5251bvI == null) {
            C8632dsu.d("");
            c5251bvI = null;
        }
        c5251bvI.b(this.b);
        this.d.b(new drM<C8049dcz, C8049dcz>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.UserMarksViewModel$removeUserMark$1.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: a */
            public final C8049dcz invoke(C8049dcz c8049dcz2) {
                List U;
                C8632dsu.c((Object) c8049dcz2, "");
                U = C8576dqs.U(n);
                return C8049dcz.copy$default(c8049dcz2, U, null, false, null, 14, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }
}
