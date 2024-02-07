public enum Branch {
    MATH("High level numerical analysis is needed",100),
    PHYSICH("High level logic analysis is needed",200),
    CS("I DONT KNOW",300),
    ENG("high level Memorize is needed",400);

    final private String dec;
    private int ID;
    private Branch(String dec,int ID){
        this.dec=dec;
        this.ID=ID;
    }
    public String getDec(){
        return this.dec;
    }
}
