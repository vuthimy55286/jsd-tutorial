package Challenge.model;

public class Tinh {
    private int maTinh;
    private String tenTinh;
    public Tinh(int maTinh, String tenTing) {
        super();
        this.maTinh = maTinh;
        this.tenTinh = tenTinh;
    }
    public int getMaTinh(){
        return maTinh;
    }
    public String getTenTinh(){
        return tenTinh;
    }
    public void setMaTinh(String tenTinh){
        this.maTinh= maTinh;
    }
    public void setTenTinh(){
        this.tenTinh = tenTinh;
    }

}
