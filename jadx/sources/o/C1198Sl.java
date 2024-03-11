package o;

import com.netflix.mediaclient.android.widget.NetflixImageView;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.Sl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1198Sl implements MembersInjector<NetflixImageView> {
    private final Provider<InterfaceC9637uE> b;
    private final Provider<InterfaceC9639uG> c;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(NetflixImageView netflixImageView) {
        b(netflixImageView, DoubleCheck.lazy(this.c));
        a(netflixImageView, DoubleCheck.lazy(this.b));
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.widget.NetflixImageView.imageLoaderThemeProvider")
    public static void b(NetflixImageView netflixImageView, Lazy<InterfaceC9639uG> lazy) {
        netflixImageView.imageLoaderThemeProvider = lazy;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.android.widget.NetflixImageView.forImageViewsOnlyImageLoaderRepository")
    public static void a(NetflixImageView netflixImageView, Lazy<InterfaceC9637uE> lazy) {
        netflixImageView.forImageViewsOnlyImageLoaderRepository = lazy;
    }
}
