package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.content.res.AppCompatResources;
import com.netflix.mediaclient.servicemgr.interface_.TrailerItem;
import com.netflix.model.leafs.UpNextFeedVideoEvidence;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.C7939dav;
import o.C9834xU;

/* renamed from: o.daK */
/* loaded from: classes5.dex */
public final class C7902daK {
    private static int a = 0;
    private static final Map<UpNextFeedVideoEvidence.Action, Integer> b;
    public static final C7902daK c;
    private static Map<d, Integer> d = null;
    private static final List<UpNextFeedVideoEvidence.Action> e;
    private static byte e$ss2$155 = 0;
    private static int f = 1;

    /* renamed from: o.daK$e */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[UpNextFeedVideoEvidence.Action.values().length];
            try {
                iArr[UpNextFeedVideoEvidence.Action.ADD_TO_MY_LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.PLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.PLAY_MOVIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.PLAY_EPISODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.MORE_INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.INSTALL_GAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.LAUNCH_GAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.REMIND_ME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UpNextFeedVideoEvidence.Action.JOIN_NOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            a = iArr;
            int[] iArr2 = new int[TrailerItem.Action.values().length];
            try {
                iArr2[TrailerItem.Action.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[TrailerItem.Action.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[TrailerItem.Action.j.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[TrailerItem.Action.h.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[TrailerItem.Action.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[TrailerItem.Action.d.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[TrailerItem.Action.e.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[TrailerItem.Action.a.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[TrailerItem.Action.g.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            b = iArr2;
        }
    }

    static void e() {
        e$ss2$155 = (byte) 24;
    }

    public final Map<UpNextFeedVideoEvidence.Action, Integer> a() {
        return b;
    }

    private C7902daK() {
    }

    static {
        List<UpNextFeedVideoEvidence.Action> j;
        int d2;
        Map<UpNextFeedVideoEvidence.Action, Integer> d3;
        e();
        c = new C7902daK();
        d = new LinkedHashMap();
        j = C8569dql.j(UpNextFeedVideoEvidence.Action.SHARE, UpNextFeedVideoEvidence.Action.REMIND_ME, UpNextFeedVideoEvidence.Action.ADD_TO_MY_LIST, UpNextFeedVideoEvidence.Action.PLAY, UpNextFeedVideoEvidence.Action.PLAY_MOVIE, UpNextFeedVideoEvidence.Action.PLAY_EPISODE, UpNextFeedVideoEvidence.Action.MORE_INFO, UpNextFeedVideoEvidence.Action.HOME_PAGE, UpNextFeedVideoEvidence.Action.INSTALL_GAME, UpNextFeedVideoEvidence.Action.LAUNCH_GAME, UpNextFeedVideoEvidence.Action.JOIN_NOW);
        e = j;
        d2 = C8572dqo.d(j, 10);
        ArrayList arrayList = new ArrayList(d2);
        int i = 0;
        for (Object obj : j) {
            if (i < 0) {
                C8569dql.h();
            }
            arrayList.add(dpD.a((UpNextFeedVideoEvidence.Action) obj, Integer.valueOf(i)));
            i++;
        }
        d3 = dqE.d(arrayList);
        b = d3;
    }

    private final Integer a(UpNextFeedVideoEvidence.Action action, boolean z) {
        switch (e.a[action.ordinal()]) {
            case 1:
                return Integer.valueOf(com.netflix.mediaclient.ui.R.o.eu);
            case 2:
                return Integer.valueOf(C7939dav.i.f13823o);
            case 3:
                return Integer.valueOf(com.netflix.mediaclient.ui.R.o.fJ);
            case 4:
                return Integer.valueOf(C7939dav.i.m);
            case 5:
                return Integer.valueOf(C7939dav.i.y);
            case 6:
                return Integer.valueOf(com.netflix.mediaclient.ui.R.o.dS);
            case 7:
                return Integer.valueOf(C7939dav.i.i);
            case 8:
                return Integer.valueOf(C7939dav.i.l);
            case 9:
                return Integer.valueOf(z ? C7939dav.i.h : com.netflix.mediaclient.ui.R.o.aw);
            case 10:
                return Integer.valueOf(C7939dav.i.j);
            default:
                return null;
        }
    }

    public static /* synthetic */ CharSequence a(C7902daK c7902daK, Context context, UpNextFeedVideoEvidence.Action action, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c7902daK.c(context, action, z);
    }

    public final CharSequence c(Context context, UpNextFeedVideoEvidence.Action action, boolean z) {
        int i = 2 % 2;
        int i2 = f + 29;
        a = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) action, "");
            a(action, z);
            throw null;
        }
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) action, "");
        Integer a2 = a(action, z);
        if (a2 != null) {
            int i3 = f + 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int intValue = a2.intValue();
            String string = context.getString(intValue);
            if (string.startsWith("'!#+")) {
                int i5 = a + 9;
                f = i5 % 128;
                int i6 = i5 % 2;
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                if (i6 == 0) {
                    g(substring, objArr);
                    ((String) objArr[0]).intern();
                    boolean z2 = context.getText(intValue) instanceof Spanned;
                    obj.hashCode();
                    throw null;
                }
                g(substring, objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(intValue);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    return spannableString;
                }
            }
            return string;
        }
        return null;
    }

    private final Integer e(TrailerItem.Action action, boolean z) {
        switch (e.b[action.ordinal()]) {
            case 1:
                return Integer.valueOf(com.netflix.mediaclient.ui.R.o.eu);
            case 2:
                return Integer.valueOf(C7939dav.i.f13823o);
            case 3:
                return Integer.valueOf(com.netflix.mediaclient.ui.R.o.fJ);
            case 4:
                return Integer.valueOf(C7939dav.i.m);
            case 5:
                return Integer.valueOf(C7939dav.i.y);
            case 6:
                return Integer.valueOf(com.netflix.mediaclient.ui.R.o.dS);
            case 7:
                return Integer.valueOf(C7939dav.i.i);
            case 8:
                return Integer.valueOf(C7939dav.i.l);
            case 9:
                return Integer.valueOf(z ? C7939dav.i.h : com.netflix.mediaclient.ui.R.o.aw);
            default:
                return null;
        }
    }

    public static /* synthetic */ CharSequence d(C7902daK c7902daK, Context context, TrailerItem.Action action, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c7902daK.d(context, action, z);
    }

    public final CharSequence d(Context context, TrailerItem.Action action, boolean z) {
        int i = 2 % 2;
        int i2 = f + 55;
        a = i2 % 128;
        SpannableString spannableString = null;
        if (i2 % 2 != 0) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) action, "");
            e(action, z);
            spannableString.hashCode();
            throw null;
        }
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) action, "");
        Integer e2 = e(action, z);
        if (e2 != null) {
            int intValue = e2.intValue();
            String string = context.getString(intValue);
            if (string.startsWith("'!#+")) {
                int i3 = f + 45;
                a = i3 % 128;
                int i4 = i3 % 2;
                String substring = string.substring(4);
                if (i4 != 0) {
                    Object[] objArr = new Object[1];
                    g(substring, objArr);
                    ((String) objArr[0]).intern();
                    boolean z2 = context.getText(intValue) instanceof Spanned;
                    spannableString.hashCode();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                g(substring, objArr2);
                string = ((String) objArr2[0]).intern();
                CharSequence text = context.getText(intValue);
                if (text instanceof Spanned) {
                    SpannableString spannableString2 = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString2, 0);
                    spannableString = spannableString2;
                    int i5 = a + 49;
                    f = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            spannableString = string;
            int i52 = a + 49;
            f = i52 % 128;
            int i62 = i52 % 2;
        }
        return spannableString;
    }

    private final boolean c(Context context) {
        if (C1870aRh.a.a().f()) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics.widthPixels / displayMetrics.density < 360.0f) {
                return true;
            }
        }
        return false;
    }

