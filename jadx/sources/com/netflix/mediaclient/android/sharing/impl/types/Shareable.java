package com.netflix.mediaclient.android.sharing.impl.types;

import android.os.Parcelable;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import o.QI;
import o.bEY;

/* loaded from: classes3.dex */
public interface Shareable<T> extends Parcelable {

    /* loaded from: classes6.dex */
    public static final class a {
        public static <T> String c(Shareable<T> shareable) {
            return null;
        }
    }

    String a();

    CharSequence b(bEY bey, QI<T> qi);

    CharSequence c(QI<T> qi);

    T d();

    String d(bEY bey, QI<T> qi);

    String e();

    TrackingInfoHolder i();
}
