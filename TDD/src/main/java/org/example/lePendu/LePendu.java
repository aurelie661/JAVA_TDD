package org.example.lePendu;

public class LePendu {
    private int nbEssai;
    private String masque;
    private String motATrouve;

    public LePendu() {
        nbEssai = 12;
    }

    public int getNbEssai() {
        return nbEssai;
    }

    public void setNbEssai(int nbEssai) {
        this.nbEssai = nbEssai;
    }

    public String getMasque() {
        return masque;
    }

    public void setMasque(String masque) {
        this.masque = masque;
    }

    public String getMotATrouve() {
        return motATrouve;
    }

    public void setMotATrouve(String motATrouve) {
        this.motATrouve = motATrouve;
    }

    public void genererMasque(GenerateurMot generateurMot)  {
        motATrouve = generateurMot.generer();
        StringBuilder builder = new StringBuilder();
        for(int i=0; i < motATrouve.length(); i++) {
            builder.append('*');
        }
        masque= builder.toString();
    }

    public boolean testChar(char c) {
        boolean result = false;
        if(getNbEssai() > 0 && motATrouve.contains(String.valueOf(c))){
            StringBuilder builder = new StringBuilder();
            for(int i=0; i < motATrouve.length(); i++) {
                if(motATrouve.charAt(i) == c) {
                    builder.append(c);
                }
                else {
                    builder.append(masque.charAt(i));
                }
            }
            masque = builder.toString();
            result = true;
        } else {
            nbEssai--;
        }
        return  result;
    }

    public boolean testWin() {
        return getMotATrouve().equals(getMasque());
    }
}
