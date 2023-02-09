public class Fraction{
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return topN + "/" + btmN;
    }
    public String toFloat(){
        return ((double)topN / btmN) + "";
    }
}
