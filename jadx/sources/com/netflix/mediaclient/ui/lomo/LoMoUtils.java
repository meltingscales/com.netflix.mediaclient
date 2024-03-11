package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.widget.TextView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.ui.R;
import java.util.List;
import o.C4000bSn;

/* loaded from: classes4.dex */
public class LoMoUtils {

    /* loaded from: classes4.dex */
    public enum LoMoWidthType {
        STANDARD,
        KIDS_CHARACTER_ROW
    }

    /* loaded from: classes4.dex */
    public enum SupportedBadge {
        NEW,
        NEW_EPISODE
    }

    public static int c(Context context) {
        return context.getResources().getDimensionPixelOffset(R.b.x);
    }

    /* renamed from: com.netflix.mediaclient.ui.lomo.LoMoUtils$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LoMoWidthType.values().length];
            a = iArr;
            try {
                iArr[LoMoWidthType.KIDS_CHARACTER_ROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LoMoWidthType.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static int c(Context context, LoMoWidthType loMoWidthType) {
        if (AnonymousClass2.a[loMoWidthType.ordinal()] == 1) {
            return context.getResources().getDimensionPixelOffset(R.b.p);
        }
        return e();
    }

    public static int a(Context context) {
        return C4000bSn.e(context);
    }

    public static void c(List<String> list, TextView textView) {
        d((list == null || list.size() <= 0) ? null : list.get(0), textView);
    }

    public static void d(String str, TextView textView) {
        if (textView == null) {
            return;
        }
        if (str != null && !str.isEmpty()) {
            if (str.equalsIgnoreCase(SupportedBadge.NEW.toString())) {
                textView.setText(textView.getResources().getString(R.o.dv));
                textView.setVisibility(0);
                return;
            } else if (str.equalsIgnoreCase(SupportedBadge.NEW_EPISODE.toString())) {
                textView.setText(textView.getResources().getString(R.o.eB));
                textView.setVisibility(0);
                return;
            } else {
                return;
            }
        }
        textView.setVisibility(8);
    }

    public static CharSequence c(Context context, String str) {
        if (str != null) {
            if (str.equalsIgnoreCase(SupportedBadge.NEW.toString())) {
                return context.getResources().getString(R.o.dv);
            }
            if (str.equalsIgnoreCase(SupportedBadge.NEW_EPISODE.toString())) {
                return context.getResources().getString(R.o.eB);
            }
            return null;
        }
        return null;
    }

    public static int e() {
        return NetflixApplication.getInstance().getResources().getDimensionPixelOffset(R.b.x);
    }
}
