package com.netflix.mediaclient.service.user;

import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractApplicationC1040Mh;
import o.C8157dfA;

/* loaded from: classes4.dex */
public enum SmartLockMonitor {
    INSTANCE;
    
    private AtomicBoolean a = new AtomicBoolean(false);

    SmartLockMonitor() {
        b();
    }

    private void b() {
        this.a.set(C8157dfA.b(AbstractApplicationC1040Mh.d(), "preference_smart_lock_used_for_last_login", false));
    }

    public boolean d() {
        return this.a.get();
    }

    public void d(boolean z) {
        synchronized (this) {
            this.a.set(z);
            C8157dfA.d(AbstractApplicationC1040Mh.d(), "preference_smart_lock_used_for_last_login", z);
        }
    }
}
