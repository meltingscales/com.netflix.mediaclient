package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Flow extends VirtualLayout {
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* loaded from: classes2.dex */
    class WidgetsList {
        private ConstraintWidget biggest;
        private ConstraintAnchor mBottom;
        private int mCount;
        private ConstraintAnchor mLeft;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private int mStartIndex;
        private ConstraintAnchor mTop;
        final /* synthetic */ Flow this$0;

        public void createConstraints(boolean z, int i, boolean z2) {
            ConstraintWidget constraintWidget;
            char c;
            float f;
            int i2 = this.mCount;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.mStartIndex + i3 >= this.this$0.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget2 = this.this$0.mDisplayedWidgets[this.mStartIndex + i3];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
            }
            if (i2 == 0 || this.biggest == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.mStartIndex + i7 >= this.this$0.mDisplayedWidgetsCount) {
                    break;
                }
                ConstraintWidget constraintWidget3 = this.this$0.mDisplayedWidgets[this.mStartIndex + i7];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.mOrientation == 0) {
                ConstraintWidget constraintWidget5 = this.biggest;
                constraintWidget5.setVerticalChainStyle(this.this$0.mVerticalStyle);
                int i8 = this.mPaddingTop;
                if (i > 0) {
                    i8 += this.this$0.mVerticalGap;
                }
                constraintWidget5.mTop.connect(this.mTop, i8);
                if (z2) {
                    constraintWidget5.mBottom.connect(this.mBottom, this.mPaddingBottom);
                }
                if (i > 0) {
                    this.mTop.mOwner.mBottom.connect(constraintWidget5.mTop, 0);
                }
                char c2 = 3;
                if (this.this$0.mVerticalAlign == 3 && !constraintWidget5.hasBaseline()) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.mStartIndex + i10 >= this.this$0.mDisplayedWidgetsCount) {
                            break;
                        }
                        constraintWidget = this.this$0.mDisplayedWidgets[this.mStartIndex + i10];
                        if (constraintWidget.hasBaseline()) {
                            break;
                        }
                    }
                }
                constraintWidget = constraintWidget5;
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.mStartIndex + i12 >= this.this$0.mDisplayedWidgetsCount) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = this.this$0.mDisplayedWidgets[this.mStartIndex + i12];
                    if (constraintWidget6 == null) {
                        constraintWidget6 = constraintWidget4;
                        c = c2;
                    } else {
                        if (i11 == 0) {
                            constraintWidget6.connect(constraintWidget6.mLeft, this.mLeft, this.mPaddingLeft);
                        }
                        if (i12 == 0) {
                            int i13 = this.this$0.mHorizontalStyle;
                            float f2 = this.this$0.mHorizontalBias;
                            if (z) {
                                f2 = 1.0f - f2;
                            }
                            if (this.mStartIndex != 0 || this.this$0.mFirstHorizontalStyle == -1) {
                                if (z2 && this.this$0.mLastHorizontalStyle != -1) {
                                    i13 = this.this$0.mLastHorizontalStyle;
                                    if (z) {
                                        f = this.this$0.mLastHorizontalBias;
                                        f2 = 1.0f - f;
                                    } else {
                                        f2 = this.this$0.mLastHorizontalBias;
                                    }
                                }
                                constraintWidget6.setHorizontalChainStyle(i13);
                                constraintWidget6.setHorizontalBiasPercent(f2);
                            } else {
                                i13 = this.this$0.mFirstHorizontalStyle;
                                if (z) {
                                    f = this.this$0.mFirstHorizontalBias;
                                    f2 = 1.0f - f;
                                    constraintWidget6.setHorizontalChainStyle(i13);
                                    constraintWidget6.setHorizontalBiasPercent(f2);
                                } else {
                                    f2 = this.this$0.mFirstHorizontalBias;
                                    constraintWidget6.setHorizontalChainStyle(i13);
                                    constraintWidget6.setHorizontalBiasPercent(f2);
                                }
                            }
                        }
                        if (i11 == i2 - 1) {
                            constraintWidget6.connect(constraintWidget6.mRight, this.mRight, this.mPaddingRight);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.mLeft.connect(constraintWidget4.mRight, this.this$0.mHorizontalGap);
                            if (i11 == i4) {
                                constraintWidget6.mLeft.setGoneMargin(this.mPaddingLeft);
                            }
                            constraintWidget4.mRight.connect(constraintWidget6.mLeft, 0);
                            if (i11 == i5 + 1) {
                                constraintWidget4.mRight.setGoneMargin(this.mPaddingRight);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            c = 3;
                            if (this.this$0.mVerticalAlign != 3 || !constraintWidget.hasBaseline() || constraintWidget6 == constraintWidget || !constraintWidget6.hasBaseline()) {
                                int i14 = this.this$0.mVerticalAlign;
                                if (i14 == 0) {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                } else if (i14 == 1) {
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                } else if (z3) {
                                    constraintWidget6.mTop.connect(this.mTop, this.mPaddingTop);
                                    constraintWidget6.mBottom.connect(this.mBottom, this.mPaddingBottom);
                                } else {
                                    constraintWidget6.mTop.connect(constraintWidget5.mTop, 0);
                                    constraintWidget6.mBottom.connect(constraintWidget5.mBottom, 0);
                                }
                            } else {
                                constraintWidget6.mBaseline.connect(constraintWidget.mBaseline, 0);
                            }
                        } else {
                            c = 3;
                        }
                    }
                    i11++;
                    c2 = c;
                    constraintWidget4 = constraintWidget6;
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.biggest;
            constraintWidget7.setHorizontalChainStyle(this.this$0.mHorizontalStyle);
            int i15 = this.mPaddingLeft;
            if (i > 0) {
                i15 += this.this$0.mHorizontalGap;
            }
            if (z) {
                constraintWidget7.mRight.connect(this.mRight, i15);
                if (z2) {
                    constraintWidget7.mLeft.connect(this.mLeft, this.mPaddingRight);
                }
                if (i > 0) {
                    this.mRight.mOwner.mLeft.connect(constraintWidget7.mRight, 0);
                }
            } else {
                constraintWidget7.mLeft.connect(this.mLeft, i15);
                if (z2) {
                    constraintWidget7.mRight.connect(this.mRight, this.mPaddingRight);
                }
                if (i > 0) {
                    this.mLeft.mOwner.mRight.connect(constraintWidget7.mLeft, 0);
                }
            }
            for (int i16 = 0; i16 < i2; i16++) {
                if (this.mStartIndex + i16 >= this.this$0.mDisplayedWidgetsCount) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.this$0.mDisplayedWidgets[this.mStartIndex + i16];
                if (constraintWidget8 != null) {
                    if (i16 == 0) {
                        constraintWidget8.connect(constraintWidget8.mTop, this.mTop, this.mPaddingTop);
                        int i17 = this.this$0.mVerticalStyle;
                        float f3 = this.this$0.mVerticalBias;
                        if (this.mStartIndex != 0 || this.this$0.mFirstVerticalStyle == -1) {
                            if (z2 && this.this$0.mLastVerticalStyle != -1) {
                                i17 = this.this$0.mLastVerticalStyle;
                                f3 = this.this$0.mLastVerticalBias;
                            }
                        } else {
                            i17 = this.this$0.mFirstVerticalStyle;
                            f3 = this.this$0.mFirstVerticalBias;
                        }
                        constraintWidget8.setVerticalChainStyle(i17);
                        constraintWidget8.setVerticalBiasPercent(f3);
                    }
                    if (i16 == i2 - 1) {
                        constraintWidget8.connect(constraintWidget8.mBottom, this.mBottom, this.mPaddingBottom);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.mTop.connect(constraintWidget4.mBottom, this.this$0.mVerticalGap);
                        if (i16 == i4) {
                            constraintWidget8.mTop.setGoneMargin(this.mPaddingTop);
                        }
                        constraintWidget4.mBottom.connect(constraintWidget8.mTop, 0);
                        if (i16 == i5 + 1) {
                            constraintWidget4.mBottom.setGoneMargin(this.mPaddingBottom);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        if (z) {
                            int i18 = this.this$0.mHorizontalAlign;
                            if (i18 == 0) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i18 == 1) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i18 == 2) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            }
                        } else {
                            int i19 = this.this$0.mHorizontalAlign;
                            if (i19 == 0) {
                                constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                            } else if (i19 == 1) {
                                constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                            } else if (i19 == 2) {
                                if (z3) {
                                    constraintWidget8.mLeft.connect(this.mLeft, this.mPaddingLeft);
                                    constraintWidget8.mRight.connect(this.mRight, this.mPaddingRight);
                                } else {
                                    constraintWidget8.mLeft.connect(constraintWidget7.mLeft, 0);
                                    constraintWidget8.mRight.connect(constraintWidget7.mRight, 0);
                                }
                            }
                            constraintWidget4 = constraintWidget8;
                        }
                    }
                    constraintWidget4 = constraintWidget8;
                }
            }
        }
    }

    private void createAlignedConstraints(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i2 = 0; i2 < this.mDisplayedWidgetsCount; i2++) {
            this.mDisplayedWidgets[i2].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.mHorizontalBias;
        ConstraintWidget constraintWidget2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.mHorizontalBias;
            } else {
                f = f2;
                i = i5;
            }
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i5 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(f);
                }
                if (i5 == i3 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i5 > 0 && constraintWidget2 != null) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i6];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i6 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i6 == i4 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i6 > 0 && constraintWidget2 != null) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.mOrientation == 1) {
                    i9 = (i7 * i4) + i8;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i9 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i9]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i7];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i8];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z) {
        super.addToSolver(linearSystem, z);
        boolean z2 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i = this.mWrapMode;
        if (i != 0) {
            if (i == 1) {
                int size = this.mChainList.size();
                int i2 = 0;
                while (i2 < size) {
                    this.mChainList.get(i2).createConstraints(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                createAlignedConstraints(z2);
            } else if (i == 3) {
                int size2 = this.mChainList.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.mChainList.get(i3).createConstraints(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z2, 0, true);
        }
        needsCallbackFromSolver(false);
    }
}
