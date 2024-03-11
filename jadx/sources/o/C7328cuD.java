package o;

import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.SeasonDownloadButton;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cuD  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7328cuD implements MembersInjector<SeasonDownloadButton> {
    private final Provider<InterfaceC7303ctf> a;
    private final Provider<InterfaceC7303ctf> b;
    private final Provider<SeasonDownloadButton.b> c;
    private final Provider<DownloadButton.a> d;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(SeasonDownloadButton seasonDownloadButton) {
        C7183crR.d(seasonDownloadButton, this.d.get());
        C7183crR.d((DownloadButton) seasonDownloadButton, this.b.get());
        a(seasonDownloadButton, this.c.get());
        e(seasonDownloadButton, this.a.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.offline.SeasonDownloadButton.clickListener")
    public static void a(SeasonDownloadButton seasonDownloadButton, SeasonDownloadButton.b bVar) {
        seasonDownloadButton.clickListener = bVar;
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.offline.SeasonDownloadButton.offlineApi")
    public static void e(SeasonDownloadButton seasonDownloadButton, InterfaceC7303ctf interfaceC7303ctf) {
        seasonDownloadButton.offlineApi = interfaceC7303ctf;
    }
}
