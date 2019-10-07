package model;

public class Direktur extends Karyawan{
  private String jabatanName= "Direktur";
  private int gajiPokok     = 18500000;
  private int tunjangan     = 15000000;
  private int pajak         = 2; // 2/100

  public String getJabatan(){
    return this.jabatanName;
  }

  public int getGaji(){
    return this.gajiPokok;
  }

  public int getTunjangan(){
    return this.tunjangan;
  }

  public int getPajak(){
    return this.pajak;
  }

  public int getTotalTerima(){
    int gajiKotor =
      this.getGaji() +
      this.getTunjangan();

    return gajiKotor - ((gajiKotor * this.getPajak())/ 100);
  }
}