    public final int d(Activity activity) {
        String[] b2;
        C8632dsu.c((Object) activity, "");
        Paint paint = new Paint();
        paint.setTypeface(C1336Xt.e(activity));
        paint.setTextSize(activity.getResources().getDimension(C9834xU.a.W));
        int i = 0;
        for (String str : C8146deq.c.b(true)) {
            Locale locale = Locale.getDefault();
            C8632dsu.a(locale, "");
            String upperCase = str.toUpperCase(locale);
            C8632dsu.a(upperCase, "");
            C1332Xp c1332Xp = C1332Xp.b;
            i = C8657dts.b(i, ((int) paint.measureText(upperCase)) + ((int) TypedValue.applyDimension(1, 2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
        }
        paint.setTextSize(activity.getResources().getDimension(C9834xU.a.Y));
        int measureText = (int) paint.measureText("00");
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(C9834xU.a.m);
        if (c(activity)) {
            return Math.min(Math.max(i, measureText) + (dimensionPixelSize * 2), (int) (C8150deu.p(activity) / 6.0f));
        }
        return Math.max(i, measureText) + (dimensionPixelSize * 2);
    }

    public final int b(Activity activity) {
        C8632dsu.c((Object) activity, "");
        Paint paint = new Paint();
        paint.setTypeface(C1336Xt.e(activity));
        paint.setTextSize(activity.getResources().getDimension(C9834xU.a.Y));
        return ((int) paint.measureText("10")) + (activity.getResources().getDimensionPixelSize(C9834xU.a.m) * 2);
    }

    public static /* synthetic */ int b(C7902daK c7902daK, Context context, int i, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        return c7902daK.d(context, i, num, num2);
    }

    public final int d(Context context, int i, Integer num, Integer num2) {
        int i2;
        int max;
        C8632dsu.c((Object) context, "");
        d dVar = new d(i, num, num2);
        Integer num3 = d.get(dVar);
        if (num3 != null) {
            return num3.intValue();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        C8632dsu.d(inflate);
        C1206St c1206St = (C1206St) inflate;
        frameLayout.addView(c1206St);
        UpNextFeedVideoEvidence.Action action = UpNextFeedVideoEvidence.Action.REMIND_ME;
        c1206St.setText(c(context, action, false));
        c1206St.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = c1206St.getMeasuredWidth();
        c1206St.setText(c(context, action, true));
        c1206St.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth2 = c1206St.getMeasuredWidth();
        if (num != null) {
            Drawable drawable = AppCompatResources.getDrawable(context, num.intValue());
            i2 = (drawable != null ? drawable.getIntrinsicWidth() : 0) + c1206St.getCompoundPaddingStart();
        } else {
            i2 = 0;
        }
        if (num2 != null) {
            Drawable drawable2 = AppCompatResources.getDrawable(context, num2.intValue());
            r2 = (drawable2 != null ? drawable2.getIntrinsicWidth() : 0) + c1206St.getCompoundPaddingEnd();
        }
        if (c(context)) {
            max = Math.min(Math.max(measuredWidth, measuredWidth2) + i2 + r2, (int) (C8150deu.p(context) / 5.0f));
        } else {
            max = Math.max(measuredWidth, measuredWidth2) + i2 + r2;
        }
        d.put(dVar, Integer.valueOf(max));
        return max;
    }

    /* renamed from: o.daK$d */
    /* loaded from: classes5.dex */
    public static final class d {
        private final int a;
        private final Integer b;
        private final Integer e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.a == dVar.a && C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.a);
            Integer num = this.b;
            int hashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.e;
            return (((hashCode * 31) + hashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            int i = this.a;
            Integer num = this.b;
            Integer num2 = this.e;
            return "CalculationKey(layoutId=" + i + ", drawableStartId=" + num + ", drawableEndId=" + num2 + ")";
        }

        public d(int i, Integer num, Integer num2) {
            this.a = i;
            this.b = num;
            this.e = num2;
        }
    }

    private void g(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$155);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
