package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.PowerManager;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.util.DeviceCategory;

/* renamed from: o.brx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5080brx {
    private Context a;
    private aMF b;
    private e c = new e();
    private boolean d;
    private boolean e;
    private PowerManager.WakeLock g;
    private boolean i;
    private PowerManager.WakeLock j;

    public C5080brx(Context context, aMF amf) {
        if (context == null) {
            throw new IllegalArgumentException("Context can not be null");
        }
        this.a = context;
        this.b = amf;
    }

    public void d() {
        synchronized (this) {
            this.d = true;
            c();
            b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            ContextCompat.registerReceiver(this.a, this.c, intentFilter, 2);
        }
    }

    private void g() {
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        boolean z = false;
        if (audioManager != null) {
            this.e = (audioManager.isWiredHeadsetOn() || audioManager.isBluetoothA2dpOn()) ? true : true;
            this.i = audioManager.isSpeakerphoneOn();
            return;
        }
        this.e = false;
        this.i = false;
    }

    public void e() {
        synchronized (this) {
            this.d = false;
            j();
            f();
            try {
                this.a.unregisterReceiver(this.c);
            } catch (Throwable unused) {
            }
        }
    }

    private void a() {
        PowerManager.WakeLock wakeLock = this.j;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.j.release();
        }
        if (this.b.getConfigurationAgent().r() != DeviceCategory.PHONE) {
            C1044Mm.e("nf_voip", "Device is tablet (like), do NOT acquire screen lock!");
            return;
        }
        C1044Mm.e("nf_voip", "Device is phone, do acquire screen lock!");
        PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
        if (powerManager == null) {
            C1044Mm.j("nf_voip", "Power manager is not available!");
            return;
        }
        try {
            this.j = powerManager.newWakeLock(32, "nf_voip");
        } catch (Throwable th) {
            C1044Mm.e("nf_voip", "Failed to created new wake lock for promixity!", th);
        }
        if (this.j != null) {
            C1044Mm.e("nf_voip", "Proximity screen wake off is supported on this device. Aquiring...");
            this.j.acquire();
            C1044Mm.e("nf_voip", "Proximity sensor aquired.");
            return;
        }
        C1044Mm.e("nf_voip", "Proximity screen wake off is not supported on this device");
    }

    private void j() {
        PowerManager.WakeLock wakeLock = this.j;
        if (wakeLock == null) {
            return;
        }
        if (wakeLock.isHeld()) {
            C1044Mm.e("nf_voip", "releaseScreenLock: releasing...");
            this.j.release();
        } else {
            C1044Mm.j("nf_voip", "releaseScreenLock: lock already released!");
        }
        this.j = null;
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.g;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.g.release();
        }
        PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
        if (powerManager == null) {
            C1044Mm.j("nf_voip", "Power manager is not available!");
            return;
        }
        try {
            this.g = powerManager.newWakeLock(1, "nf_voip");
        } catch (Throwable unused) {
            C1044Mm.d("nf_voip", "Failed to created new wake lock for promixity!");
        }
        if (this.g != null) {
            C1044Mm.e("nf_voip", "acquireCpuLock: acquiring...");
            this.g.acquire();
            C1044Mm.e("nf_voip", "acquireCpuLock: acquired.");
        }
    }

    private void f() {
        PowerManager.WakeLock wakeLock = this.g;
        if (wakeLock == null) {
            return;
        }
        if (wakeLock.isHeld()) {
            C1044Mm.e("nf_voip", "releaseCpuLock: releasing...");
            this.g.release();
        } else {
            C1044Mm.j("nf_voip", "releaseCpuLock: lock already released!");
        }
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        g();
        if (this.d) {
            if (this.i) {
                C1044Mm.e("nf_voip", "Speaker is on, release proximity lock.");
            } else if (this.e) {
                C1044Mm.e("nf_voip", "Headphones are used for call, release proximity lock.");
            } else {
                C1044Mm.e("nf_voip", "Internal speaker is used, acquire proximity lock.");
                C1044Mm.e("nf_voip", "Acquire proximity lock...");
                a();
                return;
            }
            C1044Mm.e("nf_voip", "Release proximity lock...");
            j();
        }
    }

    public void b(boolean z) {
        b();
    }

    /* renamed from: o.brx$e */
    /* loaded from: classes4.dex */
    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.HEADSET_PLUG".equals(action)) {
                C1044Mm.e("nf_voip", "Wired headset state changed...");
                C5080brx.this.b();
            } else if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                C1044Mm.e("nf_voip", "Bluetooth headset state changed...");
                C5080brx.this.b();
            }
        }
    }
}
