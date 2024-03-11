package o;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes3.dex */
public final class WQ extends MediaSessionCompat.Callback {
    public static final d b = new d(null);
    private final WW d;

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("MediaSessionCallback");
        }
    }

    public WQ(WW ww) {
        this.d = ww;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onFastForward() {
        b.getLogTag();
        WW ww = this.d;
        if (ww != null) {
            ww.c();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onRewind() {
        b.getLogTag();
        WW ww = this.d;
        if (ww != null) {
            ww.b();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSeekTo(long j) {
        b.getLogTag();
        WW ww = this.d;
        if (ww != null) {
            ww.b(j);
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPause() {
        b.getLogTag();
        WW ww = this.d;
        if (ww != null) {
            ww.e();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlay() {
        b.getLogTag();
        WW ww = this.d;
        if (ww != null) {
            ww.d();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSkipToNext() {
        b.getLogTag();
        WW ww = this.d;
        if (ww != null) {
            ww.a();
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onCustomAction(String str, Bundle bundle) {
        WW ww;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) bundle, "");
        b.getLogTag();
        switch (str.hashCode()) {
            case -2068340961:
                if (str.equals("custom_action_play_next_episode")) {
                    onSkipToNext();
                    return;
                }
                return;
            case -1301010425:
                if (str.equals("custom_action_skip_intro") && (ww = this.d) != null) {
                    ww.f();
                    return;
                }
                return;
            case -1192953292:
                if (str.equals("custom_action_forward_10")) {
                    onFastForward();
                    return;
                }
                return;
            case 1191654504:
                if (str.equals("custom_action_rewind_10")) {
                    onRewind();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
