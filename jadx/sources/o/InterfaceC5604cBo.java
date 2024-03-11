package o;

import com.netflix.mediaclient.browse.api.task.TaskMode;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Single;

/* renamed from: o.cBo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5604cBo {
    Single<C5593cBd> a(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, TaskMode taskMode);

    Single<C5593cBd> c(String str, VideoType videoType, PlayContext playContext, PlayerExtras playerExtras, TaskMode taskMode, String str2, boolean z);
}
