package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.ui.profiles.RecentlyWatchedVideoInfo;
import o.C1333Xq;
import o.C5855cKw;
import o.C8161dfE;
import o.C8632dsu;
import o.C9834xU;
import o.C9935zP;
import o.cMH;
import o.cMJ;
import o.dpR;
import o.drO;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class cMJ extends TH {
    private final C9935zP c;
    private final RecentlyWatchedVideoInfo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cMJ(RecentlyWatchedVideoInfo recentlyWatchedVideoInfo, C9935zP c9935zP, final Activity activity, final drM<? super View, dpR> drm) {
        super(activity, C5855cKw.c.j, new drM<View, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuSheet$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(View view) {
                d(view);
                return dpR.c;
            }

            public final void d(View view) {
                C8632dsu.c((Object) view, "");
                drm.invoke(view);
            }
        }, null, 0, 0, 0, 0, activity.getResources().getDimensionPixelOffset(C9834xU.a.f13911o), true, false, false, false, false, 15608, null);
        C8632dsu.c((Object) recentlyWatchedVideoInfo, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) drm, "");
        this.d = recentlyWatchedVideoInfo;
        this.c = c9935zP;
        ((ComposeView) findViewById(C5855cKw.d.Z)).setContent(ComposableLambdaKt.composableLambdaInstance(-23384602, true, new drX<Composer, Integer, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuSheet$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return dpR.c;
            }

            public final void c(Composer composer, int i) {
                RecentlyWatchedVideoInfo recentlyWatchedVideoInfo2;
                RecentlyWatchedVideoInfo recentlyWatchedVideoInfo3;
                C9935zP c9935zP2;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-23384602, i, -1, "com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuSheet.<anonymous>.<anonymous> (MyNetflixRecentlyWatchedMenuSheet.kt:64)");
                    }
                    C1333Xq d = C1333Xq.d(C5855cKw.i.K);
                    recentlyWatchedVideoInfo2 = cMJ.this.d;
                    String c = d.d(SignupConstants.Field.VIDEO_TITLE, recentlyWatchedVideoInfo2.i()).c();
                    C8632dsu.d((Object) c);
                    boolean a = C8161dfE.d.a();
                    recentlyWatchedVideoInfo3 = cMJ.this.d;
                    c9935zP2 = cMJ.this.c;
                    Activity activity2 = activity;
                    final cMJ cmj = cMJ.this;
                    cMH.a(c, a, recentlyWatchedVideoInfo3, c9935zP2, activity2, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.profiles.MyNetflixRecentlyWatchedMenuSheet$2$1.1
                        {
                            super(0);
                        }

                        @Override // o.drO
                        public /* synthetic */ dpR invoke() {
                            c();
                            return dpR.c;
                        }

                        public final void c() {
                            cMJ.this.close();
                        }
                    }, composer, 37376, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }
}
