package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes5.dex */
public class ExtractionForegroundService extends Service {
    private final IBinder a = new ch(this);

    public final void a() {
        synchronized (this) {
            stopForeground(true);
            stopSelf();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}
