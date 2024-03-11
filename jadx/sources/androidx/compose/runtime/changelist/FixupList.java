package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import kotlin.KotlinNothingValueException;
import o.C8632dsu;
import o.dpR;
import o.drO;
import o.drX;
import o.dsH;

/* loaded from: classes.dex */
public final class FixupList {
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (this.pendingOperations.isEmpty()) {
            this.operations.executeAndFlushAllPendingOperations(applier, slotWriter, rememberManager);
        } else {
            ComposerKt.composeRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void createAndInsertNode(drO<? extends Object> dro, int i, Anchor anchor) {
        int i2;
        Operations operations;
        Operations operations2 = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations2.pushOp(insertNodeFixup);
        Operations m1036constructorimpl = Operations.WriteScope.m1036constructorimpl(operations2);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(0), dro);
        Operations.WriteScope.m1040setIntA6tL2VI(m1036constructorimpl, Operation.IntParameter.m1018constructorimpl(0), i);
        Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl, Operation.ObjectParameter.m1024constructorimpl(1), anchor);
        if (Operations.access$getPushedIntMask$p(operations2) == Operations.access$createExpectedArgMask(operations2, insertNodeFixup.getInts()) && Operations.access$getPushedObjectMask$p(operations2) == Operations.access$createExpectedArgMask(operations2, insertNodeFixup.getObjects())) {
            Operations operations3 = this.pendingOperations;
            Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
            operations3.pushOp(postInsertNodeFixup);
            Operations m1036constructorimpl2 = Operations.WriteScope.m1036constructorimpl(operations3);
            Operations.WriteScope.m1040setIntA6tL2VI(m1036constructorimpl2, Operation.IntParameter.m1018constructorimpl(0), i);
            Operations.WriteScope.m1041setObjectDKhxnng(m1036constructorimpl2, Operation.ObjectParameter.m1024constructorimpl(0), anchor);
            if (Operations.access$getPushedIntMask$p(operations3) == Operations.access$createExpectedArgMask(operations3, postInsertNodeFixup.getInts()) && Operations.access$getPushedObjectMask$p(operations3) == Operations.access$createExpectedArgMask(operations3, postInsertNodeFixup.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = postInsertNodeFixup.getInts();
            int i3 = 0;
            for (int i4 = 0; i4 < ints; i4++) {
                if (((1 << i4) & Operations.access$getPushedIntMask$p(operations3)) != 0) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(postInsertNodeFixup.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i4)));
                    i3++;
                }
            }
            String sb2 = sb.toString();
            C8632dsu.a(sb2, "");
            StringBuilder sb3 = new StringBuilder();
            int objects = postInsertNodeFixup.getObjects();
            int i5 = 0;
            int i6 = 0;
            while (i6 < objects) {
                if (((1 << i6) & Operations.access$getPushedObjectMask$p(operations3)) != 0) {
                    if (i3 > 0) {
                        sb3.append(", ");
                    }
                    operations = operations3;
                    sb3.append(postInsertNodeFixup.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i6)));
                    i5++;
                } else {
                    operations = operations3;
                }
                i6++;
                operations3 = operations;
            }
            String sb4 = sb3.toString();
            C8632dsu.a(sb4, "");
            throw new IllegalStateException(("Error while pushing " + postInsertNodeFixup + ". Not all arguments were provided. Missing " + i3 + " int arguments (" + sb2 + ") and " + i5 + " object arguments (" + sb4 + ").").toString());
        }
        StringBuilder sb5 = new StringBuilder();
        int ints2 = insertNodeFixup.getInts();
        int i7 = 0;
        for (int i8 = 0; i8 < ints2; i8++) {
            if ((Operations.access$getPushedIntMask$p(operations2) & (1 << i8)) != 0) {
                if (i7 > 0) {
                    sb5.append(", ");
                }
                sb5.append(insertNodeFixup.mo1016intParamNamew8GmfQM(Operation.IntParameter.m1018constructorimpl(i8)));
                i7++;
            }
        }
        String sb6 = sb5.toString();
        C8632dsu.a(sb6, "");
        StringBuilder sb7 = new StringBuilder();
        int objects2 = insertNodeFixup.getObjects();
        int i9 = 0;
        int i10 = 0;
        while (i9 < objects2) {
            if (((1 << i9) & Operations.access$getPushedObjectMask$p(operations2)) != 0) {
                if (i7 > 0) {
                    sb7.append(", ");
                }
                i2 = objects2;
                sb7.append(insertNodeFixup.mo1017objectParamName31yXWZQ(Operation.ObjectParameter.m1024constructorimpl(i9)));
                i10++;
            } else {
                i2 = objects2;
            }
            i9++;
            objects2 = i2;
        }
        String sb8 = sb7.toString();
        C8632dsu.a(sb8, "");
        throw new IllegalStateException(("Error while pushing " + insertNodeFixup + ". Not all arguments were provided. Missing " + i7 + " int arguments (" + sb6 + ") and " + i10 + " object arguments (" + sb8 + ").").toString());
    }

    public final void endNodeInsert() {
        if (this.pendingOperations.isNotEmpty()) {
            this.pendingOperations.popInto(this.operations);
        } else {
            ComposerKt.composeRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final <V, T> void updateNode(V v, drX<? super T, ? super V, dpR> drx) {
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
}
