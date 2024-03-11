package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.LogAudioSinkType;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import o.C4898boa;

/* renamed from: o.boa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4898boa {
    private static C4898boa b;
    private final Context a;
    private int c;
    private String d;
    private boolean i;
    private boolean j;
    private final IntentFilter e = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
    private final c g = new c();
    private final a f = new a();
    private final List<WeakReference<d>> h = new ArrayList();

    /* renamed from: o.boa$d */
    /* loaded from: classes3.dex */
    public interface d {
        void e(String str, int i, int i2);
    }

    public String a() {
        return this.d;
    }

    private C4898boa(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.c = d();
        this.d = LogAudioSinkType.c(applicationContext);
    }

    public static C4898boa b(Context context) {
        C4898boa c4898boa;
        synchronized (C4898boa.class) {
            if (b == null) {
                b = new C4898boa(context);
            }
            c4898boa = b;
        }
        return c4898boa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r6 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(o.C4898boa.d r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.List<java.lang.ref.WeakReference<o.boa$d>> r0 = r5.h     // Catch: java.lang.Throwable -> L63
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L63
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L63
            r0.add(r1)     // Catch: java.lang.Throwable -> L63
            boolean r6 = r5.j     // Catch: java.lang.Throwable -> L63
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L34
            java.lang.String r6 = "VolumeChangeObserver"
            java.lang.String r2 = "registered VolumeChangeListener"
            o.C1044Mm.e(r6, r2)     // Catch: java.lang.Throwable -> L63
            android.content.Context r6 = r5.a     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L63
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L63
            android.net.Uri r2 = android.provider.Settings.System.CONTENT_URI     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L63
            o.boa$a r3 = r5.f     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L63
            r6.registerContentObserver(r2, r1, r3)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L63
            r5.j = r1     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L63
            goto L32
        L28:
            r6 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "VolumeChangeObserver"
            java.lang.String r4 = "unable to register content resolver"
            o.C1044Mm.b(r3, r6, r4, r2)     // Catch: java.lang.Throwable -> L63
        L32:
            r6 = r1
            goto L35
        L34:
            r6 = r0
        L35:
            boolean r2 = r5.i     // Catch: java.lang.Throwable -> L63
            if (r2 != 0) goto L51
            android.content.Context r6 = r5.a     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L63
            o.boa$c r2 = r5.g     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L63
            android.content.IntentFilter r3 = r5.e     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L63
            r4 = 4
            androidx.core.content.ContextCompat.registerReceiver(r6, r2, r3, r4)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L63
            r5.i = r1     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L63
            goto L53
        L46:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L63
            java.lang.String r1 = "VolumeChangeObserver"
            java.lang.String r2 = "unable to register audio stream receiver"
            o.C1044Mm.b(r1, r6, r2, r0)     // Catch: java.lang.Throwable -> L63
            goto L53
        L51:
            if (r6 == 0) goto L61
        L53:
            int r6 = r5.d()     // Catch: java.lang.Throwable -> L63
            r5.c = r6     // Catch: java.lang.Throwable -> L63
            android.content.Context r6 = r5.a     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = com.netflix.mediaclient.service.player.streamingplayback.playbackreporter.LogAudioSinkType.c(r6)     // Catch: java.lang.Throwable -> L63
            r5.d = r6     // Catch: java.lang.Throwable -> L63
        L61:
            monitor-exit(r5)
            return
        L63:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4898boa.b(o.boa$d):void");
    }

    public void d(final d dVar) {
        synchronized (this) {
            this.h.removeIf(new Predicate() { // from class: o.bof
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean b2;
                    b2 = C4898boa.b(C4898boa.d.this, (WeakReference) obj);
                    return b2;
                }
            });
            if (this.h.isEmpty()) {
                if (this.j) {
                    C1044Mm.e("VolumeChangeObserver", "unregistered VolumeChangeListener");
                    try {
                        this.a.getContentResolver().unregisterContentObserver(this.f);
                    } catch (Exception e) {
                        C1044Mm.b("VolumeChangeObserver", e, "unable to unregister content resolver", new Object[0]);
                    }
                    this.j = false;
                }
                if (this.i) {
                    try {
                        this.a.unregisterReceiver(this.g);
                    } catch (Exception e2) {
                        C1044Mm.b("VolumeChangeObserver", e2, "unable to unregister audio stream receiver", new Object[0]);
                    }
                    this.i = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(d dVar, WeakReference weakReference) {
        d dVar2 = (d) weakReference.get();
        return dVar2 == null || dVar2 == dVar;
    }

    public int d() {
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (streamVolume * Prefetch.NANOSECONDS_PER_MILLISECOND) / streamMaxVolume;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this) {
            int d2 = d();
            String c2 = LogAudioSinkType.c(this.a);
            if (!C8168dfL.d(c2, this.d)) {
                this.d = c2;
                this.c = -1;
            }
            int i = this.c;
            if (d2 != i || i == -1) {
                for (WeakReference<d> weakReference : this.h) {
                    d dVar = weakReference.get();
                    if (dVar != null) {
                        C1044Mm.e("VolumeChangeObserver", "Volume changed : AudioSink: " + this.d + " " + this.c + "  newVolume:" + d2);
                        dVar.e(this.d, this.c, d2);
                    }
                }
                this.c = d2;
            }
        }
    }

    /* renamed from: o.boa$a */
    /* loaded from: classes3.dex */
    class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            C4898boa.this.c();
        }
    }

    /* renamed from: o.boa$c */
    /* loaded from: classes3.dex */
    class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                C4898boa.this.c();
            }
        }
    }
}
