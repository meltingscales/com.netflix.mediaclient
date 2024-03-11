package o;

import com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cvp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7419cvp implements MembersInjector<DownloadedForYouSettingsFragment> {
    private final Provider<InterfaceC7221csC> b;
    private final Provider<InterfaceC1573aGh> c;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(DownloadedForYouSettingsFragment downloadedForYouSettingsFragment) {
        C1092Oj.e(downloadedForYouSettingsFragment, this.c);
        d(downloadedForYouSettingsFragment, this.b.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.offline.downloadedforyou.DownloadedForYouSettingsFragment.downloadsFeatures")
    public static void d(DownloadedForYouSettingsFragment downloadedForYouSettingsFragment, InterfaceC7221csC interfaceC7221csC) {
        downloadedForYouSettingsFragment.downloadsFeatures = interfaceC7221csC;
    }
}
