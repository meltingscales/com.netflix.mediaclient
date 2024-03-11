package org.intellij.markdown.parser.markerblocks;

import o.C8627dsp;
import o.C8632dsu;
import org.intellij.markdown.IElementType;
import org.intellij.markdown.parser.LookaheadText;
import org.intellij.markdown.parser.ProductionHolder;
import org.intellij.markdown.parser.constraints.MarkdownConstraints;

/* loaded from: classes5.dex */
public interface MarkerBlock {

    /* loaded from: classes5.dex */
    public enum EventAction {
        PROPAGATE,
        CANCEL
    }

    boolean acceptAction(ClosingAction closingAction);

    boolean allowsSubBlocks();

    MarkdownConstraints getBlockConstraints();

    int getNextInterestingOffset(LookaheadText.Position position);

    boolean isInterestingOffset(LookaheadText.Position position);

    ProcessingResult processToken(LookaheadText.Position position, MarkdownConstraints markdownConstraints);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final abstract class ClosingAction {
        public static final ClosingAction DONE = new DONE("DONE", 0);
        public static final ClosingAction DROP = new DROP("DROP", 1);
        public static final ClosingAction DEFAULT = new DEFAULT("DEFAULT", 2);
        public static final ClosingAction NOTHING = new NOTHING("NOTHING", 3);
        private static final /* synthetic */ ClosingAction[] $VALUES = $values();

        private static final /* synthetic */ ClosingAction[] $values() {
            return new ClosingAction[]{DONE, DROP, DEFAULT, NOTHING};
        }

        public /* synthetic */ ClosingAction(String str, int i, C8627dsp c8627dsp) {
            this(str, i);
        }

        public static ClosingAction valueOf(String str) {
            return (ClosingAction) Enum.valueOf(ClosingAction.class, str);
        }

        public static ClosingAction[] values() {
            return (ClosingAction[]) $VALUES.clone();
        }

        public abstract void doAction(ProductionHolder.Marker marker, IElementType iElementType);

        /* loaded from: classes5.dex */
        static final class DONE extends ClosingAction {
            DONE(String str, int i) {
                super(str, i, null);
            }

            @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock.ClosingAction
            public void doAction(ProductionHolder.Marker marker, IElementType iElementType) {
                C8632dsu.c((Object) marker, "");
                C8632dsu.c((Object) iElementType, "");
                marker.done(iElementType);
            }
        }

        private ClosingAction(String str, int i) {
        }

        /* loaded from: classes5.dex */
        static final class DROP extends ClosingAction {
            @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock.ClosingAction
            public void doAction(ProductionHolder.Marker marker, IElementType iElementType) {
                C8632dsu.c((Object) marker, "");
                C8632dsu.c((Object) iElementType, "");
            }

            DROP(String str, int i) {
                super(str, i, null);
            }
        }

        /* loaded from: classes5.dex */
        static final class DEFAULT extends ClosingAction {
            DEFAULT(String str, int i) {
                super(str, i, null);
            }

            @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock.ClosingAction
            public void doAction(ProductionHolder.Marker marker, IElementType iElementType) {
                C8632dsu.c((Object) marker, "");
                C8632dsu.c((Object) iElementType, "");
                throw new UnsupportedOperationException("Should not be invoked");
            }
        }

        /* loaded from: classes5.dex */
        static final class NOTHING extends ClosingAction {
            @Override // org.intellij.markdown.parser.markerblocks.MarkerBlock.ClosingAction
            public void doAction(ProductionHolder.Marker marker, IElementType iElementType) {
                C8632dsu.c((Object) marker, "");
                C8632dsu.c((Object) iElementType, "");
            }

            NOTHING(String str, int i) {
                super(str, i, null);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class ProcessingResult {
        private static final ProcessingResult CANCEL;
        public static final Companion Companion = new Companion(null);
        private static final ProcessingResult DEFAULT;
        private static final ProcessingResult PASS;
        private final ClosingAction childrenAction;
        private final EventAction eventAction;
        private final ClosingAction selfAction;

        public final ClosingAction getChildrenAction() {
            return this.childrenAction;
        }

        public final EventAction getEventAction() {
            return this.eventAction;
        }

        public final ClosingAction getSelfAction() {
            return this.selfAction;
        }

        public ProcessingResult(ClosingAction closingAction, ClosingAction closingAction2, EventAction eventAction) {
            C8632dsu.c((Object) closingAction, "");
            C8632dsu.c((Object) closingAction2, "");
            C8632dsu.c((Object) eventAction, "");
            this.childrenAction = closingAction;
            this.selfAction = closingAction2;
            this.eventAction = eventAction;
        }

        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final ProcessingResult getPASS() {
                return ProcessingResult.PASS;
            }

            public final ProcessingResult getCANCEL() {
                return ProcessingResult.CANCEL;
            }

            public final ProcessingResult getDEFAULT() {
                return ProcessingResult.DEFAULT;
            }
        }

        static {
            ClosingAction closingAction = ClosingAction.NOTHING;
            EventAction eventAction = EventAction.PROPAGATE;
            PASS = new ProcessingResult(closingAction, closingAction, eventAction);
            CANCEL = new ProcessingResult(closingAction, closingAction, EventAction.CANCEL);
            DEFAULT = new ProcessingResult(ClosingAction.DEFAULT, ClosingAction.DONE, eventAction);
        }
    }
}
