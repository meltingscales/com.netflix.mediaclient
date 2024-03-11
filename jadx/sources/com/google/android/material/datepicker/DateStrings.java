package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.Base64;
import com.google.android.material.R;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes5.dex */
class DateStrings {
    private static int d = 1;
    private static int e = 0;
    private static byte e$ss2$101 = 24;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearMonth(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    static String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, Locale.getDefault());
    }

    static String getMonthDayOfWeekDay(long j, Locale locale) {
        return UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j));
    }

    static String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, Locale.getDefault());
    }

    static String getYearMonthDayOfWeekDay(long j, Locale locale) {
        return UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j));
    }

    static String getOptionalYearMonthDayOfWeekDay(long j) {
        if (isDateWithinCurrentYear(j)) {
            return getMonthDayOfWeekDay(j);
        }
        return getYearMonthDayOfWeekDay(j);
    }

    private static boolean isDateWithinCurrentYear(long j) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getDayContentDescription(Context context, long j, boolean z, boolean z2, boolean z3) {
        int i = 2 % 2;
        int i2 = d + 79;
        e = i2 % 128;
        if (i2 % 2 != 0) {
            getOptionalYearMonthDayOfWeekDay(j);
            throw null;
        }
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j);
        if (z) {
            String string = context.getString(R.string.mtrl_picker_today_description);
            if (!(!string.startsWith("'!#+"))) {
                int i3 = e + 27;
                d = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    b(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                b(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            optionalYearMonthDayOfWeekDay = String.format(string, optionalYearMonthDayOfWeekDay);
        }
        if (z2) {
            int i4 = d + 17;
            e = i4 % 128;
            if (i4 % 2 != 0) {
                context.getString(R.string.mtrl_picker_start_date_description).startsWith("'!#+");
                throw null;
            }
            String string2 = context.getString(R.string.mtrl_picker_start_date_description);
            if (string2.startsWith("'!#+")) {
                Object[] objArr3 = new Object[1];
                b(string2.substring(4), objArr3);
                string2 = ((String) objArr3[0]).intern();
            }
            return String.format(string2, optionalYearMonthDayOfWeekDay);
        } else if (z3) {
            int i5 = e + 19;
            d = i5 % 128;
            int i6 = i5 % 2;
            String string3 = context.getString(R.string.mtrl_picker_end_date_description);
            if (string3.startsWith("'!#+")) {
                Object[] objArr4 = new Object[1];
                b(string3.substring(4), objArr4);
                string3 = ((String) objArr4[0]).intern();
            }
            return String.format(string3, optionalYearMonthDayOfWeekDay);
        } else {
            return optionalYearMonthDayOfWeekDay;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearContentDescription(Context context, int i) {
        int i2 = 2 % 2;
        if (UtcDates.getTodayCalendar().get(1) == i) {
            String string = context.getString(R.string.mtrl_picker_navigate_to_current_year_description);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            }
            return String.format(string, Integer.valueOf(i));
        }
        String string2 = context.getString(R.string.mtrl_picker_navigate_to_year_description);
        if (!(!string2.startsWith("'!#+"))) {
            int i3 = d + 41;
            e = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr2 = new Object[1];
            b(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
        }
        String format = String.format(string2, Integer.valueOf(i));
        int i5 = d + 117;
        e = i5 % 128;
        int i6 = i5 % 2;
        return format;
    }

    private static void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$101);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
