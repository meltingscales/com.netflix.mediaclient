package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class MyersDiffKt {
    public static final /* synthetic */ void access$swap(int[] iArr, int i, int i2) {
        swap(iArr, i, i2);
    }

    private static final IntStack calculateDiff(int i, int i2, DiffCallback diffCallback) {
        int i3 = ((i + i2) + 1) / 2;
        IntStack intStack = new IntStack(i3 * 3);
        IntStack intStack2 = new IntStack(i3 * 4);
        intStack2.pushRange(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] m1844constructorimpl = CenteredArray.m1844constructorimpl(new int[i4]);
        int[] m1844constructorimpl2 = CenteredArray.m1844constructorimpl(new int[i4]);
        int[] m1951constructorimpl = Snake.m1951constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int pop = intStack2.pop();
            int pop2 = intStack2.pop();
            int pop3 = intStack2.pop();
            int pop4 = intStack2.pop();
            int[] iArr = m1844constructorimpl;
            int[] iArr2 = m1844constructorimpl2;
            if (m1904midPointq5eDKzI(pop4, pop3, pop2, pop, diffCallback, m1844constructorimpl, m1844constructorimpl2, m1951constructorimpl)) {
                if (Snake.m1953getDiagonalSizeimpl(m1951constructorimpl) > 0) {
                    Snake.m1950addDiagonalToStackimpl(m1951constructorimpl, intStack);
                }
                intStack2.pushRange(pop4, Snake.m1958getStartXimpl(m1951constructorimpl), pop2, Snake.m1959getStartYimpl(m1951constructorimpl));
                intStack2.pushRange(Snake.m1954getEndXimpl(m1951constructorimpl), pop3, Snake.m1955getEndYimpl(m1951constructorimpl), pop);
            }
            m1844constructorimpl = iArr;
            m1844constructorimpl2 = iArr2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i2, 0);
        return intStack;
    }

    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < intStack.getSize()) {
            int i4 = intStack.get(i);
            int i5 = i + 2;
            int i6 = intStack.get(i5);
            int i7 = intStack.get(i + 1);
            int i8 = intStack.get(i5);
            i += 3;
            while (i3 < i4 - i6) {
                diffCallback.remove(i2, i3);
                i3++;
            }
            while (i2 < i7 - i8) {
                diffCallback.insert(i2);
                i2++;
            }
            for (int i9 = intStack.get(i5); i9 > 0; i9--) {
                diffCallback.same(i3, i2);
                i3++;
                i2++;
            }
        }
    }

    public static final void executeDiff(int i, int i2, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i, i2, diffCallback), diffCallback);
    }

    /* renamed from: midPoint-q5eDKzI  reason: not valid java name */
    private static final boolean m1904midPointq5eDKzI(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            CenteredArray.m1849setimpl(iArr, 1, i);
            CenteredArray.m1849setimpl(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (m1903forward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i8, iArr3) || m1902backward4l5_RBY(i, i2, i3, i4, diffCallback, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    /* renamed from: forward-4l5_RBY  reason: not valid java name */
    private static final boolean m1903forward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int m1846getimpl;
        int i6;
        int i7;
        int i8;
        int i9 = (i2 - i) - (i4 - i3);
        boolean z = Math.abs(i9) % 2 == 1;
        int i10 = -i5;
        for (int i11 = i10; i11 <= i5; i11 += 2) {
            if (i11 == i10 || (i11 != i5 && CenteredArray.m1846getimpl(iArr, i11 + 1) > CenteredArray.m1846getimpl(iArr, i11 - 1))) {
                m1846getimpl = CenteredArray.m1846getimpl(iArr, i11 + 1);
                i6 = m1846getimpl;
            } else {
                m1846getimpl = CenteredArray.m1846getimpl(iArr, i11 - 1);
                i6 = m1846getimpl + 1;
            }
            int i12 = (i3 + (i6 - i)) - i11;
            if (i5 == 0 || i6 != m1846getimpl) {
                i7 = i12;
            } else {
                i7 = i12;
                i12--;
            }
            while (i6 < i2 && i7 < i4) {
                if (!diffCallback.areItemsTheSame(i6, i7)) {
                    break;
                }
                i6++;
                i7++;
            }
            CenteredArray.m1849setimpl(iArr, i11, i6);
            if (z && (i8 = i9 - i11) >= i10 + 1 && i8 <= i5 - 1) {
                if (CenteredArray.m1846getimpl(iArr2, i8) <= i6) {
                    fillSnake(m1846getimpl, i12, i6, i7, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: backward-4l5_RBY  reason: not valid java name */
    private static final boolean m1902backward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int m1846getimpl;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = i8 % 2 == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && CenteredArray.m1846getimpl(iArr2, i10 + 1) < CenteredArray.m1846getimpl(iArr2, i10 - 1))) {
                m1846getimpl = CenteredArray.m1846getimpl(iArr2, i10 + 1);
                i6 = m1846getimpl;
            } else {
                m1846getimpl = CenteredArray.m1846getimpl(iArr2, i10 - 1);
                i6 = m1846getimpl - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = (i5 == 0 || i6 != m1846getimpl) ? i11 : i11 + 1;
            while (i6 > i && i11 > i3) {
                if (!diffCallback.areItemsTheSame(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            CenteredArray.m1849setimpl(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (CenteredArray.m1846getimpl(iArr, i7) >= i6) {
                    fillSnake(i6, i11, m1846getimpl, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
