package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.netflix.mediaclient.service.pushnotification.Payload;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class KeyCycle extends Key {
    private String mTransitionEasing = null;
    private int mCurveFit = 0;
    private int mWaveShape = -1;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;
    private float mProgress = Float.NaN;
    private int mWaveVariesBy = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;

    public KeyCycle() {
        this.mType = 4;
        this.mCustomConstraints = new HashMap<>();
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add(InteractiveAnimation.ANIMATION_TYPE.ALPHA);
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add(InteractiveAnimation.ANIMATION_TYPE.ROTATION);
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (this.mCustomConstraints.size() > 0) {
            Iterator<String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void addCycleValues(HashMap<String, KeyCycleOscillator> hashMap) {
        for (String str : hashMap.keySet()) {
            if (str.startsWith(Payload.Action.CUSTOM)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                if (constraintAttribute != null && constraintAttribute.getType() == ConstraintAttribute.AttributeType.FLOAT_TYPE) {
                    hashMap.get(str).setPoint(this.mFramePosition, this.mWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value)) {
                    hashMap.get(str).setPoint(this.mFramePosition, this.mWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, value);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public float getValue(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals(InteractiveAnimation.ANIMATION_TYPE.ROTATION)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals(InteractiveAnimation.ANIMATION_TYPE.ALPHA)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return this.mRotationX;
            case 1:
                return this.mRotationY;
            case 2:
                return this.mTranslationX;
            case 3:
                return this.mTranslationY;
            case 4:
                return this.mTranslationZ;
            case 5:
                return this.mProgress;
            case 6:
                return this.mScaleX;
            case 7:
                return this.mScaleY;
            case '\b':
                return this.mRotation;
            case '\t':
                return this.mElevation;
            case '\n':
                return this.mTransitionPathRotate;
            case 11:
                return this.mAlpha;
            case '\f':
                return this.mWaveOffset;
            default:
                Log.v("KeyCycle", "WARNING! KeyCycle UNKNOWN  " + str);
                return Float.NaN;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, SplineSet> hashMap) {
        char c;
        Debug.logStack("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String str : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(str);
            str.hashCode();
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -40300674:
                    if (str.equals(InteractiveAnimation.ANIMATION_TYPE.ROTATION)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 92909918:
                    if (str.equals(InteractiveAnimation.ANIMATION_TYPE.ALPHA)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 156108012:
                    if (str.equals("waveOffset")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    splineSet.setPoint(this.mFramePosition, this.mRotationX);
                    break;
                case 1:
                    splineSet.setPoint(this.mFramePosition, this.mRotationY);
                    break;
                case 2:
                    splineSet.setPoint(this.mFramePosition, this.mTranslationX);
                    break;
                case 3:
                    splineSet.setPoint(this.mFramePosition, this.mTranslationY);
                    break;
                case 4:
                    splineSet.setPoint(this.mFramePosition, this.mTranslationZ);
                    break;
                case 5:
                    splineSet.setPoint(this.mFramePosition, this.mProgress);
                    break;
                case 6:
                    splineSet.setPoint(this.mFramePosition, this.mScaleX);
                    break;
                case 7:
                    splineSet.setPoint(this.mFramePosition, this.mScaleY);
                    break;
                case '\b':
                    splineSet.setPoint(this.mFramePosition, this.mRotation);
                    break;
                case '\t':
                    splineSet.setPoint(this.mFramePosition, this.mElevation);
                    break;
                case '\n':
                    splineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                    break;
                case 11:
                    splineSet.setPoint(this.mFramePosition, this.mAlpha);
                    break;
                case '\f':
                    splineSet.setPoint(this.mFramePosition, this.mWaveOffset);
                    break;
                default:
                    Log.v("KeyCycle", "WARNING KeyCycle UNKNOWN  " + str);
                    break;
            }
        }
    }

    /* loaded from: classes5.dex */
    static class Loader {
        private static SparseIntArray mAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            mAttrMap.append(R.styleable.KeyCycle_framePosition, 2);
            mAttrMap.append(R.styleable.KeyCycle_transitionEasing, 3);
            mAttrMap.append(R.styleable.KeyCycle_curveFit, 4);
            mAttrMap.append(R.styleable.KeyCycle_waveShape, 5);
            mAttrMap.append(R.styleable.KeyCycle_wavePeriod, 6);
            mAttrMap.append(R.styleable.KeyCycle_waveOffset, 7);
            mAttrMap.append(R.styleable.KeyCycle_waveVariesBy, 8);
            mAttrMap.append(R.styleable.KeyCycle_android_alpha, 9);
            mAttrMap.append(R.styleable.KeyCycle_android_elevation, 10);
            mAttrMap.append(R.styleable.KeyCycle_android_rotation, 11);
            mAttrMap.append(R.styleable.KeyCycle_android_rotationX, 12);
            mAttrMap.append(R.styleable.KeyCycle_android_rotationY, 13);
            mAttrMap.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            mAttrMap.append(R.styleable.KeyCycle_android_scaleX, 15);
            mAttrMap.append(R.styleable.KeyCycle_android_scaleY, 16);
            mAttrMap.append(R.styleable.KeyCycle_android_translationX, 17);
            mAttrMap.append(R.styleable.KeyCycle_android_translationY, 18);
            mAttrMap.append(R.styleable.KeyCycle_android_translationZ, 19);
            mAttrMap.append(R.styleable.KeyCycle_motionProgress, 20);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(KeyCycle keyCycle, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyCycle.mTargetId);
                            keyCycle.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyCycle.mTargetString = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyCycle.mTargetString = typedArray.getString(index);
                            break;
                        } else {
                            keyCycle.mTargetId = typedArray.getResourceId(index, keyCycle.mTargetId);
                            break;
                        }
                    case 2:
                        keyCycle.mFramePosition = typedArray.getInt(index, keyCycle.mFramePosition);
                        break;
                    case 3:
                        keyCycle.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 4:
                        keyCycle.mCurveFit = typedArray.getInteger(index, keyCycle.mCurveFit);
                        break;
                    case 5:
                        keyCycle.mWaveShape = typedArray.getInt(index, keyCycle.mWaveShape);
                        break;
                    case 6:
                        keyCycle.mWavePeriod = typedArray.getFloat(index, keyCycle.mWavePeriod);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            keyCycle.mWaveOffset = typedArray.getDimension(index, keyCycle.mWaveOffset);
                            break;
                        } else {
                            keyCycle.mWaveOffset = typedArray.getFloat(index, keyCycle.mWaveOffset);
                            break;
                        }
                    case 8:
                        keyCycle.mWaveVariesBy = typedArray.getInt(index, keyCycle.mWaveVariesBy);
                        break;
                    case 9:
                        keyCycle.mAlpha = typedArray.getFloat(index, keyCycle.mAlpha);
                        break;
                    case 10:
                        keyCycle.mElevation = typedArray.getDimension(index, keyCycle.mElevation);
                        break;
                    case 11:
                        keyCycle.mRotation = typedArray.getFloat(index, keyCycle.mRotation);
                        break;
                    case 12:
                        keyCycle.mRotationX = typedArray.getFloat(index, keyCycle.mRotationX);
                        break;
                    case 13:
                        keyCycle.mRotationY = typedArray.getFloat(index, keyCycle.mRotationY);
                        break;
                    case 14:
                        keyCycle.mTransitionPathRotate = typedArray.getFloat(index, keyCycle.mTransitionPathRotate);
                        break;
                    case 15:
                        keyCycle.mScaleX = typedArray.getFloat(index, keyCycle.mScaleX);
                        break;
                    case 16:
                        keyCycle.mScaleY = typedArray.getFloat(index, keyCycle.mScaleY);
                        break;
                    case 17:
                        keyCycle.mTranslationX = typedArray.getDimension(index, keyCycle.mTranslationX);
                        break;
                    case 18:
                        keyCycle.mTranslationY = typedArray.getDimension(index, keyCycle.mTranslationY);
                        break;
                    case 19:
                        keyCycle.mTranslationZ = typedArray.getDimension(index, keyCycle.mTranslationZ);
                        break;
                    case 20:
                        keyCycle.mProgress = typedArray.getFloat(index, keyCycle.mProgress);
                        break;
                    default:
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                }
            }
        }
    }
}
