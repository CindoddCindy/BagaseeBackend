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
    


}