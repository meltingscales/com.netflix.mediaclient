package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import o.C8564dqg;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.drN;

/* loaded from: classes.dex */
public final class Operations {
    private int intArgsSize;
    private int objectArgsSize;
    private int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private Operation[] opCodes = new Operation[16];
    private int[] intArgs = new int[16];
    private Object[] objectArgs = new Object[16];

    public final int createExpectedArgMask(int i) {
        if (i == 0) {
            return 0;
        }
        return (-1) >>> (32 - i);
    }

    public final int getSize() {
        return this.opCodesSize;
    }

    public static final /* synthetic */ int access$createExpectedArgMask(Operations operations, int i) {
        return operations.createExpectedArgMask(i);
    }

    public static final /* synthetic */ int access$getPushedIntMask$p(Operations operations) {
        return operations.pushedIntMask;
    }

    public static final /* synthetic */ int access$getPushedObjectMask$p(Operations operations) {
        return operations.pushedObjectMask;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        C8564dqg.d(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void pushOp(Operation operation) {
        int i;
        this.pushedIntMask = 0;
        this.pushedObjectMask = 0;
        int i2 = this.opCodesSize;
        if (i2 == this.opCodes.length) {
            i = C8657dts.i(i2, 1024);
            Object[] copyOf = Arrays.copyOf(this.opCodes, this.opCodesSize + i);
            C8632dsu.a(copyOf, "");
            this.opCodes = (Operation[]) copyOf;
        }
        ensureIntArgsSizeAtLeast(this.intArgsSize + operation.getInts());
        ensureObjectArgsSizeAtLeast(this.objectArgsSize + operation.getObjects());
        Operation[] operationArr = this.opCodes;
        int i3 = this.opCodesSize;
        this.opCodesSize = i3 + 1;
        operationArr[i3] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
    }

    private final int determineNewSize(int i, int i2) {
        int i3;
        int b;
        i3 = C8657dts.i(i, 1024);
        b = C8657dts.b(i + i3, i2);
        return b;
    }

    private final void ensureIntArgsSizeAtLeast(int i) {
        int[] iArr = this.intArgs;
        int length = iArr.length;
        if (i > length) {
            int[] copyOf = Arrays.copyOf(iArr, determineNewSize(length, i));
            C8632dsu.a(copyOf, "");
            this.intArgs = copyOf;
        }
    }

    private final void ensureObjectArgsSizeAtLeast(int i) {
        Object[] objArr = this.objectArgs;
        int length = objArr.length;
        if (i > length) {
            Object[] copyOf = Arrays.copyOf(objArr, determineNewSize(length, i));
            C8632dsu.a(copyOf, "");
            this.objectArgs = copyOf;
        }
    }

    public final void push(Operation operation) {
        if (operation.getInts() != 0 || operation.getObjects() != 0) {
            throw new IllegalArgumentException(("Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.").toString());
        }
        pushOp(operation);
    }

    public final void popInto(Operations operations) {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        Operation operation = operationArr[i];
        C8632dsu.d(operation);
        this.opCodes[this.opCodesSize] = null;
        operations.pushOp(operation);
        int i2 = this.objectArgsSize;
        int i3 = operations.objectArgsSize;
        int objects = operation.getObjects();
        for (int i4 = 0; i4 < objects; i4++) {
            i3--;
            i2--;
            Object[] objArr = operations.objectArgs;
            Object[] objArr2 = this.objectArgs;
            objArr[i3] = objArr2[i2];
            objArr2[i2] = null;
        }
        int i5 = this.intArgsSize;
        int i6 = operations.intArgsSize;
        int ints = operation.getInts();
        for (int i7 = 0; i7 < ints; i7++) {
            i6--;
            i5--;
            int[] iArr = operations.intArgs;
            int[] iArr2 = this.intArgs;
            iArr[i6] = iArr2[i5];
            iArr2[i5] = 0;
        }
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final Operation peekOperation() {
        Operation operation = this.opCodes[this.opCodesSize - 1];
        C8632dsu.d(operation);
        return operation;
    }

    /* renamed from: topIntIndexOf-w8GmfQM */
    public final int m1034topIntIndexOfw8GmfQM(int i) {
        return (this.intArgsSize - peekOperation().getInts()) + i;
    }

    /* renamed from: topObjectIndexOf-31yXWZQ */
    public final int m1035topObjectIndexOf31yXWZQ(int i) {
        return (this.objectArgsSize - peekOperation().getObjects()) + i;
    }

    @drN
    /* loaded from: classes.dex */
    public static final class WriteScope {
        private final Operations stack;

        /* renamed from: constructor-impl */
        public static Operations m1036constructorimpl(Operations operations) {
            return operations;
        }

        /* renamed from: equals-impl */
        public static boolean m1037equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && C8632dsu.c(operations, ((WriteScope) obj).m1043unboximpl());
        }

        /* renamed from: hashCode-impl */
        public static int m1039hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* renamed from: toString-impl */
        public static String m1042toStringimpl(Operations operations) {
            return "WriteScope(stack=" + operations + ')';
        }

        public boolean equals(Object obj) {
            return m1037equalsimpl(this.stack, obj);
        }

        public int hashCode() {
            return m1039hashCodeimpl(this.stack);
        }

        public String toString() {
            return m1042toStringimpl(this.stack);
        }

        /* renamed from: unbox-impl */
        public final /* synthetic */ Operations m1043unboximpl() {
            return this.stack;
        }

        /* renamed from: getOperation-impl */
        public static final Operation m1038getOperationimpl(Operations operations) {
            return operations.peekOperation();
        }

        /* renamed from: setInt-A6tL2VI */
        public static final void m1040setIntA6tL2VI(Operations operations, int i, int i2) {
            int i3 = 1 << i;
            if ((operations.pushedIntMask & i3) == 0) {
                operations.pushedIntMask = i3 | operations.pushedIntMask;
                operations.intArgs[operations.m1034topIntIndexOfw8GmfQM(i)] = i2;
                return;
            }
            throw new IllegalStateException(("Already pushed argument " + m1038getOperationimpl(operations).mo1016intParamNamew8GmfQM(i)).toString());
        }

        /* renamed from: setObject-DKhxnng */
        public static final <T> void m1041setObjectDKhxnng(Operations operations, int i, T t) {
            int i2 = 1 << i;
            if ((operations.pushedObjectMask & i2) == 0) {
                operations.pushedObjectMask = i2 | operations.pushedObjectMask;
                operations.objectArgs[operations.m1035topObjectIndexOf31yXWZQ(i)] = t;
                return;
            }
            throw new IllegalStateException(("Already pushed argument " + m1038getOperationimpl(operations).mo1017objectParamName31yXWZQ(i)).toString());
        }
    }

    /* loaded from: classes.dex */
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
            Operations.this = r1;
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx += operation.getInts();
            this.objIdx += operation.getObjects();
            int i = this.opIdx + 1;
            this.opIdx = i;
            return i < Operations.this.opCodesSize;
        }

        public final Operation getOperation() {
            Operation operation = Operations.this.opCodes[this.opIdx];
            C8632dsu.d(operation);
            return operation;
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getInt-w8GmfQM */
        public int mo1030getIntw8GmfQM(int i) {
            return Operations.this.intArgs[this.intIdx + i];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo1031getObject31yXWZQ(int i) {
            return (T) Operations.this.objectArgs[this.objIdx + i];
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public String toString() {
        return super.toString();
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slotWriter, rememberManager);
            } while (opIterator.next());
            clear();
        }
        clear();
    }
}
