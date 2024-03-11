package o;

import com.netflix.mediaclient.ui.offline.DownloadButton;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.crR  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7183crR implements MembersInjector<DownloadButton> {
    private final Provider<DownloadButton.a> a;
    private final Provider<InterfaceC7303ctf> e;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(DownloadButton downloadButton) {
        d(downloadButton, this.a.get());
        d(downloadButton, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.offline.DownloadButton.clickListenerFactory")
    public static void d(DownloadButton downloadButton, Object obj) {
        downloadButton.clickListenerFactory = (DownloadButton.a) obj;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.offline.DownloadButton.offlineApi")
    public static void d(DownloadButton downloadButton, InterfaceC7303ctf interfaceC7303ctf) {
        downloadButton.offlineApi = interfaceC7303ctf;
    }
}
