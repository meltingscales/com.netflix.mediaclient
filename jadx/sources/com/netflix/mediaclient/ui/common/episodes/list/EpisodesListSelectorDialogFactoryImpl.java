package com.netflix.mediaclient.ui.common.episodes.list;

import androidx.fragment.app.DialogFragment;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import o.C8632dsu;
import o.InterfaceC3612bEh;
import o.bEH;

/* loaded from: classes4.dex */
public final class EpisodesListSelectorDialogFactoryImpl implements InterfaceC3612bEh {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface DetailsModule {
        @Binds
        InterfaceC3612bEh a(EpisodesListSelectorDialogFactoryImpl episodesListSelectorDialogFactoryImpl);
    }

    @Override // o.InterfaceC3612bEh
    public DialogFragment d(String str, String str2, long j, bEH beh) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        return EpisodesListSelectorDialogFragment.a.d(str, str2, j, beh);
    }
}
