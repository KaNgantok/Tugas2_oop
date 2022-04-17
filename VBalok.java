package hvbalok;

/**
 *
 * @author Dani Pratama_20103320
 */
public class VBalok {
    
    public double pj, lb, tg, vol;
    
    public VBalok (double Pj, double Lb, double Tg){
        
        this.setPanjang(Pj);
        this.setLebar(Lb);
        this.setTinggi(Tg);
        
    }
    
   private void setPanjang(double Pj){
        
        this.pj=Pj;
        
    }
    
    private void setLebar(double Lb){
        
        this.lb=Lb;
        
    }
    
    private void setTinggi (double Tg){
        
        this.tg=Tg;
        
    }
    
    public double HV(){
        
        this.vol= this.pj * this.lb * this.tg; 
        return this.vol;
        
    }
    
    public void tapvol(){
        
        this.HV();
        System.out.println("Hitung Volume Balok");
        System.out.println("======================");
        System.out.println("Nilai Panjang = "+this.pj+"cm²");
        System.out.println("Nilai Lebar = "+this.lb+"cm²");
        System.out.println("Nilai Tinggi = "+this.tg+"cm²");
        System.out.println("Nilai Volume Balok = "+this.vol+"cm³");
        
    }
    
    
}
