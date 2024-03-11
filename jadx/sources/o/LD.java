package o;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.ConfigurationCompat;
import com.netflix.hawkins.consumer.tokens.Theme;
import com.netflix.hawkins.consumer.tokens.Token;
import java.util.Locale;
import o.C1030Lx;

/* loaded from: classes3.dex */
public final class LD {
    private static Typeface b;

    private static final Typeface e(View view) {
        Font.Builder weight;
        Font build;
        Font.Builder weight2;
        Font build2;
        Font.Builder weight3;
        Font build3;
        Font.Builder weight4;
        Font build4;
        Font.Builder weight5;
        Font build5;
        Font.Builder weight6;
        Font build6;
        FontFamily.Builder addFont;
        FontFamily.Builder addFont2;
        FontFamily.Builder addFont3;
        FontFamily.Builder addFont4;
        FontFamily.Builder addFont5;
        FontFamily build7;
        Font.Builder weight7;
        Font build8;
        Font.Builder weight8;
        Font build9;
        Font.Builder weight9;
        Font build10;
        FontFamily.Builder addFont6;
        FontFamily.Builder addFont7;
        FontFamily build11;
        Font.Builder weight10;
        Font build12;
        Font.Builder weight11;
        Font build13;
        Font.Builder weight12;
        Font build14;
        FontFamily.Builder addFont8;
        FontFamily.Builder addFont9;
        FontFamily build15;
        Typeface.CustomFallbackBuilder addCustomFallback;
        Typeface.CustomFallbackBuilder addCustomFallback2;
        Typeface build16;
        Typeface typeface = b;
        if (typeface == null) {
            LM.a();
            weight = LN.b(view.getResources(), C1030Lx.a.n).setWeight(400);
            build = weight.build();
            C8632dsu.a(build, "");
            LM.a();
            weight2 = LN.b(view.getResources(), C1030Lx.a.f).setWeight(700);
            build2 = weight2.build();
            C8632dsu.a(build2, "");
            LM.a();
            weight3 = LN.b(view.getResources(), C1030Lx.a.a).setWeight(900);
            build3 = weight3.build();
            C8632dsu.a(build3, "");
            LM.a();
            weight4 = LN.b(view.getResources(), C1030Lx.a.m).setWeight(500);
            build4 = weight4.build();
            C8632dsu.a(build4, "");
            LM.a();
            weight5 = LN.b(view.getResources(), C1030Lx.a.i).setWeight(300);
            build5 = weight5.build();
            C8632dsu.a(build5, "");
            LM.a();
            weight6 = LN.b(view.getResources(), C1030Lx.a.l).setWeight(100);
            build6 = weight6.build();
            C8632dsu.a(build6, "");
            addFont = LO.b(build).addFont(build2);
            addFont2 = addFont.addFont(build3);
            addFont3 = addFont2.addFont(build4);
            addFont4 = addFont3.addFont(build5);
            addFont5 = addFont4.addFont(build6);
            build7 = addFont5.build();
            C8632dsu.a(build7, "");
            LM.a();
            weight7 = LN.b(view.getResources(), C1030Lx.a.d).setWeight(400);
            build8 = weight7.build();
            C8632dsu.a(build8, "");
            LM.a();
            weight8 = LN.b(view.getResources(), C1030Lx.a.e).setWeight(500);
            build9 = weight8.build();
            C8632dsu.a(build9, "");
            LM.a();
            weight9 = LN.b(view.getResources(), C1030Lx.a.e).setWeight(700);
            build10 = weight9.build();
            C8632dsu.a(build10, "");
            addFont6 = LO.b(build8).addFont(build9);
            addFont7 = addFont6.addFont(build10);
            build11 = addFont7.build();
            C8632dsu.a(build11, "");
            LM.a();
            weight10 = LN.b(view.getResources(), C1030Lx.a.b).setWeight(400);
            build12 = weight10.build();
            C8632dsu.a(build12, "");
            LM.a();
            weight11 = LN.b(view.getResources(), C1030Lx.a.c).setWeight(500);
            build13 = weight11.build();
            C8632dsu.a(build13, "");
            LM.a();
            weight12 = LN.b(view.getResources(), C1030Lx.a.c).setWeight(700);
            build14 = weight12.build();
            C8632dsu.a(build14, "");
            addFont8 = LO.b(build12).addFont(build13);
            addFont9 = addFont8.addFont(build14);
            build15 = addFont9.build();
            C8632dsu.a(build15, "");
            addCustomFallback = LP.e(build7).addCustomFallback(build11);
            addCustomFallback2 = addCustomFallback.addCustomFallback(build15);
            build16 = addCustomFallback2.build();
            b = build16;
            C8632dsu.a(build16, "");
            return build16;
        }
        return typeface;
    }

