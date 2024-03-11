package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.pushnotification.NotificationFactory;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drN;
import o.drO;
import o.drX;
import o.dsA;

/* loaded from: classes.dex */
public abstract class Operation {
    private final int ints;
    private final int objects;

    @drN
    /* loaded from: classes.dex */
    public static final class IntParameter {
        private final int offset;

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m1018constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m1019equalsimpl(int i, Object obj) {
            return (obj instanceof IntParameter) && i == ((IntParameter) obj).m1023unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m1020equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m1021hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m1022toStringimpl(int i) {
            return "IntParameter(offset=" + i + ')';
        }

        public boolean equals(Object obj) {
            return m1019equalsimpl(this.offset, obj);
        }

        public int hashCode() {
            return m1021hashCodeimpl(this.offset);
        }

        public String toString() {
            return m1022toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m1023unboximpl() {
            return this.offset;
        }
    }

    @drN
    /* loaded from: classes.dex */
    public static final class ObjectParameter<T> {
        private final int offset;

        /* renamed from: constructor-impl  reason: not valid java name */
        public static <T> int m1024constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m1025equalsimpl(int i, Object obj) {
            return (obj instanceof ObjectParameter) && i == ((ObjectParameter) obj).m1029unboximpl();
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m1026equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m1027hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m1028toStringimpl(int i) {
            return "ObjectParameter(offset=" + i + ')';
        }

        public boolean equals(Object obj) {
            return m1025equalsimpl(this.offset, obj);
        }

        public int hashCode() {
            return m1027hashCodeimpl(this.offset);
        }

        public String toString() {
            return m1028toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m1029unboximpl() {
            return this.offset;
        }
    }

    public /* synthetic */ Operation(int i, int i2, C8627dsp c8627dsp) {
        this(i, i2);
    }

    public abstract void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager);

    public final int getInts() {
        return this.ints;
    }

    public final int getObjects() {
        return this.objects;
    }

    private Operation(int i, int i2) {
        this.ints = i;
        this.objects = i2;
    }

    public /* synthetic */ Operation(int i, int i2, int i3, C8627dsp c8627dsp) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, null);
    }

    public final String getName() {
        String b = dsA.a(getClass()).b();
        return b == null ? "" : b;
    }

    /* renamed from: intParamName-w8GmfQM  reason: not valid java name */
    public String mo1016intParamNamew8GmfQM(int i) {
        return "IntParameter(" + i + ')';
    }

    /* renamed from: objectParamName-31yXWZQ  reason: not valid java name */
    public String mo1017objectParamName31yXWZQ(int i) {
        return "ObjectParameter(" + i + ')';
    }

    public String toString() {
        return getName();
    }

    /* loaded from: classes.dex */
    public static final class Ups extends Operation {
        public static final Ups INSTANCE = new Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo1016intParamNamew8GmfQM(int i) {
            return IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(0)) ? "count" : super.mo1016intParamNamew8GmfQM(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int mo1030getIntw8GmfQM = operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(0));
            for (int i = 0; i < mo1030getIntw8GmfQM; i++) {
                applier.up();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Downs extends Operation {
        public static final Downs INSTANCE = new Downs();

        private Downs() {
            super(0, 1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            C8632dsu.d(applier);
            for (Object obj : (Object[]) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0))) {
                applier.down(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "nodes" : super.mo1017objectParamName31yXWZQ(i);
        }
    }

    /* loaded from: classes.dex */
    public static final class AdvanceSlotsBy extends Operation {
        public static final AdvanceSlotsBy INSTANCE = new AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo1016intParamNamew8GmfQM(int i) {
            return IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(0)) ? "distance" : super.mo1016intParamNamew8GmfQM(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(0)));
        }
    }

    /* loaded from: classes.dex */
    public static final class SideEffect extends Operation {
        public static final SideEffect INSTANCE = new SideEffect();

        private SideEffect() {
            super(0, 1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "effect" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.sideEffect((drO) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0)));
        }
    }

    /* loaded from: classes.dex */
    public static final class Remember extends Operation {
        public static final Remember INSTANCE = new Remember();

        private Remember() {
            super(0, 1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "value" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            rememberManager.remembering((RememberObserver) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0)));
        }
    }

    /* loaded from: classes.dex */
    public static final class UpdateValue extends Operation {
        public static final UpdateValue INSTANCE = new UpdateValue();

