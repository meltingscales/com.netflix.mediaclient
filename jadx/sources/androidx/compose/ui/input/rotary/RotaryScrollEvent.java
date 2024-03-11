package androidx.compose.ui.input.rotary;

/* loaded from: classes.dex */
public final class RotaryScrollEvent {
    private final float horizontalScrollPixels;
    private final int inputDeviceId;
    private final long uptimeMillis;
    private final float verticalScrollPixels;

    public RotaryScrollEvent(float f, float f2, long j, int i) {
        this.verticalScrollPixels = f;
        this.horizontalScrollPixels = f2;
        this.uptimeMillis = j;
        this.inputDeviceId = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof RotaryScrollEvent) {
            RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
            if (rotaryScrollEvent.verticalScrollPixels == this.verticalScrollPixels && rotaryScrollEvent.horizontalScrollPixels == this.horizontalScrollPixels && rotaryScrollEvent.uptimeMillis == this.uptimeMillis && rotaryScrollEvent.inputDeviceId == this.inputDeviceId) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.verticalScrollPixels);
        int hashCode2 = Float.hashCode(this.horizontalScrollPixels);
        return (((((hashCode * 31) + hashCode2) * 31) + Long.hashCode(this.uptimeMillis)) * 31) + Integer.hashCode(this.inputDeviceId);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.verticalScrollPixels + ",horizontalScrollPixels=" + this.horizontalScrollPixels + ",uptimeMillis=" + this.uptimeMillis + ",deviceId=" + this.inputDeviceId + ')';
    }
}
