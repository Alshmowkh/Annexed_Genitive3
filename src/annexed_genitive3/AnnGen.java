package annexed_genitive3;

import phraser.Word;

public class AnnGen {

    private int sentIndex;
    private String annexed;
    private String genitive;
    private String annTag;
    private String genTag;
    private int aIndex;
    private int gIndex;
    private String gDet;

    public AnnGen(String ann, String gen) {
        annexed = ann;
        genitive = gen;
    }

  

    void setIndexSent(int index) {
        sentIndex = index;
    }

    void setAnnexed(String ann) {
        annexed = ann;
    }

    void setGenitive(String gen) {
        genitive = gen;
    }

    void setAnnTag(String tag) {
        annTag = tag;
    }

    void setGenTag(String tag) {
        genTag = tag;
    }

    void setAIndex(int annI) {
        aIndex = annI;
    }

    void setGIndex(int genI) {
        gIndex = genI;
    }

    void setGDet(String det) {
        gDet = det;
    }

    int getIndexSent() {
        return sentIndex;
    }

    String getAnnexed() {
        return annexed;
    }

    String getGenitive() {
        return genitive;
    }

    String getAnnTag() {
        return annTag;
    }

    String getGenTag() {
        return genTag;
    }

    int getAIndex() {
        return aIndex;
    }

    int getGIndex() {
        return gIndex;
    }

    String getGDet() {
        return gDet;
    }

    public String toString() {
        return this.annexed + " : " + this.genitive;
    }
}
