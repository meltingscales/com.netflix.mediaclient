package o;

import android.content.IntentFilter;

/* renamed from: o.bcI  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4317bcI {
    static IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.netflix.mediaclient.intent.action.PLAYER_DELETE");
        return intentFilter;
    }
}
