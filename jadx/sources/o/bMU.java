package o;

import android.os.SystemClock;
import androidx.compose.runtime.MutableState;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.playerui.videoview.api.PlayerState;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import java.util.Map;
import o.AbstractC5271bvc;
import o.C1682aKi;
import o.C8126deW;
import o.C8632dsu;

/* loaded from: classes4.dex */
public final class bMU {
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final long r24, final java.lang.String r26, final o.drX<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, o.dpR> r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bMU.b(long, java.lang.String, o.drX, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* loaded from: classes4.dex */
    public static final class b implements C1682aKi.c {
        final /* synthetic */ drM<Boolean, dpR> c;

        /* JADX WARN: Multi-variable type inference failed */
        b(drM<? super Boolean, dpR> drm) {
            this.c = drm;
        }

        @Override // o.C1682aKi.c
        public void a(PlayerState playerState) {
            C8632dsu.c((Object) playerState, "");
            if (playerState == PlayerState.d) {
                this.c.invoke(Boolean.FALSE);
            } else if (playerState == PlayerState.f) {
                this.c.invoke(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C1677aKd c1677aKd, AbstractC5100bsQ abstractC5100bsQ, Map<String, AbstractC5271bvc> map, AbstractC5271bvc.a aVar, long j, drM<? super Boolean, dpR> drm) {
        map.put(aVar.d(), aVar);
        c1677aKd.setPlayerStatusChangeListener(new b(drm));
        b(c1677aKd, abstractC5100bsQ, map, aVar, j);
    }

    private static final void b(C1677aKd c1677aKd, AbstractC5100bsQ abstractC5100bsQ, Map<String, AbstractC5271bvc> map, AbstractC5271bvc.a aVar, long j) {
        if (c1677aKd.getVisibility() != 0) {
            c1677aKd.setVisibility(0);
        }
        c1677aKd.setViewInFocus(true);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C5208buS e = a(aVar.d(), map).e();
        VideoType videoType = VideoType.SUPPLEMENTAL;
        bMV bmv = new bMV("CompanionModeFeatureEducationVideo", false, new drO<String>() { // from class: com.netflix.mediaclient.ui.featureeducationvideoexperience.impl.FeatureEducationVideoKt$attachPlaybackSession$1
            @Override // o.drO
            /* renamed from: c */
            public final String invoke() {
                String d2 = C8126deW.d();
                C8632dsu.a(d2, "");
                return d2;
            }
        }, 2, null);
        EmptyPlayContext emptyPlayContext = new EmptyPlayContext("CompanionModeFeatureEducationVideo", 13804431);
        PlaylistTimestamp playlistTimestamp = new PlaylistTimestamp(aVar.d(), String.valueOf(j), 0L);
        String d = C8126deW.d();
        C8632dsu.a(d, "");
        c1677aKd.e(elapsedRealtime, abstractC5100bsQ, e, videoType, bmv, emptyPlayContext, playlistTimestamp, true, d, null, (r27 & 1024) != 0);
    }

    private static final AbstractC5271bvc a(String str, Map<String, AbstractC5271bvc> map) {
        AbstractC5271bvc abstractC5271bvc = map.get(str);
        if (abstractC5271bvc != null) {
            return abstractC5271bvc;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5100bsQ b(MutableState<AbstractC5100bsQ> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<AbstractC5100bsQ> mutableState, AbstractC5100bsQ abstractC5100bsQ) {
        mutableState.setValue(abstractC5100bsQ);
    }
}
