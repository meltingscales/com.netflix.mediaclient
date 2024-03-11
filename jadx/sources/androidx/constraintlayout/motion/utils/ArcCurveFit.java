package androidx.constraintlayout.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
class ArcCurveFit extends CurveFit {
    Arc[] mArcs;
    private final double[] mTime;

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        }
        if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i];
            if (d <= arc.mTime2) {
                if (arc.linear) {
                    dArr[0] = arc.getLinearX(d);
                    dArr[1] = this.mArcs[i].getLinearY(d);
                    return;
                }
                arc.setPoint(d);
                dArr[0] = this.mArcs[i].getX();
                dArr[1] = this.mArcs[i].getY();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        Arc[] arcArr = this.mArcs;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i];
            if (d <= arc.mTime2) {
                if (arc.linear) {
                    fArr[0] = (float) arc.getLinearX(d);
                    fArr[1] = (float) this.mArcs[i].getLinearY(d);
                    return;
                }
                arc.setPoint(d);
                fArr[0] = (float) this.mArcs[i].getX();
                fArr[1] = (float) this.mArcs[i].getY();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public void getSlope(double d, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i];
            if (d <= arc.mTime2) {
                if (arc.linear) {
                    dArr[0] = arc.getLinearDX(d);
                    dArr[1] = this.mArcs[i].getLinearDY(d);
                    return;
                }
                arc.setPoint(d);
                dArr[0] = this.mArcs[i].getDX();
                dArr[1] = this.mArcs[i].getDY();
                return;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.motion.utils.CurveFit
    public double getPos(double d, int i) {
        Arc[] arcArr = this.mArcs;
        int i2 = 0;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i2];
            if (d <= arc.mTime2) {
                if (arc.linear) {
                    if (i == 0) {
                        return arc.getLinearX(d);
                    }
                    return arc.getLinearY(d);
                }
                arc.setPoint(d);
                if (i == 0) {
                    return this.mArcs[i2].getX();
                }
                return this.mArcs[i2].getY();
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ArcCurveFit(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.mTime = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r2 = new androidx.constraintlayout.motion.utils.ArcCurveFit.Arc[r2]
            r0.mArcs = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L14:
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L4d
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2d
            if (r8 == r3) goto L2a
            r10 = 2
            if (r8 == r10) goto L28
            if (r8 == r9) goto L26
            goto L2e
        L26:
            if (r5 != r3) goto L2a
        L28:
            r5 = r10
            goto L2b
        L2a:
            r5 = r3
        L2b:
            r6 = r5
            goto L2e
        L2d:
            r6 = r9
        L2e:
            r10 = r1[r4]
            int r22 = r4 + 1
            r12 = r1[r22]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r22]
            androidx.constraintlayout.motion.utils.ArcCurveFit$Arc r23 = new androidx.constraintlayout.motion.utils.ArcCurveFit$Arc
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r23
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r23
            r4 = r22
            goto L14
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    /* loaded from: classes2.dex */
    static class Arc {
        private static double[] ourPercent = new double[91];
        boolean linear;
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        public double getLinearDX(double d) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d) {
            double d2 = this.mTime1;
            double d3 = this.mOneOverDeltaTime;
            double d4 = this.mX1;
            return d4 + ((d - d2) * d3 * (this.mX2 - d4));
        }

        public double getLinearY(double d) {
            double d2 = this.mTime1;
            double d3 = this.mOneOverDeltaTime;
            double d4 = this.mY1;
            return d4 + ((d - d2) * d3 * (this.mY2 - d4));
        }

        double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        Arc(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.linear = false;
            this.mVertical = i == 1;
            this.mTime1 = d;
            this.mTime2 = d2;
            this.mOneOverDeltaTime = 1.0d / (d2 - d);
            if (3 == i) {
                this.linear = true;
            }
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (this.linear || Math.abs(d7) < 0.001d || Math.abs(d8) < 0.001d) {
                this.linear = true;
                this.mX1 = d3;
                this.mX2 = d5;
                this.mY1 = d4;
                this.mY2 = d6;
                double hypot = Math.hypot(d8, d7);
                this.mArcDistance = hypot;
                this.mArcVelocity = hypot * this.mOneOverDeltaTime;
                double d9 = this.mTime2 - this.mTime1;
                this.mEllipseCenterX = d7 / d9;
                this.mEllipseCenterY = d8 / d9;
                return;
            }
            this.mLut = new double[101];
            boolean z = this.mVertical;
            this.mEllipseA = d7 * (z ? -1 : 1);
            this.mEllipseB = d8 * (z ? 1 : -1);
            this.mEllipseCenterX = z ? d5 : d3;
            this.mEllipseCenterY = z ? d4 : d6;
            buildTable(d3, d4, d5, d6);
            this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
        }

        void setPoint(double d) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d : d - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }

        double getDX() {
            double d = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d = -d;
            }
            return d * hypot;
        }

        double getDY() {
            double d = this.mEllipseA;
            double d2 = this.mTmpCosAngle;
            double d3 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d * d2, d3);
            return this.mVertical ? (-d3) * hypot : d3 * hypot;
        }

        double lookup(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = dArr[i];
            return d2 + ((length - i) * (dArr[i + 1] - d2));
        }

        private void buildTable(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            int i = 0;
            int i2 = 0;
            double d5 = 0.0d;
            double d6 = 0.0d;
            double d7 = 0.0d;
            while (true) {
                if (i2 >= ourPercent.length) {
                    break;
                }
                double radians = Math.toRadians((i2 * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * (d3 - d);
                double cos = Math.cos(radians) * (d2 - d4);
                if (i2 > 0) {
                    d5 += Math.hypot(sin - d6, cos - d7);
                    ourPercent[i2] = d5;
                }
                i2++;
                d7 = cos;
                d6 = sin;
            }
            this.mArcDistance = d5;
            int i3 = 0;
            while (true) {
                double[] dArr3 = ourPercent;
                if (i3 >= dArr3.length) {
                    break;
                }
                dArr3[i3] = dArr3[i3] / d5;
                i3++;
            }
            while (true) {
                if (i >= this.mLut.length) {
                    return;
                }
                double length = i / (dArr2.length - 1);
                int binarySearch = Arrays.binarySearch(ourPercent, length);
                if (binarySearch >= 0) {
                    this.mLut[i] = binarySearch / (ourPercent.length - 1);
                } else if (binarySearch == -1) {
                    this.mLut[i] = 0.0d;
                } else {
                    int i4 = -binarySearch;
                    int i5 = i4 - 2;
                    double[] dArr4 = ourPercent;
                    double d8 = dArr4[i5];
                    this.mLut[i] = (i5 + ((length - d8) / (dArr4[i4 - 1] - d8))) / (dArr4.length - 1);
                }
                i++;
            }
        }
    }
}
