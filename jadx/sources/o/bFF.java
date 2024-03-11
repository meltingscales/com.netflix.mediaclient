package o;

import com.netflix.mediaclient.ui.details.EpisodeView;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bFF implements MembersInjector<EpisodeView> {
    private final Provider<InterfaceC7303ctf> c;

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(EpisodeView episodeView) {
        c(episodeView, this.c.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.details.EpisodeView.offlineApi")
    public static void c(EpisodeView episodeView, InterfaceC7303ctf interfaceC7303ctf) {
        episodeView.offlineApi = interfaceC7303ctf;
    }
}
