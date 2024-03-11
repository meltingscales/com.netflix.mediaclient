package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.ThumbRating;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.action.ActionTracked;
import com.netflix.cl.model.event.session.action.SetThumbRating;

/* loaded from: classes4.dex */
public final class cPV {
    public final ActionTracked a(int i, AppView appView, AppView appView2, TrackingInfo trackingInfo) {
        long e = e(i);
        return new SetThumbRating(appView, appView2, Long.valueOf(e), CommandValue.SetThumbRatingCommand, trackingInfo);
    }

    public final long e(int i) {
        int val;
        if (i == 1) {
            val = ThumbRating.DOWN.getVal();
        } else if (i == 2) {
            val = ThumbRating.UP.getVal();
        } else if (i == 3) {
            val = ThumbRating.DOUBLE_UP.getVal();
        } else {
            val = ThumbRating.UNRATED.getVal();
        }
        return val;
    }
}
