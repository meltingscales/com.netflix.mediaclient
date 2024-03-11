package org.tensorflow.lite;

/* loaded from: classes6.dex */
public interface Tensor {
    DataType dataType();

    int index();

    String name();

    int[] shape();

    /* loaded from: classes6.dex */
    public static class QuantizationParams {
        private final float scale;
        private final int zeroPoint;

        public QuantizationParams(float f, int i) {
            this.scale = f;
            this.zeroPoint = i;
        }
    }
}
