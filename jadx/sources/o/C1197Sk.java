package o;

import com.netflix.mediaclient.android.widget.NetflixTagsTextView;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"com.netflix.common.di.App"})
/* renamed from: o.Sk  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1197Sk implements MembersInjector<NetflixTagsTextView> {
    private final Provider<dwU> b;

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(NetflixTagsTextView netflixTagsTextView) {
        c(netflixTagsTextView, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.widget.NetflixTagsTextView.appScope")
    public static void c(NetflixTagsTextView netflixTagsTextView, Lazy<dwU> lazy) {
        netflixTagsTextView.appScope = lazy;
    }
}
