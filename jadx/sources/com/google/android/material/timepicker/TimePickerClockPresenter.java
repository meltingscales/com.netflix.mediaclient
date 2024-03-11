package com.google.android.material.timepicker;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import o.C9574sF;

/* loaded from: classes5.dex */
class TimePickerClockPresenter implements ClockHandView.OnRotateListener, TimePickerView.OnSelectionChange, TimePickerView.OnPeriodChangeListener, ClockHandView.OnActionUpListener, TimePickerPresenter {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String[] HOUR_CLOCK_24_VALUES;
    private static final String[] HOUR_CLOCK_VALUES;
    private static final String[] MINUTE_CLOCK_VALUES;
    private static int a$s25$2013 = 0;
    private static int b = 0;
    private static int b$s26$2013 = 0;
    private static int c = 1;
    private static short[] c$s28$2013;
    private static byte[] d$s27$2013;
    private static int e$s24$2013;
    private boolean broadcasting = false;
    private float hourRotation;
    private float minuteRotation;
    private final TimeModel time;
    private final TimePickerView timePickerView;

    static {
        e();
        Object[] objArr = new Object[1];
        d(-32, 1827376457, (byte) 93, (short) 0, -849415842, objArr);
        HOUR_CLOCK_VALUES = new String[]{"12", ((String) objArr[0]).intern(), "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        Object[] objArr2 = new Object[1];
        d(-32, 1827376457, (byte) 93, (short) 0, -849415842, objArr2);
        HOUR_CLOCK_24_VALUES = new String[]{"00", ((String) objArr2[0]).intern(), "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
        MINUTE_CLOCK_VALUES = new String[]{"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
        int i = c + 125;
        b = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void e() {
        b$s26$2013 = 1405526027;
        e$s24$2013 = -227287999;
        a$s25$2013 = -1059925252;
        d$s27$2013 = new byte[]{1};
    }

    static /* synthetic */ TimeModel access$000(TimePickerClockPresenter timePickerClockPresenter) {
        int i = 2 % 2;
        int i2 = c + 21;
        b = i2 % 128;
        if (i2 % 2 == 0) {
            return timePickerClockPresenter.time;
        }
        TimeModel timeModel = timePickerClockPresenter.time;
        throw null;
    }

    public TimePickerClockPresenter(TimePickerView timePickerView, TimeModel timeModel) {
        this.timePickerView = timePickerView;
        this.time = timeModel;
        initialize();
    }

    public void initialize() {
        int i = 2 % 2;
        if (this.time.format == 0) {
            int i2 = b + 9;
            c = i2 % 128;
            if (i2 % 2 == 0) {
                this.timePickerView.showToggle();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.timePickerView.showToggle();
        }
        this.timePickerView.addOnRotateListener(this);
        this.timePickerView.setOnSelectionChangeListener(this);
        this.timePickerView.setOnPeriodChangeListener(this);
        this.timePickerView.setOnActionUpListener(this);
        updateValues();
        invalidate();
        int i3 = b + 89;
        c = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        int i = 2 % 2;
        int i2 = b + 103;
        c = i2 % 128;
        int i3 = i2 % 2;
        this.hourRotation = getHourRotation();
        TimeModel timeModel = this.time;
        this.minuteRotation = timeModel.minute * 6;
        setSelection(timeModel.selection, false);
        updateTime();
        int i4 = c + 47;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        int i = 2 % 2;
        int i2 = c + 33;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.timePickerView.setVisibility(0);
        int i4 = b + 61;
        c = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        int i = 2 % 2;
        int i2 = b + 37;
        c = i2 % 128;
        int i3 = i2 % 2;
        this.timePickerView.setVisibility(8);
        int i4 = b + 25;
        c = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private String[] getHourClockValues() {
        int i = 2 % 2;
        int i2 = c + 3;
        b = i2 % 128;
        int i3 = i2 % 2;
        if (this.time.format == 1) {
            int i4 = c + 53;
            b = i4 % 128;
            if (i4 % 2 == 0) {
                return HOUR_CLOCK_24_VALUES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return HOUR_CLOCK_VALUES;
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f, boolean z) {
        double d;
        int i = 2 % 2;
        if (this.broadcasting) {
            return;
        }
        TimeModel timeModel = this.time;
        int i2 = timeModel.hour;
        int i3 = timeModel.minute;
        int round = Math.round(f);
        TimeModel timeModel2 = this.time;
        if (timeModel2.selection == 12) {
            int i4 = c + 91;
            b = i4 % 128;
            if (i4 % 2 != 0) {
                timeModel2.setMinute((round / 2) + 18);
                d = this.time.minute >>> 82;
            } else {
                timeModel2.setMinute((round + 3) / 6);
                d = this.time.minute * 6;
            }
            this.minuteRotation = (float) Math.floor(d);
        } else {
            int i5 = (round + 15) / 30;
            if (timeModel2.format == 1) {
                i5 %= 12;
                if (this.timePickerView.getCurrentLevel() == 2) {
                    int i6 = c + 65;
                    b = i6 % 128;
                    i5 = i6 % 2 != 0 ? i5 / 93 : i5 + 12;
                }
            }
            this.time.setHour(i5);
            this.hourRotation = getHourRotation();
        }
        if (z) {
            return;
        }
        int i7 = c + 87;
        b = i7 % 128;
        if (i7 % 2 == 0) {
            updateTime();
            performHapticFeedback(i2, i3);
            return;
        }
        updateTime();
        performHapticFeedback(i2, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void performHapticFeedback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = c + 59;
        b = i4 % 128;
        int i5 = i4 % 2;
        TimeModel timeModel = this.time;
        if (timeModel.minute == i2) {
            int i6 = c + 79;
            b = i6 % 128;
            int i7 = i6 % 2;
            if (timeModel.hour == i) {
                return;
            }
        }
        this.timePickerView.performHapticFeedback(4);
        int i8 = b + 105;
        c = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
        int i2 = 2 % 2;
        int i3 = b + 1;
        c = i3 % 128;
        int i4 = i3 % 2;
        setSelection(i, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int i) {
        int i2 = 2 % 2;
        int i3 = b + 11;
        c = i3 % 128;
        int i4 = i3 % 2;
        this.time.setPeriod(i);
        int i5 = c + 101;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void setSelection(int i, boolean z) {
        boolean z2;
        String[] hourClockValues;
        int i2 = 2 % 2;
        if (i == 12) {
            int i3 = b + 39;
            c = i3 % 128;
            int i4 = i3 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        this.timePickerView.setAnimateOnTouchUp(z2);
        this.time.selection = i;
        TimePickerView timePickerView = this.timePickerView;
        if (z2) {
            int i5 = c + 65;
            int i6 = i5 % 128;
            b = i6;
            int i7 = i5 % 2;
            hourClockValues = MINUTE_CLOCK_VALUES;
            int i8 = i6 + 67;
            c = i8 % 128;
            int i9 = i8 % 2;
        } else {
            hourClockValues = getHourClockValues();
        }
        timePickerView.setValues(hourClockValues, z2 ? R.string.material_minute_suffix : this.time.getHourContentDescriptionResId());
        updateCurrentLevel();
        this.timePickerView.setHandRotation(z2 ? this.minuteRotation : this.hourRotation, z);
        this.timePickerView.setActiveSelection(i);
        TimePickerView timePickerView2 = this.timePickerView;
        timePickerView2.setMinuteHourDelegate(new ClickActionDelegate(timePickerView2.getContext(), R.string.material_hour_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.1
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(TimePickerClockPresenter.access$000(TimePickerClockPresenter.this).getHourContentDescriptionResId(), String.valueOf(TimePickerClockPresenter.access$000(TimePickerClockPresenter.this).getHourForDisplay())));
            }
        });
        TimePickerView timePickerView3 = this.timePickerView;
        timePickerView3.setHourClickDelegate(new ClickActionDelegate(timePickerView3.getContext(), R.string.material_minute_selection) { // from class: com.google.android.material.timepicker.TimePickerClockPresenter.2
            @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setContentDescription(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(TimePickerClockPresenter.access$000(TimePickerClockPresenter.this).minute)));
            }
        });
    }

    private void updateCurrentLevel() {
        int i = 2 % 2;
        int i2 = c + 53;
        b = i2 % 128;
        int i3 = i2 % 2;
        TimeModel timeModel = this.time;
        int i4 = 1;
        if (timeModel.selection == 10 && timeModel.format == 1 && timeModel.hour >= 12) {
            int i5 = c + 73;
            b = i5 % 128;
            int i6 = i5 % 2;
            i4 = 2;
        }
        this.timePickerView.setCurrentLevel(i4);
        int i7 = b + 17;
        c = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (r8 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r8.isTouchExplorationEnabled() == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        setSelection(12, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r8 != null) goto L11;
     */
    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActionUp(float r8, boolean r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            r7.broadcasting = r1
            com.google.android.material.timepicker.TimeModel r2 = r7.time
            int r3 = r2.minute
            int r4 = r2.hour
            int r2 = r2.selection
            r5 = 10
            r6 = 0
            if (r2 != r5) goto L5a
            int r8 = com.google.android.material.timepicker.TimePickerClockPresenter.c
            int r8 = r8 + 19
            int r9 = r8 % 128
            com.google.android.material.timepicker.TimePickerClockPresenter.b = r9
            int r8 = r8 % r0
            if (r8 == 0) goto L36
            com.google.android.material.timepicker.TimePickerView r8 = r7.timePickerView
            float r9 = r7.hourRotation
            r8.setHandRotation(r9, r1)
            com.google.android.material.timepicker.TimePickerView r8 = r7.timePickerView
            android.content.Context r8 = r8.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r9 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r8 = androidx.core.content.ContextCompat.getSystemService(r8, r9)
            android.view.accessibility.AccessibilityManager r8 = (android.view.accessibility.AccessibilityManager) r8
            if (r8 == 0) goto L54
            goto L4d
        L36:
            com.google.android.material.timepicker.TimePickerView r8 = r7.timePickerView
            float r9 = r7.hourRotation
            r8.setHandRotation(r9, r6)
            com.google.android.material.timepicker.TimePickerView r8 = r7.timePickerView
            android.content.Context r8 = r8.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r9 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r8 = androidx.core.content.ContextCompat.getSystemService(r8, r9)
            android.view.accessibility.AccessibilityManager r8 = (android.view.accessibility.AccessibilityManager) r8
            if (r8 == 0) goto L54
        L4d:
            boolean r8 = r8.isTouchExplorationEnabled()
            if (r8 == 0) goto L54
            goto L99
        L54:
            r8 = 12
            r7.setSelection(r8, r1)
            goto L99
        L5a:
            int r8 = java.lang.Math.round(r8)
            if (r9 != 0) goto L92
            int r1 = com.google.android.material.timepicker.TimePickerClockPresenter.b
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.google.android.material.timepicker.TimePickerClockPresenter.c = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L80
            int r8 = r8 >> 81
            int r8 = r8 * 23
            com.google.android.material.timepicker.TimeModel r0 = r7.time
            int r8 = r8 >> 4
            r0.setMinute(r8)
            com.google.android.material.timepicker.TimeModel r8 = r7.time
            int r8 = r8.minute
            int r8 = r8 + 109
        L7c:
            float r8 = (float) r8
            r7.minuteRotation = r8
            goto L92
        L80:
            int r8 = r8 + 15
            int r8 = r8 / 30
            com.google.android.material.timepicker.TimeModel r0 = r7.time
            int r8 = r8 * 5
            r0.setMinute(r8)
            com.google.android.material.timepicker.TimeModel r8 = r7.time
            int r8 = r8.minute
            int r8 = r8 * 6
            goto L7c
        L92:
            com.google.android.material.timepicker.TimePickerView r8 = r7.timePickerView
            float r0 = r7.minuteRotation
            r8.setHandRotation(r0, r9)
        L99:
            r7.broadcasting = r6
            r7.updateTime()
            r7.performHapticFeedback(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.TimePickerClockPresenter.onActionUp(float, boolean):void");
    }

    private void updateTime() {
        int i = 2 % 2;
        int i2 = c + 65;
        b = i2 % 128;
        int i3 = i2 % 2;
        TimePickerView timePickerView = this.timePickerView;
        TimeModel timeModel = this.time;
        timePickerView.updateTime(timeModel.period, timeModel.getHourForDisplay(), this.time.minute);
        int i4 = c + 39;
        b = i4 % 128;
        int i5 = i4 % 2;
    }

    private void updateValues() {
        int i = 2 % 2;
        int i2 = b + 27;
        c = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            updateValues(HOUR_CLOCK_VALUES, "%d");
            updateValues(MINUTE_CLOCK_VALUES, "%02d");
            obj.hashCode();
            throw null;
        }
        updateValues(HOUR_CLOCK_VALUES, "%d");
        updateValues(MINUTE_CLOCK_VALUES, "%02d");
        int i3 = b + 33;
        c = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private void updateValues(String[] strArr, String str) {
        int i = 2 % 2;
        int i2 = c + 81;
        b = i2 % 128;
        for (int i3 = i2 % 2 != 0 ? 1 : 0; i3 < strArr.length; i3++) {
            strArr[i3] = TimeModel.formatText(this.timePickerView.getResources(), strArr[i3], str);
        }
        int i4 = c + 13;
        b = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private int getHourRotation() {
        int i = 2 % 2;
        int i2 = c + 81;
        b = i2 % 128;
        int i3 = i2 % 2;
        int hourForDisplay = (this.time.getHourForDisplay() * 30) % 360;
        int i4 = c + 1;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return hourForDisplay;
        }
        throw null;
    }

    private static void d(int i, int i2, byte b2, short s, int i3, Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        int i6 = 2 % 2;
        C9574sF c9574sF = new C9574sF();
        StringBuilder sb = new StringBuilder();
        int i7 = ((int) (a$s25$2013 ^ 6907579060530107107L)) + i;
        int i8 = i7 == -1 ? 1 : 0;
        if (i8 != 0) {
            int i9 = $11 + 3;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            byte[] bArr = d$s27$2013;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = $11 + 73;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    bArr2[i11] = (byte) (bArr[i11] ^ 6907579060530107107L);
                }
                bArr = bArr2;
            }
            i7 = bArr != null ? (byte) (((byte) (d$s27$2013[i3 + ((int) (e$s24$2013 ^ 6907579060530107107L))] ^ 6907579060530107107L)) + ((int) (a$s25$2013 ^ 6907579060530107107L))) : (short) (((short) (c$s28$2013[i3 + ((int) (e$s24$2013 ^ 6907579060530107107L))] ^ 6907579060530107107L)) + ((int) (a$s25$2013 ^ 6907579060530107107L)));
        }
        if (i7 > 0) {
            c9574sF.e = ((i3 + i7) - 2) + ((int) (e$s24$2013 ^ 6907579060530107107L)) + i8;
            c9574sF.c = (char) (((int) (b$s26$2013 ^ 6907579060530107107L)) + i2);
            sb.append(c9574sF.c);
            c9574sF.b = c9574sF.c;
            byte[] bArr3 = d$s27$2013;
            if (bArr3 != null) {
                int i14 = $10 + 123;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i16 = 0; i16 < length2; i16++) {
                    int i17 = $11 + 55;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    bArr4[i16] = (byte) (bArr3[i16] ^ 6907579060530107107L);
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i19 = $11 + 103;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                z = true;
            } else {
                z = false;
            }
            c9574sF.d = 1;
            while (c9574sF.d < i7) {
                if (z) {
                    byte[] bArr5 = d$s27$2013;
                    c9574sF.e = c9574sF.e - 1;
                    c9574sF.c = (char) (c9574sF.b + (((byte) (((byte) (bArr5[i5] ^ 6907579060530107107L)) + s)) ^ b2));
                } else {
                    short[] sArr = c$s28$2013;
                    c9574sF.e = c9574sF.e - 1;
                    c9574sF.c = (char) (c9574sF.b + (((short) (((short) (sArr[i4] ^ 6907579060530107107L)) + s)) ^ b2));
                }
                sb.append(c9574sF.c);
                c9574sF.b = c9574sF.c;
                c9574sF.d++;
            }
        }
        objArr[0] = sb.toString();
    }
}