    private static final Typeface d(Token.Typography typography, Context context) {
        int i;
        String language = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0).getLanguage();
        if (C8632dsu.c((Object) language, (Object) new Locale("th").getLanguage())) {
            return ResourcesCompat.getFont(context, typography.d() < 500 ? C1030Lx.a.b : C1030Lx.a.c);
        } else if (C8632dsu.c((Object) language, (Object) new Locale("ar").getLanguage())) {
            return ResourcesCompat.getFont(context, typography.d() < 500 ? C1030Lx.a.d : C1030Lx.a.e);
        } else {
            int d = typography.d();
            if (1 <= d && d < 101) {
                i = C1030Lx.a.l;
            } else if (100 > d || d >= 301) {
                if (300 > d || d >= 401) {
                    if (400 <= d && d < 501) {
                        i = C1030Lx.a.m;
                    } else if (500 <= d && d < 701) {
                        i = C1030Lx.a.f;
                    } else if (700 <= d && d < 1001) {
                        i = C1030Lx.a.a;
                    }
                }
                i = C1030Lx.a.n;
            } else {
                i = C1030Lx.a.i;
            }
            return ResourcesCompat.getFont(context, i);
        }
    }

    public static /* synthetic */ void e(View view, Token token, Theme theme, int i, Object obj) {
        if ((i & 2) != 0) {
            theme = Theme.b;
        }
        a(view, token, theme);
    }

    public static final void a(View view, Token token, Theme theme) {
        Typeface d;
        int e;
        boolean d2;
        boolean d3;
        boolean d4;
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) token, "");
        C8632dsu.c((Object) theme, "");
        if (token instanceof Token.Color) {
            d2 = duD.d((CharSequence) token.e(), (CharSequence) "background-color", false, 2, (Object) null);
            if (d2) {
                view.setBackgroundColor(LF.d((Token.Color) token, theme));
                return;
            }
            d3 = duD.d((CharSequence) token.e(), (CharSequence) "text-color", false, 2, (Object) null);
            if (d3) {
                TextView textView = view instanceof TextView ? (TextView) view : null;
                if (textView != null) {
                    textView.setTextColor(LF.d((Token.Color) token, theme));
                    return;
                }
                return;
            }
            d4 = duD.d((CharSequence) token.e(), (CharSequence) "icon-color", false, 2, (Object) null);
            if (d4) {
                ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
                if (imageView != null) {
                    imageView.setColorFilter(LF.d((Token.Color) token, theme));
                }
            }
        } else if (token instanceof Token.Typography) {
            TextView textView2 = view instanceof TextView ? (TextView) view : null;
            if (textView2 == null) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                d = Typeface.create(e(view), ((Token.Typography) token).d(), false);
            } else {
                Context context = ((TextView) view).getContext();
                C8632dsu.a(context, "");
                d = d((Token.Typography) token, context);
            }
            textView2.setTypeface(d);
            Token.Typography typography = (Token.Typography) token;
            textView2.setTextSize(typography.b());
            if (i >= 28) {
                e = dsT.e(TypedValue.applyDimension(2, typography.a(), ((TextView) view).getResources().getDisplayMetrics()));
                textView2.setLineHeight(e);
            }
        } else if (token instanceof Token.e) {
            Log.d("View.applyToken", "Dimension tokens are not supported by `applyToken`");
        }
    }
}
