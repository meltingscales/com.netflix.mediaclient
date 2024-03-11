package o;

import android.annotation.SuppressLint;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.mediaclient.servicemgr.IMdxSharedState;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.aWg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2003aWg implements IMdxSharedState {
    @SuppressLint({"UseSparseArrays"})
    private static final Map<IMdxSharedState.MdxPlaybackState, String> b = new HashMap<IMdxSharedState.MdxPlaybackState, String>() { // from class: com.netflix.mediaclient.service.mdx.MdxSharedState$1
        {
            put(IMdxSharedState.MdxPlaybackState.Playing, "Playing");
            put(IMdxSharedState.MdxPlaybackState.Paused, "Paused");
            put(IMdxSharedState.MdxPlaybackState.Stopped, "Stopped");
            put(IMdxSharedState.MdxPlaybackState.Loading, "Loading");
            put(IMdxSharedState.MdxPlaybackState.Transitioning, "Transitioning");
        }
    };
    private static final String d = "MdxSharedState";
    private boolean a;
    private String e;
    private String f;
    private long g;
    private IMdxSharedState.MdxPlaybackState c = IMdxSharedState.MdxPlaybackState.Stopped;
    private long h = -1;
    private int i = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.e = str;
    }

    @Override // com.netflix.mediaclient.servicemgr.IMdxSharedState
    public String e() {
        return this.e;
    }

    public void g() {
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2003aWg(String str) {
        this.f = str;
    }

    @Override // com.netflix.mediaclient.servicemgr.IMdxSharedState
    public IMdxSharedState.MdxPlaybackState c() {
        IMdxSharedState.MdxPlaybackState mdxPlaybackState;
        synchronized (this) {
            mdxPlaybackState = this.c;
        }
        return mdxPlaybackState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.c = IMdxSharedState.MdxPlaybackState.Loading;
        String str = d;
        C1044Mm.e(str, "state: " + b.get(this.c) + ", pos: " + this.h + ", volume: " + this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.a = true;
        this.c = IMdxSharedState.MdxPlaybackState.Playing;
        g();
        String str = d;
        C1044Mm.e(str, "state: " + b.get(this.c) + ", pos: " + this.h + ", volume: " + this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        i();
        String str = d;
        C1044Mm.e(str, "state: " + b.get(this.c) + ", pos: " + this.h + ", volume: " + this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, int i, int i2) {
        this.h = i;
        this.g = System.currentTimeMillis();
        this.i = i2;
        if ("prepause".equals(str) || "preplay".equals(str) || "preseek".equals(str)) {
            this.c = IMdxSharedState.MdxPlaybackState.Transitioning;
            g();
        } else if ("PROGRESS".equals(str)) {
            g();
            this.c = IMdxSharedState.MdxPlaybackState.Transitioning;
        } else if (Payload.Action.PLAY.equals(str) || "PLAYING".equals(str)) {
            this.c = IMdxSharedState.MdxPlaybackState.Playing;
            g();
        } else if ("PAUSE".equals(str)) {
            this.c = IMdxSharedState.MdxPlaybackState.Paused;
        } else {
            this.c = IMdxSharedState.MdxPlaybackState.Stopped;
        }
        String str2 = d;
        C1044Mm.e(str2, "state: " + b.get(this.c) + ", pos: " + this.h + ", volume: " + this.i);
    }

    private void i() {
        this.a = false;
        this.c = IMdxSharedState.MdxPlaybackState.Stopped;
        this.h = -1L;
        this.i = -1;
    }
}
