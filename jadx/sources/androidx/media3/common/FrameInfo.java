package androidx.media3.common;

import androidx.media3.common.util.Assertions;

/* loaded from: classes2.dex */
public class FrameInfo {
    public final int height;
    public final long offsetToAddUs;
    public final float pixelWidthHeightRatio;
    public final int width;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private int height;
        private long offsetToAddUs;
        private float pixelWidthHeightRatio = 1.0f;
        private int width;

        public Builder setPixelWidthHeightRatio(float f) {
            this.pixelWidthHeightRatio = f;
            return this;
        }

        public Builder(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public FrameInfo build() {
            return new FrameInfo(this.width, this.height, this.pixelWidthHeightRatio, this.offsetToAddUs);
        }
    }

    private FrameInfo(int i, int i2, float f, long j) {
        boolean z = i > 0;
        Assertions.checkArgument(z, "width must be positive, but is: " + i);
        boolean z2 = i2 > 0;
        Assertions.checkArgument(z2, "height must be positive, but is: " + i2);
        this.width = i;
        this.height = i2;
        this.pixelWidthHeightRatio = f;
        this.offsetToAddUs = j;
    }
}
