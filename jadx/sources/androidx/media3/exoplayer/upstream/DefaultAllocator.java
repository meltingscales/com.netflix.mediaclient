package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class DefaultAllocator implements Allocator {
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    public DefaultAllocator(boolean z, int i) {
        this(z, i, 0);
    }

    public DefaultAllocator(boolean z, int i, int i2) {
        Assertions.checkArgument(i > 0);
        Assertions.checkArgument(i2 >= 0);
        this.trimOnReset = z;
        this.individualAllocationSize = i;
        this.availableCount = i2;
        this.availableAllocations = new Allocation[i2 + 100];
        if (i2 <= 0) {
            this.initialAllocationBlock = null;
            return;
        }
        this.initialAllocationBlock = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.availableAllocations[i3] = new Allocation(this.initialAllocationBlock, i3 * i);
        }
    }

    public void reset() {
        synchronized (this) {
            if (this.trimOnReset) {
                setTargetBufferSize(0);
            }
        }
    }

    public void setTargetBufferSize(int i) {
        synchronized (this) {
            boolean z = i < this.targetBufferSize;
            this.targetBufferSize = i;
            if (z) {
                trim();
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public Allocation allocate() {
        Allocation allocation;
        synchronized (this) {
            this.allocatedCount++;
            int i = this.availableCount;
            if (i > 0) {
                Allocation[] allocationArr = this.availableAllocations;
                int i2 = i - 1;
                this.availableCount = i2;
                allocation = (Allocation) Assertions.checkNotNull(allocationArr[i2]);
                this.availableAllocations[this.availableCount] = null;
            } else {
                allocation = new Allocation(new byte[this.individualAllocationSize], 0);
                int i3 = this.allocatedCount;
                Allocation[] allocationArr2 = this.availableAllocations;
                if (i3 > allocationArr2.length) {
                    this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
                }
            }
        }
        return allocation;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public void release(Allocation allocation) {
        synchronized (this) {
            Allocation[] allocationArr = this.availableAllocations;
            int i = this.availableCount;
            this.availableCount = i + 1;
            allocationArr[i] = allocation;
            this.allocatedCount--;
            notifyAll();
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public void release(Allocator.AllocationNode allocationNode) {
        synchronized (this) {
            while (allocationNode != null) {
                Allocation[] allocationArr = this.availableAllocations;
                int i = this.availableCount;
                this.availableCount = i + 1;
                allocationArr[i] = allocationNode.getAllocation();
                this.allocatedCount--;
                allocationNode = allocationNode.next();
            }
            notifyAll();
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public void trim() {
        synchronized (this) {
            int i = 0;
            int max = Math.max(0, Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
            int i2 = this.availableCount;
            if (max >= i2) {
                return;
            }
            if (this.initialAllocationBlock != null) {
                loop0: while (true) {
                    i2--;
                    while (i <= i2) {
                        Allocation allocation = (Allocation) Assertions.checkNotNull(this.availableAllocations[i]);
                        if (allocation.data != this.initialAllocationBlock) {
                            Allocation allocation2 = (Allocation) Assertions.checkNotNull(this.availableAllocations[i2]);
                            if (allocation2.data != this.initialAllocationBlock) {
                                break;
                            }
                            Allocation[] allocationArr = this.availableAllocations;
                            allocationArr[i] = allocation2;
                            allocationArr[i2] = allocation;
                            i2--;
                        }
                        i++;
                    }
                }
                max = Math.max(max, i);
                if (max >= this.availableCount) {
                    return;
                }
            }
            Arrays.fill(this.availableAllocations, max, this.availableCount, (Object) null);
            this.availableCount = max;
        }
    }

    public int getTotalBytesAllocated() {
        int i;
        int i2;
        synchronized (this) {
            i = this.allocatedCount;
            i2 = this.individualAllocationSize;
        }
        return i * i2;
    }
}
