package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    static String[] names = {"position", InteractiveAnimation.ANIMATION_TYPE.X, InteractiveAnimation.ANIMATION_TYPE.Y, InteractiveAnimation.ANIMATION_TYPE.WIDTH, InteractiveAnimation.ANIMATION_TYPE.HEIGHT, "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;
    float x;
    float y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBounds(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f2 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f3 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f4 = motionPaths2.width;
        float f5 = motionPaths.width;
        float f6 = motionPaths2.height;
        float f7 = motionPaths.height;
        this.position = this.time;
        float f8 = motionPaths.x;
        float f9 = motionPaths.y;
        float f10 = (motionPaths2.x + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (motionPaths2.y + (f6 / 2.0f)) - ((f7 / 2.0f) + f9);
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.x = (int) ((f8 + (f10 * f)) - f13);
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.y = (int) ((f9 + (f11 * f)) - f15);
        this.width = (int) (f5 + f12);
        this.height = (int) (f7 + f14);
        float f16 = Float.isNaN(keyPosition.mPercentX) ? f : keyPosition.mPercentX;
        float f17 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f = keyPosition.mPercentY;
        }
        float f18 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 2;
        this.x = (int) (((motionPaths.x + (f16 * f10)) + (f18 * f11)) - f13);
        this.y = (int) (((motionPaths.y + (f10 * f17)) + (f11 * f)) - f15);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public MotionPaths(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        int i3 = keyPosition.mPositionType;
        if (i3 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i3 == 2) {
            initScreen(i, i2, keyPosition, motionPaths, motionPaths2);
        } else {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        }
    }

    void initScreen(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f2 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f3 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f4 = motionPaths2.width;
        float f5 = motionPaths.width;
        float f6 = motionPaths2.height;
        float f7 = motionPaths.height;
        this.position = this.time;
        float f8 = motionPaths.x;
        float f9 = motionPaths.y;
        float f10 = motionPaths2.x;
        float f11 = f4 / 2.0f;
        float f12 = motionPaths2.y;
        float f13 = f6 / 2.0f;
        float f14 = (f4 - f5) * f2;
        this.x = (int) ((f8 + (((f10 + f11) - ((f5 / 2.0f) + f8)) * f)) - (f14 / 2.0f));
        float f15 = (f6 - f7) * f3;
        this.y = (int) ((f9 + (((f12 + f13) - ((f7 / 2.0f) + f9)) * f)) - (f15 / 2.0f));
        this.width = (int) (f5 + f14);
        this.height = (int) (f7 + f15);
        this.mMode = 3;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.x = (int) (keyPosition.mPercentX * ((int) (i - this.width)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.y = (int) (keyPosition.mPercentY * ((int) (i2 - this.height)));
        }
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f2 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f3 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f4 = motionPaths2.width;
        float f5 = motionPaths.width;
        float f6 = motionPaths2.height;
        float f7 = motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f = keyPosition.mPercentX;
        }
        float f8 = motionPaths.x;
        float f9 = motionPaths.width;
        float f10 = motionPaths.y;
        float f11 = motionPaths.height;
        float f12 = (motionPaths2.x + (motionPaths2.width / 2.0f)) - ((f9 / 2.0f) + f8);
        float f13 = (motionPaths2.y + (motionPaths2.height / 2.0f)) - ((f11 / 2.0f) + f10);
        float f14 = f12 * f;
        float f15 = (f4 - f5) * f2;
        float f16 = f15 / 2.0f;
        this.x = (int) ((f8 + f14) - f16);
        float f17 = f * f13;
        float f18 = (f6 - f7) * f3;
        float f19 = f18 / 2.0f;
        this.y = (int) ((f10 + f17) - f19);
        this.width = (int) (f9 + f15);
        this.height = (int) (f11 + f18);
        float f20 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        this.x = ((int) ((motionPaths.x + f14) - f16)) + ((-f13) * f20);
        this.y = ((int) ((motionPaths.y + f17) - f19)) + (f12 * f20);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    private boolean diff(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        zArr[1] = zArr[1] | diff(this.x, motionPaths.x) | z;
        zArr[2] = z | diff(this.y, motionPaths.y) | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setView(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f;
        float f2;
        float f3;
        float f4 = this.x;
        float f5 = this.y;
        float f6 = this.width;
        float f7 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            double[] dArr4 = this.mTempValue;
            int i4 = iArr[i3];
            dArr4[i4] = dArr[i3];
            this.mTempDelta[i4] = dArr2[i3];
        }
        float f8 = Float.NaN;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i2 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i2]) && (dArr3 == null || dArr3[i2] == 0.0d)) {
                f3 = f7;
                f = f8;
                f2 = f6;
            } else {
                double d = dArr3 != null ? dArr3[i2] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i2])) {
                    d = this.mTempValue[i2] + d;
                }
                f = f8;
                float f13 = (float) d;
                f2 = f6;
                f3 = f7;
                float f14 = (float) this.mTempDelta[i2];
                if (i2 == 1) {
                    f4 = f13;
                    f11 = f14;
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        f8 = f;
                        f12 = f14;
                        f7 = f3;
                        f6 = f13;
                    } else if (i2 == 4) {
                        f7 = f13;
                        f10 = f14;
                        f6 = f2;
                        f8 = f;
                    } else if (i2 == 5) {
                        f6 = f2;
                        f7 = f3;
                        f8 = f13;
                    }
                    i2++;
                } else {
                    f5 = f13;
                    f9 = f14;
                }
            }
            f6 = f2;
            f7 = f3;
            f8 = f;
            i2++;
        }
        float f15 = f7;
        float f16 = f8;
        float f17 = f6;
        if (Float.isNaN(f16)) {
            if (!Float.isNaN(Float.NaN)) {
                view.setRotation(Float.NaN);
            }
        } else {
            view.setRotation((float) ((Float.isNaN(Float.NaN) ? 0.0f : Float.NaN) + f16 + Math.toDegrees(Math.atan2(f9 + (f10 / 2.0f), f11 + (f12 / 2.0f)))));
        }
        float f18 = f4 + 0.5f;
        int i5 = (int) f18;
        float f19 = f5 + 0.5f;
        int i6 = (int) f19;
        int i7 = (int) (f18 + f17);
        int i8 = (int) (f19 + f15);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.x;
        float f2 = this.y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f8 = f + 0.0f;
        fArr[i] = f8;
        float f9 = f2 + 0.0f;
        fArr[i + 1] = f9;
        float f10 = f6 + 0.0f;
        fArr[i + 2] = f10;
        fArr[i + 3] = f9;
        fArr[i + 4] = f10;
        float f11 = f7 + 0.0f;
        fArr[i + 5] = f11;
        fArr[i + 6] = f8;
        fArr[i + 7] = f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDpDt(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((f4 * 0.0f) / 2.0f);
        float f9 = f5 - ((f6 * 0.0f) / 2.0f);
        fArr[0] = ((1.0f - f) * f8) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = ((1.0f - f2) * f9) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.x, this.y, this.width, this.height, this.mPathRotate};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        return this.attributes.get(str).noOfInterpValues();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomData(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.noOfInterpValues() == 1) {
            dArr[i] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int noOfInterpValues = constraintAttribute.noOfInterpValues();
        float[] fArr = new float[noOfInterpValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        int i2 = 0;
        while (i2 < noOfInterpValues) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return noOfInterpValues;
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.getType() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }
}
