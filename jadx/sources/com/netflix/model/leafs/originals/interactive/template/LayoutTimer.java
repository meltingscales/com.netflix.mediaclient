package com.netflix.model.leafs.originals.interactive.template;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.netflix.model.leafs.originals.interactive.ImageAssetId;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_LayoutTimer;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_LayoutTimer_SpriteSheetTimer;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_LayoutTimer_TimerChildren;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_LayoutTimer_TimerChildren_TimerBar;
import com.netflix.model.leafs.originals.interactive.template.C$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class LayoutTimer extends Element {
    public abstract TimerChildren children();

    public abstract Integer maxSecondsForCountdown();

    public abstract SpriteSheetTimer spritesheet();

    public LayoutTimer merge(LayoutTimer layoutTimer) {
        if (layoutTimer == null) {
            return this;
        }
        return new AutoValue_LayoutTimer(id() == null ? layoutTimer.id() : id(), type() == null ? layoutTimer.type() : type(), styleId() == null ? layoutTimer.styleId() : styleId(), mergeVisualStateTransition(layoutTimer.visualStateTransitions()), mergeVisualStates(layoutTimer.visualStates()), children() == null ? layoutTimer.children() : children().merge(layoutTimer.children()), spritesheet() == null ? layoutTimer.spritesheet() : spritesheet().merge(layoutTimer.spritesheet()), maxSecondsForCountdown() == null ? layoutTimer.maxSecondsForCountdown() : maxSecondsForCountdown());
    }

    @Override // com.netflix.model.leafs.originals.interactive.template.Element
    public List<Element> elementChildList() {
        ArrayList arrayList = new ArrayList(4);
        TimerChildren children = children();
        if (children != null) {
            Element[] elementArr = new Element[6];
            elementArr[0] = children;
            elementArr[1] = children.background();
            elementArr[2] = children.fillContainer();
            elementArr[3] = children.fillContainer() == null ? null : children.fillContainer().children();
            elementArr[4] = children.overlay();
            elementArr[5] = children.deviceIcon();
            Collections.addAll(arrayList, elementArr);
        }
        return arrayList;
    }

    /* loaded from: classes.dex */
    public static abstract class TimerChildren extends Element {
        public abstract ImageElement background();

        public abstract SimpleElement countdownLabel();

        public abstract ImageElement deviceIcon();

        public abstract TimerBar fillContainer();

        public abstract ImageElement overlay();

        public TimerChildren merge(TimerChildren timerChildren) {
            if (timerChildren == null) {
                return this;
            }
            return new AutoValue_LayoutTimer_TimerChildren(id() == null ? timerChildren.id() : id(), type() == null ? timerChildren.type() : type(), styleId() == null ? timerChildren.styleId() : styleId(), mergeVisualStateTransition(timerChildren.visualStateTransitions()), mergeVisualStates(timerChildren.visualStates()), background() == null ? timerChildren.background() : background().merge(timerChildren.background()), fillContainer() == null ? timerChildren.fillContainer() : fillContainer().merge(timerChildren.fillContainer()), overlay() == null ? timerChildren.overlay() : overlay().merge(timerChildren.overlay()), deviceIcon() == null ? timerChildren.deviceIcon() : deviceIcon().merge(timerChildren.deviceIcon()), countdownLabel() == null ? timerChildren.countdownLabel() : countdownLabel().merge(timerChildren.countdownLabel()));
        }

        /* loaded from: classes.dex */
        public static abstract class TimerBar extends Element {
            public abstract String assetId();

            public abstract TimerBarChildren children();

            @Override // com.netflix.model.leafs.originals.interactive.template.Element
            public List<Element> elementChildList() {
                ArrayList arrayList = new ArrayList(4);
                TimerBarChildren children = children();
                Collections.addAll(arrayList, children, children.fill(), children.leftCap(), children.rightCap());
                return arrayList;
            }

            public TimerBar merge(TimerBar timerBar) {
                if (timerBar == null) {
                    return this;
                }
                return new AutoValue_LayoutTimer_TimerChildren_TimerBar(id() == null ? timerBar.id() : id(), type() == null ? timerBar.type() : type(), styleId() == null ? timerBar.styleId() : styleId(), mergeVisualStateTransition(timerBar.visualStateTransitions()), mergeVisualStates(timerBar.visualStates()), assetId() == null ? timerBar.assetId() : assetId(), children() == null ? timerBar.children() : children().merge(timerBar.children()));
            }

            /* loaded from: classes.dex */
            public static abstract class TimerBarChildren extends Element {
                public abstract ImageElement fill();

                public abstract ImageElement leftCap();

                public abstract ImageElement rightCap();

                public static TypeAdapter<TimerBarChildren> typeAdapter(Gson gson) {
                    return new C$AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren.GsonTypeAdapter(gson);
                }

                public TimerBarChildren merge(TimerBarChildren timerBarChildren) {
                    if (timerBarChildren == null) {
                        return this;
                    }
                    return new AutoValue_LayoutTimer_TimerChildren_TimerBar_TimerBarChildren(id() == null ? timerBarChildren.id() : id(), type() == null ? timerBarChildren.type() : type(), styleId() == null ? timerBarChildren.styleId() : styleId(), mergeVisualStateTransition(timerBarChildren.visualStateTransitions()), mergeVisualStates(timerBarChildren.visualStates()), fill() == null ? timerBarChildren.fill() : fill().merge(timerBarChildren.fill()), leftCap() == null ? timerBarChildren.leftCap() : leftCap().merge(timerBarChildren.leftCap()), fill() == null ? timerBarChildren.fill() : fill().merge(timerBarChildren.fill()));
                }
            }

            public static TypeAdapter<TimerBar> typeAdapter(Gson gson) {
                return new C$AutoValue_LayoutTimer_TimerChildren_TimerBar.GsonTypeAdapter(gson);
            }
        }

        public static TypeAdapter<TimerChildren> typeAdapter(Gson gson) {
            return new C$AutoValue_LayoutTimer_TimerChildren.GsonTypeAdapter(gson);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class SpriteSheetTimer extends Element {
        public abstract ImageAssetId fail();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract ImageAssetId image();

        public abstract ImageAssetId pass();

        public abstract List<Integer> yOffsets();

        public String assetId() {
            ImageAssetId image = image();
            if (image == null) {
                return null;
            }
            return image.assetId();
        }

        public String failImageId() {
            ImageAssetId fail = fail();
            if (fail == null) {
                return null;
            }
            return fail.assetId();
        }

        public SpriteSheetTimer merge(SpriteSheetTimer spriteSheetTimer) {
            return new AutoValue_LayoutTimer_SpriteSheetTimer(id() == null ? spriteSheetTimer.id() : id(), type() == null ? spriteSheetTimer.type() : type(), styleId() == null ? spriteSheetTimer.styleId() : styleId(), mergeVisualStateTransition(spriteSheetTimer.visualStateTransitions()), mergeVisualStates(spriteSheetTimer.visualStates()), image() == null ? spriteSheetTimer.image() : image(), yOffsets() == null ? spriteSheetTimer.yOffsets() : yOffsets(), pass() == null ? spriteSheetTimer.pass() : pass(), fail() == null ? spriteSheetTimer.fail() : fail());
        }

        public static TypeAdapter<SpriteSheetTimer> typeAdapter(Gson gson) {
            return new C$AutoValue_LayoutTimer_SpriteSheetTimer.GsonTypeAdapter(gson);
        }
    }

    public static TypeAdapter<LayoutTimer> typeAdapter(Gson gson) {
        return new C$AutoValue_LayoutTimer.GsonTypeAdapter(gson);
    }
}
