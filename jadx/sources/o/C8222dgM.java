package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.android.imageloader.api.ImageDataSource;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.NetflixTraceCategory;
import com.netflix.cl.model.NetflixTraceStatus;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.util.gfx.ImageLoadCanceledError;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* renamed from: o.dgM  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8222dgM {

    /* renamed from: o.dgM$a */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[ImageDataSource.values().length];
            try {
                iArr[ImageDataSource.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageDataSource.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageDataSource.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            e = iArr;
        }
    }

    public static final /* synthetic */ JSONObject a(ImageDataSource imageDataSource) {
        return d(imageDataSource);
    }

    public static final /* synthetic */ AppView b(FragmentActivity fragmentActivity, Fragment fragment) {
        return c(fragmentActivity, fragment);
    }

    public static final /* synthetic */ NetflixTraceCategory b(ImageDataSource imageDataSource) {
        return c(imageDataSource);
    }

    public static final /* synthetic */ NetflixTraceStatus b(Throwable th) {
        return c(th);
    }

    public static final /* synthetic */ boolean e(ImageDataSource imageDataSource) {
        return j(imageDataSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetflixTraceCategory c(ImageDataSource imageDataSource) {
        int i = a.e[imageDataSource.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return NetflixTraceCategory.cdn;
                }
                throw new NoWhenBranchMatchedException();
            }
            return NetflixTraceCategory.device;
        }
        return NetflixTraceCategory.device;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(ImageDataSource imageDataSource) {
        return imageDataSource != ImageDataSource.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppView c(FragmentActivity fragmentActivity, Fragment fragment) {
        if (fragment != null && (fragment instanceof NetflixFrag)) {
            return ((NetflixFrag) fragment).bh_();
        }
        if (fragmentActivity == null || !(fragmentActivity instanceof NetflixActivity)) {
            return null;
        }
        return ((NetflixActivity) fragmentActivity).getUiScreen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject d(ImageDataSource imageDataSource) {
        String str;
        JSONObject jSONObject = new JSONObject();
        int i = a.e[imageDataSource.ordinal()];
        if (i == 1) {
            str = "disk";
        } else if (i == 2) {
            str = "memory";
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "network";
        }
        jSONObject.put(NetflixActivity.EXTRA_SOURCE, str);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetflixTraceStatus c(Throwable th) {
        if (th instanceof ImageLoadCanceledError) {
            return NetflixTraceStatus.cancel;
        }
        return NetflixTraceStatus.fail;
    }
}
