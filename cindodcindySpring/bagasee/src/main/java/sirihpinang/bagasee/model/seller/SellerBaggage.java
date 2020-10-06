package sirihpinang.bagasee.model.seller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="SellerBaggage")
public class SellerBaggage{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private Long seller_id;

    @Column(name="seller_name")
    private String seller_name;

    @Column(name="seller_tanggal_berangkat")
    private String seller_tanggal_berangkat;

    @Column(name="seller_jam_berangkat")
    private String seller_jam_berangkat;

    @Column(name="seller_tanggal_tiba")
    private String seller_tanggal_tiba;

    @Column(name="seller_jam_tiba")
    private String seller_jam_tiba;

    @Column(name="seller_berangkat_ke")
    private String seller_berangkat_ke;

    @Column(name="seller_berangkat_dari")
    private String seller_berangkat_dari;

    @Column(name="seller_jenis_transportasi")
    private String seller_jenis_transportasi;

    @Column(name="seller_nama_transportasi")
    private String seller_nama_transportasi;

    @Column(name="seller_jumlah_bagasi")
    private String seller_jumlah_bagasi;

    @Column(name="seller_jenis_barang")
    private String seller_jenis_barang;

    @Column(name="seller_harga_bagasi")
    private String seller_harga_bagasi;


    public SellerBaggage(){

    }

    public void setSellerId(Long seller_id){
        this.seller_id=seller_id;
    }

    public Long getSellerId(){
        return seller_id;
    }

    public void setSellerName(String seller_name){
        this.seller_name=seller_name;
    }

    public String getSellerName(){
        return seller_name;
    }

    public void setSellerTanggalBerangkat(){
        this.seller_tanggal_berangkat=seller_tanggal_berangkat;
    }

    public String getSellerTanggalBerangkat(){
        return seller_tanggal_berangkat;
    }

    public void setSellerJamBerangkat(String seller_jam_berangkat){
        this.seller_jam_berangkat=seller_jam_berangkat;
    }
    public String getSellerJamBerangkat(){
        return seller_jam_berangkat;
    }

    public void setSellerTanggalTiba(String seller_tanggal_tiba){
        this.seller_tanggal_tiba=seller_tanggal_tiba;
    }

    public String getSellerTanggalTiba(){
        return seller_tanggal_tiba;
    }

    public void setSellerJamTiba(String seller_jam_tiba){
        this.seller_jam_tiba=seller_jam_tiba;
    }

    public String getSellerJamTiba(){
        return seller_jam_tiba;
    }

    public void setSellerBerangkatDari(String seller_berangkat_dari){
        this.seller_berangkat_dari=seller_berangkat_dari;
    }

    public String getSellerBerangkatDari(){
        return seller_berangkat_dari;
    }

    public void setSellerBerangkatKe(String seller_berangkat_ke){
        this.seller_berangkat_ke=seller_berangkat_ke;
    }

    public String getSellerBerangkatKe(){
        return seller_berangkat_ke;
    }

    public void setSellerJenisTransportasi(String seller_jenis_transportasi){
        this.seller_jenis_transportasi=seller_jenis_transportasi;
    }

    public String getSellerJenisTransportasi(){
        return seller_jenis_transportasi;
    }

    public void setSellerNamaTransportasi(String seller_nama_transportasi){
        this.seller_nama_transportasi=seller_nama_transportasi;
    }

    public String getSellerNamaTransportasi(){
        return seller_nama_transportasi;
    }

    public void setSellerJumlahBagasi(String seller_jumlah_bagasi){
        this.seller_jumlah_bagasi=seller_jumlah_bagasi;
    }

    public String getSellerJumlahBagasi(){
        return seller_jumlah_bagasi;
    }

    public void setSellerJenisBarang(String seller_jenis_barang){
        this.seller_jenis_barang=seller_jenis_barang;
    }

    public String getSellerJenisBarang(){
        return seller_jenis_barang;
    }

    public void setSellerHargaBagasi(String seller_harga_bagasi){
        this.seller_harga_bagasi=seller_harga_bagasi;
    }

    public String getSellerHargaBagasi(){
        return seller_harga_bagasi;
    }


}