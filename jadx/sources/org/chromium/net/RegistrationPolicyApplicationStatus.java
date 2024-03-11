package org.chromium.net;

import org.chromium.base.ApplicationStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes6.dex */
public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy implements ApplicationStatus.ApplicationStateListener {
    private boolean mDestroyed;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        ApplicationStatus.registerApplicationStateListener(this);
        onApplicationStateChange(0);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    protected void destroy() {
        if (this.mDestroyed) {
            return;
        }
        ApplicationStatus.unregisterApplicationStateListener(this);
        this.mDestroyed = true;
    }

    @Override // org.chromium.base.ApplicationStatus.ApplicationStateListener
    public void onApplicationStateChange(int i) {
        if (ApplicationStatus.hasVisibleActivities()) {
            register();
        } else {
            unregister();
        }
    }
}
