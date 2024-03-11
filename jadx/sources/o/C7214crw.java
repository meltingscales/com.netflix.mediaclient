package o;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C9671um;

/* renamed from: o.crw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7214crw extends ConstraintLayout {
    public static final c a = new c(null);
    private final NetflixImageView b;
    private AnimatorSet c;
    private final NetflixImageView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7214crw(Context context, int i) {
        super(context);
        C8632dsu.c((Object) context, "");
        this.c = new AnimatorSet();
        View.inflate(context, i, this);
        C7211crt b = C7211crt.b(this);
        C8632dsu.a(b, "");
        NetflixImageView netflixImageView = b.b;
        C8632dsu.a(netflixImageView, "");
        this.d = netflixImageView;
        NetflixImageView netflixImageView2 = b.c;
        C8632dsu.a(netflixImageView2, "");
        this.b = netflixImageView2;
        this.c.setDuration(1000L);
        setId(C9671um.a.b);
        Property property = View.SCALE_X;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(property, 0.0f, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(netflixImageView, ofFloat, PropertyValuesHolder.ofFloat(property2, 0.0f, 1.0f));
        ofPropertyValuesHolder.setDuration(150L);
        C8632dsu.a(ofPropertyValuesHolder, "");
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(property, 0.0f, 1.0f);
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(property2, 0.0f, 1.0f);
        Property property3 = View.ALPHA;
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(netflixImageView2, ofFloat2, ofFloat3, PropertyValuesHolder.ofFloat(property3, 0.1f, 0.2f));
        ofPropertyValuesHolder2.setDuration(150L);
        C8632dsu.a(ofPropertyValuesHolder2, "");
        ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(netflixImageView, PropertyValuesHolder.ofFloat(property, 1.0f, 1.2f), PropertyValuesHolder.ofFloat(property2, 1.0f, 1.2f));
        ofPropertyValuesHolder3.setDuration(1000L);
        ofPropertyValuesHolder3.setRepeatMode(2);
        ofPropertyValuesHolder3.setRepeatCount(-1);
        C8632dsu.a(ofPropertyValuesHolder3, "");
        ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(netflixImageView2, PropertyValuesHolder.ofFloat(property, 1.0f, 1.5f), PropertyValuesHolder.ofFloat(property2, 1.0f, 1.5f), PropertyValuesHolder.ofFloat(property3, 0.2f, 0.4f));
        ofPropertyValuesHolder4.setDuration(1000L);
        ofPropertyValuesHolder4.setRepeatMode(2);
        ofPropertyValuesHolder4.setRepeatCount(-1);
        C8632dsu.a(ofPropertyValuesHolder4, "");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofPropertyValuesHolder).with(ofPropertyValuesHolder2);
        AnimatorSet animatorSet2 = this.c;
        animatorSet2.play(animatorSet).before(ofPropertyValuesHolder3);
        animatorSet2.play(ofPropertyValuesHolder3).with(ofPropertyValuesHolder4);
    }

    /* renamed from: o.crw$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PulsatingLayout");
        }
    }

    public final void a() {
        this.c.start();
    }
}
