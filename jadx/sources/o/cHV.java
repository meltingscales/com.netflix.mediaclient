package o;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.TransitionType;
import java.util.List;
import o.C8632dsu;
import o.cBO;
import o.cBQ;
import o.cHR;
import o.cIE;
import o.dpR;

/* loaded from: classes4.dex */
public final class cHV extends cBZ {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cHV(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cHV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    @Override // o.cBZ
    public void l() {
    }

    @Override // o.cBZ
    public void s() {
    }

    public /* synthetic */ cHV(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cHV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
    }

    public final void b(aJY ajy, final cHR chr, final Moment moment) {
        String optionType;
        C1203Sq c1203Sq;
        C1203Sq c1203Sq2;
        C8632dsu.c((Object) moment, "");
        List<Choice> choices = moment.choices();
        if (choices != null) {
            for (final Choice choice : choices) {
                if (choice != null && (optionType = choice.optionType()) != null) {
                    int hashCode = optionType.hashCode();
                    if (hashCode != -1119721862) {
                        if (hashCode == 3127582 && optionType.equals("exit") && (c1203Sq = (C1203Sq) findViewById(cIE.b.au)) != null) {
                            C8632dsu.d(c1203Sq);
                            c1203Sq.setVisibility(0);
                            c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cId
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    cHV.a(cHR.this, moment, choice, view);
                                }
                            });
                        }
                    } else if (optionType.equals("continueWatching") && (c1203Sq2 = (C1203Sq) findViewById(cIE.b.as)) != null) {
                        C8632dsu.d(c1203Sq2);
                        c1203Sq2.setVisibility(0);
                        c1203Sq2.setOnClickListener(new View.OnClickListener() { // from class: o.cIa
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                cHV.d(Choice.this, chr, moment, view);
                            }
                        });
                    }
                }
            }
        }
        setAlpha(0.0f);
        setVisibility(0);
        animate().alpha(1.0f).setDuration(500L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final Choice choice, final cHR chr, final Moment moment, View view) {
        C8632dsu.c((Object) moment, "");
        String segmentId = choice.segmentId();
        Choice.ChoiceAction action = choice.action();
        C9726vo.d(segmentId, action != null ? action.startTimeMs() : null, new drX<String, Long, dpR>() { // from class: com.netflix.mediaclient.ui.player.v2.uiView.interactive.InteractiveInterrupterMoment$start$1$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // o.drX
            /* renamed from: d */
            public final dpR invoke(String str, Long l) {
                C8632dsu.c((Object) str, "");
                C8632dsu.c((Object) l, "");
                cHR chr2 = cHR.this;
                if (chr2 != null) {
                    Moment moment2 = moment;
                    String id = choice.id();
                    C8632dsu.a(id, "");
                    chr2.d(true, moment2, id, str, choice.impressionData(), l.longValue());
                    return dpR.c;
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cHR chr, Moment moment, Choice choice, View view) {
        C8632dsu.c((Object) moment, "");
        if (chr != null) {
            chr.b(new cBQ.b(moment, choice.id(), null, true, choice.impressionData(), null, TransitionType.IMMEDIATE));
        }
        if (chr != null) {
            chr.b(cBO.C5574j.e);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
        }

        d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            cHV.this.setVisibility(8);
        }
    }

    @Override // o.cBZ
    public void e() {
        animate().alpha(0.0f).setDuration(500L).setListener(new d()).start();
    }
}
