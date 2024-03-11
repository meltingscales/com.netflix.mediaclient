package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Notification;
import com.netflix.model.leafs.originals.interactive.TransitionType;
import com.netflix.model.leafs.originals.interactive.UiDefinition;
import com.netflix.model.leafs.originals.interactive.animations.AnimationTemplateId;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import com.netflix.model.leafs.originals.interactive.animations.TransitionDefinitions;
import com.netflix.model.leafs.originals.interactive.template.Element;
import com.netflix.model.leafs.originals.interactive.template.ElementV2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class cCW {
    public static final a b = new a(null);
    private final ArrayList<Map<String, Map<String, Map<String, List<InteractiveAnimation>>>>> a;
    private final ArrayList<cCO> c;
    private final ArrayList<AnimatorSet> d;
    private final ArrayList<Map<String, Map<String, Map<String, List<InteractiveAnimation>>>>> e;
    private final cBY f;
    private final float g;
    private final boolean h;
    private Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> j;

    public cCW(cBY cby, float f, boolean z) {
        C8632dsu.c((Object) cby, "");
        this.f = cby;
        this.g = f;
        this.h = z;
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.a = new ArrayList<>();
        this.e = new ArrayList<>();
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("InteractiveTemplateAnimationsData");
        }
    }

    public final void c(InteractiveMoments interactiveMoments, UiDefinition.Layout.Elements elements, Map<String, ? extends TransitionDefinitions> map, Map<String, Map<String, List<InteractiveAnimation>>> map2) {
        C8632dsu.c((Object) interactiveMoments, "");
        C8632dsu.c((Object) elements, "");
        C8632dsu.c((Object) map2, "");
        if (map != null) {
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c2 = c(map, elements.background(interactiveMoments), map2, interactiveMoments);
            if (!c2.isEmpty()) {
                this.e.add(c2);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c3 = c(map, elements.timer(), map2, interactiveMoments);
            if (!c3.isEmpty()) {
                this.e.add(c3);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c4 = c(map, elements.header(), map2, interactiveMoments);
            if (!c4.isEmpty()) {
                this.e.add(c4);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c5 = c(map, elements.scoreContainer(), map2, interactiveMoments);
            if (!c5.isEmpty()) {
                this.e.add(c5);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c6 = c(map, elements.category(), map2, interactiveMoments);
            if (!c6.isEmpty()) {
                this.e.add(c6);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c7 = c(map, elements.categorySubtext(), map2, interactiveMoments);
            if (!c7.isEmpty()) {
                this.e.add(c7);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c8 = c(map, elements.p1ScoreLabel(), map2, interactiveMoments);
            if (!c8.isEmpty()) {
                this.e.add(c8);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c9 = c(map, elements.p2ScoreLabel(), map2, interactiveMoments);
            if (!c9.isEmpty()) {
                this.e.add(c9);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c10 = c(map, elements.controlsIcon(), map2, interactiveMoments);
            if (!c10.isEmpty()) {
                this.e.add(c10);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c11 = c(map, elements.streakIndicator(), map2, interactiveMoments);
            if (!c11.isEmpty()) {
                this.e.add(c11);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c12 = c(map, elements.leftPointsEarnedLabel(interactiveMoments), map2, interactiveMoments);
            if (!c12.isEmpty()) {
                this.e.add(c12);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c13 = c(map, elements.rightPointsEarnedLabel(interactiveMoments), map2, interactiveMoments);
            if (!c13.isEmpty()) {
                this.e.add(c13);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c14 = c(map, elements.tutorialContent(), map2, interactiveMoments);
            if (!c14.isEmpty()) {
                this.e.add(c14);
            }
            HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c15 = c(map, elements.resultsContent(interactiveMoments), map2, interactiveMoments);
            if (!c15.isEmpty()) {
                this.e.add(c15);
            }
            Notification notification = elements.toast();
            if (notification == null) {
                notification = elements.notification(interactiveMoments);
            }
            this.j = c(map, notification, map2, interactiveMoments);
            List<UiDefinition.Layout.Choice> choices = elements.choices();
            if (choices != null) {
                C8632dsu.d(choices);
                for (UiDefinition.Layout.Choice choice : choices) {
                    if (choice == null) {
                        this.a.add(null);
                    } else {
                        this.a.add(c(map, choice, map2, interactiveMoments));
                    }
                }
            }
        }
    }

    private final HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> c(Map<String, ? extends TransitionDefinitions> map, Element element, Map<String, Map<String, List<InteractiveAnimation>>> map2, InteractiveMoments interactiveMoments) {
        HashMap<String, Map<String, Map<String, List<InteractiveAnimation>>>> hashMap = new HashMap<>();
        if (element instanceof ElementV2) {
            element = ((ElementV2) element).override(interactiveMoments);
        }
        if (element != null) {
            for (Map.Entry<String, ? extends TransitionDefinitions> entry : map.entrySet()) {
                Map<String, Map<String, List<InteractiveAnimation>>> d = d(entry.getValue().transitionId(), element, map2, interactiveMoments);
                if (!d.isEmpty()) {
                    hashMap.put(entry.getKey(), d);
                }
            }
        }
        return hashMap;
    }

    private final Map<String, Map<String, List<InteractiveAnimation>>> d(String str, Element element, Map<String, Map<String, List<InteractiveAnimation>>> map, InteractiveMoments interactiveMoments) {
        AnimationTemplateId animationTemplateId;
        HashMap hashMap = new HashMap();
        if (str != null && str.length() != 0) {
            if (element instanceof ElementV2) {
                element = ((ElementV2) element).override(interactiveMoments);
            }
            String id = element.id();
            if (id != null) {
                Map<String, AnimationTemplateId> visualStateTransitions = element.visualStateTransitions();
                Map<String, List<InteractiveAnimation>> map2 = map.get((visualStateTransitions == null || (animationTemplateId = visualStateTransitions.get(str)) == null) ? null : animationTemplateId.animationTemplateId());
                if (map2 != null) {
                    hashMap.put(id, map2);
                }
            }
            List<Element> elementChildList = element.elementChildList();
            if (elementChildList != null) {
                for (Element element2 : elementChildList) {
                    if (element2 != null) {
                        Map<String, Map<String, List<InteractiveAnimation>>> d = d(str, element2, map, interactiveMoments);
                        if (!d.isEmpty()) {
                            hashMap.putAll(d);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static /* synthetic */ void e(cCW ccw, TransitionType transitionType, int i, boolean z, int i2, cCK cck, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            cck = null;
        }
        ccw.c(transitionType, i, z2, i4, cck);
    }

    public static /* synthetic */ void b(cCW ccw, boolean z, int i, cCK cck, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            cck = null;
        }
        ccw.a(z, i, cck);
    }

    public final void a(boolean z, int i, cCK cck) {
        HashMap hashMap = new HashMap();
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map = this.a.get(i);
        if (map != null) {
            Map<String, Map<String, List<InteractiveAnimation>>> map2 = map.get(z ? "focused" : InteractiveAnimation.States.unfocused);
            if (map2 != null) {
                hashMap.putAll(map2);
            }
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public static /* synthetic */ void b(cCW ccw, cCK cck, int i, Object obj) {
        if ((i & 1) != 0) {
            cck = null;
        }
        ccw.j(cck);
    }

    public static /* synthetic */ void e(cCW ccw, cCK cck, int i, Object obj) {
        if ((i & 1) != 0) {
            cck = null;
        }
        ccw.b(cck);
    }

    public static /* synthetic */ void d(cCW ccw, cCK cck, int i, Object obj) {
        if ((i & 1) != 0) {
            cck = null;
        }
        ccw.e(cck);
    }

    public static /* synthetic */ void a(cCW ccw, cCK cck, int i, Object obj) {
        if ((i & 1) != 0) {
            cck = null;
        }
        ccw.c(cck);
    }

    public static /* synthetic */ void a(cCW ccw, List list, cCK cck, int i, Object obj) {
        if ((i & 2) != 0) {
            cck = null;
        }
        ccw.d(list, cck);
    }

    public final void c() {
        if (!this.d.isEmpty()) {
            AnimatorSet animatorSet = this.d.get(0);
            if (animatorSet.isStarted()) {
                animatorSet.pause();
            }
        }
    }

    public final void a() {
        if (!this.d.isEmpty()) {
            this.d.get(0).resume();
        }
    }

    private final void b(Map<String, Map<String, List<InteractiveAnimation>>> map, cCK cck, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        boolean z2 = z;
        for (Map.Entry<String, Map<String, List<InteractiveAnimation>>> entry : map.entrySet()) {
            ArrayList arrayList2 = new ArrayList();
            View findViewWithTag = this.f.findViewWithTag(entry.getKey());
            if (findViewWithTag != null) {
                C8632dsu.d(findViewWithTag);
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (Map.Entry<String, List<InteractiveAnimation>> entry2 : entry.getValue().entrySet()) {
                    ArrayList arrayList3 = new ArrayList();
                    int i = 0;
                    for (Object obj : entry2.getValue()) {
                        if (i < 0) {
                            C8569dql.h();
                        }
                        ArrayList arrayList4 = arrayList3;
                        ValueAnimator d = cCL.b.d(findViewWithTag, (InteractiveAnimation) obj, entry2.getKey(), this.g, 0L, i == 0);
                        if (d != null) {
                            arrayList4.add(d);
                            if (d.getRepeatCount() != 0) {
                                z2 = true;
                            }
                        }
                        i++;
                        arrayList3 = arrayList4;
                    }
                    animatorSet2.playSequentially(arrayList3);
                }
                arrayList2.add(animatorSet2);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            arrayList.add(animatorSet3);
        }
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new c(cck, this));
        if (arrayList.isEmpty()) {
            if (cck != null) {
                cck.e();
            }
            if (cck != null) {
                cck.b();
            }
        } else if (z2) {
            animatorSet.start();
        } else {
            this.d.add(animatorSet);
            if (this.d.size() == 1) {
                animatorSet.start();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Animator.AnimatorListener {
        final /* synthetic */ cCK b;
        final /* synthetic */ cCW e;

        c(cCK cck, cCW ccw) {
            this.b = cck;
            this.e = ccw;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8632dsu.c((Object) animator, "");
            cCK cck = this.b;
            if (cck != null) {
                cck.e();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8632dsu.c((Object) animator, "");
            cCK cck = this.b;
            if (cck != null) {
                cck.b();
            }
            C8571dqn.p(this.e.d);
            if (!this.e.d.isEmpty()) {
                ((AnimatorSet) this.e.d.get(0)).start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C8632dsu.c((Object) animator, "");
            cCK cck = this.b;
            if (cck != null) {
                cck.c();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C8632dsu.c((Object) animator, "");
            cCK cck = this.b;
            if (cck != null) {
                cck.a();
            }
        }
    }

    static /* synthetic */ void e(cCW ccw, Map map, cCK cck, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        ccw.c(map, cck, z);
    }

    private final void c(Map<String, Map<String, List<InteractiveAnimation>>> map, cCK cck, boolean z) {
        if (this.h) {
            b(map, cck, z);
        } else {
            c(map, cck);
        }
    }

    private final void c(Map<String, Map<String, List<InteractiveAnimation>>> map, cCK cck) {
        List<Animation> animations;
        cCO cco = new cCO();
        long j = -1;
        boolean z = false;
        boolean z2 = false;
        AnimationSet animationSet = null;
        for (Map.Entry<String, Map<String, List<InteractiveAnimation>>> entry : map.entrySet()) {
            View findViewWithTag = this.f.findViewWithTag(entry.getKey());
            if (findViewWithTag != null) {
                C8632dsu.d(findViewWithTag);
                AnimationSet animationSet2 = new AnimationSet(z);
                long j2 = 0;
                for (Map.Entry<String, List<InteractiveAnimation>> entry2 : entry.getValue().entrySet()) {
                    InteractiveAnimation interactiveAnimation = null;
                    long j3 = 0;
                    long j4 = 0;
                    for (InteractiveAnimation interactiveAnimation2 : entry2.getValue()) {
                        Animation b2 = cCM.a.b(findViewWithTag, interactiveAnimation2, entry2.getKey(), this.g, 0L, interactiveAnimation);
                        if (b2 != null) {
                            b2.setStartOffset(b2.getStartOffset() + j4);
                            animationSet2.addAnimation(b2);
                            j4 = b2.getDuration() + b2.getStartOffset();
                            if (j4 > j3) {
                                j3 = j4;
                            }
                            if (b2.getRepeatCount() != 0) {
                                z2 = true;
                            }
                            interactiveAnimation = interactiveAnimation2;
                        }
                    }
                    j2 = j3;
                }
                C8632dsu.a(animationSet2.getAnimations(), "");
                if (!animations.isEmpty()) {
                    if (j2 > j) {
                        cBZ.a.getLogTag();
                        animationSet = animationSet2;
                        j = j2;
                    }
                    animationSet2.setFillAfter(true);
                    animationSet2.setFillEnabled(true);
                    cco.e(findViewWithTag, animationSet2);
                }
                z = false;
            }
        }
        if (animationSet != null) {
            animationSet.setAnimationListener(new b(cck, this, cco));
        }
        if (cco.b()) {
            if (cck != null) {
                cck.e();
            }
            if (cck != null) {
                cck.b();
            }
        } else if (this.c.isEmpty() || z2) {
            cco.d();
        } else {
            this.c.add(cco);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Animation.AnimationListener {
        final /* synthetic */ cCO a;
        final /* synthetic */ cCK b;
        final /* synthetic */ cCW e;

        b(cCK cck, cCW ccw, cCO cco) {
            this.b = cck;
            this.e = ccw;
            this.a = cco;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            cCK cck = this.b;
            if (cck != null) {
                cck.e();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.e.c.remove(this.a);
            cCK cck = this.b;
            if (cck != null) {
                cck.b();
            }
            if (!this.e.c.isEmpty()) {
                ((cCO) this.e.c.get(0)).d();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            cCK cck = this.b;
            if (cck != null) {
                cck.a();
            }
        }
    }

    public final void a(List<Choice> list, cCK cck) {
        Choice choice;
        Map map;
        Map map2;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map3 = (Map) it.next();
            if (map3 != null && (map2 = (Map) map3.get("init")) != null) {
                hashMap.putAll(map2);
            }
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map4 = this.j;
        if (map4 == null) {
            C8632dsu.d("");
            map4 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map5 = map4.get("init");
        if (map5 != null) {
            hashMap.putAll(map5);
        }
        int i = 0;
        for (Object obj : this.a) {
            if (i < 0) {
                C8569dql.h();
            }
            Map map6 = (Map) obj;
            if (i < (list != null ? list.size() : 0) && list != null && (choice = list.get(i)) != null && choice.isEnabled && map6 != null && (map = (Map) map6.get("init")) != null) {
                hashMap.putAll(map);
            }
            i++;
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void e(List<Choice> list, cCK cck) {
        Choice choice;
        Map map;
        Map map2;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map3 = (Map) it.next();
            if (map3 != null && (map2 = (Map) map3.get(InteractiveAnimation.States.initUnfocused)) != null) {
                hashMap.putAll(map2);
            }
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map4 = this.j;
        if (map4 == null) {
            C8632dsu.d("");
            map4 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map5 = map4.get(InteractiveAnimation.States.initUnfocused);
        if (map5 != null) {
            hashMap.putAll(map5);
        }
        int i = 0;
        for (Object obj : this.a) {
            if (i < 0) {
                C8569dql.h();
            }
            Map map6 = (Map) obj;
            if (i < (list != null ? list.size() : 0) && list != null && (choice = list.get(i)) != null && choice.isEnabled && map6 != null && (map = (Map) map6.get(InteractiveAnimation.States.initUnfocused)) != null) {
                hashMap.putAll(map);
            }
            i++;
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void c(TransitionType transitionType, int i, boolean z, int i2, cCK cck) {
        Map map;
        Map map2;
        Map<String, Map<String, List<InteractiveAnimation>>> map3;
        Map map4;
        C8632dsu.c((Object) transitionType, "");
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map5 = null;
        if (transitionType == TransitionType.LAZY && z) {
            Iterator<T> it = this.e.iterator();
            while (it.hasNext()) {
                Map map6 = (Map) it.next();
                if (map6 != null && (map4 = (Map) map6.get(InteractiveAnimation.States.dismissSelectedLazy)) != null) {
                    hashMap.putAll(map4);
                }
            }
            Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map7 = this.j;
            if (map7 == null) {
                C8632dsu.d("");
            } else {
                map5 = map7;
            }
            Map<String, Map<String, List<InteractiveAnimation>>> map8 = map5.get(InteractiveAnimation.States.dismissSelectedLazy);
            if (map8 != null) {
                hashMap.putAll(map8);
            }
            Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map9 = this.a.get(i);
            if (map9 != null && (map3 = map9.get(InteractiveAnimation.States.dismissSelectedLazy)) != null) {
                hashMap.putAll(map3);
            }
        } else {
            Iterator<T> it2 = this.e.iterator();
            while (it2.hasNext()) {
                Map map10 = (Map) it2.next();
                if (map10 != null && (map2 = (Map) map10.get(InteractiveAnimation.States.dismissTimeout)) != null) {
                    hashMap.putAll(map2);
                }
            }
            Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map11 = this.j;
            if (map11 == null) {
                C8632dsu.d("");
            } else {
                map5 = map11;
            }
            Map<String, Map<String, List<InteractiveAnimation>>> map12 = map5.get(InteractiveAnimation.States.dismissTimeout);
            if (map12 != null) {
                hashMap.putAll(map12);
            }
            int i3 = 0;
            for (Object obj : this.a) {
                if (i3 < 0) {
                    C8569dql.h();
                }
                Map map13 = (Map) obj;
                String str = i3 == i ? i3 == i2 ? InteractiveAnimation.States.dismissSelectedTimeout : InteractiveAnimation.States.dismissNonFocusedSelectedTimeout : InteractiveAnimation.States.dismissNonSelectedTimeout;
                if (map13 != null && (map = (Map) map13.get(str)) != null) {
                    hashMap.putAll(map);
                }
                i3++;
            }
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void c(TransitionType transitionType, int i, cCK cck) {
        Map map;
        Map map2;
        C8632dsu.c((Object) transitionType, "");
        b.getLogTag();
        HashMap hashMap = new HashMap();
        int i2 = 0;
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map3 = null;
        if (transitionType == TransitionType.LAZY) {
            Iterator<T> it = this.e.iterator();
            while (it.hasNext()) {
                Map map4 = (Map) it.next();
                if (map4 != null && (map2 = (Map) map4.get(InteractiveAnimation.States.selectedLazy)) != null) {
                    hashMap.putAll(map2);
                }
            }
            Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map5 = this.j;
            if (map5 == null) {
                C8632dsu.d("");
            } else {
                map3 = map5;
            }
            Map<String, Map<String, List<InteractiveAnimation>>> map6 = map3.get(InteractiveAnimation.States.selectedLazy);
            if (map6 != null) {
                hashMap.putAll(map6);
            }
            for (Object obj : this.a) {
                if (i2 < 0) {
                    C8569dql.h();
                }
                Map map7 = (Map) obj;
                if (map7 != null) {
                    Map map8 = (Map) map7.get(i2 == i ? InteractiveAnimation.States.selectedLazy : InteractiveAnimation.States.dismissNonSelectedLazy);
                    if (map8 != null) {
                        hashMap.putAll(map8);
                    }
                }
                i2++;
            }
        } else {
            Iterator<T> it2 = this.e.iterator();
            while (it2.hasNext()) {
                Map map9 = (Map) it2.next();
                if (map9 != null && (map = (Map) map9.get(InteractiveAnimation.States.dismissImmediate)) != null) {
                    hashMap.putAll(map);
                }
            }
            Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map10 = this.j;
            if (map10 == null) {
                C8632dsu.d("");
            } else {
                map3 = map10;
            }
            Map<String, Map<String, List<InteractiveAnimation>>> map11 = map3.get(InteractiveAnimation.States.dismissImmediate);
            if (map11 != null) {
                hashMap.putAll(map11);
            }
            for (Object obj2 : this.a) {
                if (i2 < 0) {
                    C8569dql.h();
                }
                Map map12 = (Map) obj2;
                if (map12 != null) {
                    Map map13 = (Map) map12.get(i2 == i ? InteractiveAnimation.States.dismissSelectedImmediate : InteractiveAnimation.States.dismissNonSelectedImmediate);
                    if (map13 != null) {
                        hashMap.putAll(map13);
                    }
                }
                i2++;
            }
        }
        if ((!hashMap.isEmpty()) && (!this.d.isEmpty())) {
            for (AnimatorSet animatorSet : this.d) {
                if (!animatorSet.isPaused()) {
                    animatorSet.cancel();
                }
            }
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void g(cCK cck) {
        Map map;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            if (map2 != null && (map = (Map) map2.get("update")) != null) {
                hashMap.putAll(map);
            }
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map3 = this.j;
        if (map3 == null) {
            C8632dsu.d("");
            map3 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map4 = map3.get("update");
        if (map4 != null) {
            hashMap.putAll(map4);
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void a(cCK cck) {
        Map map;
        Map map2;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map3 = (Map) it.next();
            if (map3 != null && (map2 = (Map) map3.get(InteractiveAnimation.States.displayResults)) != null) {
                hashMap.putAll(map2);
            }
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map4 = this.j;
        if (map4 == null) {
            C8632dsu.d("");
            map4 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map5 = map4.get(InteractiveAnimation.States.displayResults);
        if (map5 != null) {
            hashMap.putAll(map5);
        }
        Iterator<T> it2 = this.a.iterator();
        while (it2.hasNext()) {
            Map map6 = (Map) it2.next();
            if (map6 != null && (map = (Map) map6.get(InteractiveAnimation.States.displayResults)) != null) {
                hashMap.putAll(map);
            }
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void j(cCK cck) {
        Map map;
        Map map2;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map3 = (Map) it.next();
            if (map3 != null && (map2 = (Map) map3.get(InteractiveAnimation.States.teardown)) != null) {
                hashMap.putAll(map2);
            }
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map4 = this.j;
        if (map4 == null) {
            C8632dsu.d("");
            map4 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map5 = map4.get(InteractiveAnimation.States.teardown);
        if (map5 != null) {
            hashMap.putAll(map5);
        }
        Iterator<T> it2 = this.a.iterator();
        while (it2.hasNext()) {
            Map map6 = (Map) it2.next();
            if (map6 != null && (map = (Map) map6.get(InteractiveAnimation.States.teardown)) != null) {
                hashMap.putAll(map);
            }
        }
        if ((!hashMap.isEmpty()) && (!this.d.isEmpty())) {
            for (AnimatorSet animatorSet : this.d) {
                if (!animatorSet.isPaused()) {
                    animatorSet.cancel();
                }
            }
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void b(cCK cck) {
        Map map;
        Map map2;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map3 = (Map) it.next();
            if (map3 != null && (map2 = (Map) map3.get(InteractiveAnimation.States.display)) != null) {
                hashMap.putAll(map2);
            }
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map4 = this.j;
        if (map4 == null) {
            C8632dsu.d("");
            map4 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map5 = map4.get(InteractiveAnimation.States.display);
        if (map5 != null) {
            hashMap.putAll(map5);
        }
        Iterator<T> it2 = this.a.iterator();
        while (it2.hasNext()) {
            Map map6 = (Map) it2.next();
            if (map6 != null && (map = (Map) map6.get(InteractiveAnimation.States.display)) != null) {
                hashMap.putAll(map);
            }
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void e(cCK cck) {
        Map map;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            if (map2 != null && (map = (Map) map2.get(InteractiveAnimation.States.showLeftPointsEarned)) != null) {
                hashMap.putAll(map);
            }
        }
        c((Map<String, Map<String, List<InteractiveAnimation>>>) hashMap, cck, true);
    }

    public final void c(cCK cck) {
        Map map;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            if (map2 != null && (map = (Map) map2.get(InteractiveAnimation.States.showRightPointsEarned)) != null) {
                hashMap.putAll(map);
            }
        }
        c((Map<String, Map<String, List<InteractiveAnimation>>>) hashMap, cck, true);
    }

    public final void d(cCK cck) {
        Map map;
        Map map2;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map3 = (Map) it.next();
            if (map3 != null && (map2 = (Map) map3.get(InteractiveAnimation.States.dismissTimeoutFallbackTutorial)) != null) {
                hashMap.putAll(map2);
            }
        }
        Iterator<T> it2 = this.a.iterator();
        while (it2.hasNext()) {
            Map map4 = (Map) it2.next();
            if (map4 != null && (map = (Map) map4.get(InteractiveAnimation.States.dismissNonSelectedImmediate)) != null) {
                hashMap.putAll(map);
            }
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void b(boolean z, cCK cck) {
        b.getLogTag();
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map = null;
        if (z) {
            Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map2 = this.j;
            if (map2 == null) {
                C8632dsu.d("");
            } else {
                map = map2;
            }
            Map<String, Map<String, List<InteractiveAnimation>>> map3 = map.get("init");
            if (map3 != null) {
                e(this, map3, cck, false, 4, null);
                return;
            }
            return;
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map4 = this.j;
        if (map4 == null) {
            C8632dsu.d("");
            map4 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map5 = map4.get(InteractiveAnimation.States.hide);
        if (map5 == null) {
            Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map6 = this.j;
            if (map6 == null) {
                C8632dsu.d("");
            } else {
                map = map6;
            }
            map5 = map.get(InteractiveAnimation.States.dismissTimeout);
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map7 = map5;
        if (map7 != null) {
            e(this, map7, cck, false, 4, null);
        }
    }

    public final void d(List<Choice> list, cCK cck) {
        Choice choice;
        Map map;
        Map map2;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map3 = (Map) it.next();
            if (map3 != null && (map2 = (Map) map3.get(InteractiveAnimation.States.filterInChoice)) != null) {
                hashMap.putAll(map2);
            }
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map4 = this.j;
        if (map4 == null) {
            C8632dsu.d("");
            map4 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map5 = map4.get(InteractiveAnimation.States.filterInChoice);
        if (map5 != null) {
            hashMap.putAll(map5);
        }
        int i = 0;
        for (Object obj : this.a) {
            if (i < 0) {
                C8569dql.h();
            }
            Map map6 = (Map) obj;
            if (i < (list != null ? list.size() : 0) && list != null && (choice = list.get(i)) != null && choice.isEnabled && map6 != null && (map = (Map) map6.get(InteractiveAnimation.States.filterInChoice)) != null) {
                hashMap.putAll(map);
            }
            i++;
        }
        e(this, hashMap, cck, false, 4, null);
    }

    public final void d(int i, List<Choice> list, cCK cck) {
        Choice choice;
        Map map;
        b.getLogTag();
        HashMap hashMap = new HashMap();
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            if (map2 != null && (map = (Map) map2.get(InteractiveAnimation.States.filterSelectedOutChoice)) != null) {
                hashMap.putAll(map);
            }
        }
        Map<String, Map<String, Map<String, List<InteractiveAnimation>>>> map3 = this.j;
        if (map3 == null) {
            C8632dsu.d("");
            map3 = null;
        }
        Map<String, Map<String, List<InteractiveAnimation>>> map4 = map3.get(InteractiveAnimation.States.filterSelectedOutChoice);
        if (map4 != null) {
            hashMap.putAll(map4);
        }
        int i2 = 0;
        for (Object obj : this.a) {
            if (i2 < 0) {
                C8569dql.h();
            }
            Map map5 = (Map) obj;
            if (i2 < (list != null ? list.size() : 0) && list != null && (choice = list.get(i2)) != null && choice.isEnabled && map5 != null) {
                Map map6 = (Map) map5.get(i2 == i ? InteractiveAnimation.States.filterSelectedOutChoice : InteractiveAnimation.States.filterNonSelectedOutChoice);
                if (map6 != null) {
                    hashMap.putAll(map6);
                }
            }
            i2++;
        }
        e(this, hashMap, cck, false, 4, null);
    }
}
