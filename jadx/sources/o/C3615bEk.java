package o;

import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorDialogFragment;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bEk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3615bEk implements MembersInjector<EpisodesListSelectorDialogFragment> {
    private final Provider<InterfaceC1573aGh> d;
    private final Provider<InterfaceC3619bEo> e;

    @Override // dagger.MembersInjector
    /* renamed from: e */
    public void injectMembers(EpisodesListSelectorDialogFragment episodesListSelectorDialogFragment) {
        C1095Om.d(episodesListSelectorDialogFragment, DoubleCheck.lazy(this.d));
        a(episodesListSelectorDialogFragment, this.e.get());
    }

    @InjectedFieldSignature("com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorDialogFragment.episodesListRepositoryFactory")
    public static void a(EpisodesListSelectorDialogFragment episodesListSelectorDialogFragment, InterfaceC3619bEo interfaceC3619bEo) {
        episodesListSelectorDialogFragment.episodesListRepositoryFactory = interfaceC3619bEo;
    }
}
