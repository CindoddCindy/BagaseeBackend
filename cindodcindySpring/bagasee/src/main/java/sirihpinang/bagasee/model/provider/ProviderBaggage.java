package sirihpinang.bagasee.model.provider;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ProviderBaggage")
public class ProviderBaggage{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provider_id")
    private Long provider_id;

    @Column(name = "provider_name")
    private String provider_name;

    @Column(name = "provider_email")
    private String provider_email;

    @Column(name = "provider_phone_num")
    private String provider_phone_num;

    @Column(name="provider_address")
    private String provider_address;

    @Column(name="provider_password")
    private String provider_password;

    @Column(name="provider_image")
    private String provider_image;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_baggage_id")
    private SellerBaggage sellerBaggage;


    public void setIdProvider(Long provider_id){
        this.provider_id=provider_id;
    }

    public Long getProviderId(){
        return provider_id;
    }

    public void setProviderName(String provider_name){
        this.provider_name=provider_name;
    }

    public String getProviderName(){
        return provider_name;
    }

    public void setProviderEmail(String provider_email){
        this.provider_email=provider_email;
    }

    public String getProviderEmail(){
        return provider_email;
    }

    public void setProviderPhoneNum(String provider_phone_num){
        this.provider_phone_num=provider_phone_num;
    }

    public String getProviderPhoneNum(){
        return provider_phone_num;
    }

    public void setProviderAddress(String provider_address){
        this.provider_address=provider_address;
    }

    public String getProviderAddress(){
        return provider_address;
    }

    public void setProviderPassword(String provider_password){
        this.provider_password=provider_password;
    }

    public String getProviderPassword(){
        return provider_password;
    }

    public void setProviderImage(String provider_image){
        this.provider_image=provider_image;
    }

    public String getProviderImage(){
        return provider_image;
    }

    public void setSellerBagage(SellerBaggage sellerBaggage){
        this.sellerBaggage=sellerBaggage;
    }

    public SellerBaggage getSellerBaggage(){
        return sellerBaggage;
    }

 

}