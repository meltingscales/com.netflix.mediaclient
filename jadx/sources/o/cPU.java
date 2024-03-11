package o;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.session.action.ActionTracked;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* loaded from: classes4.dex */
public interface cPU {
    public static final e e = e.c;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes4.dex */
    public interface a {
        cPU v();
    }

    DialogFragment c();

    cPT c(Context context, ViewGroup viewGroup, Integer num);

    cPT e(Context context, ViewGroup viewGroup, Integer num);

    /* loaded from: classes4.dex */
    public static final class e {
        static final /* synthetic */ e c = new e();

        private e() {
        }

        public final ActionTracked d(int i, AppView appView, AppView appView2, TrackingInfo trackingInfo) {
            return new cPV().a(i, appView, appView2, trackingInfo);
        }

        public final cPU e(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((a) EntryPointAccessors.fromActivity(activity, a.class)).v();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {
        public static /* synthetic */ cPT a(cPU cpu, Context context, ViewGroup viewGroup, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    viewGroup = null;
                }
                if ((i & 4) != 0) {
                    num = null;
                }
                return cpu.e(context, viewGroup, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildGameRatingView");
        }
    }
}
