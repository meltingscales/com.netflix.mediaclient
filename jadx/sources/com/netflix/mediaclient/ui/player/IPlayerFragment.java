package com.netflix.mediaclient.ui.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.subjects.Subject;
import o.C7631czp;
import o.cBO;
import org.chromium.net.ConnectionSubtype;

/* loaded from: classes4.dex */
public interface IPlayerFragment {
    void b(Runnable runnable);

    Context d();

    void d(String str, boolean z, VideoType videoType, PlayContext playContext, boolean z2, boolean z3, long j, C7631czp c7631czp);

    @TargetApi(ConnectionSubtype.SUBTYPE_10_GIGABIT_ETHERNET)
    boolean f();

    @Deprecated
    Subject<cBO> g();

    View h();

    Fragment i();

    boolean j();

    /* loaded from: classes4.dex */
    public enum PlayerFragmentState {
        ACTIVITY_NOTREADY(0, "NOTREADY"),
        ACTIVITY_SRVCMNGR_READY(1, "SRVCMNGR_READY"),
        ACTIVITY_PLAYER_READY(2, "PLAYER_READY"),
        ACTIVITY_PLAYER_LOADING_NEXT(3, "PLAYER_LOADING_NEXT");
        
        final int d;
        final String j;

        PlayerFragmentState(int i2, String str) {
            this.d = i2;
            this.j = str;
        }
    }
}
