package com.netflix.android.org.json.zip;

import com.netflix.android.org.json.Kim;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class TrieKeep extends Keep {
    private int[] froms;
    private Kim[] kims;
    private Node root;
    private int[] thrus;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class Node implements PostMortem {
        private int integer = -1;
        private Node[] next = null;

        public Node() {
        }

        public Node get(int i) {
            Node[] nodeArr = this.next;
            if (nodeArr == null) {
                return null;
            }
            return nodeArr[i];
        }

        public Node get(byte b) {
            return get(b & 255);
        }

        @Override // com.netflix.android.org.json.zip.PostMortem
        public boolean postMortem(PostMortem postMortem) {
            Node node = (Node) postMortem;
            if (node == null) {
                JSONzip.log("\nMisalign");
                return false;
            } else if (this.integer != node.integer) {
                JSONzip.log("\nInteger " + this.integer + " <> " + node.integer);
                return false;
            } else if (this.next == null) {
                if (node.next == null) {
                    return true;
                }
                JSONzip.log("\nNext is null " + this.integer);
                return false;
            } else {
                for (int i = 0; i < 256; i++) {
                    Node node2 = this.next[i];
                    if (node2 != null) {
                        if (!node2.postMortem(node.next[i])) {
                            return false;
                        }
                    } else if (node.next[i] != null) {
                        JSONzip.log("\nMisalign " + i);
                        return false;
                    }
                }
                return true;
            }
        }

        public void set(int i, Node node) {
            if (this.next == null) {
                this.next = new Node[JSONzip.end];
            }
            this.next[i] = node;
        }

        public void set(byte b, Node node) {
            set(b & 255, node);
        }

        public Node vet(int i) {
            Node node = get(i);
            if (node == null) {
                Node node2 = new Node();
                set(i, node2);
                return node2;
            }
            return node;
        }

        public Node vet(byte b) {
            return vet(b & 255);
        }
    }

    public TrieKeep(int i) {
        super(i);
        int i2 = this.capacity;
        this.froms = new int[i2];
        this.thrus = new int[i2];
        this.kims = new Kim[i2];
        this.root = new Node();
    }

    public Kim kim(int i) {
        Kim kim = this.kims[i];
        int i2 = this.froms[i];
        int i3 = this.thrus[i];
        if (i2 == 0 && i3 == kim.length) {
            return kim;
        }
        Kim kim2 = new Kim(kim, i2, i3);
        this.froms[i] = 0;
        this.thrus[i] = kim2.length;
        this.kims[i] = kim2;
        return kim2;
    }

    public int length(int i) {
        return this.thrus[i] - this.froms[i];
    }

    public int match(Kim kim, int i, int i2) {
        Node node = this.root;
        int i3 = -1;
        while (i < i2) {
            node = node.get(kim.get(i));
            if (node == null) {
                break;
            }
            if (node.integer != -1) {
                i3 = node.integer;
            }
            i++;
        }
        return i3;
    }

    @Override // com.netflix.android.org.json.zip.PostMortem
    public boolean postMortem(PostMortem postMortem) {
        TrieKeep trieKeep = (TrieKeep) postMortem;
        if (this.length != trieKeep.length) {
            JSONzip.log("\nLength " + this.length + " <> " + trieKeep.length);
            return false;
        } else if (this.capacity != trieKeep.capacity) {
            JSONzip.log("\nCapacity " + this.capacity + " <> " + trieKeep.capacity);
            return false;
        } else {
            boolean z = true;
            for (int i = 0; i < this.length; i++) {
                Kim kim = kim(i);
                Kim kim2 = trieKeep.kim(i);
                if (!kim.equals(kim2)) {
                    JSONzip.log("\n[" + i + "] " + kim + " <> " + kim2);
                    z = false;
                }
            }
            return z && this.root.postMortem(trieKeep.root);
        }
    }

    public void registerMany(Kim kim) {
        int i = kim.length;
        int i2 = this.capacity - this.length;
        if (i2 > 40) {
            i2 = 40;
        }
        for (int i3 = 0; i3 < i - 2; i3++) {
            int i4 = i - i3;
            if (i4 > 10) {
                i4 = 10;
            }
            Node node = this.root;
            for (int i5 = i3; i5 < i4 + i3; i5++) {
                node = node.vet(kim.get(i5));
                if (node.integer == -1 && i5 - i3 >= 2) {
                    node.integer = this.length;
                    long[] jArr = this.uses;
                    int i6 = this.length;
                    jArr[i6] = 1;
                    this.kims[i6] = kim;
                    this.froms[i6] = i3;
                    this.thrus[i6] = i5 + 1;
                    this.length = i6 + 1;
                    i2--;
                    if (i2 <= 0) {
                        return;
                    }
                }
            }
        }
    }

    public void registerOne(Kim kim) {
        int registerOne = registerOne(kim, 0, kim.length);
        if (registerOne != -1) {
            this.kims[registerOne] = kim;
        }
    }

    public int registerOne(Kim kim, int i, int i2) {
        if (this.length < this.capacity) {
            Node node = this.root;
            for (int i3 = i; i3 < i2; i3++) {
                node = node.vet(kim.get(i3));
            }
            if (node.integer == -1) {
                int i4 = this.length;
                node.integer = i4;
                this.uses[i4] = 1;
                this.kims[i4] = kim;
                this.froms[i4] = i;
                this.thrus[i4] = i2;
                this.length++;
                return i4;
            }
        }
        return -1;
    }

    public void reserve() {
        int i;
        if (this.capacity - this.length < 40) {
            this.root = new Node();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = this.capacity;
                if (i2 >= i) {
                    break;
                }
                if (this.uses[i2] > 1) {
                    Kim kim = this.kims[i2];
                    int i4 = this.thrus[i2];
                    Node node = this.root;
                    for (int i5 = this.froms[i2]; i5 < i4; i5++) {
                        node = node.vet(kim.get(i5));
                    }
                    node.integer = i3;
                    long[] jArr = this.uses;
                    jArr[i3] = Keep.age(jArr[i2]);
                    int[] iArr = this.froms;
                    iArr[i3] = iArr[i2];
                    this.thrus[i3] = i4;
                    this.kims[i3] = kim;
                    i3++;
                }
                i2++;
            }
            if (i - i3 < 40) {
                this.power = 0;
                this.root = new Node();
                i3 = 0;
            }
            this.length = i3;
            while (i3 < this.capacity) {
                this.uses[i3] = 0;
                this.kims[i3] = null;
                this.froms[i3] = 0;
                this.thrus[i3] = 0;
                i3++;
            }
        }
    }

    @Override // com.netflix.android.org.json.zip.Keep
    public Object value(int i) {
        return kim(i);
    }
}
