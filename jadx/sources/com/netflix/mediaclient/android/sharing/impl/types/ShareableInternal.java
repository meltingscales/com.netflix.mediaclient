package com.netflix.mediaclient.android.sharing.impl.types;

import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.sharing.impl.ShareMenuController;
import com.netflix.mediaclient.android.sharing.impl.types.Shareable;
import io.reactivex.Observable;
import java.util.List;
import o.QI;

/* loaded from: classes3.dex */
public interface ShareableInternal<T> extends Shareable<T> {
    Observable<ShareMenuController<T>> c(FragmentActivity fragmentActivity);

    List<QI<T>> c();

    /* loaded from: classes6.dex */
    public static final class c {
        public static <T> String c(ShareableInternal<T> shareableInternal) {
            return Shareable.a.c(shareableInternal);
        }
    }
}
