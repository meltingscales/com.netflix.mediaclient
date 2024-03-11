package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.model.leafs.originals.interactive.AssetManifest;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.Image;
import com.netflix.model.leafs.originals.interactive.Moment;
import o.cHR;
import o.cIE;

/* renamed from: o.cCf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5622cCf extends cBX {
    public static final c j = new c(null);
    private C1203Sq i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5622cCf(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5622cCf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C5622cCf(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5622cCf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    /* renamed from: o.cCf$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("InteractiveTextMomentLayout");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.cBX, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(cIE.b.F);
        C8632dsu.a(findViewById, "");
        this.i = (C1203Sq) findViewById;
        b().add(findViewById(cIE.b.I));
        b().add(findViewById(cIE.b.H));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
    @Override // o.cBX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void e(float r28) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5622cCf.e(float):void");
    }

    /* renamed from: o.cCf$d */
    /* loaded from: classes4.dex */
    public static final class d implements cIA {
        final /* synthetic */ C1204Sr a;
        final /* synthetic */ String b;
        final /* synthetic */ NetflixImageView c;
        final /* synthetic */ C5622cCf d;
        final /* synthetic */ float e;

        d(C1204Sr c1204Sr, NetflixImageView netflixImageView, C5622cCf c5622cCf, String str, float f) {
            this.a = c1204Sr;
            this.c = netflixImageView;
            this.d = c5622cCf;
            this.b = str;
            this.e = f;
        }

        @Override // o.cIA
        public void b(String str) {
            C1204Sr c1204Sr = this.a;
            if (c1204Sr == null) {
                return;
            }
            c1204Sr.setVisibility(0);
        }

        @Override // o.cIA
        public void e(View view) {
            Image image;
            Integer height;
            Image image2;
            Integer width;
            C8632dsu.c((Object) view, "");
            C1204Sr c1204Sr = this.a;
            if (c1204Sr != null) {
                c1204Sr.setVisibility(8);
            }
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            C8632dsu.d(layoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            AssetManifest assetManifest = this.d.q().assetManifest();
            int i = 0;
            marginLayoutParams.width = (int) (((assetManifest == null || (image2 = assetManifest.getImage(this.b)) == null || (width = image2.width()) == null) ? 0 : width.intValue()) * this.e);
            AssetManifest assetManifest2 = this.d.q().assetManifest();
            if (assetManifest2 != null && (image = assetManifest2.getImage(this.b)) != null && (height = image.height()) != null) {
                i = height.intValue();
            }
            marginLayoutParams.height = (int) (i * this.e);
            this.c.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C5622cCf c5622cCf, int i, Choice choice, View view) {
        cHR u;
        C8632dsu.c((Object) c5622cCf, "");
        if (c5622cCf.o() || !c5622cCf.n()) {
            return;
        }
        c5622cCf.a(true);
        view.performHapticFeedback(3);
        ViewPropertyAnimator alpha = c5622cCf.m().animate().alpha(0.5f);
        cCM ccm = cCM.a;
        Context context = c5622cCf.getContext();
        C8632dsu.a(context, "");
        alpha.setDuration(ccm.d(context, 40L)).start();
        int size = c5622cCf.b().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 != i) {
                ViewPropertyAnimator alpha2 = c5622cCf.b().get(i2).animate().alpha(0.0f);
                cCM ccm2 = cCM.a;
                Context context2 = c5622cCf.getContext();
                C8632dsu.a(context2, "");
                alpha2.setDuration(ccm2.d(context2, 250L)).start();
            } else {
                ViewPropertyAnimator alpha3 = c5622cCf.b().get(i2).animate().alpha(1.0f);
                cCM ccm3 = cCM.a;
                Context context3 = c5622cCf.getContext();
                C8632dsu.a(context3, "");
                alpha3.setDuration(ccm3.d(context3, 250L)).start();
            }
        }
        String segmentId = choice.segmentId();
        if (segmentId == null) {
            String id = choice.id();
            if (id == null || (u = c5622cCf.u()) == null) {
                return;
            }
            cHR.d.a(u, true, c5622cCf.q(), id, id, choice.impressionData(), null, null, 96, null);
        } else if (!c5622cCf.k()) {
            cHR u2 = c5622cCf.u();
            if (u2 != null) {
                Moment q = c5622cCf.q();
                String id2 = choice.id();
                C8632dsu.a(id2, "");
                u2.d(true, q, id2, segmentId, choice.impressionData(), choice.startTimeMs());
            }
        } else {
            cHR u3 = c5622cCf.u();
            if (u3 != null) {
                Moment q2 = c5622cCf.q();
                String id3 = choice.id();
                C8632dsu.a(id3, "");
                cHR.d.a(u3, true, q2, id3, segmentId, choice.impressionData(), null, null, 96, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Choice choice, C5622cCf c5622cCf, View view) {
        C8632dsu.c((Object) choice, "");
        C8632dsu.c((Object) c5622cCf, "");
        String segmentId = choice.segmentId();
        if (segmentId != null) {
            view.performHapticFeedback(3);
            cHR u = c5622cCf.u();
            if (u != null) {
                Moment q = c5622cCf.q();
                String id = choice.id();
                C8632dsu.a(id, "");
                u.d(true, q, id, segmentId, null, choice.startTimeMs());
            }
        }
    }
}
