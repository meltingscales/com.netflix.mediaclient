package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import java.util.List;
import o.C8632dsu;
import o.dpR;
import o.drM;
import o.drO;
import o.drX;
import o.dsH;

/* loaded from: classes.dex */
public final class ChangeList {
    private final Operations operations = new Operations();

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
    }

    public final void pushRemember(RememberObserver rememberObserver) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m1041setObjectDKhxnng(Operations.WriteScope.m1036constructorimpl(operations), Operation.ObjectParameter.m1024constructorimpl(0), rememberObserver);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, remember.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, remember.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = remember.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(remember.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = remember.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(remember.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + remember + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUpdateValue(Object obj, int i) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), obj);
        Operations.WriteScope.m1040setIntA6tL2VI(m1036constructorimpl, Operation.IntParameter.m1018constructorimpl(0), i);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateValue.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateValue.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(updateValue.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i3)));
                i2++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateValue.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateValue.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i5)));
                i4++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + updateValue + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + sb2 + ") and " + i4 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(Object obj) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m1041setObjectDKhxnng(Operations.WriteScope.m1036constructorimpl(operations), Operation.ObjectParameter.m1024constructorimpl(0), obj);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateAuxData.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateAuxData.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateAuxData.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateAuxData.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateAuxData.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateAuxData.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + updateAuxData + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m1041setObjectDKhxnng(Operations.WriteScope.m1036constructorimpl(operations), Operation.ObjectParameter.m1024constructorimpl(0), anchor);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, ensureGroupStarted.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, ensureGroupStarted.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ensureGroupStarted.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(ensureGroupStarted.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = ensureGroupStarted.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(ensureGroupStarted.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + ensureGroupStarted + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable slotTable) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), anchor);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), slotTable);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, insertSlots.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, insertSlots.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlots.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlots.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = insertSlots.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlots.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + insertSlots + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable slotTable, FixupList fixupList) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), anchor);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), slotTable);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(2), fixupList);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, insertSlotsWithFixups.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, insertSlotsWithFixups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlotsWithFixups.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlotsWithFixups.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = insertSlotsWithFixups.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(insertSlotsWithFixups.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + insertSlotsWithFixups + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushMoveCurrentGroup(int i) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations.WriteScope.m1040setIntA6tL2VI(Operations.WriteScope.m1036constructorimpl(operations), Operation.IntParameter.m1018constructorimpl(0), i);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, moveCurrentGroup.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, moveCurrentGroup.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveCurrentGroup.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(moveCurrentGroup.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i3)));
                i2++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = moveCurrentGroup.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(moveCurrentGroup.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i5)));
                i4++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + moveCurrentGroup + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + sb2 + ") and " + i4 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEndCompositionScope(drM<? super Composition, dpR> drm, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), drm);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), composition);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, endCompositionScope.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, endCompositionScope.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = endCompositionScope.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(endCompositionScope.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = endCompositionScope.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(endCompositionScope.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + endCompositionScope + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUseNode(Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final <T, V> void pushUpdateNode(V v, drX<? super T, ? super V, dpR> drx) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), v);
        int m1024constructorimpl = Operation.ObjectParameter.m1024constructorimpl(1);
        C8632dsu.d(drx);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, m1024constructorimpl, (drX) dsH.a(drx, 2));
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateNode.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, updateNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateNode.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(updateNode.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = updateNode.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(updateNode.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + updateNode + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushRemoveNode(int i, int i2) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1040setIntA6tL2VI(m1036constructorimpl, Operation.IntParameter.m1018constructorimpl(0), i);
        Operations.WriteScope.m1040setIntA6tL2VI(m1036constructorimpl, Operation.IntParameter.m1018constructorimpl(1), i2);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, removeNode.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, removeNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = removeNode.getInts();
        int i3 = 0;
        for (int i4 = 0; i4 < ints; i4++) {
            if (((1 << i4) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append(removeNode.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i4)));
                i3++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = removeNode.getObjects();
        int i5 = 0;
        for (int i6 = 0; i6 < objects; i6++) {
            if (((1 << i6) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i3 > 0) {
                    sb3.append(", ");
                }
                sb3.append(removeNode.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i6)));
                i5++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + removeNode + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushMoveNode(int i, int i2, int i3) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1040setIntA6tL2VI(m1036constructorimpl, Operation.IntParameter.m1018constructorimpl(1), i);
        Operations.WriteScope.m1040setIntA6tL2VI(m1036constructorimpl, Operation.IntParameter.m1018constructorimpl(0), i2);
        Operations.WriteScope.m1040setIntA6tL2VI(m1036constructorimpl, Operation.IntParameter.m1018constructorimpl(2), i3);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, moveNode.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, moveNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveNode.getInts();
        int i4 = 0;
        for (int i5 = 0; i5 < ints; i5++) {
            if (((1 << i5) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(moveNode.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i5)));
                i4++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = moveNode.getObjects();
        int i6 = 0;
        for (int i7 = 0; i7 < objects; i7++) {
            if (((1 << i7) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i4 > 0) {
                    sb3.append(", ");
                }
                sb3.append(moveNode.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i7)));
                i6++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + moveNode + ". Not all arguments were provided. Missing " + i4 + " int arguments (" + sb2 + ") and " + i6 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushAdvanceSlotsBy(int i) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations.WriteScope.m1040setIntA6tL2VI(Operations.WriteScope.m1036constructorimpl(operations), Operation.IntParameter.m1018constructorimpl(0), i);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, advanceSlotsBy.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, advanceSlotsBy.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = advanceSlotsBy.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(advanceSlotsBy.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i3)));
                i2++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = advanceSlotsBy.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(advanceSlotsBy.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i5)));
                i4++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + advanceSlotsBy + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + sb2 + ") and " + i4 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushUps(int i) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations.WriteScope.m1040setIntA6tL2VI(Operations.WriteScope.m1036constructorimpl(operations), Operation.IntParameter.m1018constructorimpl(0), i);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, ups.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, ups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ups.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(ups.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i3)));
                i2++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = ups.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(ups.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i5)));
                i4++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + ups + ". Not all arguments were provided. Missing " + i2 + " int arguments (" + sb2 + ") and " + i4 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushDowns(Object[] objArr) {
        if (!(objArr.length == 0)) {
            Operations operations = this.operations;
            Operation.Downs downs = Operation.Downs.INSTANCE;
            operations.pushOp(downs);
            Operations.WriteScope.m1041setObjectDKhxnng(Operations.WriteScope.m1036constructorimpl(operations), Operation.ObjectParameter.m1024constructorimpl(0), objArr);
            if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, downs.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, downs.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = downs.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(downs.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                    i++;
                }
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            StringBuilder sb3 = new StringBuilder();
            int objects = downs.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(downs.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                    i3++;
                }
            }
            String sb4 = sb3.toString();
            C8632dsu.a(sb4, "");
            throw new IllegalStateException(("Error while pushing " + downs + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushSideEffect(drO<dpR> dro) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m1041setObjectDKhxnng(Operations.WriteScope.m1036constructorimpl(operations), Operation.ObjectParameter.m1024constructorimpl(0), dro);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, sideEffect.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, sideEffect.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = sideEffect.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(sideEffect.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = sideEffect.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(sideEffect.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + sideEffect + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef intRef, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), intRef);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), anchor);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, determineMovableContentNodeIndex.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, determineMovableContentNodeIndex.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = determineMovableContentNodeIndex.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(determineMovableContentNodeIndex.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = determineMovableContentNodeIndex.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(determineMovableContentNodeIndex.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + determineMovableContentNodeIndex + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> list, IntRef intRef) {
        if (!list.isEmpty()) {
            Operations operations = this.operations;
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            operations.pushOp(copyNodesToNewAnchorLocation);
            Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
            Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), list);
            Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), intRef);
            if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, copyNodesToNewAnchorLocation.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, copyNodesToNewAnchorLocation.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = copyNodesToNewAnchorLocation.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(copyNodesToNewAnchorLocation.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                    i++;
                }
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            StringBuilder sb3 = new StringBuilder();
            int objects = copyNodesToNewAnchorLocation.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(copyNodesToNewAnchorLocation.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                    i3++;
                }
            }
            String sb4 = sb3.toString();
            C8632dsu.a(sb4, "");
            throw new IllegalStateException(("Error while pushing " + copyNodesToNewAnchorLocation + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
        }
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState movableContentState, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), movableContentState);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), compositionContext);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(3), movableContentStateReference2);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(2), movableContentStateReference);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, copySlotTableToAnchorLocation.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, copySlotTableToAnchorLocation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = copySlotTableToAnchorLocation.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(copySlotTableToAnchorLocation.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = copySlotTableToAnchorLocation.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(copySlotTableToAnchorLocation.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + copySlotTableToAnchorLocation + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), controlledComposition);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), compositionContext);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(2), movableContentStateReference);
        if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, releaseMovableGroupAtCurrent.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, releaseMovableGroupAtCurrent.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = releaseMovableGroupAtCurrent.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(releaseMovableGroupAtCurrent.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                i++;
            }
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        StringBuilder sb3 = new StringBuilder();
        int objects = releaseMovableGroupAtCurrent.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append(releaseMovableGroupAtCurrent.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                i3++;
            }
        }
        String sb4 = sb3.toString();
        C8632dsu.a(sb4, "");
        throw new IllegalStateException(("Error while pushing " + releaseMovableGroupAtCurrent + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef intRef) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations);
            Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), changeList);
            Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), intRef);
            if (Operations.access$getPushedIntMask$p(operations) == Operations.access$createExpectedArgMask(operations, applyChangeList.getInts()) && Operations.access$getPushedObjectMask$p(operations) == Operations.access$createExpectedArgMask(operations, applyChangeList.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = applyChangeList.getInts();
            int i = 0;
            for (int i2 = 0; i2 < ints; i2++) {
                if (((1 << i2) & Operations.access$getPushedIntMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(applyChangeList.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i2)));
                    i++;
                }
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            StringBuilder sb3 = new StringBuilder();
            int objects = applyChangeList.getObjects();
            int i3 = 0;
            for (int i4 = 0; i4 < objects; i4++) {
                if (((1 << i4) & Operations.access$getPushedObjectMask$p(operations)) != 0) {
                    if (i > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(applyChangeList.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i4)));
                    i3++;
                }
            }
            String sb4 = sb3.toString();
            C8632dsu.a(sb4, "");
            throw new IllegalStateException(("Error while pushing " + applyChangeList + ". Not all arguments were provided. Missing " + i + " int arguments (" + sb2 + ") and " + i3 + " object arguments (" + sb4 + ").").toString());
        }
    }
}
