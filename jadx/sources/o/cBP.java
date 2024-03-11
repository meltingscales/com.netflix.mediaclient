package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.PlaybackContext;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.PostPlayExperience;
import io.reactivex.Single;

/* loaded from: classes4.dex */
public interface cBP {
    Single<PostPlayExperience> b(String str, IPlayer.PlaybackType playbackType, VideoType videoType, PlayLocationType playLocationType, boolean z, boolean z2, PlaybackContext playbackContext);
}
