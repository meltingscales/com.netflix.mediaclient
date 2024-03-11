package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Util;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    private float bottomPaddingFraction;
    private final CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private CaptionStyleCompat style;
    private List<Cue> textCues;
    private final WebView webView;

    private static int anchorTypeToTranslatePercent(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String convertVerticalTypeToCss(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = Collections.emptyList();
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        WebView webView = new WebView(context, attributeSet) { // from class: androidx.media3.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public void update(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    public void destroy() {
        this.webView.destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0135, code lost:
        if (r13 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0138, code lost:
        if (r13 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013b, code lost:
        r8 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013d, code lost:
        r19 = r8;
        r17 = "top";
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateWebView() {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.updateWebView():void");
    }

    private static String getBlockShearTransformFunction(Cue cue) {
        float f = cue.shearDegrees;
        if (f != 0.0f) {
            int i = cue.verticalType;
            return Util.formatInvariant("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
        }
        return "";
    }

    private String convertTextSizeToCss(int i, float f) {
        float resolveTextSize = SubtitleViewUtils.resolveTextSize(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return resolveTextSize == -3.4028235E38f ? "unset" : Util.formatInvariant("%.2fpx", Float.valueOf(resolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static String convertCaptionStyleToCssTextShadow(CaptionStyleCompat captionStyleCompat) {
        int i = captionStyleCompat.edgeType;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? "unset" : Util.formatInvariant("-0.05em -0.05em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
                }
                return Util.formatInvariant("0.06em 0.08em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
            }
            return Util.formatInvariant("0.1em 0.12em 0.15em %s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String convertAlignmentToCss(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        return i != 1 ? i != 2 ? "center" : "end" : "start";
    }

    private static float getAdjustedLineHeight(Cue cue) {
        CharSequence charSequence = cue.text;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Object[] spans = spanned.getSpans(0, spanned.length(), RubySpan.class);
            if (spans == null || spans.length <= 0) {
                Object[] spans2 = spanned.getSpans(0, spanned.length(), TextEmphasisSpan.class);
                return (spans2 == null || spans2.length <= 0) ? 1.2f : 1.8f;
            }
            return 1.8f;
        }
        return 1.2f;
    }
}
