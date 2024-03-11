package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.media3.common.Player;
import androidx.media3.common.text.Cue;
import androidx.media3.ui.CanvasSubtitleOutput;
import androidx.media3.ui.CaptionStyleCompat;
import androidx.media3.ui.SubtitleView;
import com.google.common.collect.Comparators;
import com.netflix.mediaclient.service.player.subtitles.text.CharacterEdgeTypeMapping;
import com.netflix.mediaclient.service.player.subtitles.text.ColorMapping;
import com.netflix.mediaclient.service.player.subtitles.text.FontFamilyMapping;
import com.netflix.model.leafs.ArtworkColors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.beq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4457beq extends SubtitleView implements InterfaceC5299bwD, Player.Listener {
    private static final CaptionStyleCompat e = new CaptionStyleCompat(-1, 0, 0, 2, ArtworkColors.DEFAULT_BACKGROUND_COLOR, null);
    private ViewGroup a;
    private boolean b;
    private ViewGroup c;
    private boolean d;

    @Override // o.InterfaceC5299bwD
    public void setSubtitleVisibility(boolean z) {
        this.b = z;
    }

    public C4457beq(Context context) {
        this(context, null);
    }

    public C4457beq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        this.d = false;
        setStyle(e);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(List<Cue> list) {
        setCues(list);
    }

    @Override // androidx.media3.ui.SubtitleView
    public void setCues(List<Cue> list) {
        ViewGroup viewGroup;
        if (!this.b || ((viewGroup = this.a) != null && (viewGroup.getAlpha() <= 0.0f || this.a.getVisibility() != 0))) {
            list = Collections.emptyList();
        }
        if (this.cues == list) {
            return;
        }
        super.setCues(c(list));
        if (getAccessibilityLiveRegion() != 0) {
            e();
        }
    }

    private void e() {
        List<Cue> list = this.cues;
        int size = list == null ? 0 : list.size();
        boolean z = true;
        String str = "";
        for (int i = 0; i < size; i++) {
            if (!z) {
                str = str + " ";
            }
            if (!TextUtils.isEmpty(this.cues.get(i).text)) {
                str = str + ((Object) this.cues.get(i).text);
                z = false;
            }
        }
        setContentDescription(str);
    }

    @Override // o.InterfaceC5299bwD
    public void setSubtitleDisplayArea(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.c = viewGroup2;
        this.a = viewGroup;
        SubtitleView.Output output = this.output;
        if (output instanceof C4385bdX) {
            ((C4385bdX) output).setSubtitleDisplayArea(viewGroup, viewGroup2);
        }
    }

    @Override // o.InterfaceC5299bwD
    public void b(Rect rect) {
        if (rect == null) {
            return;
        }
        setPaddingRelative(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void b(InterfaceC5284bvp interfaceC5284bvp, InterfaceC5284bvp interfaceC5284bvp2) {
        C4975bpy b = C4975bpy.b(interfaceC5284bvp);
        C4975bpy b2 = C4975bpy.b(interfaceC5284bvp2);
        if (b == null) {
            return;
        }
        if (b2 != null) {
            b.b(b2);
        }
        Integer d = ColorMapping.d(b.j(), b.a());
        Integer d2 = ColorMapping.d(b.e(), b.d());
        Integer d3 = ColorMapping.d(b.f(), b.g());
        C4927bpC i = b.i();
        if (i == null) {
            i = C4927bpC.a();
        }
        int i2 = AnonymousClass3.d[i.b().ordinal()];
        int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 2 : 1 : 4 : 3;
        Integer d4 = ColorMapping.d(null, i.e());
        FontFamilyMapping c = b.c();
        if (c == null) {
            c = FontFamilyMapping.c;
        }
        Typeface d5 = c.d();
        Integer b3 = b.b();
        float intValue = b3 == null ? 1.0f : b3.intValue() / 100.0f;
        setStyle(new CaptionStyleCompat(d != null ? d.intValue() : -1, d2 != null ? d2.intValue() : 0, d3 != null ? d3.intValue() : 0, i3, d4 != null ? d4.intValue() : ArtworkColors.DEFAULT_BACKGROUND_COLOR, d5 != null ? d5 : Typeface.DEFAULT));
        setFractionalTextSize(intValue * 0.0533f);
        setApplyEmbeddedStyles(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.beq$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[CharacterEdgeTypeMapping.values().length];
            d = iArr;
            try {
                iArr[CharacterEdgeTypeMapping.RAISED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[CharacterEdgeTypeMapping.DEPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[CharacterEdgeTypeMapping.UNIFORM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[CharacterEdgeTypeMapping.DROP_SHADOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[CharacterEdgeTypeMapping.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // o.InterfaceC5299bwD
    public void setHDR10ColorOverride(boolean z) {
        this.d = z;
        SubtitleView.Output output = this.output;
        if (output instanceof C4385bdX) {
            ((C4385bdX) output).setHDR10ColorOverride(z);
        }
    }

    private List<Cue> c(List<Cue> list) {
        if (list != null && list.size() >= 2) {
            Comparator comparator = new Comparator() { // from class: o.bes
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e2;
                    e2 = C4457beq.e((Cue) obj, (Cue) obj2);
                    return e2;
                }
            };
            if (!Comparators.isInOrder(list, comparator)) {
                ArrayList arrayList = new ArrayList(list);
                Collections.sort(arrayList, comparator);
                return arrayList;
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(Cue cue, Cue cue2) {
        float f = cue.line;
        float f2 = cue2.line;
        if (f < f2) {
            return 1;
        }
        return f == f2 ? 0 : -1;
    }

    @Override // androidx.media3.ui.SubtitleView
    public CanvasSubtitleOutput createCanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        C4385bdX c4385bdX = new C4385bdX(context, attributeSet);
        c4385bdX.setHDR10ColorOverride(this.d);
        c4385bdX.setSubtitleDisplayArea(this.a, this.c);
        return c4385bdX;
    }
}
