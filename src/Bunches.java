import java.util.ArrayList;

public class Bunches implements IBunch, IStandardFunc {
    private ArrayList<AFlower> Flowers = new ArrayList<AFlower>();

    public void add(AFlower f) {
        Flowers.add(f);
    }

    public ArrayList<AFlower> getFlowers() {
        return Flowers;
    }

    @Override
    public int hashCode() {
        return super.hashCode()*Flowers.size();
    }

    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode()== this.hashCode() ? true : false;
        return comp;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < Flowers.size()-1; i++) {
            s += Flowers.get(i).getType() + ", ";
        }
        s += Flowers.get(Flowers.size()-1).getType();
        return s;
    }
}
