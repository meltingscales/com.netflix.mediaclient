package com.netflix.mediaclient.ui.home.impl.lolomo;

import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$clearActionsUpToId$1;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.Lambda;
import o.C4029bTp;
import o.C4049bUi;
import o.C8576dqs;
import o.C8632dsu;
import o.drM;
import org.linphone.core.Privacy;

/* loaded from: classes4.dex */
public final class GraphQLLolomoViewModel$clearActionsUpToId$1 extends Lambda implements drM<C4049bUi, C4049bUi> {
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLLolomoViewModel$clearActionsUpToId$1(int i) {
        super(1);
        this.d = i;
    }

    @Override // o.drM
    /* renamed from: d */
    public final C4049bUi invoke(C4049bUi c4049bUi) {
        Set V;
        C4049bUi d;
        C8632dsu.c((Object) c4049bUi, "");
        C4029bTp D = c4049bUi.D();
        V = C8576dqs.V(D.b());
        final int i = this.d;
        final drM<Integer, Boolean> drm = new drM<Integer, Boolean>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$clearActionsUpToId$1.1
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
        V.removeIf(new Predicate() { // from class: o.bTD
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean e;
                e = GraphQLLolomoViewModel$clearActionsUpToId$1.e(drM.this, obj);
                return e;
            }
        });
        d = c4049bUi.d((r43 & 1) != 0 ? c4049bUi.l : false, (r43 & 2) != 0 ? c4049bUi.a : null, (r43 & 4) != 0 ? c4049bUi.q : null, (r43 & 8) != 0 ? c4049bUi.w : null, (r43 & 16) != 0 ? c4049bUi.m : null, (r43 & 32) != 0 ? c4049bUi.u : null, (r43 & 64) != 0 ? c4049bUi.y : null, (r43 & 128) != 0 ? c4049bUi.k : null, (r43 & JSONzip.end) != 0 ? c4049bUi.z : null, (r43 & 512) != 0 ? c4049bUi.i : null, (r43 & 1024) != 0 ? c4049bUi.d : null, (r43 & 2048) != 0 ? c4049bUi.b : false, (r43 & 4096) != 0 ? c4049bUi.r : null, (r43 & 8192) != 0 ? c4049bUi.t : null, (r43 & 16384) != 0 ? c4049bUi.g : false, (r43 & Privacy.DEFAULT) != 0 ? c4049bUi.v : false, (r43 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c4049bUi.h : false, (r43 & 131072) != 0 ? c4049bUi.e : C4029bTp.c(D, V, null, null, 6, null), (r43 & 262144) != 0 ? c4049bUi.x : null, (r43 & 524288) != 0 ? c4049bUi.n : null, (r43 & 1048576) != 0 ? c4049bUi.p : null, (r43 & 2097152) != 0 ? c4049bUi.c : 0, (r43 & 4194304) != 0 ? c4049bUi.f13548o : false, (r43 & 8388608) != 0 ? c4049bUi.j : 0, (r43 & 16777216) != 0 ? c4049bUi.s : null);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        return ((Boolean) drm.invoke(obj)).booleanValue();
    }
}
