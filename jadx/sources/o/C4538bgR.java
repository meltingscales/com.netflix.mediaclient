package o;

import android.content.Context;
import android.os.Bundle;
import androidx.media.MediaSessionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.bgR  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4538bgR extends C4543bgW {
    private static final List<String> j = new ArrayList(Arrays.asList("com.google.android.googlequicksearchbox"));
    private final InterfaceC4856bnl f;

    public C4538bgR(Context context, InterfaceC4342bch interfaceC4342bch, InterfaceC4856bnl interfaceC4856bnl) {
        super(context, interfaceC4342bch);
        this.f = interfaceC4856bnl;
        if (interfaceC4342bch.b()) {
            m();
        }
    }

    private void m() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isRemote", false);
        bundle.putString("uuid", "");
        this.e.setExtras(bundle);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public void onCustomAction(String str, Bundle bundle) {
        if ("customActionSeek".equals(str)) {
            int i = bundle != null ? bundle.getInt("offset") : 0;
            C1044Mm.c("nf_mde", "onCustomAction action action=%s offset=%d", str, Integer.valueOf(i));
            this.c.b(i);
        } else {
            C1044Mm.c(this.a, "onCustomAction unsupported action=%s", str);
        }
        super.onCustomAction(str, bundle);
    }

    @Override // o.C4543bgW, android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPlay() {
        super.onPlay();
        String o2 = o();
        if (C8168dfL.g(o2) || !c(o2)) {
            return;
        }
        this.f.b(o2, "resume", true, new int[0]);
    }

    @Override // o.C4543bgW, android.support.v4.media.session.MediaSessionCompat.Callback
    public void onPause() {
        super.onPause();
        String o2 = o();
        if (C8168dfL.g(o2) || !c(o2)) {
            return;
        }
        this.f.b(o2, "pause", true, new int[0]);
    }

    @Override // o.C4543bgW, android.support.v4.media.session.MediaSessionCompat.Callback
    public void onRewind() {
        super.onRewind();
        String o2 = o();
        if (C8168dfL.g(o2) || !c(o2)) {
            return;
        }
        this.f.b(o2, "skipByDelta", true, (-C4543bgW.d) / 1000);
    }

    @Override // o.C4543bgW, android.support.v4.media.session.MediaSessionCompat.Callback
    public void onFastForward() {
        super.onFastForward();
        String o2 = o();
        if (C8168dfL.g(o2) || !c(o2)) {
            return;
        }
        this.f.b(o2, "skipByDelta", true, C4543bgW.d / 1000);
    }

    @Override // o.C4543bgW, android.support.v4.media.session.MediaSessionCompat.Callback
    public void onStop() {
        super.onStop();
        String o2 = o();
        if (C8168dfL.g(o2) || !c(o2)) {
            return;
        }
        this.f.b(o2, "pause", true, new int[0]);
    }

    @Override // o.C4543bgW, android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSeekTo(long j2) {
        super.onSeekTo(j2);
        String o2 = o();
        if (C8168dfL.g(o2) || !c(o2)) {
            return;
        }
        this.f.b(o2, "seek", true, new int[0]);
    }

    @Override // o.C4543bgW, android.support.v4.media.session.MediaSessionCompat.Callback
    public void onSkipToNext() {
        super.onSkipToNext();
        String o2 = o();
        if (C8168dfL.g(o2) || !c(o2)) {
            return;
        }
        this.f.b(o2, "next", true, new int[0]);
    }

    private String o() {
        try {
            MediaSessionManager.RemoteUserInfo currentControllerInfo = this.e.getCurrentControllerInfo();
            return currentControllerInfo != null ? currentControllerInfo.getPackageName() : "";
        } catch (IllegalStateException unused) {
            return "";
        }
    }

    static boolean c(String str) {
        for (String str2 : j) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
