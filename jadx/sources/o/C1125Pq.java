package o;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;
import io.reactivex.Observable;

/* renamed from: o.Pq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125Pq extends AbstractC1127Ps<Boolean> {
    public static final int c;
    public static final C1125Pq d;
    private static final Observable<Boolean> e;

    public final Observable<Boolean> b() {
        return e;
    }

    private C1125Pq() {
        super(Boolean.TRUE);
    }

    static {
        C1125Pq c1125Pq = new C1125Pq();
        d = c1125Pq;
        e = super.e();
        c = 8;
    }

    public final void a(boolean z, boolean z2) {
        super.d(Boolean.valueOf(z));
        if (!z2 || z) {
            return;
        }
        C1332Xp c1332Xp = C1332Xp.b;
        AudioManager audioManager = (AudioManager) ContextCompat.getSystemService((Context) C1332Xp.b(Context.class), AudioManager.class);
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if ((streamMaxVolume > 0 ? (1.0f / streamMaxVolume) * streamVolume : 0.0f) <= 0.2f) {
                audioManager.setStreamVolume(3, streamVolume, 1);
            }
        }
    }
}
