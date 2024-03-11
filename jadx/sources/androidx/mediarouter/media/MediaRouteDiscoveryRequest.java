package androidx.mediarouter.media;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class MediaRouteDiscoveryRequest {
    private final Bundle mBundle;
    private MediaRouteSelector mSelector;

    public Bundle asBundle() {
        return this.mBundle;
    }

    public MediaRouteDiscoveryRequest(MediaRouteSelector mediaRouteSelector, boolean z) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle = new Bundle();
        this.mBundle = bundle;
        this.mSelector = mediaRouteSelector;
        bundle.putBundle("selector", mediaRouteSelector.asBundle());
        bundle.putBoolean("activeScan", z);
    }

    public MediaRouteSelector getSelector() {
        ensureSelector();
        return this.mSelector;
    }

    private void ensureSelector() {
        if (this.mSelector == null) {
            MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(this.mBundle.getBundle("selector"));
            this.mSelector = fromBundle;
            if (fromBundle == null) {
                this.mSelector = MediaRouteSelector.EMPTY;
            }
        }
    }

    public boolean isActiveScan() {
        return this.mBundle.getBoolean("activeScan");
    }

    public boolean isValid() {
        ensureSelector();
        return this.mSelector.isValid();
    }

    public boolean equals(Object obj) {
        if (obj instanceof MediaRouteDiscoveryRequest) {
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = (MediaRouteDiscoveryRequest) obj;
            if (getSelector().equals(mediaRouteDiscoveryRequest.getSelector()) && isActiveScan() == mediaRouteDiscoveryRequest.isActiveScan()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return getSelector().hashCode() ^ isActiveScan();
    }

    public String toString() {
        return "DiscoveryRequest{ selector=" + getSelector() + ", activeScan=" + isActiveScan() + ", isValid=" + isValid() + " }";
    }
}
