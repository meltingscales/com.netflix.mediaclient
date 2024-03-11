package o;

import android.content.Context;
import android.view.View;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.games.api.GameBillboardCanvas;
import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel;
import com.netflix.model.leafs.RecommendedTrailer;
import o.InterfaceC3825bMa;

/* loaded from: classes4.dex */
public interface bNN {
    AbstractC3073as<?> a(String str, Context context, InterfaceC4467bf<AbstractC3073as<?>, AbstractC3179au> interfaceC4467bf);

    void a(InterfaceC2023aX interfaceC2023aX, Context context, InterfaceC5145btI interfaceC5145btI, int i, AppView appView, TrackingInfoHolder trackingInfoHolder, InterfaceC3825bMa.a aVar, C9935zP c9935zP, boolean z, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i2, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, String str, InterfaceC6718cib interfaceC6718cib, bLW blw, String str2, bLU blu, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf);

    void a(InterfaceC2023aX interfaceC2023aX, String str, String str2, String str3, String str4, Integer num, int i, Integer num2, Integer num3, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, bLU blu, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf);

    void a(InterfaceC2023aX interfaceC2023aX, InterfaceC3825bMa.a aVar, TrackingInfoHolder trackingInfoHolder, AppView appView, drM<? super drM<? super String, dpR>, dpR> drm, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf, InterfaceC4732bk<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4732bk);

    AbstractC3073as<?> b(InterfaceC5185btw interfaceC5185btw, Integer num, int i, Integer num2, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, InterfaceC4732bk<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4732bk, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf, boolean z, Integer num3);

    void c(InterfaceC2023aX interfaceC2023aX, String str, Context context, int i, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf);

    void c(InterfaceC2023aX interfaceC2023aX, InterfaceC5185btw interfaceC5185btw, Integer num, int i, Integer num2, Integer num3, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, bLU blu, InterfaceC4467bf<AbstractC3073as<AbstractC3179au>, AbstractC3179au> interfaceC4467bf);

    void d(InterfaceC2023aX interfaceC2023aX, int i, InterfaceC5141btE interfaceC5141btE, AbstractC5100bsQ abstractC5100bsQ, TrackingInfoHolder trackingInfoHolder, Context context, bLW blw, C9935zP c9935zP, AppView appView, String str, GameBillboardCanvas gameBillboardCanvas, Integer num, drO<dpR> dro, bLU blu);

    void d(InterfaceC2023aX interfaceC2023aX, Context context, String str, String str2, int i, RecommendedTrailer recommendedTrailer, TrackingInfoHolder trackingInfoHolder, String str3, InterfaceC6718cib interfaceC6718cib, AppView appView, MiniPlayerVideoGroupViewModel miniPlayerVideoGroupViewModel, String str4, C9935zP c9935zP, bLW blw, drX<? super View, ? super Boolean, dpR> drx);

    /* loaded from: classes4.dex */
    public static final class b {
        public static /* synthetic */ AbstractC3073as d(bNN bnn, InterfaceC5185btw interfaceC5185btw, Integer num, int i, Integer num2, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, InterfaceC4732bk interfaceC4732bk, InterfaceC4467bf interfaceC4467bf, boolean z, Integer num3, int i2, Object obj) {
            if (obj == null) {
                return bnn.b(interfaceC5185btw, (i2 & 2) != 0 ? null : num, i, (i2 & 8) != 0 ? null : num2, appView, (i2 & 32) != 0 ? null : aVar, (i2 & 64) != 0 ? null : onClickListener, trackingInfoHolder, (i2 & JSONzip.end) != 0 ? null : interfaceC4732bk, (i2 & 512) != 0 ? null : interfaceC4467bf, (i2 & 1024) != 0 ? false : z, (i2 & 2048) != 0 ? null : num3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGameIconModel");
        }

        public static /* synthetic */ void a(bNN bnn, InterfaceC2023aX interfaceC2023aX, InterfaceC5185btw interfaceC5185btw, Integer num, int i, Integer num2, Integer num3, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, bLU blu, InterfaceC4467bf interfaceC4467bf, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addGameIcon");
            }
            bnn.c(interfaceC2023aX, interfaceC5185btw, (i2 & 2) != 0 ? null : num, i, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : num3, appView, (i2 & 64) != 0 ? null : aVar, (i2 & 128) != 0 ? null : onClickListener, trackingInfoHolder, blu, (i2 & 1024) != 0 ? null : interfaceC4467bf);
        }

        public static /* synthetic */ void c(bNN bnn, InterfaceC2023aX interfaceC2023aX, String str, String str2, String str3, String str4, Integer num, int i, Integer num2, Integer num3, AppView appView, InterfaceC3825bMa.a aVar, View.OnClickListener onClickListener, TrackingInfoHolder trackingInfoHolder, bLU blu, InterfaceC4467bf interfaceC4467bf, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addGameIcon");
            }
            bnn.a(interfaceC2023aX, str, str2, str3, str4, (i2 & 16) != 0 ? null : num, i, (i2 & 64) != 0 ? null : num2, (i2 & 128) != 0 ? null : num3, appView, (i2 & 512) != 0 ? null : aVar, (i2 & 1024) != 0 ? null : onClickListener, trackingInfoHolder, blu, interfaceC4467bf);
        }

        public static /* synthetic */ void c(bNN bnn, InterfaceC2023aX interfaceC2023aX, int i, InterfaceC5141btE interfaceC5141btE, AbstractC5100bsQ abstractC5100bsQ, TrackingInfoHolder trackingInfoHolder, Context context, bLW blw, C9935zP c9935zP, AppView appView, String str, GameBillboardCanvas gameBillboardCanvas, Integer num, drO dro, bLU blu, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addGameMotionBillboard");
            }
            bnn.d(interfaceC2023aX, i, interfaceC5141btE, abstractC5100bsQ, trackingInfoHolder, context, blw, c9935zP, appView, str, gameBillboardCanvas, (i2 & 1024) != 0 ? null : num, dro, blu);
        }
    }
}
