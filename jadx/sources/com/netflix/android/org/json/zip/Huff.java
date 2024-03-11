package com.netflix.android.org.json.zip;

import com.netflix.android.org.json.JSONException;

/* loaded from: classes5.dex */
public class Huff implements None, PostMortem {
    private final int domain;
    private final Symbol[] symbols;
    private Symbol table;
    private boolean upToDate = false;
    private int width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class Symbol implements PostMortem {
        public final int integer;
        public long weight = 0;
        public Symbol next = null;
        public Symbol back = null;
        public Symbol one = null;
        public Symbol zero = null;

        public Symbol(int i) {
            this.integer = i;
        }

        @Override // com.netflix.android.org.json.zip.PostMortem
        public boolean postMortem(PostMortem postMortem) {
            Symbol symbol = (Symbol) postMortem;
            if (this.integer == symbol.integer && this.weight == symbol.weight) {
                boolean z = true;
                if ((this.back != null) != (symbol.back != null)) {
                    return false;
                }
                Symbol symbol2 = this.zero;
                Symbol symbol3 = this.one;
                if (symbol2 == null) {
                    if (symbol.zero != null) {
                        return false;
                    }
                } else {
                    z = symbol2.postMortem(symbol.zero);
                }
                if (symbol3 == null) {
                    if (symbol.one != null) {
                        return false;
                    }
                    return z;
                }
                return symbol3.postMortem(symbol.one);
            }
            return false;
        }
    }

    public Huff(int i) {
        this.domain = i;
        int i2 = (i * 2) - 1;
        this.symbols = new Symbol[i2];
        for (int i3 = 0; i3 < i; i3++) {
            this.symbols[i3] = new Symbol(i3);
        }
        while (i < i2) {
            this.symbols[i] = new Symbol(-1);
            i++;
        }
    }

    public void generate() {
        int i;
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        if (this.upToDate) {
            return;
        }
        Symbol symbol5 = this.symbols[0];
        this.table = null;
        symbol5.next = null;
        Symbol symbol6 = symbol5;
        int i2 = 1;
        while (true) {
            i = this.domain;
            if (i2 >= i) {
                break;
            }
            Symbol symbol7 = this.symbols[i2];
            long j = symbol7.weight;
            if (j < symbol5.weight) {
                symbol7.next = symbol5;
                symbol5 = symbol7;
            } else {
                if (j < symbol6.weight) {
                    symbol6 = symbol5;
                }
                while (true) {
                    symbol4 = symbol6.next;
                    if (symbol4 == null || symbol7.weight < symbol4.weight) {
                        break;
                    }
                    symbol6 = symbol4;
                }
                symbol7.next = symbol4;
                symbol6.next = symbol7;
                symbol6 = symbol7;
            }
            i2++;
        }
        while (true) {
            Symbol symbol8 = symbol5;
            while (true) {
                Symbol symbol9 = symbol5.next;
                symbol = symbol9.next;
                symbol2 = this.symbols[i];
                i++;
                long j2 = symbol5.weight + symbol9.weight;
                symbol2.weight = j2;
                symbol2.zero = symbol5;
                symbol2.one = symbol9;
                symbol2.back = null;
                symbol5.back = symbol2;
                symbol9.back = symbol2;
                if (symbol == null) {
                    this.table = symbol2;
                    this.upToDate = true;
                    return;
                } else if (j2 < symbol.weight) {
                    break;
                } else {
                    while (true) {
                        symbol3 = symbol8.next;
                        if (symbol3 != null && symbol2.weight >= symbol3.weight) {
                            symbol8 = symbol3;
                        }
                    }
                    symbol2.next = symbol3;
                    symbol8.next = symbol2;
                    symbol5 = symbol;
                    symbol8 = symbol2;
                }
            }
            symbol2.next = symbol;
            symbol5 = symbol2;
        }
    }

    private boolean postMortem(int i) {
        int i2;
        int[] iArr = new int[this.domain];
        Symbol symbol = this.symbols[i];
        if (symbol.integer != i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            Symbol symbol2 = symbol.back;
            if (symbol2 == null) {
                Symbol symbol3 = this.table;
                if (symbol != symbol3) {
                    return false;
                }
                this.width = 0;
                while (true) {
                    i2 = symbol3.integer;
                    if (i2 != -1) {
                        break;
                    }
                    i3--;
                    symbol3 = iArr[i3] != 0 ? symbol3.one : symbol3.zero;
                }
                return i2 == i && i3 == 0;
            }
            if (symbol2.zero == symbol) {
                iArr[i3] = 0;
            } else if (symbol2.one != symbol) {
                return false;
            } else {
                iArr[i3] = 1;
            }
            i3++;
            symbol = symbol2;
        }
    }

    @Override // com.netflix.android.org.json.zip.PostMortem
    public boolean postMortem(PostMortem postMortem) {
        for (int i = 0; i < this.domain; i++) {
            if (!postMortem(i)) {
                JSONzip.log("\nBad huff ");
                JSONzip.logchar(i, i);
                return false;
            }
        }
        return this.table.postMortem(((Huff) postMortem).table);
    }

    public int read(BitReader bitReader) {
        try {
            this.width = 0;
            Symbol symbol = this.table;
            while (true) {
                int i = symbol.integer;
                if (i == -1) {
                    this.width++;
                    symbol = bitReader.bit() ? symbol.one : symbol.zero;
                } else {
                    tick(i);
                    return symbol.integer;
                }
            }
        } catch (Throwable th) {
            throw new JSONException(th);
        }
    }

    public void tick(int i) {
        this.symbols[i].weight++;
        this.upToDate = false;
    }

    public void tick(int i, int i2) {
        while (i <= i2) {
            tick(i);
            i++;
        }
    }

    private void write(Symbol symbol, BitWriter bitWriter) {
        try {
            Symbol symbol2 = symbol.back;
            if (symbol2 != null) {
                this.width++;
                write(symbol2, bitWriter);
                if (symbol2.zero == symbol) {
                    bitWriter.zero();
                } else {
                    bitWriter.one();
                }
            }
        } catch (Throwable th) {
            throw new JSONException(th);
        }
    }

    public void write(int i, BitWriter bitWriter) {
        this.width = 0;
        write(this.symbols[i], bitWriter);
        tick(i);
    }
}