        private UpdateValue() {
            super(1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo1016intParamNamew8GmfQM(int i) {
            return IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(0)) ? "groupSlotIndex" : super.mo1016intParamNamew8GmfQM(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "value" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object mo1031getObject31yXWZQ = operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0));
            int mo1030getIntw8GmfQM = operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(0));
            if (mo1031getObject31yXWZQ instanceof RememberObserverHolder) {
                rememberManager.remembering(((RememberObserverHolder) mo1031getObject31yXWZQ).getWrapped());
            }
            Object obj = slotWriter.set(mo1030getIntw8GmfQM, mo1031getObject31yXWZQ);
            if (obj instanceof RememberObserverHolder) {
                rememberManager.forgetting(((RememberObserverHolder) obj).getWrapped());
            } else if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class UpdateAuxData extends Operation {
        public static final UpdateAuxData INSTANCE = new UpdateAuxData();

        private UpdateAuxData() {
            super(0, 1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? NotificationFactory.DATA : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0)));
        }
    }

    /* loaded from: classes.dex */
    public static final class EnsureRootGroupStarted extends Operation {
        public static final EnsureRootGroupStarted INSTANCE = new EnsureRootGroupStarted();

        private EnsureRootGroupStarted() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    /* loaded from: classes.dex */
    public static final class EnsureGroupStarted extends Operation {
        public static final EnsureGroupStarted INSTANCE = new EnsureGroupStarted();

        private EnsureGroupStarted() {
            super(0, 1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "anchor" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.ensureStarted((Anchor) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0)));
        }
    }

    /* loaded from: classes.dex */
    public static final class RemoveCurrentGroup extends Operation {
        public static final RemoveCurrentGroup INSTANCE = new RemoveCurrentGroup();

        private RemoveCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* loaded from: classes.dex */
    public static final class MoveCurrentGroup extends Operation {
        public static final MoveCurrentGroup INSTANCE = new MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo1016intParamNamew8GmfQM(int i) {
            return IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(0)) ? "offset" : super.mo1016intParamNamew8GmfQM(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(0)));
        }
    }

    /* loaded from: classes.dex */
    public static final class EndCurrentGroup extends Operation {
        public static final EndCurrentGroup INSTANCE = new EndCurrentGroup();

        private EndCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    /* loaded from: classes.dex */
    public static final class SkipToEndOfCurrentGroup extends Operation {
        public static final SkipToEndOfCurrentGroup INSTANCE = new SkipToEndOfCurrentGroup();

        private SkipToEndOfCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* loaded from: classes.dex */
    public static final class EndCompositionScope extends Operation {
        public static final EndCompositionScope INSTANCE = new EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "anchor" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? "composition" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((drM) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0))).invoke((Composition) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1)));
        }
    }

    /* loaded from: classes.dex */
    public static final class UseCurrentNode extends Operation {
        public static final UseCurrentNode INSTANCE = new UseCurrentNode();

        private UseCurrentNode() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object current = applier.getCurrent();
            C8632dsu.d(current);
            ((ComposeNodeLifecycleCallback) current).onReuse();
        }
    }

    /* loaded from: classes.dex */
    public static final class UpdateNode extends Operation {
        public static final UpdateNode INSTANCE = new UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "value" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? "block" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ((drX) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1))).invoke(applier.getCurrent(), operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0)));
        }
    }

    /* loaded from: classes.dex */
    public static final class RemoveNode extends Operation {
        public static final RemoveNode INSTANCE = new RemoveNode();

        private RemoveNode() {
            super(2, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo1016intParamNamew8GmfQM(int i) {
            return IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(0)) ? "removeIndex" : IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(1)) ? "count" : super.mo1016intParamNamew8GmfQM(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.remove(operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(0)), operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(1)));
        }
    }

    /* loaded from: classes.dex */
    public static final class MoveNode extends Operation {
        public static final MoveNode INSTANCE = new MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo1016intParamNamew8GmfQM(int i) {
            return IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(0)) ? NetflixActivity.EXTRA_FROM : IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(1)) ? "to" : IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(2)) ? "count" : super.mo1016intParamNamew8GmfQM(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            applier.move(operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(0)), operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(1)), operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(2)));
        }
    }

    /* loaded from: classes.dex */
    public static final class InsertSlots extends Operation {
        public static final InsertSlots INSTANCE = new InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "anchor" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? NetflixActivity.EXTRA_FROM : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, ((Anchor) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0))).toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }
    }

    /* loaded from: classes.dex */
    public static final class InsertSlotsWithFixups extends Operation {
        public static final InsertSlotsWithFixups INSTANCE = new InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "anchor" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? NetflixActivity.EXTRA_FROM : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(2)) ? "fixups" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            SlotTable slotTable = (SlotTable) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1));
            Anchor anchor = (Anchor) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0));
            FixupList fixupList = (FixupList) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(2));
            SlotWriter openWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, openWriter, rememberManager);
                dpR dpr = dpR.c;
                openWriter.close();
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (Throwable th) {
                openWriter.close();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class InsertNodeFixup extends Operation {
        public static final InsertNodeFixup INSTANCE = new InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo1016intParamNamew8GmfQM(int i) {
            return IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(0)) ? "insertIndex" : super.mo1016intParamNamew8GmfQM(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "factory" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? "groupAnchor" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            Object invoke = ((drO) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0))).invoke();
            int mo1030getIntw8GmfQM = operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(0));
            C8632dsu.d(applier);
            slotWriter.updateNode((Anchor) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1)), invoke);
            applier.insertTopDown(mo1030getIntw8GmfQM, invoke);
            applier.down(invoke);
        }
    }

    /* loaded from: classes.dex */
    public static final class PostInsertNodeFixup extends Operation {
        public static final PostInsertNodeFixup INSTANCE = new PostInsertNodeFixup();

        private PostInsertNodeFixup() {
            super(1, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public String mo1016intParamNamew8GmfQM(int i) {
            return IntParameter.m1020equalsimpl0(i, IntParameter.m1018constructorimpl(0)) ? "insertIndex" : super.mo1016intParamNamew8GmfQM(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "groupAnchor" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int mo1030getIntw8GmfQM = operationArgContainer.mo1030getIntw8GmfQM(IntParameter.m1018constructorimpl(0));
            applier.up();
            C8632dsu.d(applier);
            applier.insertBottomUp(mo1030getIntw8GmfQM, slotWriter.node((Anchor) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0))));
        }
    }

    /* loaded from: classes.dex */
    public static final class DeactivateCurrentGroup extends Operation {
        public static final DeactivateCurrentGroup INSTANCE = new DeactivateCurrentGroup();

        private DeactivateCurrentGroup() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* loaded from: classes.dex */
    public static final class ResetSlots extends Operation {
        public static final ResetSlots INSTANCE = new ResetSlots();

        private ResetSlots() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    /* loaded from: classes.dex */
    public static final class DetermineMovableContentNodeIndex extends Operation {
        public static final DetermineMovableContentNodeIndex INSTANCE = new DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "effectiveNodeIndexOut" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? "anchor" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int positionToInsert;
            C8632dsu.d(applier);
            positionToInsert = OperationKt.positionToInsert(slotWriter, (Anchor) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1)), applier);
            ((IntRef) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0))).setElement(positionToInsert);
        }
    }

    /* loaded from: classes.dex */
    public static final class CopyNodesToNewAnchorLocation extends Operation {
        public static final CopyNodesToNewAnchorLocation INSTANCE = new CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "effectiveNodeIndex" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? "nodes" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            int element = ((IntRef) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0))).getElement();
            List list = (List) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                C8632dsu.d(applier);
                int i2 = element + i;
                applier.insertBottomUp(i2, obj);
                applier.insertTopDown(i2, obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class CopySlotTableToAnchorLocation extends Operation {
        public static final CopySlotTableToAnchorLocation INSTANCE = new CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "resolvedState" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? "resolvedCompositionContext" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(2)) ? NetflixActivity.EXTRA_FROM : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(3)) ? "to" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            MovableContentStateReference movableContentStateReference = (MovableContentStateReference) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(2));
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(3));
            CompositionContext compositionContext = (CompositionContext) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1));
            MovableContentState movableContentState = (MovableContentState) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0));
            if (movableContentState == null && (movableContentState = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<Anchor> moveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentState.getSlotTable$runtime_release(), 2);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            ControlledComposition composition$runtime_release = movableContentStateReference2.getComposition$runtime_release();
            C8632dsu.d(composition$runtime_release);
            companion.adoptAnchoredScopes$runtime_release(slotWriter, moveIntoGroupFrom, (RecomposeScopeOwner) composition$runtime_release);
        }
    }

    /* loaded from: classes.dex */
    public static final class EndMovableContentPlacement extends Operation {
        public static final EndMovableContentPlacement INSTANCE = new EndMovableContentPlacement();

        private EndMovableContentPlacement() {
            super(0, 0, 3, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            C8632dsu.d(applier);
            OperationKt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* loaded from: classes.dex */
    public static final class ReleaseMovableGroupAtCurrent extends Operation {
        public static final ReleaseMovableGroupAtCurrent INSTANCE = new ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "composition" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? "parentCompositionContext" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(2)) ? "reference" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            OperationKt.releaseMovableGroupAtCurrent((ControlledComposition) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0)), (CompositionContext) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1)), (MovableContentStateReference) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(2)), slotWriter);
        }
    }

    /* loaded from: classes.dex */
    public static final class ApplyChangeList extends Operation {
        public static final ApplyChangeList INSTANCE = new ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public String mo1017objectParamName31yXWZQ(int i) {
            return ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(0)) ? "changes" : ObjectParameter.m1026equalsimpl0(i, ObjectParameter.m1024constructorimpl(1)) ? "effectiveNodeIndex" : super.mo1017objectParamName31yXWZQ(i);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(OperationArgContainer operationArgContainer, Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
            IntRef intRef = (IntRef) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            ChangeList changeList = (ChangeList) operationArgContainer.mo1031getObject31yXWZQ(ObjectParameter.m1024constructorimpl(0));
            if (element > 0) {
                applier = new OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }
    }
}
