package annexed_genitive3;

import phraser.Word;

public class AnnGen2 extends Word {

    String annexed;
    String genitive;

    public AnnGen2(Word w) {
        annexed = w.stemyNodiac;
        genitive = w.encVal;

    }

    public AnnGen2(Word w1, Word w2) {
        annexed = w1.stemyNodiac;
        genitive = w2.stemyNodiac;

    }

    String getAnnexed() {
        return this.annexed;
    }

    String getGenitive() {
        return this.genitive;
    }

    @Override
    public String toString() {
        return this.annexed + " : " + this.genitive;
    }
}
