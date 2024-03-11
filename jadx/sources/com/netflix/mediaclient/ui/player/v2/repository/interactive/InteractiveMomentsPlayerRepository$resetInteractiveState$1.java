package com.netflix.mediaclient.ui.player.v2.repository.interactive;

import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.ui.player.v2.repository.interactive.InteractiveMomentsPlayerRepository$resetInteractiveState$1;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.condition.Snapshots;
import com.netflix.model.leafs.originals.interactive.condition.StateHistory;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Lambda;
import o.C5723cFz;
import o.C6004cQk;
import o.C8632dsu;
import o.InterfaceC1078Nw;
import o.drM;

/* loaded from: classes4.dex */
public final class InteractiveMomentsPlayerRepository$resetInteractiveState$1 extends Lambda implements drM<C6004cQk.d<StateHistory>, SingleSource<? extends C5723cFz.a>> {
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveMomentsPlayerRepository$resetInteractiveState$1(String str) {
        super(1);
        this.c = str;
    }

    @Override // o.drM
    /* renamed from: c */
    public final SingleSource<? extends C5723cFz.a> invoke(final C6004cQk.d<StateHistory> dVar) {
        Single d;
        C8632dsu.c((Object) dVar, "");
        if (dVar.c() == null) {
            NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.af;
            C8632dsu.a(netflixImmutableStatus, "");
            return Single.just(new C5723cFz.a(null, -1L, netflixImmutableStatus, 1, null));
        }
        d = new C6004cQk().d(this.c, "IntPlayerRepo", Moment.InteractiveIntent.PLAYBACK_START, 0L, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? null : null, (r27 & 128) != 0 ? null : null, (r27 & JSONzip.end) != 0 ? null : null, (r27 & 512) != 0 ? null : null);
        final drM<C6004cQk.d<InteractiveMoments>, C5723cFz.a> drm = new drM<C6004cQk.d<InteractiveMoments>, C5723cFz.a>() { // from class: com.netflix.mediaclient.ui.player.v2.repository.interactive.InteractiveMomentsPlayerRepository$resetInteractiveState$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final C5723cFz.a invoke(C6004cQk.d<InteractiveMoments> dVar2) {
                InteractiveMoments.Builder builder;
                InteractiveMoments.Builder stateHistory;
                InteractiveMoments.Builder snapshots;
                C8632dsu.c((Object) dVar2, "");
                InteractiveMoments c = dVar2.c();
                return new C5723cFz.a((c == null || (builder = c.toBuilder()) == null || (stateHistory = builder.stateHistory(dVar.c())) == null || (snapshots = stateHistory.snapshots(new Snapshots())) == null) ? null : snapshots.build(), 0L, dVar2.d());
            }
        };
        return d.map(new Function() { // from class: o.cFE
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C5723cFz.a a;
                a = InteractiveMomentsPlayerRepository$resetInteractiveState$1.a(drM.this, obj);
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5723cFz.a a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (C5723cFz.a) drm.invoke(obj);
    }
}
