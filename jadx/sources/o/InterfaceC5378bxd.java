package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.RatingDetails;

/* renamed from: o.bxd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5378bxd {
    Drawable a(Context context, RatingDetails ratingDetails, boolean z);

    InterfaceC5396bxv d(Context context, ContentAdvisory contentAdvisory, boolean z);

    /* renamed from: o.bxd$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ Drawable e(InterfaceC5378bxd interfaceC5378bxd, Context context, RatingDetails ratingDetails, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                return interfaceC5378bxd.a(context, ratingDetails, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRatingIconDrawable");
        }
    }
}
