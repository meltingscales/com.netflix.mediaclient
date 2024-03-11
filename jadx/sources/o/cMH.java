package o;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.profiles.RecentlyWatchedVideoInfo;
import o.C5855cKw;
import o.C7350cuZ;
import o.C8632dsu;
import o.InterfaceC5176btn;
import o.cMH;
import o.dpR;

/* loaded from: classes4.dex */
public final class cMH {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.String r38, boolean r39, com.netflix.mediaclient.ui.profiles.RecentlyWatchedVideoInfo r40, o.C9935zP r41, android.app.Activity r42, o.drO<o.dpR> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cMH.a(java.lang.String, boolean, com.netflix.mediaclient.ui.profiles.RecentlyWatchedVideoInfo, o.zP, android.app.Activity, o.drO, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final RecentlyWatchedVideoInfo recentlyWatchedVideoInfo, final Activity activity, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1742732268);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1742732268, i, -1, "com.netflix.mediaclient.ui.profiles.DownloadRowButton (MyNetflixRecentlyWatchedMenuSheet.kt:180)");
        }
        AndroidView_androidKt.AndroidView(new drM<Context, DownloadButton>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuSheetKt$DownloadRowButton$1
            @Override // o.drM
            /* renamed from: c */
            public final DownloadButton invoke(Context context) {
                C8632dsu.c((Object) context, "");
                View inflate = LayoutInflater.from(context).inflate(C5855cKw.c.s, (ViewGroup) null, false);
                C8632dsu.d(inflate);
                return (DownloadButton) inflate;
            }
        }, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), new drM<DownloadButton, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuSheetKt$DownloadRowButton$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(DownloadButton downloadButton) {
                a(downloadButton);
                return dpR.c;
            }

            /* loaded from: classes4.dex */
            public static final class b implements InterfaceC5176btn {
                final /* synthetic */ RecentlyWatchedVideoInfo e;

                @Override // o.InterfaceC5176btn
                public boolean d() {
                    return true;
                }

                @Override // o.InterfaceC5176btn
                public boolean isPlayable() {
                    return true;
                }

                b(RecentlyWatchedVideoInfo recentlyWatchedVideoInfo) {
                    this.e = recentlyWatchedVideoInfo;
                }

                @Override // o.InterfaceC5176btn
                public String aH_() {
                    return this.e.f();
                }

                @Override // o.InterfaceC5176btn
                public boolean aY_() {
                    return this.e.h() == VideoType.EPISODE;
                }
            }

            public final void a(DownloadButton downloadButton) {
                C8632dsu.c((Object) downloadButton, "");
                b bVar = new b(recentlyWatchedVideoInfo);
                Activity activity2 = activity;
                if (activity2 != null) {
                    downloadButton.setStateFromPlayable(bVar, activity2);
                }
                downloadButton.setPlayContext(TrackingInfoHolder.b(recentlyWatchedVideoInfo.d(), PlayLocationType.VIDEO_VIEW, false, 2, null));
                downloadButton.setDefaultLabelId(recentlyWatchedVideoInfo.h() == VideoType.EPISODE ? C5855cKw.i.a : C7350cuZ.a.a);
            }
        }, startRestartGroup, 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuSheetKt$DownloadRowButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(Composer composer2, int i2) {
                    cMH.a(RecentlyWatchedVideoInfo.this, activity, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(Composer composer2, Integer num) {
                    b(composer2, num.intValue());
                    return dpR.c;
                }
            });
        }
    }
}
