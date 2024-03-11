package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;

/* loaded from: classes2.dex */
final class Projection {
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    public static Projection createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public static Projection createEquirectangular(float f, int i, int i2, float f2, float f3, int i3) {
        int i4;
        float f4;
        int i5;
        int i6;
        float[] fArr;
        int i7;
        float f5 = f;
        int i8 = i;
        int i9 = i2;
        Assertions.checkArgument(f5 > 0.0f);
        Assertions.checkArgument(i8 >= 1);
        Assertions.checkArgument(i9 >= 1);
        Assertions.checkArgument(f2 > 0.0f && f2 <= 180.0f);
        Assertions.checkArgument(f3 > 0.0f && f3 <= 360.0f);
        float radians = (float) Math.toRadians(f2);
        float radians2 = (float) Math.toRadians(f3);
        float f6 = radians / i8;
        float f7 = radians2 / i9;
        int i10 = i9 + 1;
        int i11 = ((i10 * 2) + 2) * i8;
        float[] fArr2 = new float[i11 * 3];
        float[] fArr3 = new float[i11 * 2];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i8) {
            float f8 = radians / 2.0f;
            float f9 = (i12 * f6) - f8;
            int i15 = i12 + 1;
            float f10 = (i15 * f6) - f8;
            int i16 = 0;
            while (i16 < i10) {
                float f11 = f9;
                int i17 = i15;
                int i18 = 0;
                int i19 = 2;
                while (i18 < i19) {
                    if (i18 == 0) {
                        f4 = f11;
                        i4 = i10;
                    } else {
                        i4 = i10;
                        f4 = f10;
                    }
                    float f12 = i16 * f7;
                    int i20 = i16;
                    double d = f5;
                    float f13 = f6;
                    float f14 = f7;
                    double d2 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    int i21 = i18;
                    double d3 = f4;
                    float[] fArr4 = fArr3;
                    float f15 = f10;
                    fArr2[i14] = -((float) (Math.sin(d2) * d * Math.cos(d3)));
                    int i22 = i12;
                    int i23 = i13;
                    fArr2[i14 + 1] = (float) (d * Math.sin(d3));
                    int i24 = i14 + 3;
                    fArr2[i14 + 2] = (float) (d * Math.cos(d2) * Math.cos(d3));
                    fArr4[i23] = f12 / radians2;
                    i13 = i23 + 2;
                    fArr4[i23 + 1] = ((i22 + i21) * f13) / radians;
                    if (i20 == 0 && i21 == 0) {
                        i5 = i2;
                        i6 = i20;
                    } else {
                        i5 = i2;
                        i6 = i20;
                        if (i6 != i5 || i21 != 1) {
                            fArr = fArr4;
                            i7 = 2;
                            i14 = i24;
                            fArr3 = fArr;
                            i19 = i7;
                            i12 = i22;
                            i10 = i4;
                            f6 = f13;
                            f7 = f14;
                            f10 = f15;
                            i18 = i21 + 1;
                            f5 = f;
                            int i25 = i6;
                            i9 = i5;
                            i16 = i25;
                        }
                    }
                    System.arraycopy(fArr2, i14, fArr2, i24, 3);
                    i14 += 6;
                    fArr = fArr4;
                    i7 = 2;
                    System.arraycopy(fArr, i23, fArr, i13, 2);
                    i13 = i23 + 4;
                    fArr3 = fArr;
                    i19 = i7;
                    i12 = i22;
                    i10 = i4;
                    f6 = f13;
                    f7 = f14;
                    f10 = f15;
                    i18 = i21 + 1;
                    f5 = f;
                    int i252 = i6;
                    i9 = i5;
                    i16 = i252;
                }
                f9 = f11;
                i9 = i9;
                i15 = i17;
                f6 = f6;
                f7 = f7;
                f10 = f10;
                i16++;
                f5 = f;
            }
            f5 = f;
            i8 = i;
            i12 = i15;
        }
        return new Projection(new Mesh(new SubMesh(0, fArr2, fArr3, 1)), i3);
    }

    public Projection(Mesh mesh, int i) {
        this(mesh, mesh, i);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i;
        this.singleMesh = mesh == mesh2;
    }

    /* loaded from: classes2.dex */
    public static final class SubMesh {
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i, float[] fArr, float[] fArr2, int i2) {
            this.textureId = i;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i2;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }

        public SubMesh getSubMesh(int i) {
            return this.subMeshes[i];
        }
    }
}
