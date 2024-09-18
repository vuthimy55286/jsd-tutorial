package Challenge.model;

import java.util.ArrayList;

public class QLSVModel {
    private ArrayList<ThiSinh> dsThiSinh;
    public QLSVModel() {
        this.dsThiSinh = new ArrayList<ThiSinh>();
    }
    public QLSVModel(ArrayList<ThiSinh> dsThiSinh){
        this.dsThiSinh = dsThiSinh;
    }
    public ArrayList<ThiSinh> getDsThiSinh(){
        return dsThiSinh;
    }
    public void setDsThiSinh(){
        this.dsThiSinh = dsThiSinh;
    }
    public void insert(ThiSinh thiSinh){
        this.dsThiSinh.add(thiSinh);
    }
    public void remove(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
    }
    public void update(ThiSinh thiSinh){
         this.dsThiSinh.add(thiSinh);
         this.dsThiSinh.remove(thiSinh);

    }
}
