package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.ui.player.postplay.PlayerPostPlayManagerImpl;
import com.netflix.model.leafs.PostPlayExperience;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;

@AssistedFactory
/* renamed from: o.czQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7606czQ {
    PlayerPostPlayManagerImpl a(IPlayer.PlaybackType playbackType, @Assisted("deeplink") boolean z, String str, @Assisted("supplemental") boolean z2, PostPlayExperience postPlayExperience);
}
